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
import pe.edu.upeu.dao.PeriodoDaoImp;
import pe.edu.upeu.dao.PeriodoDaoInt;
import pe.edu.upeu.servicio.PeriodoServicioImp;
import pe.edu.upeu.servicio.PeriodoServicioInt;

/**
 *
 * @author pp
 */
@WebServlet(name = "ControlPeriodo", urlPatterns = {"/ControlPeriodo"})
public class ControlPeriodo extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      char opt = request.getParameter("opt").charAt(0);
        
       PeriodoServicioInt dao;
            switch (opt) {
                case 'V': {
                    try {
                        
                    dao = new PeriodoServicioImp();
                    request.getSession().setAttribute("listar", dao.listperiodo());
                    response.sendRedirect("Menu/habilitandor/habperiodo.jsp");
                    System.out.println("bien");
                    } catch (Exception e) {
                    System.out.println("error..................."+e.getMessage());
                    }
                    }
                    break;
                
             case 'A':{
                    String idperiodo = request.getParameter("idperiodo")== null?"":request.getParameter("idperiodo");
                     dao = new PeriodoServicioImp();
                    dao.eliminar(idperiodo);
                          
                    dao = new PeriodoServicioImp();
                    request.getSession().setAttribute("listar", dao.listperiodo());
                    response.sendRedirect("Menu/habilitandor/habperiodo.jsp");
                
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
