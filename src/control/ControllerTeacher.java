/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.subject;
import modelo.teacher;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerTeacher {
        public boolean insertTeacher(teacher objr) { 
        boolean t=false;
        String sql="insert into teacher(nameT1, lastNameT1, email)" 
                + " value('"+objr.getNameT1()+"', '"+objr.getLastNameT1()+"', '"+objr.getEmail()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
        
         public LinkedList<teacher> insertTeacher() {
        
        LinkedList<teacher> lc=null;
        
        String sql="select * from teacher;";
        teacher objce=new teacher();
        
        lc=objce.consultarTeacher(sql);
        return lc;
    }
}
