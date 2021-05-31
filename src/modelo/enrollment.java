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
public class enrollment {
    
    private int idEn;
    private String dateEnrollment;
    private int idSfk;
    private int idGrfk;

    public enrollment() {
    }
    
    public enrollment(String dateEnrollment) {
        this.dateEnrollment = dateEnrollment;

    }
    
    public enrollment(int idEn, String dateEnrollment, int idSfk, int idGrfk) {
        this.idEn = idEn;
        this.dateEnrollment = dateEnrollment;
        this.idSfk = idSfk;
        this.idGrfk = idGrfk;
    }
     public enrollment( String dateEnrollment, int idSfk, int idGrfk) {
       
        this.dateEnrollment = dateEnrollment;
        this.idSfk = idSfk;
        this.idGrfk = idGrfk;
    }


    /**
     * Get the value of dateEnrollment
     *
     * @return the value of dateEnrollment
     */
    public String getDateEnrollment() {
        return dateEnrollment;
    }

    /**
     * Set the value of dateEnrollment
     *
     * @param dateEnrollment new value of dateEnrollment
     */
    public void setDateEnrollment(String dateEnrollment) {
        this.dateEnrollment = dateEnrollment;
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
        return "Enrollment{" + "idEn=" + idEn + ", dateEnrollment=" + dateEnrollment + ", idSfk=" + idSfk + ", idGrfk=" + idGrfk + '}';
    }

    
}
