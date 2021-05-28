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
public class score {
    
    private int idSC;
    
    private double score;
    
    private int idSfk;

    private int idEnfk;

    public score(int idSC, double score, int idSfk, int idEnfk) {
        this.idSC = idSC;
        this.score = score;
        this.idSfk = idSfk;
        this.idEnfk = idEnfk;
    }


    public score(double score, int idSfk, int idEnfk) {
        this.score = score;
        this.idSfk = idSfk;
        this.idEnfk = idEnfk;
    }

    public score(double score) {
        this.score = score;
    }


    /**
     * Get the value of idEnfk
     *
     * @return the value of idEnfk
     */
    public int getIdEnfk() {
        return idEnfk;
    }

    /**
     * Set the value of idEnfk
     *
     * @param idEnfk new value of idEnfk
     */
    public void setIdEnfk(int idEnfk) {
        this.idEnfk = idEnfk;
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
     * Get the value of score
     *
     * @return the value of score
     */
    public double getScore() {
        return score;
    }

    /**
     * Set the value of score
     *
     * @param score new value of score
     */
    public void setScore(double score) {
        this.score = score;
    }


    /**
     * Get the value of idSC
     *
     * @return the value of idSC
     */
    public int getIdSC() {
        return idSC;
    }

    /**
     * Set the value of idSC
     *
     * @param idSC new value of idSC
     */
    public void setIdSC(int idSC) {
        this.idSC = idSC;
    }

    @Override
    public String toString() {
        return "score{" + "idSC=" + idSC + ", score=" + score + ", idSfk=" + idSfk + ", idEnfk=" + idEnfk + '}';
    }

   


}
