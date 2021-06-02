/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    private String passwordT;

    private int idAfk;

    private int idSufk;

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

    public teacher(String nameT1, String lastNameT1, String email, int idAfk, String passwordT) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
        this.email = email;
        this.idAfk = idAfk;
        this.passwordT = passwordT;

    }

    public teacher(String nameT1, String nameT2, String lastNameT1, String lastNameT2, String email, String passwordT, int idAfk, int idSufk) {
        this.nameT1 = nameT1;
        this.nameT2 = nameT2;
        this.lastNameT1 = lastNameT1;
        this.lastNameT2 = lastNameT2;
        this.email = email;
        this.passwordT = passwordT;
        this.idAfk = idAfk;
        this.idSufk = idSufk;
    }

    public teacher(String nameT1, String lastNameT1, String email, int idAfk, String passwordT, int idSufk) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
        this.email = email;
        this.idAfk = idAfk;
        this.passwordT = passwordT;
        this.idSufk = idSufk;
    }

    public teacher(int idT, String nameT1, String lastNameT1, String email, String passwordT, int idSufk) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
        this.email = email;
        this.idAfk = idAfk;
        this.passwordT = passwordT;
        this.idSufk = idSufk;
        this.idT = idT;
    }

    public teacher(String nameT1, String lastNameT1, String email, int idAfk) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
        this.email = email;
        this.idAfk = idAfk;
    }

    public teacher(int idT, String nameT1, String nameT2, String lastNameT1, String lastNameT2, String email, String passwordT, int idAfk, int idSufk) {
        this.idT = idT;
        this.nameT1 = nameT1;
        this.nameT2 = nameT2;
        this.lastNameT1 = lastNameT1;
        this.lastNameT2 = lastNameT2;
        this.email = email;
        this.passwordT = passwordT;
        this.idAfk = idAfk;
        this.idSufk = idSufk;
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

    public teacher(String nameT1, String lastNameT1, String email, String passwordT) {
        this.nameT1 = nameT1;
        this.lastNameT1 = lastNameT1;
        this.email = email;
        this.passwordT = passwordT;
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

    public int getIdSufk() {
        return idSufk;
    }

    public void setIdSufk(int idSufk) {
        this.idSufk = idSufk;
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

    public String getPasswordT() {
        return passwordT;
    }

    public void setPasswordT(String passwordT) {
        this.passwordT = passwordT;
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

    public LinkedList<teacher> consultarTeacher(String sql) {

        BaseDatos objbd = new BaseDatos();
        LinkedList<teacher> lc = new LinkedList<>();
        ResultSet rs;
        String name;
        String name2;
        String last;
        String last2;
        String password;
        String mail;
        int idTe;
        int idSu;

        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    name = rs.getString("nameT1");
                    name2 = rs.getString("nameT2");
                    last = rs.getString("lastNameT1");
                    last2 = rs.getString("lastNameT2");
                    mail = rs.getString("email");
                    password = rs.getString("passwordT");
                    idSu = rs.getInt("idSufk");
                    idTe = rs.getInt("idT");
                    lc.add(new teacher(name, name2, last, last2, mail, password, idSu, idTe));
                }
            } catch (SQLException ex) {
                Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        return lc;
    }

    public teacher consultarDocentesApellido(String sql) {

        BaseDatos objbd = new BaseDatos();
        teacher objd = new teacher();
        String name;
        String last;
        ResultSet rs;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                rs.next();
                name = rs.getString("nameT1");
                last = rs.getString("lastNameT1");

                objd = new teacher(name, last);

            } catch (SQLException ex) {
                Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return objd;
    }

    BaseDatos conectar = new BaseDatos();
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;

    public List listar() {

        List<teacher> datos = new ArrayList<>();
        String sql = "select * from teacher";

        try {

            conexion = conectar.getConexion();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                teacher t = new teacher();
                t.setNameT1(rs.getString(1));
                t.setLastNameT1(rs.getString(2));
                t.setEmail(rs.getString(3));
                datos.add(t);
            }
        } catch (Exception e) {

        }
        return datos;
    }

    public int idT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
