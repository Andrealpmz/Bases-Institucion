/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.BaseDatos;
import modelo.administrator;
import modelo.teacher;
import vista.FiltarDocentes;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerTeacher implements ActionListener{

    public ControllerTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


public boolean insertTeacher(teacher objr) {
        boolean t = false;
        String sql = "insert into teacher(nameT1, lastNameT1, email,idAfk)"
                + " value('" + objr.getNameT1() + "', '" + objr.getLastNameT1() + "', '" + objr.getEmail() + "', '" + objr.getIdAfk() + "');";

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

    
            public LinkedList<teacher> BuscarTeacherRegistrado(String email, String password) {
        
        LinkedList<teacher> lc=null;
        
        String sql="SELECT idT, nameT1, lastNameT1, email  FROM teacher WHERE email = '"+email+"' && password = '"+password+"'";
        teacher objc=new teacher();
        
        lc=objc.consultarTeacher(sql);
        return lc;
    }
//          public void mostrartabla()
//    {
//        
//         BaseDatos objbd=new BaseDatos();
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("nameT1");
//        modelo.addColumn("nameT2");
//        modelo.addColumn("lastNameT1");
//        modelo.addColumn("lastNameT2");
//        modelo.addColumn("email");
//        modelo.addColumn("idAfk");
//        tabladatos.setModel(modelo);
//        
//        String sql = "SELECT * FROM teacher";
//        
//        String datos [] = new String [6];
////        BaseDatos objbd=new BaseDatos();
////        t=objbd.ejecutarSQL(sql);
//        
//        try {
//                Statement st = objbd.getConexion().createStatement();
//               ResultSet rs = st.executeQuery(sql);
//                while (rs.next()) {
//                    datos[0]=rs.getString(1);
//                    datos[1]=rs.getString(2);
//                    datos[2]=rs.getString(3);
//                    datos[3]=rs.getString(4);
//                    datos[4]=rs.getString(5);
//                    datos[5]=rs.getString(6);
//                    modelo.addRow(datos);
//                }
//                
//                tabladatos.setModel(modelo);
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(administrator.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        
//    }

    teacher t=new teacher();
    FiltarDocentes FiltarDocentes=new FiltarDocentes();
    DefaultTableModel modelo=new DefaultTableModel();

    public ControllerTeacher(FiltarDocentes f) {
        
       this.FiltarDocentes=f;
       this.FiltarDocentes.jButton1.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==FiltarDocentes.jButton1){
          listar(FiltarDocentes.tabladatos);
      }
    }
    
    public void listar (JTable tabladatos){
        modelo=(DefaultTableModel)tabladatos.getModel();
        List<teacher>lista=t.listar();
        Object[]object=new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getNameT1();
            object[1]=lista.get(i).getLastNameT1();
            object[2]=lista.get(i).getEmail();
            modelo.addRow(object);
        }
        FiltarDocentes.tabladatos.setModel(modelo);
    }

    public LinkedList<teacher> insertTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
