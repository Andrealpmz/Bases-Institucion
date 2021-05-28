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
public class sport {
    
    private int idSP;
      
    private String sportType;
    
    private int weeklyhours;

    public sport() {
    }
    

    public sport(int idSP, String sportType, int weeklyhours) {
        this.idSP = idSP;
        this.sportType = sportType;
        this.weeklyhours = weeklyhours;
    }

    public sport(String sportType, int weeklyhours) {
        this.sportType = sportType;
        this.weeklyhours = weeklyhours;
    }

    public sport(String sportType) {
        this.sportType = sportType;
    }

    /**
     * Get the value of weeklyhours
     *
     * @return the value of weeklyhours
     */
    public int getWeeklyhours() {
        return weeklyhours;
    }

    /**
     * Set the value of weeklyhours
     *
     * @param weeklyhours new value of weeklyhours
     */
    public void setWeeklyhours(int weeklyhours) {
        this.weeklyhours = weeklyhours;
    }


    /**
     * Get the value of sportType
     *
     * @return the value of sportType
     */
    public String getSportType() {
        return sportType;
    }

    /**
     * Set the value of sportType
     *
     * @param sportType new value of sportType
     */
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }


    /**
     * Get the value of idSP
     *
     * @return the value of idSP
     */
    public int getIdSP() {
        return idSP;
    }

    /**
     * Set the value of idSP
     *
     * @param idSP new value of idSP
     */
    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    @Override
    public String toString() {
        return "sport{" + "idSP=" + idSP + ", sportType=" + sportType + ", weeklyhours=" + weeklyhours + '}';
    }

    public LinkedList<sport> consultarSport(String sql) {
        
        BaseDatos objbd=new BaseDatos();
        LinkedList<sport> lc=new LinkedList<>();
        ResultSet rs;
        String name;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    name=rs.getString("sportType");
                    
                    lc.add(new sport(name));
                }
            } catch (SQLException ex) {
                Logger.getLogger(sport.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
  
    }

    
}
