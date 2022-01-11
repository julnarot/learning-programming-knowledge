/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.util.DBConn;

/**
 *
 * @author Alumno
 */
public class AlumnoDAO extends DBConn{
//    public int insertarAlumno(AlumnoTO to) {
//        int r=0;
//        try {
//            getConexionDb();
//           ps=con.prepareStatement("insert into "
//                   +"cultura.cp_alumno(codigo, nombre, apellidos, eap, sexo, email, telefono, estado) "
//                   + "values (?, ?, ?, ?, ?, ?, ?, ?)"); 
//            ps.setString(1, to.getCodigo());
//            ps.setString(2, to.getNombre());
//            ps.setString(3, to.getApellidos());
//            ps.setString(4, to.getEap());
//            ps.setString(5, to.getSexo());
//            ps.setString(6, to.getEmail());
//            ps.setString(7, to.getTelefono());
//            ps.setString(8, to.getEstado());
//
//            if (ps.executeUpdate() == 1) {
//                r=1;    
//                System.out.println("Insertado!!!");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        return r;
//    }    
//    
//    public AlumnoTO buscarAlumnoId(String idAlumno){
//    AlumnoTO alumno=new AlumnoTO();
//        try {
//           getConexionDb();
//            ps=con.prepareStatement("select * from cp_alumno "
//                    + "where id_alumno=? ");
//            ps.setInt(1, Integer.parseInt(idAlumno));
//            rs=ps.executeQuery();
//            if(rs.next()){
//            alumno.setId_alumno(rs.getInt("id_alumno"));    
//            alumno.setCodigo(rs.getString("codigo"));
//            alumno.setNombre(rs.getString("nombre"));
//            alumno.setApellidos(rs.getString("apellidos"));
//            alumno.setEap(rs.getString("eap"));
//            alumno.setSexo(rs.getString("sexo"));
//            alumno.setEmail(rs.getString("email"));
//            alumno.setEstado(rs.getString("estado"));
//            alumno.setTelefono(rs.getString("telefono"));   
//            
//            }
//        } catch (Exception e) {     }
//        return alumno;
//    }
//    
//    public List buscarAlumnoDatos(String datos){    
//     List lista=new ArrayList();
//        try {
//           getConexionDb();
//            ps=con.prepareStatement("select * from cultura.cp_alumno where codigo like ? ");
//            ps.setString(1, "%"+datos+"%");
//            rs=ps.executeQuery();
//            while(rs.next()){
//            AlumnoTO alumno=new AlumnoTO();
//            alumno.setId_alumno(rs.getInt("id_alumno"));    
//            alumno.setCodigo(rs.getString("codigo"));
//            alumno.setNombre(rs.getString("nombre"));
//            alumno.setApellidos(rs.getString("apellidos"));
//            alumno.setEap(rs.getString("eap"));
//            alumno.setSexo(rs.getString("sexo"));
//            alumno.setEmail(rs.getString("email"));
//            alumno.setEstado(rs.getString("estado"));
//            alumno.setTelefono(rs.getString("telefono")); 
//            lista.add(alumno);
//            }
//        } catch (Exception e) {  System.out.println(e.getMessage());   }
//        return lista;
//    }    
//    public List estadiscticAlumnoEap(){    
//     List lista=new ArrayList();
//        try {
//           getConexionDb();
//            ps=con.prepareStatement("select count(*)  cantidad, eap from cultura.cp_alumno group by eap ");           
//            rs=ps.executeQuery();
//            while(rs.next()){
//            AlumnoTO alumno=new AlumnoTO();
//            alumno.setEap(rs.getString("eap"));
//            alumno.setCantidad(rs.getInt("cantidad"));
//            lista.add(alumno);
//            }
//        } catch (Exception e) {  System.out.println(e.getMessage());   }
//        return lista;
//    }    
//    
//    public List reporteAlumno() {   //list:return del mismo tipo
//        List reporte = new ArrayList();
//        AlumnoTO to;
//        try {
//            getConexionDb();
//           
//            
//            ps = con.prepareStatement("select * from cultura.cp_alumno ");
//            rs = ps.executeQuery();
//            while (rs.next()) {
//               to = new AlumnoTO();
//                to.setId_alumno(rs.getInt("id_alumno"));
//                to.setCodigo(rs.getString("codigo"));
//                to.setNombre(rs.getString("nombre"));
//                to.setApellidos(rs.getString("apellidos"));
//                to.setEap(rs.getString("eap"));
//                to.setSexo(rs.getString("sexo"));
//                to.setEmail(rs.getString("email"));
//                to.setTelefono(rs.getString("telefono"));
//                to.setEstado(rs.getString("estado"));
//
//
//                reporte.add(to);
//                
//                
//                System.out.println("Reportado..!");
//                
//            }
//        } catch (Exception e) {
//            System.out.println("Error en Reporte alumno..." + e.getMessage());
//        }
//        finally {
//         getCerrarConexion();
//        }
//        return reporte;
//
//    }
//    public void eliminarRegistroAlumno(int id_alumno) {
//        try {
//            getConexionDb();
//            ps=con.prepareStatement("Delete FROM cultura.cp_alumno WHERE id_alumno=? ");
//            ps.setInt(1, id_alumno);
//            
//            if(ps.executeUpdate()==1){
//                
//                System.out.println(" Eliminado");
//            }
//        } catch (Exception e) {
//        }
//        finally{
//            getCerrarConexion();
//        }
//    }
//    public void actualizarDatosAlumno(AlumnoTO to,int id_alumno ) {
//        try {
//             
//            getConexionDb();
//            ps=con.prepareStatement("update cultura.cp_alumno set codigo=?, nombre=?, apellidos=?,eap=?, sexo=?, email=?, telefono=?, estado=? WHERE id_alumno=?");
//            ps.setString(1, to.getCodigo());
//            ps.setString(2, to.getNombre());
//            ps.setString(3, to.getApellidos());
//            ps.setString(4, to.getEap());
//            ps.setString(5, to.getSexo());
//            ps.setString(6, to.getEmail());
//            ps.setString(7, to.getTelefono());
//            ps.setString(8, to.getEstado());
//            ps.setInt(9, id_alumno);
//            
//            ps.executeUpdate(); 
//         
//         System.out.println("Actualizado");
//          
//        } catch (Exception e) {
//        } finally {
//            getCerrarConexion();
//        }
//    }
}




    
    
    
    
    

