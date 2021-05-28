/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.grade_subject;
import modelo.student;

/**
 *
 * @author ANDREA PEREZ
 */


public class ControllerGrade_Subject {
        public boolean insertGrade_Subject(grade_subject obja) { 
        boolean t=false;
        String sql="insert into grade_subject(idGrfk, idTfk, idSufk)" 
                + " value('"+obja.getIdGrfk()+"', '"+obja.getIdTfk()+"', '"+obja.getIdSufk()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<grade_subject> insertGradeSubject() {
       
                
         LinkedList<grade_subject> lc=null;
        
        String sql="select * from grade_subject;";
        grade_subject objc=new grade_subject();
        
        lc=objc.consultarGrade_subject(sql);
        return lc;
    }
}
