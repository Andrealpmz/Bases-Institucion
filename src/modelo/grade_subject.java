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
public class grade_subject {
    
    private int idEn;
    
    private int idGrfk;

    private int idTfk;
    
    private int idSufk;

    public grade_subject(int idSufk) {
        this.idSufk = idSufk;
    }

    public grade_subject(int idEn, int idGrfk, int idTfk, int idSufk) {
        this.idEn = idEn;
        this.idGrfk = idGrfk;
        this.idTfk = idTfk;
        this.idSufk = idSufk;
    }

    public grade_subject() {
    }

    /**
     * Get the value of idSufk
     *
     * @return the value of idSufk
     */
    public int getIdSufk() {
        return idSufk;
    }

    /**
     * Set the value of idSufk
     *
     * @param idSufk new value of idSufk
     */
    public void setIdSufk(int idSufk) {
        this.idSufk = idSufk;
    }


    /**
     * Get the value of idTfk
     *
     * @return the value of idTfk
     */
    public int getIdTfk() {
        return idTfk;
    }

    /**
     * Set the value of idTfk
     *
     * @param idTfk new value of idTfk
     */
    public void setIdTfk(int idTfk) {
        this.idTfk = idTfk;
    }

    /**
     * Get the value of idGrfk
     *
     * @return the value of idGrfk
     */
    public int getIdGrfk() {
        return idGrfk;
    }

    /**
     * Set the value of idGrfk
     *
     * @param idGrfk new value of idGrfk
     */
    public void setIdGrfk(int idGrfk) {
        this.idGrfk = idGrfk;
    }


    /**
     * Get the value of idEn
     *
     * @return the value of idEn
     */
    public int getIdEn() {
        return idEn;
    }

    /**
     * Set the value of idEn
     *
     * @param idEn new value of idEn
     */
    public void setIdEn(int idEn) {
        this.idEn = idEn;
    }

    @Override
    public String toString() {
        return "grade_subject{" + "idEn=" + idEn + ", idGrfk=" + idGrfk + ", idTfk=" + idTfk + ", idSufk=" + idSufk + '}';
    }

    public LinkedList<grade_subject> consultarGrade_subject(String sql) {
        
         BaseDatos objbd=new BaseDatos();
        LinkedList<grade_subject> lc=new LinkedList<>();
        ResultSet rs;
        int idS;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    idS=rs.getInt("idSufk");
                    
                    lc.add(new grade_subject(idS));
                }
            } catch (SQLException ex) {
                Logger.getLogger(grade_subject.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }

}
