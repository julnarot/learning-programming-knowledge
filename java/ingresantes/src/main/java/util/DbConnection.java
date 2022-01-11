/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jota
 */
public class DbConnection {
           
   public Connection Conexion = null;
   public PreparedStatement Prsta = null;
   public ResultSet ResSet = null;
   public Statement Sta = null;
    
    public Connection ObtenerConexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            System.out.println("Validando Driver De Conexion a Base de Datos");
        } catch (Exception e) {
            System.out.println("Error al Identificar Driver -> "+ e.getMessage()+"\n >>");
            e.printStackTrace();
        }
                
        String RutServ = "jdbc:mysql://mysql-arjhey.alwaysdata.net/arjhey_jota";
//        String RutServ = "jdbc:mysql://localhost/arjhey_jota";
        String Usuario = "arjhey";
        String Clave = "12345678";
        try{              
        Conexion = DriverManager.getConnection(RutServ,Usuario,Clave);  
//        System.out.println("Conexion a DB Establecida!!");
        } catch (Exception ex) {            
            System.out.println("Erro de Conexion de Bas de Datos: "+ex.getMessage()+" -> " + ex.getLocalizedMessage());
        }
        return Conexion;    
    }
    public void CerrarConexion(){
       try {
           if (Conexion != null) {Conexion.close();}
           if (Prsta != null) {Prsta.close();}
           if (ResSet != null) {ResSet.close();}
           if (Sta != null) {Sta.close();}        
//           System.out.println("Conexion a DB  Cerrada");
       } catch (SQLException ex) {           
           System.out.println("Error al Cerrar Db: " + ex.getMessage());
           ex.printStackTrace();
       }
//       return Conexion;
    }    
}
