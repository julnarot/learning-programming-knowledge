/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.edu.to.PersonaTO;
import upeu.edu.util.DBConn;


public class personaDAO extends DBConn{
    
    public List ListarPersonas ()
    {
    List reporte=new ArrayList();
    PersonaTO to;
    String sql="select * from caja.persona";
        try {
            getConexionDb();
           
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            to=new PersonaTO();
            to.setIdPersona(rs.getInt("persona_id"));
            to.setNombres(rs.getString("nombres"));
            to.setApe_pat(rs.getString("ape_pate"));
            to.setApe_mate(rs.getString("ape_mat"));
            to.setCodigo(rs.getString("codigo"));
            to.setFecha_nac(rs.getString("fecha_nac"));
            to.setEmail(rs.getString("email"));
            to.setNivel(rs.getString("nivel"));
            to.setEstado(rs.getString("estado"));
            reporte.add(to);
            
             System.out.println("Reportado..!");
            }
        } catch (Exception e) {
            System.out.println("Error en Reporte alumno..." + e.getMessage());
        }
        finally {
         getCerrarConexion();
        }
        return reporte;
    }
    
    
    public int insertarAlumnoPeriodo(int idAlum,int idPer)
    {
              
        int stado=0;
        String sql="insert into cultura.cp_alumno_periodo(id_alumno,id_periodo) values(?,?)";      
        try {
        getConexionDb();
      //
        //System.out.println("PROVANDO\nCodigo:"+to.getCodigo()+" ID: "+idalumnoXcodigo(to.getCodigo()));
      //  System.out.println("Periodo:"+to.getPeriodo()+" ID: "+idPeriodoXPeriodo(to.getPeriodo()));
        ps=con.prepareStatement("insert into cultura.cp_alumno_periodo(id_alumno,id_periodo) values(?,?)");
        ps.setInt(1, idAlum);
        ps.setInt(2, idPer);
        
        if(ps.executeUpdate()==1)
        {
        stado=1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        System.out.println("Insertado!!!");
        }
        
     
        } catch (SQLException e) {
            System.out.println("Error Al Insertar Alumno :"+e.getMessage());
        }finally {
         getCerrarConexion();
        }
        
        return stado;
    
    }
   
    
     public int buscarAlumnoId(String codigo){
    int alumno=0;
        try {
           getConexionDb();
            ps=con.prepareStatement("select * from cultura.cp_alumno a "
                    + "where a.codigo=? ");
            ps.setString(1, codigo);
            rs=ps.executeQuery();
            if(rs.next()){
            alumno=rs.getInt("id_alumno");
            }
        } catch (Exception e) {     }
        return alumno;
    }
     
     
     
      public int buscarPeriodoId(String periodo){
    int per=0;
        try {
           getConexionDb();
            ps=con.prepareStatement("select * from cultura.cp_periodo p "
                    + "where p.periodo=? ");
            ps.setString(1, periodo);
            rs=ps.executeQuery();
            if(rs.next()){
            per=rs.getInt("id_periodo");
            }
        } catch (Exception e) {     }
        return per;
    }
      
      
//      public ExoneradoTO buscarAlumnoPeriodoId(String idAlumno){
//    ExoneradoTO alumno=new ExoneradoTO();
//        try {
//           getConexionDb();
//            ps=con.prepareStatement("select * from cultura.cp_alumno a,cultura.cp_alumno_periodo ap where a.id_alumno=ap.id_alumno and id_alumno=?");
//            ps.setInt(1, Integer.parseInt(idAlumno));
//            rs=ps.executeQuery();
//            if(rs.next()){
//            alumno.setId_alumno(rs.getInt("id_alumno_periodo"));                
//            alumno.setNombre(rs.getString("nombre"));
//            alumno.setApellidos(rs.getString("apellidos"));            
//            }
//        } catch (Exception e) {     }
//        return alumno;
//    }
}
