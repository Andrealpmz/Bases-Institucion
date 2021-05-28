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
public class teacher {
    
    private int idT;

    private String nameT1;

    private String nameT2;

    private String lastNameT1;

    private String lastNameT2;

    private String email;

    private int idAfk;
    
    public teacher() {
    }
    
    public teacher(int idT, String nameT1, String nameT2, String lastNameT1, String lastNameT2, String email, int idAfk) {
        this.idT = idT;
        this.nameT1 = nameT1;
        this.nameT2 = nameT2;
        this.lastNameT1 = lastNameT1;
        this.lastNameT2 = lastNameT2;
        this.email = email;
        this.idAfk = idAfk;
    }

    public teacher(String nameT1, String lastNameT1, String email) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
        this.email = email;
    }

    public teacher(String nameT1, String lastNameT1) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
    }



    /**
     * Get the value of idAfk
     *
     * @return the value of idAfk
     */
    public int getIdAfk() {
        return idAfk;
    }

    /**
     * Set the value of idAfk
     *
     * @param idAfk new value of idAfk
     */
    public void setIdAfk(int idAfk) {
        this.idAfk = idAfk;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of lastNameT2
     *
     * @return the value of lastNameT2
     */
    public String getLastNameT2() {
        return lastNameT2;
    }

    /**
     * Set the value of lastNameT2
     *
     * @param lastNameT2 new value of lastNameT2
     */
    public void setLastNameT2(String lastNameT2) {
        this.lastNameT2 = lastNameT2;
    }

    /**
     * Get the value of lastNameT1
     *
     * @return the value of lastNameT1
     */
    public String getLastNameT1() {
        return lastNameT1;
    }

    /**
     * Set the value of lastNameT1
     *
     * @param lastNameT1 new value of lastNameT1
     */
    public void setLastNameT1(String lastNameT1) {
        this.lastNameT1 = lastNameT1;
    }

    /**
     * Get the value of nameT2
     *
     * @return the value of nameT2
     */
    public String getNameT2() {
        return nameT2;
    }

    /**
     * Set the value of nameT2
     *
     * @param nameT2 new value of nameT2
     */
    public void setNameT2(String nameT2) {
        this.nameT2 = nameT2;
    }

    /**
     * Get the value of nameT1
     *
     * @return the value of nameT1
     */
    public String getNameT1() {
        return nameT1;
    }

    /**
     * Set the value of nameT1
     *
     * @param nameT1 new value of nameT1
     */
    public void setNameT1(String nameT1) {
        this.nameT1 = nameT1;
    }

    /**
     * Get the value of idT
     *
     * @return the value of idT
     */
    public int getIdT() {
        return idT;
    }

    /**
     * Set the value of idT
     *
     * @param idT new value of idT
     */
    public void setIdT(int idT) {
        this.idT = idT;
    }

    @Override
    public String toString() {
        return "teacher{" + "idT=" + idT + ", nameT1=" + nameT1 + ", nameT2=" + nameT2 + ", lastNameT1=" + lastNameT1 + ", lastNameT2=" + lastNameT2 + ", email=" + email + ", idAfk=" + idAfk + '}';
    }

    public LinkedList<teacher> consultarTeacher(String sql) {

         BaseDatos objbd=new BaseDatos();
        LinkedList<teacher> lc=new LinkedList<>();
        ResultSet rs;
        String name;
        String last;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    name=rs.getString("nameT1");
                    last=rs.getString("lastNameT1");
                    
                    lc.add(new teacher(name, last));
                }
            } catch (SQLException ex) {
                Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }

}
