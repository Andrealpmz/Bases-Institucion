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

    private int idTfk;

    private String topic;
/*
    public score(int idSC, double score, int idSfk, int idEnfk) {
        this.idSC = idSC;
        this.score = score;
        this.idSfk = idSfk;
        this.idTfk = idTfk;
    }
*/
    public score(double score, int idSfk, String topic, int idTfk) {
        this.score = score;
        this.idSfk = idSfk;
        this.idTfk = idTfk;
        this.topic = topic;
    }

    public score(double score) {
        this.score = score;
    }

    /**
     * Get the value of idEnfk
     *
     * @return the value of idEnfk
     */
    public int getIdTfk() {
        return idTfk;
    }

    /**
     * Set the value of idEnfk
     *
     * @param idEnfk new value of idEnfk
     */
    public void setIdTfk(int idTfk) {
        this.idTfk = idTfk;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "score{" + " score=" + score + "idS=" + idSfk +", topic=" + topic + ", idTfk=" + idTfk + '}';
    }

}
