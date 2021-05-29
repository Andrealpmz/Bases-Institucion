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
public class administrator {
    
    private int idA;

    private String nameA1;
    
    private String nameA2;

    private String lastNameA1;

    private String lastNameA2;
    
    private String email;

    private String password;

   public administrator() {
    }
   public administrator(int idAfk){
       this.idA=idAfk;
   }
    public administrator(String nameA1, String lastNameA1) {
        this.nameA1 = nameA1;
        this.lastNameA1 = lastNameA1;
    }

    public administrator(String nameA1, String lastNameA1, String email, String password) {
        this.nameA1 = nameA1;
        this.lastNameA1 = lastNameA1;
        this.email = email;
        this.password = password;
    }

    public administrator(int idA, String nameA1, String nameA2, String lastNameA1, String lastNameA2, String email, String password) {
        this.idA = idA;
        this.nameA1 = nameA1;
        this.nameA2 = nameA2;
        this.lastNameA1 = lastNameA1;
        this.lastNameA2 = lastNameA2;
        this.email = email;
        this.password = password;
    }

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * Get the value of lastNameA2
     *
     * @return the value of lastNameA2
     */
    public String getLastNameA2() {
        return lastNameA2;
    }

    /**
     * Set the value of lastNameA2
     *
     * @param lastNameA2 new value of lastNameA2
     */
    public void setLastNameA2(String lastNameA2) {
        this.lastNameA2 = lastNameA2;
    }

    /**
     * Get the value of lastNameA1
     *
     * @return the value of lastNameA1
     */
    public String getLastNameA1() {
        return lastNameA1;
    }

    /**
     * Set the value of lastNameA1
     *
     * @param lastNameA1 new value of lastNameA1
     */
    public void setLastNameA1(String lastNameA1) {
        this.lastNameA1 = lastNameA1;
    }

    /**
     * Get the value of nameA2
     *
     * @return the value of nameA2
     */
    public String getNameA2() {
        return nameA2;
    }

    /**
     * Set the value of nameA2
     *
     * @param nameA2 new value of nameA2
     */
    public void setNameA2(String nameA2) {
        this.nameA2 = nameA2;
    }


    /**
     * Get the value of nameA1
     *
     * @return the value of nameA1
     */
    public String getNameA1() {
        return nameA1;
    }

    /**
     * Set the value of nameA1
     *
     * @param nameA1 new value of nameA1
     */
    public void setNameA1(String nameA1) {
        this.nameA1 = nameA1;
    }

    /**
     * Get the value of idA
     *
     * @return the value of idA
     */
    public int getIdA() {
        return idA;
    }

    /**
     * Set the value of idA
     *
     * @param idA new value of idA
     */
    public void setIdA(int idA) {
        this.idA = idA;
    }

    @Override
    public String toString() {
        return "administrator{" + "idA=" + idA + ", nameA1=" + nameA1 + ", nameA2=" + nameA2 + ", lastNameA1=" + lastNameA1 + ", lastNameA2=" + lastNameA2 + ", email=" + email + ", password=" + password + '}';
    }

    public LinkedList<administrator> consultarAdministrator(String sql) {
        
         BaseDatos objbd=new BaseDatos();
        LinkedList<administrator> lc=new LinkedList<>();
        ResultSet rs;
        String name;
        String last;
        int id;
        String email;
        String password;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    name=rs.getString("nameA1");
                    last=rs.getString("lastNameA1");
                    id=rs.getInt("idA");
                    email=rs.getString("email");
                    password=rs.getString("password");
                    
                            
                    
                    lc.add(new administrator(id, name, null, last, null, email, password));
                }
            } catch (SQLException ex) {
                Logger.getLogger(administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }

    public Integer consultarIdAdmin(String sql) {
        
        BaseDatos objbd = new BaseDatos();
        Integer idA = null;
        ResultSet rs;
        // int idc;
        // String nomc;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt("idA"));
                    idA = rs.getInt("idA");
                    //      nomc = rs.getString("nombreCategoria");

                }
            } catch (SQLException ex) {
                Logger.getLogger(administrator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return idA;
    }

        
           
}
