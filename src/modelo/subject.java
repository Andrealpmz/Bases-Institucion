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
public class subject {

    private int idSu;

    private String nameSu;

    public subject() {
    }

    public subject(int idSu, String nameSu) {
        this.idSu = idSu;
        this.nameSu = nameSu;
    }

    public subject(String nameSu) {
        this.nameSu = nameSu;
    }

    /**
     * Get the value of nameSu
     *
     * @return the value of nameSu
     */
    public String getNameSu() {
        return nameSu;
    }

    /**
     * Set the value of nameSu
     *
     * @param nameSu new value of nameSu
     */
    public void setNameSu(String nameSu) {
        this.nameSu = nameSu;
    }

    /**
     * Get the value of idSu
     *
     * @return the value of idSu
     */
    public int getIdSu() {
        return idSu;
    }

    /**
     * Set the value of idSu
     *
     * @param idSu new value of idSu
     */
    public void setIdSu(int idSu) {
        this.idSu = idSu;
    }

    @Override
    public String toString() {
        return "subject{" + "idSu=" + idSu + ", nameSu=" + nameSu + '}';
    }

    public LinkedList<subject> consultarSubject(String sql) {

        BaseDatos objbd = new BaseDatos();
        LinkedList<subject> lc = new LinkedList<>();
        ResultSet rs;
        String name;
        int sub;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    name = rs.getString("nameSu");
                    sub = rs.getInt("idSu");
                    lc.add(new subject(sub, name));
                }
            } catch (SQLException ex) {
                Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lc;

    }

}
