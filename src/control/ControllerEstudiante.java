/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.student;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerEstudiante {
     public boolean insertEstudiante(student objs) { 
        boolean t=false;
        
//        String admin;
//        admin = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getIdAfk();
        String sql="insert into student(name1S, lastName1S, age, gender, grade, weeklyStudyHours, socioeconomicStatus, idAfk)" 
                + " value('"+objs.getName1S()+"', '"+objs.getLastName1S()+"', '"+objs.getAge()+"', "
                + "'"+objs.getGender()+"', '"+objs.getGrade()+"', '"+objs.getWeeklyStudyHours()+"', '"+objs.getSocioeconomicStatus()+"', '"+objs.getIdAfk()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public student buscarEstudiante(int ide) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LinkedList<student> insertEstudiante() {
        
                LinkedList<student> lc=null;
        
        String sql="select * from student;";
        student objc=new student();
        
        lc=objc.consultarStudent(sql);
        return lc;
    }

 

}
