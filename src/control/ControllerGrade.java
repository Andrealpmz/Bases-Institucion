/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.grade;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerGrade {
        public boolean insertGrade(grade obja) { 
        boolean t=false;
        String sql="insert into grade(nameGr)" 
                + " value('"+obja.getNameGr()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
        
        public LinkedList<grade> insertGrade() {
        
                LinkedList<grade> lc=null;
        
        String sql="select * from grade;";
        grade objc=new grade();
        
        lc=objc.consultarGrade(sql);
        return lc;
    }
}
