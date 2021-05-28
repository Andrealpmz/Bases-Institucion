/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ANDREA PEREZ
 */
public class student_activity {
    
    private int idSA;
       
    private String dateActivity;
    
    private int weeklyhours;

    private String courseType;
    
    private int idSPfk;

    private int idRefk;

    private int idVifk;
    
    private int idSfk;

    public student_activity() {
    }

    public student_activity(String dateActivity, int weeklyhours, String courseType, int idSPfk, int idRefk, int idVifk, int idSfk) {
        this.dateActivity = dateActivity;
        this.weeklyhours = weeklyhours;
        this.courseType = courseType;
        this.idSPfk = idSPfk;
        this.idRefk = idRefk;
        this.idVifk = idVifk;
        this.idSfk = idSfk;
    }

    public student_activity(int idSA, String dateActivity, int weeklyhours, String courseType, int idSPfk, int idRefk, int idVifk, int idSfk) {
        this.idSA = idSA;
        this.dateActivity = dateActivity;
        this.weeklyhours = weeklyhours;
        this.courseType = courseType;
        this.idSPfk = idSPfk;
        this.idRefk = idRefk;
        this.idVifk = idVifk;
        this.idSfk = idSfk;
    }

    /**
     * Get the value of idSfk
     *
     * @return the value of idSfk
     */
    public int getIdSfk() {
        return idSfk;
    }

    /**
     * Set the value of idSfk
     *
     * @param idSfk new value of idSfk
     */
    public void setIdSfk(int idSfk) {
        this.idSfk = idSfk;
    }


    /**
     * Get the value of idVifk
     *
     * @return the value of idVifk
     */
    public int getIdVifk() {
        return idVifk;
    }

    /**
     * Set the value of idVifk
     *
     * @param idVifk new value of idVifk
     */
    public void setIdVifk(int idVifk) {
        this.idVifk = idVifk;
    }

    /**
     * Get the value of idRefk
     *
     * @return the value of idRefk
     */
    public int getIdRefk() {
        return idRefk;
    }

    /**
     * Set the value of idRefk
     *
     * @param idRefk new value of idRefk
     */
    public void setIdRefk(int idRefk) {
        this.idRefk = idRefk;
    }

    /**
     * Get the value of idSPfk
     *
     * @return the value of idSPfk
     */
    public int getIdSPfk() {
        return idSPfk;
    }

    /**
     * Set the value of idSPfk
     *
     * @param idSPfk new value of idSPfk
     */
    public void setIdSPfk(int idSPfk) {
        this.idSPfk = idSPfk;
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
     * Get the value of dateActivity
     *
     * @return the value of dateActivity
     */
    public String getDateActivity() {
        return dateActivity;
    }

    /**
     * Set the value of dateActivity
     *
     * @param dateActivity new value of dateActivity
     */
    public void setDateActivity(String dateActivity) {
        this.dateActivity = dateActivity;
    }


    /**
     * Get the value of idSA
     *
     * @return the value of idSA
     */
    public int getIdSA() {
        return idSA;
    }

    /**
     * Set the value of idSA
     *
     * @param idSA new value of idSA
     */
    public void setIdSA(int idSA) {
        this.idSA = idSA;
    }

    @Override
    public String toString() {
        return "student_activity{" + "idSA=" + idSA + ", dateActivity=" + dateActivity + ", weeklyhours=" + weeklyhours + ", courseType=" + courseType + ", idSPfk=" + idSPfk + ", idRefk=" + idRefk + ", idVifk=" + idVifk + ", idSfk=" + idSfk + '}';
    }

}
