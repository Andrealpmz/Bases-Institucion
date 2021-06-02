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
public class virtualcourse {
    
    private int idVi;

    private String titleC;

    private int weeklyhours;

    private String courseType;

    public virtualcourse() {
    }

    public virtualcourse(int idVi, String titleC, int weeklyhours, String courseType) {
        this.idVi = idVi;
        this.titleC = titleC;
        this.weeklyhours = weeklyhours;
        this.courseType = courseType;
    }

    public virtualcourse(String titleC, int weeklyhours, String courseType) {
        this.titleC = titleC;
        this.weeklyhours = weeklyhours;
        this.courseType = courseType;
    }

    public virtualcourse(int idVi, String titleC) {
        this.titleC = titleC;
        this.idVi=idVi;
    }
    
    /**
     * Get the value of courseType
     *
     * @return the value of courseType
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * Set the value of courseType
     *
     * @param courseType new value of courseType
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType;
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
     * Get the value of titleC
     *
     * @return the value of titleC
     */
    public String getTitleC() {
        return titleC;
    }

    /**
     * Set the value of titleC
     *
     * @param titleC new value of titleC
     */
    public void setTitleC(String titleC) {
        this.titleC = titleC;
    }

    /**
     * Get the value of idVi
     *
     * @return the value of idVi
     */
    public int getIdVi() {
        return idVi;
    }

    /**
     * Set the value of idVi
     *
     * @param idVi new value of idVi
     */
    public void setIdVi(int idVi) {
        this.idVi = idVi;
    }

    @Override
    public String toString() {
        return "virtualcourse{" + "idVi=" + idVi + ", titleC=" + titleC + ", weeklyhours=" + weeklyhours + ", courseType=" + courseType + '}';
    }

    public LinkedList<virtualcourse> consultarVirtualcourse(String sql) {
        
        BaseDatos objbd=new BaseDatos();
        LinkedList<virtualcourse> lc=new LinkedList<>();
        ResultSet rs;
        String name;
        int idvc;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    idvc=rs.getInt("idVi");
                    name=rs.getString("titleC");  
                    
                    lc.add(new virtualcourse(idvc,name));
                }
            } catch (SQLException ex) {
                Logger.getLogger(virtualcourse.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }
  

}
