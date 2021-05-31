/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import modelo.BaseDatos;
import modelo.enrollment;
/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerEnrollment {
    
     public boolean insertEnroll(enrollment obje) { 
        boolean t=false;
        String sql="insert into enrollment(dateEnrollment, idSfk, idGrfk)" 
                + " value('"+obje.getDateEnrollment()+" "+obje.getIdSfk()+" "+obje.getIdGrfk()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
}
