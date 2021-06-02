/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.administrator;
import modelo.BaseDatos;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerAdministrador {

    public boolean insertAdmin(administrator obja) { 
        boolean t=false;
        String sql="insert into administrator(nameA1, nameA2, lastNameA1, lastNameA2, email, password)" 
                + " value('"+obja.getNameA1()+"', '"+obja.getNameA2()+"', '"+obja.getLastNameA1()+"', '"+obja.getLastNameA2()+"', '"+obja.getEmail()+"', "
                + "'"+obja.getPassword()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<administrator> insertAdministrator() {
        
        LinkedList<administrator> lc=null;
        
        String sql="select * from administrator;";
        administrator objc=new administrator();
        
        lc=objc.consultarAdministrator(sql);
        return lc;
    }

// 
    
        public LinkedList<administrator> BuscarAdministrator(String email) {
        
        LinkedList<administrator> lc=null;
        
        String sql="SELECT nameA1, lastNameA1 FROM administrator WHERE email = '"+email+"'";
        administrator objc=new administrator();
        
        lc=objc.consultarAdministrator(sql);
        return lc;
    }
        
        public LinkedList<administrator> BuscarAdministratorRegistrado() {
        
        LinkedList<administrator> lc=null;
        
        String sql="SELECT idA, nameA1, nameA2, lastNameA1, lastNameA2, email, password FROM administrator";
        administrator objc=new administrator();
            System.out.println(sql);
        lc=objc.consultarAdministrator(sql);
        return lc;
    }
//        
}
 
        
