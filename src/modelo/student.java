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
public class student {

    private int idS;

    private String name1S;

    private String name2S;

    private String lastName1S;

    private String lastName2S;

    private String user;

    private String pass;

    private String age;

    private String gender;

    private String grade;

    private double weeklyStudyHours;

    private int socioeconomicStatus;

    private int idAfk;

    public student(String name1S, String lastName1S, String user,String pass) {
        this.name1S = name1S;
        this.lastName1S = lastName1S;
        this.user = user;
        this.pass = pass;
    }

    /*public student(String name1S, String name2S, String lastName1S, String lastName2S, String age, String gender, String grade, double weeklyStudyHours, int socioeconomicStatus, int idAfk) {
        this.name1S = name1S;
        this.name2S = name2S;
        this.lastName1S = lastName1S;
        this.lastName2S = lastName2S;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.weeklyStudyHours = weeklyStudyHours;
        this.socioeconomicStatus = socioeconomicStatus;
        this.idAfk = idAfk;
    }*/
/*
    public student(String name1S, String lastName1S, String age, String gender, String grade, double weeklyStudyHours, int socioeconomicStatus, int idAfk) {
        this.name1S = name1S;
        this.lastName1S = lastName1S;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.weeklyStudyHours = weeklyStudyHours;
        this.socioeconomicStatus = socioeconomicStatus;
        this.idAfk = idAfk;
    }*/

    public student(String name1S, String lastName1S, String user, String pass, String age, String gender, String grade, double weeklyStudyHours, int socioeconomicStatus, int idAfk) {
        this.name1S = name1S;
        this.lastName1S = lastName1S;
        this.user = user;
        this.pass = pass;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.weeklyStudyHours = weeklyStudyHours;
        this.socioeconomicStatus = socioeconomicStatus;
        this.idAfk = idAfk;
    }
/*
    public student(int idS, String name1S, String name2S, String lastName1S, String lastName2S, String user, String pass, String age, String gender, String grade, double weeklyStudyHours, int socioeconomicStatus, int idAfk) {
        this.idS = idS;
        this.name1S = name1S;
        this.name2S = name2S;
        this.lastName1S = lastName1S;
        this.lastName2S = lastName2S;
        this.user = user;
        this.pass = pass;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.weeklyStudyHours = weeklyStudyHours;
        this.socioeconomicStatus = socioeconomicStatus;
        this.idAfk = idAfk;
    }*/

    public student() {
    }

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public String getUser() {
        return user;
    }

    /**
     * Set the value of user
     *
     * @param user new value of user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Get the value of pass
     *
     * @return the value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Set the value of pass
     *
     * @param pass new value of pass
     */
    public void setPass(String pass) {
        this.pass = pass;
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
     * Get the value of socioeconomicStatus
     *
     * @return the value of socioeconomicStatus
     */
    public int getSocioeconomicStatus() {
        return socioeconomicStatus;
    }

    /**
     * Set the value of socioeconomicStatus
     *
     * @param socioeconomicStatus new value of socioeconomicStatus
     */
    public void setSocioeconomicStatus(int socioeconomicStatus) {
        this.socioeconomicStatus = socioeconomicStatus;
    }

    /**
     * Get the value of weeklyStudyHours
     *
     * @return the value of weeklyStudyHours
     */
    public double getWeeklyStudyHours() {
        return weeklyStudyHours;
    }

    /**
     * Set the value of weeklyStudyHours
     *
     * @param weeklyStudyHours new value of weeklyStudyHours
     */
    public void setWeeklyStudyHours(double weeklyStudyHours) {
        this.weeklyStudyHours = weeklyStudyHours;
    }

    /**
     * Get the value of grade
     *
     * @return the value of grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Set the value of grade
     *
     * @param grade new value of grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Get the value of gender
     *
     * @return the value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the value of gender
     *
     * @param gender new value of gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public String getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Get the value of lastName2S
     *
     * @return the value of lastName2S
     */
    public String getLastName2S() {
        return lastName2S;
    }

    /**
     * Set the value of lastName2S
     *
     * @param lastName2S new value of lastName2S
     */
    public void setLastName2S(String lastName2S) {
        this.lastName2S = lastName2S;
    }

    /**
     * Get the value of lastName1S
     *
     * @return the value of lastName1S
     */
    public String getLastName1S() {
        return lastName1S;
    }

    /**
     * Set the value of lastName1S
     *
     * @param lastName1S new value of lastName1S
     */
    public void setLastName1S(String lastName1S) {
        this.lastName1S = lastName1S;
    }

    /**
     * Get the value of name2S
     *
     * @return the value of name2S
     */
    public String getName2S() {
        return name2S;
    }

    /**
     * Set the value of name2S
     *
     * @param name2S new value of name2S
     */
    public void setName2S(String name2S) {
        this.name2S = name2S;
    }

    /**
     * Get the value of name1S
     *
     * @return the value of name1S
     */
    public String getName1S() {
        return name1S;
    }

    /**
     * Set the value of name1S
     *
     * @param name1S new value of name1S
     */
    public void setName1S(String name1S) {
        this.name1S = name1S;
    }

    /**
     * Get the value of idS
     *
     * @return the value of idS
     */
    public int getIdS() {
        return idS;
    }

    /**
     * Set the value of idS
     *
     * @param idS new value of idS
     */
    public void setIdS(int idS) {
        this.idS = idS;
    }

    @Override
    public String toString() {
        return "student{" + "idS=" + idS + ", name1S=" + name1S + ", name2S=" + name2S + ", lastName1S=" + lastName1S + ", lastName2S=" + lastName2S + ", age=" + age + ", gender=" + gender + ", grade=" + grade + ", weeklyStudyHours=" + weeklyStudyHours + ", socioeconomicStatus=" + socioeconomicStatus + ", idAfk=" + idAfk + '}';
    }

    public LinkedList<student> consultarStudent(String sql) {

        BaseDatos objbd = new BaseDatos();
        LinkedList<student> lc = new LinkedList<>();
        ResultSet rs;
        String name;
        String last;
        String user;
        String pass;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    name = rs.getString("name1S");
                    last = rs.getString("lastName1S");
                    user = rs.getString("user");
                    pass = rs.getString("pass");
                    lc.add(new student(name, last, user, pass));
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lc;
    }

}
