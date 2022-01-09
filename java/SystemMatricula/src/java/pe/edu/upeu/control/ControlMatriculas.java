/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upeu.modelo.Designacion;
import pe.edu.upeu.modelo.Docente;
import pe.edu.upeu.servicio.DesignacionServicioImp;
import pe.edu.upeu.servicio.DesignacionServicioInt;
import pe.edu.upeu.servicio.DocenteServicioImp;
import pe.edu.upeu.servicio.DocenteServicioInt;

/**
 *
 * @author seul
 */
@WebServlet(name = "ControlMatriculas", urlPatterns = {"/ControlMatriculas"})
public class ControlMatriculas extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public String id="100";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        char opc = request.getParameter("opc").charAt(0);
        
       DocenteServicioInt dao;
       DesignacionServicioInt doo;
            switch (opc) {
                    case 'V': {
                  
                    dao = new DocenteServicioImp();
                    request.getSession().setAttribute("listar", dao.listardocente());
                    response.sendRedirect("Menu/Docente/docente.jsp");
                  
                   
                    break;
                    }
                    case 'G':{
                    try{
                    Docente to = new Docente();
                    to.setIdDocente(id);
                    System.out.println(id);
                    to.setNombre(request.getParameter("nombre"));
                    System.out.println(request.getParameter("nombre"));
                    to.setApellidopat(request.getParameter("apellidopat"));
                    System.out.println(request.getParameter("apellidopat"));
                    to.setApellidomat(request.getParameter("apellidomat"));
                    System.out.println(request.getParameter("apellidomat"));
                    to.setEspecialidad(request.getParameter("especialidad"));
                    System.out.println(request.getParameter("especialidad"));
                    to.setCodigo(Integer.parseInt(request.getParameter("codigo")));
                    System.out.println(Integer.parseInt(request.getParameter("codigo")));
                    to.setSexo(request.getParameter("sexo"));
                    System.out.println(request.getParameter("sexo"));
                    dao = new DocenteServicioImp();
                    dao.registrardocente(to);
                    
                    System.out.println("BIEN");
                    dao = new DocenteServicioImp();
                    request.getSession().setAttribute("listar", dao.listardocente());
                    response.sendRedirect("Menu/Docente/docente.jsp");
                    
                    } catch (Exception e) {
                    System.out.println("error..................."+e.getMessage());
                    }
                    }break;
                    case 'E':{
                    String idDocente = request.getParameter("idDocente")== null?"":request.getParameter("idDocente");
                    dao = new DocenteServicioImp();
                    dao.eliminardocente(idDocente);
                          
                    dao = new DocenteServicioImp();
                    request.getSession().setAttribute("listar", dao.listardocente());
                    response.sendRedirect("Menu/Docente/docente.jsp");
                
                     }break;
                    case 'B':{
                         try {
                             
                     String idDocente=(request.getParameter("idDocente")==null?"":request.getParameter("idDocente"));
                     dao = new DocenteServicioImp();
                     Docente dato=dao.buscarporid(idDocente);
            
            
            
                       request.getSession().setAttribute("datos", dato);
                     response.sendRedirect("Menu/Docente/formdocente.jsp");
                     System.out.println("...bien");
                         } catch (Exception e) {
                         System.out.println("..."+e.getMessage());
                         }
                     }break;
                        case 'U':{
                     Docente to = new Docente();
                    to.setIdDocente(id);
                    System.out.println(id);
                    to.setNombre(request.getParameter("nombre"));
                    System.out.println(request.getParameter("nombre"));
                    to.setApellidopat(request.getParameter("apellidopat"));
                    System.out.println(request.getParameter("apellidopat"));
                    to.setApellidomat(request.getParameter("apellidomat"));
                    System.out.println(request.getParameter("apellidomat"));
                    to.setEspecialidad(request.getParameter("especialidad"));
                    System.out.println(request.getParameter("especialidad"));
                    to.setCodigo(Integer.parseInt(request.getParameter("codigo")));
                    System.out.println(Integer.parseInt(request.getParameter("codigo")));
                    to.setSexo(request.getParameter("sexo"));
                    System.out.println(request.getParameter("sexo"));
                    dao = new DocenteServicioImp();
                    dao.actualizardocente(to);
                    dao = new DocenteServicioImp();
                    request.getSession().setAttribute("listar", dao.listardocente());
                    response.sendRedirect("Menu/Docente/docente.jsp");
                     }break;
                     case 'W':{
                     try {
                     String idDocente=(request.getParameter("idDocente")==null?"":request.getParameter("idDocente"));
                     dao = new DocenteServicioImp();
                     Docente dato=dao.buscarporid(idDocente);
                     request.getSession().setAttribute("datos", dato);
                     response.sendRedirect("Menu/Docente/formdocente.jsp");
                     System.out.println("...bien");
                     } catch (Exception e) {
                     System.out.println("..."+e.getMessage());
                     }
                     }break;
                     case 'X':{
                     Designacion to = new Designacion();
                    to.setIdDesignacion(id);
                    doo= new DesignacionServicioImp();
                    
                    
                    
                    System.out.println("BIEN");
                    dao = new DocenteServicioImp();
                    request.getSession().setAttribute("listar", dao.listardocente());
                    response.sendRedirect("Menu/Docente/docente.jsp");
                    
                    
                    }break;
                     
                         
                            
                            
    }}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
