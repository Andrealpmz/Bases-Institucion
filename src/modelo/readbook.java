/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANDREA PEREZ
 */
public class readbook {
    
    private int idRe;
    
    private String titleR;
    
    private String description;
    
    private int numberP;
    
    private String category;

    public readbook(int idRe, String titleR, String description, int numberP, String category) {
        this.idRe = idRe;
        this.titleR = titleR;
        this.description = description;
        this.numberP = numberP;
        this.category = category;
    }

    public readbook(String titleR, String description, int numberP, String category) {
        this.titleR = titleR;
        this.description = description;
        this.numberP = numberP;
        this.category = category;
    }

    public readbook() {
    }

    public readbook(String titleR) {
        this.titleR = titleR;
    }

  

    /**
     * Get the value of category
     *
     * @return the value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Set the value of category
     *
     * @param category new value of category
     */
    public void setCategory(String category) {
        this.category = category;
    }


    /**
     * Get the value of numberP
     *
     * @return the value of numberP
     */
    public int getNumberP() {
        return numberP;
    }

    /**
     * Set the value of numberP
     *
     * @param numberP new value of numberP
     */
    public void setNumberP(int numberP) {
        this.numberP = numberP;
    }


    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Get the value of titleR
     *
     * @return the value of titleR
     */
    public String getTitleR() {
        return titleR;
    }

    /**
     * Set the value of titleR
     *
     * @param titleR new value of titleR
     */
    public void setTitleR(String titleR) {
        this.titleR = titleR;
    }


    /**
     * Get the value of idRe
     *
     * @return the value of idRe
     */
    public int getIdRe() {
        return idRe;
    }

    /**
     * Set the value of idRe
     *
     * @param idRe new value of idRe
     */
    public void setIdRe(int idRe) {
        this.idRe = idRe;
    }

    @Override
    public String toString() {
        return "readbook{" + "idRe=" + idRe + ", titleR=" + titleR + ", description=" + description + ", numberP=" + numberP + ", category=" + category + '}';
    }

    public LinkedList<readbook> consultarReadbook(String sql) {
        
        BaseDatos objbd=new BaseDatos();
        LinkedList<readbook> lc=new LinkedList<>();
        ResultSet rs;
        String name;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    name=rs.getString("titleR");
                    
                    lc.add(new readbook(name));
                }
            } catch (SQLException ex) {
                Logger.getLogger(readbook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }
   

}
