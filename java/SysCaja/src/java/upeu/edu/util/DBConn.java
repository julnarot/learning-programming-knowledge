
package upeu.edu.util;
import java.sql.*;
import org.postgresql.Driver;

public class DBConn {
public Connection con=null; 
public PreparedStatement ps=null;
public ResultSet rs=null;
public int i=0;


public void getConexionDb(){
    try {
        DriverManager.registerDriver(new Driver());
        if(con==null){
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/caja","caja", "123456");
        
        System.out.println("Conexion Exitosa.....!!!");
        }
    } catch (SQLException e) {
        System.out.println("Error de Conexion "+e.getMessage());
    }

}
//
//public boolean getConexionDbX(){
//    boolean conexion=false;
//    try {
//        DriverManager.registerDriver(new Driver());
//        if(con==null){
//        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/cultura","cultura", "123456");        
//        if(con!=null){
//        conexion=true;
//        }
//        System.out.println("Conexion Exitosa.....!!!");
//        }
//    } catch (Exception e) {
//        System.out.println("Error de Conexion "+e.getMessage());
//    }
// return conexion;
//}

public void getCerrarConexion(){
    try {
        if(rs!=null){rs.close();}
        if(ps!=null){ps.close();}
        if (con!=null) {con.close();}
    } catch (Exception e) {
    }
}

}
