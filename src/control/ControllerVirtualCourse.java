/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.virtualcourse;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerVirtualCourse {
        public boolean insertVirtualCourse(virtualcourse objvc) { 
        boolean t=false;
        String sql="insert into virtualcourse(titleC, weeklyhours, courseType)" 
                + " value('"+objvc.getTitleC()+"', '"+objvc.getWeeklyhours()+"', '"+objvc.getCourseType()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<virtualcourse> buscarCursos() {
            
        LinkedList<virtualcourse> lc=null;
        
        String sql="select * from virtualcourse;";
        virtualcourse objc=new virtualcourse();
        
        lc=objc.consultarVirtualcourse(sql);
        return lc;
    }
}
