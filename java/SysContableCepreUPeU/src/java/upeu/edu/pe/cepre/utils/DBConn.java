/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.utils;

import java.sql.*;

/**
 *
 * @author Alumno
 */
public class DBConn {

    public Connection con = null;
    public PreparedStatement ps = null;
    public PreparedStatement psId = null;
    public ResultSet rs = null;
    public ResultSet rsId = null;
    public CallableStatement cs = null;
    public int i = 0;

    public void getConexionDb() {
        STRCrypto crypt = new STRCrypto();
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            if (con == null) {
                con = DriverManager.getConnection(crypt.decrypt("SOQofoD1sZrWEg5izYvRpKhnfWnLLDKGjkm3K8Am/bWwT2NUr06vcA=="), crypt.decrypt("QO3SoaWnsxk="), crypt.decrypt("QO3SoaWnsxk="));
                System.out.println("Conexion Open!");
            }
        } catch (Exception e) {
            System.out.println("Error de Conexion " + e.getMessage());
        }
    }

    public void getCerrarConexion() {
        try {
            if (rs != null) {
                rs.close();
                System.out.println("Conexion rs Close!");
            }
            if (rsId != null) {
                rsId.close();
                System.out.println("Conexion rsId Close!");
            }
            if (ps != null) {
                ps.close();
                System.out.println("Conexion ps Close!");
            }
            if (psId != null) {
                psId.close();
                System.out.println("Conexion psId Close!");
            }
            if (cs != null) {
                cs.close();
                System.out.println("Conexion cs Close!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
