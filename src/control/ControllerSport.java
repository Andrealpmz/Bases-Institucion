/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.sport;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerSport {
        public boolean insertSport(sport obja) { 
        boolean t=false;
        String sql="insert into sport(sportType, weeklyhours)" 
                + " value('"+obja.getSportType()+"', '"+obja.getWeeklyhours()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<sport> insertSport() {
        
        LinkedList<sport> lc=null;
        
        String sql="select * from sport;";
        sport objc=new sport();
        
        lc=objc.consultarSport(sql);
        return lc;
    }
}
