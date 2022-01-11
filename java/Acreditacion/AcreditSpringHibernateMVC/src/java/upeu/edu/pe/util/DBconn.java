/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class DBconn {

    Connection conn;

    public Connection getConnection() {

        if (conn == null) {
            try {//obtener conexion
                String sc = "jdbc:oracle:thin:@localhost:1521:xe";
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                conn = DriverManager.getConnection(sc, "acreditacion", "123456");
                System.out.println("Connection Successful");
            } catch (SQLException e) {
                System.out.println("DBConn.getConnection " + e.getMessage() + " try again ");
            }
        }
        return conn;//devuelve la conexion
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
                System.out.println("Close Connection.");
            }
        } catch (SQLException e) {
        }
    }

//    public static void main(String[] args) {
//        
//        DBconn conn=new DBconn();
//        try {
//              conn.getConnection();
//              conn.close();
//        } catch (Exception e) {
//            System.out.println("e:" + e.getMessage());
//        }
//    }
}
