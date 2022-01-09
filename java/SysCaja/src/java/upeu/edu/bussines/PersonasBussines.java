/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import upeu.edu.dao.personaDAO;

/**
 *
 * @author Alumno
 */
public class PersonasBussines {
    public personaDAO dao;
    
    
//    public void insertarAlumno(HttpServletRequest r){
//        AlumnoTO to = new AlumnoTO();
//        dao = new AlumnoDAO();        
//        to.setCodigo(r.getParameter("codigo")==null?"":r.getParameter("codigo"));
//        to.setNombre(r.getParameter("nombre")==null?"":r.getParameter("nombre"));
//        to.setApellidos(r.getParameter("apellidos")==null?"":r.getParameter("apellidos"));
//        to.setEap(r.getParameter("eap")==null?"":r.getParameter("eap"));
//        to.setSexo(r.getParameter("sexo")==null?"":r.getParameter("sexo"));
//        to.setEmail(r.getParameter("email")==null?"":r.getParameter("email"));
//        to.setTelefono(r.getParameter("telefono")==null?"":r.getParameter("telefono"));
//        to.setEstado(r.getParameter("estado")==null?"":r.getParameter("estado"));
//        dao.insertarAlumno(to);        
//    }
//    public void actualizarAlumno(HttpServletRequest r){
//        AlumnoTO to = new AlumnoTO();
//        dao = new AlumnoDAO();        
//        to.setCodigo(r.getParameter("codigo")==null?"":r.getParameter("codigo"));
//        to.setNombre(r.getParameter("nombre")==null?"":r.getParameter("nombre"));
//        to.setApellidos(r.getParameter("apellidos")==null?"":r.getParameter("apellidos"));
//        to.setEap(r.getParameter("eap")==null?"":r.getParameter("eap"));
//        to.setSexo(r.getParameter("sexo")==null?"":r.getParameter("sexo"));
//        to.setEmail(r.getParameter("email")==null?"":r.getParameter("email"));
//        to.setTelefono(r.getParameter("telefono")==null?"":r.getParameter("telefono"));
//        to.setEstado(r.getParameter("estado")==null?"":r.getParameter("estado"));
//        int idAlumno=Integer.parseInt(r.getParameter("idAlumno")==null?"":r.getParameter("idAlumno"));
//        dao.actualizarDatosAlumno(to,idAlumno );        
//    }
//    
//    public List buscarAlumnoDato(String dato){
//    dao=new AlumnoDAO();
//    return dao.buscarAlumnoDatos(dato);
//    }
//    public AlumnoTO buscarAlumnoId(String dato){
//    dao=new AlumnoDAO();
//    return dao.buscarAlumnoId(dato);
//    }    
    
    public List reportarPersonas(){    
        dao=new personaDAO();
        return  dao.ListarPersonas();
    }
//    public List estadiscticAlumnoEap(){    
//        dao=new AlumnoDAO();
//        return  dao.estadiscticAlumnoEap();
//    }
//    
//    
//    public void eliminarAlumno(int idAlumno){
//    dao=new AlumnoDAO();
//    dao.eliminarRegistroAlumno(idAlumno);    
//    }
}
