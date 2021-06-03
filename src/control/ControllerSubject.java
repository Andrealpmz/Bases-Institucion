/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.subject;


/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerSubject {
        public boolean insertSubject(subject objs) { 
        boolean t=false;
        String sql="insert into subject(nameSu)" 
                + " value('"+objs.getNameSu()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
        
        
     public LinkedList<subject> BuscarSubject() {
        
        LinkedList<subject> lc=null;
        
        String sql="select * from subject;";
        subject objc=new subject();
        
        lc=objc.consultarSubject(sql);
        return lc;
    }
}
