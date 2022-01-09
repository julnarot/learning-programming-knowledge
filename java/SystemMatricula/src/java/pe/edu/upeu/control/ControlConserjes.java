/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upeu.modelo.Auxiliar;
import pe.edu.upeu.modelo.Designacion;
import pe.edu.upeu.modelo.Docente;
import pe.edu.upeu.modelo.Grado;
import pe.edu.upeu.modelo.Periodo;
import pe.edu.upeu.modelo.Seccion;
import pe.edu.upeu.servicio.AuxiliarServicioImp;
import pe.edu.upeu.servicio.AuxiliarServicioInt;
import pe.edu.upeu.servicio.DesignacionServicioImp;
import pe.edu.upeu.servicio.DesignacionServicioInt;
import pe.edu.upeu.servicio.DocenteServicioImp;
import pe.edu.upeu.servicio.DocenteServicioInt;
import pe.edu.upeu.servicio.GradoServicioImp;
import pe.edu.upeu.servicio.GradoServicioInt;
import pe.edu.upeu.servicio.PeriodoServicioImp;
import pe.edu.upeu.servicio.PeriodoServicioInt;
import pe.edu.upeu.servicio.SeccionServicioImp;
import pe.edu.upeu.servicio.SeccionServicioInt;

/**
 *
 * @author pp
 */
@WebServlet(name = "ControlConserjes", urlPatterns = {"/ControlConserjes"})
public class ControlConserjes extends HttpServlet {

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
   public String id="19";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         char opc = request.getParameter("opc").charAt(0);
        
       AuxiliarServicioInt dao;
       GradoServicioInt doo;
       PeriodoServicioInt da;
       DocenteServicioInt dd;
       GradoServicioInt as;
       SeccionServicioInt se;
       DesignacionServicioInt sd;
       
          
            switch (opc) {
                case 'V': {
                 
                    da = new PeriodoServicioImp();
                    dao = new AuxiliarServicioImp();
                    doo= new GradoServicioImp();
                    request.getSession().setAttribute("listarr", doo.listargrado());
                    request.getSession().setAttribute("per", da.listperiodo());
                    request.getSession().setAttribute("listar", dao.listarauxiliar());
                    response.sendRedirect("Menu/Administrador/conserje.jsp");
                   
                    
                    }
                    break;
                      case 'a':{
                    String idauxiliar = request.getParameter("idauxiliar")== null?"":request.getParameter("idauxiliar");
                    dao = new AuxiliarServicioImp();
                    dao.eliminarauxiliar(idauxiliar);
                          
                    da = new PeriodoServicioImp();
                    dao = new AuxiliarServicioImp();
                    doo= new GradoServicioImp();
                    request.getSession().setAttribute("listarr", doo.listargrado());
                    request.getSession().setAttribute("per", da.listperiodo());
                    request.getSession().setAttribute("listar", dao.listarauxiliar());
                    response.sendRedirect("Menu/Administrador/conserje.jsp");
                   
                
            }break;
               
              case 'c':{
                         try {
                             System.out.println("bien 1"); 
                     String idauxiliar = (request.getParameter("idauxiliar")== null?"":request.getParameter("idauxiliar"));
                    dao = new AuxiliarServicioImp();
                    Auxiliar dato=dao.buscarCodigoAuxiliarpoid(idauxiliar);
                  request.getSession().setAttribute("dato", dato);
                 response.sendRedirect("Menu/Docente/formularioasignaciondeauxiliar.jsp");
                     System.out.println("...bien update");
                         } catch (Exception e) {
                         System.out.println("errrroo"+e.getMessage());
                         }
                     }break;
                  case 'X':{                    
                       Grado ttt= new Grado();
                       ttt.setIdGrado(id);
                       
                       ttt.setNombreGrado(request.getParameter("nombregrado"));
                       
                       dao=new AuxiliarServicioImp();
                       Auxiliar t=dao.buscarporid(request.getParameter("auxiliar"));
                       ttt.setIdAuxiliar(t);
                       
                       da= new PeriodoServicioImp();
                       Periodo p=da.buscarporid(request.getParameter("periodo"));
                       ttt.setIdPeriodo(p);
                       
                       doo= new GradoServicioImp();
                       doo.guardargrado(ttt);
                       
                       doo= new GradoServicioImp();
                    request.getSession().setAttribute("listar", doo.listargrado());
                    response.sendRedirect("Menu/Docente/formularioasignaciondeauxiliar.jsp");
                     }break;
        }
    }
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
