/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.BaseDatos;

/**
 *
 * @author ANDREA PEREZ
 */
public class Cone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Menu.main(args);
      
      BaseDatos objBD= new BaseDatos();
      
      boolean t= objBD.crearConexion();
      if (t)
      {
          System.out.println("Se creó la conexión");
      }
      else {
          System.out.println("No se creó la conexión");
      }
    }
    
}
