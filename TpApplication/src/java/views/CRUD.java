/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import java.util.List;
import models.Cotation;

/**
 *
 * @author kevin
 */
public interface CRUD {

    public List listCota();

    public Cotation listCotation(int numCotation);

    
}
