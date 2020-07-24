/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Cotation {
    int numCotation;
    String codeSociete;
    Date dateCotation;
    float valAction;
    
    public Cotation(){}
    
    public Cotation(int numCotation,String codeSociete,Date dateCotation,float valAction ) {
    this.numCotation=numCotation;
    this.codeSociete=codeSociete;
    this.dateCotation=dateCotation;
    this.valAction=valAction;
}
    public int getNumCotation(){
        return numCotation;
    }
    public void setNumCotation(int numCotation){
        this.numCotation=numCotation;
    }
    public String getCodeSociete(){
        return codeSociete;
    }
    public void setCodeSociete(String codeSociete){
        this.codeSociete=codeSociete;
    }
    public Date getDateCotation(){
        return dateCotation;
    }
    public void setDateCotation(Date dateCotation){
        this.dateCotation=dateCotation;
    }
    public float getValAction(){
        return valAction;
    }
    public void setValAction(float valAction){
        this.valAction=valAction;
    }
}
