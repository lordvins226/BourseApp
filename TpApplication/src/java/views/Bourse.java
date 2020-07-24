/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Cotation;

/**
 *
 * @author kevin
 */
public class Bourse implements CRUD{
    PreparedStatement state;
    ResultSet result;
    Connection con;
    Database data = new Database();

    @Override
    public List listCota() {
        List<Cotation> cot = new ArrayList<>();
        String sql = "select * from COTATION";
        try {
            con = data.getConnection();
            state = con.prepareStatement(sql);
            result = state.executeQuery();
            while (result.next()) {
                Cotation c = new Cotation();
                c.setNumCotation(result.getInt("NUM_COTATION"));
                c.setCodeSociete(result.getString("CODE_SOCIETE"));
                c.setDateCotation(result.getDate("DATE_COTATION"));
                c.setValAction(result.getFloat("VALEUR_ACTION"));
                cot.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cot;
    }

    @Override
    public Cotation listCotation(int numCotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
