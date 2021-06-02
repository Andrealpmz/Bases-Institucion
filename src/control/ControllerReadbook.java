/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.readbook;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerReadbook {
        public boolean insertReadbook(readbook objr) { 
        boolean t=false;
        String sql="insert into readbook(titleR, description, numberP, category)" 
                + " value('"+objr.getTitleR()+"', '"+objr.getDescription()+"', '"+objr.getNumberP()+"', "
                + "'"+objr.getCategory()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<readbook> buscarReadbook() {
        
        LinkedList<readbook> lc=null;
        
        String sql="select * from readbook;";
        readbook objc=new readbook();
        
        lc=objc.consultarReadbook(sql);
        return lc;
    }
    
}
