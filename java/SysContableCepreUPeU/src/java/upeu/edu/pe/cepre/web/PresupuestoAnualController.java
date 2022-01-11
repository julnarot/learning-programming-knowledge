/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.edu.pe.cepre.bussines.PeriodoAnualBussines;
import upeu.edu.pe.cepre.bussines.PresupuestoAnualBussines;

/**
 *
 * @author USUARIO
 */
public class PresupuestoAnualController extends HttpServlet {

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
        int opt = Integer.parseInt(request.getParameter("opt"));
        PresupuestoAnualBussines presupuestoAnualBussines;
        PeriodoAnualBussines periodoAnualBussines;
        try {
            switch (opt) {
                case 1: {
                    presupuestoAnualBussines = new PresupuestoAnualBussines();
                    List listPresupuestoAnual = presupuestoAnualBussines.allPresupuestosAnuales();
                    request.getSession().setAttribute("listPresupuestoAnual", listPresupuestoAnual);
                    response.sendRedirect("jsp/Modulos/Presupuestos/presupuestoMain.jsp");
                }
                break;
                case 2: {
                    periodoAnualBussines = new PeriodoAnualBussines();
                    List listPeriodoAnual = periodoAnualBussines.allPeriodosAnuales();
                    request.getSession().setAttribute("listPeriodoAnual", listPeriodoAnual);
                    response.sendRedirect("jsp/Modulos/Presupuestos/presupuestoForm.jsp");

                }
                break;
                case 3: {
                    presupuestoAnualBussines = new PresupuestoAnualBussines();
                    presupuestoAnualBussines.insertPresupuestoAnual(request);

                    //presupuestoAnualBussines = new PresupuestoAnualBussines();
                    List listPresupuestoAnual = presupuestoAnualBussines.allPresupuestosAnuales();
                    request.getSession().setAttribute("listPresupuestoAnual", listPresupuestoAnual);
                    response.sendRedirect("jsp/Modulos/Presupuestos/presupuestoMain.jsp");
                }
                break;
                default: {
                    out.print("There are not values");
                }
            }
        } finally {
            out.close();
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
