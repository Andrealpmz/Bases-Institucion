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
public class grade {
    
    private int idGr;
    
    private String nameGr;

    public grade() {
    }

    public grade(int idGr, String nameGr) {
        this.idGr = idGr;
        this.nameGr = nameGr;
    }

    public grade(String nameGr) {
        this.nameGr = nameGr;
    }

    /**
     * Get the value of nameGr
     *
     * @return the value of nameGr
     */
    public String getNameGr() {
        return nameGr;
    }

    /**
     * Set the value of nameGr
     *
     * @param nameGr new value of nameGr
     */
    public void setNameGr(String nameGr) {
        this.nameGr = nameGr;
    }


    /**
     * Get the value of idGr
     *
     * @return the value of idGr
     */
    public int getIdGr() {
        return idGr;
    }

    /**
     * Set the value of idGr
     *
     * @param idGr new value of idGr
     */
    public void setIdGr(int idGr) {
        this.idGr = idGr;
    }

    @Override
    public String toString() {
        return "grade{" + "idGr=" + idGr + ", nameGr=" + nameGr + '}';
    }

    public LinkedList<grade> consultarGrade(String sql) {
        
         BaseDatos objbd=new BaseDatos();
        LinkedList<grade> lc=new LinkedList<>();
        ResultSet rs;
        String name;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    name=rs.getString("nameGr");
                    
                    lc.add(new grade(name));
                }
            } catch (SQLException ex) {
                Logger.getLogger(grade.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }

}
