/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.BaseDatos;
import modelo.student_activity;

/**
 *
 * @author ANDREA PEREZ
 */


public class ControllerStudent_Activity {
        public boolean insertStudent_Activity(student_activity objsa) { 
        boolean t=false;
        String sql="insert into student_activity( idSPfk, idRefk, idVifk, idSfk)" 
                + " value('"+objsa.getIdSPfk()+"', " +"'" +objsa.getIdRefk()+"', '"+objsa.getIdVifk()+"', "+"'"+objsa.getIdSfk()+"');";
        System.out.println(sql);
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
}
