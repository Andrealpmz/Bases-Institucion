/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.teacher;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerTeacher {

  

public boolean insertTeacher(teacher objr) {
        boolean t = false;
        String  sql = "insert into teacher(nameT1, nameT2, lastNameT1, lastNameT2, email, idAfk, passwordT, idSufk)" 
                + " value('"+objr.getNameT1()+"', '"+objr.getNameT2()+"', '"+objr.getLastNameT1()+"', '"+objr.getLastNameT2()+"', '"+objr.getEmail()+"', "
                + "'"+objr.getIdAfk()+"', '"+ objr.getPasswordT()+"', '"+objr.getIdSufk()+"');";
        System.out.println(sql);
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }

    public teacher consultarDocentesApellido(String ape) {

        String sql = "select * from teacher where lastNameT1='" + ape + "';";
        teacher objc = new teacher();
        objc = objc.consultarDocentesApellido(sql);

        return objc;
    }

    
            public LinkedList<teacher> BuscarTeacherRegistrado() {
        
        LinkedList<teacher> lc=null;
        
        String sql="SELECT idT, nameT1,nameT2, lastNameT1, lastnameT2, email,passwordT, idSufk FROM teacher ";
              //  + "WHERE email = '"+email+"' && passwordT = '"+passwordT+"'";
        teacher objc=new teacher();
        
        lc=objc.consultarTeacher(sql);
        return lc;
    }


    public LinkedList<teacher> insertTeacher() {
       
     LinkedList<teacher> lt=null;
        
        String sql="select * from teacher;";
        teacher objT=new teacher();
        
        lt=objT.consultarTeacher(sql);
        return lt;
    
    }
      /* public ControllerTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}
