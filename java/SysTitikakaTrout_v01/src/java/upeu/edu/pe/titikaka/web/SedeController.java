/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.edu.pe.titikaka.bussines.FilialBussines;
import upeu.edu.pe.titikaka.bussines.SedeBussines;

/**
 *
 * @author USUARIO
 */
public class SedeController extends HttpServlet {

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
        SedeBussines sedeBussines;
        FilialBussines filialBussines;
        try {
            switch (opt) {
                case 1: {
                    /*
                     * filialBussines = new FilialBussines(); List listFilial =
                     * filialBussines.reportFilial();
                     * request.getSession().setAttribute("listFilial",
                     * listFilial);
                     *
                     */
                    sedeBussines = new SedeBussines();
                    List listSede = sedeBussines.AllSedes();
                    request.getSession().setAttribute("listSede", listSede);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/Sede/sedeMain.jsp");

                }
                break;
                case 2: {
                    filialBussines = new FilialBussines();
                    List listFilial = filialBussines.reportFilial();
                    request.getSession().setAttribute("listFilial", listFilial);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/Sede/sedeForm.jsp");
                }
                break;
                case 3: {
                    sedeBussines = new SedeBussines();
                    sedeBussines.insertSede(request);

                    //sedeBussines = new SedeBussines();
                    List listSede = sedeBussines.AllSedes();
                    request.getSession().setAttribute("listSede", listSede);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/Sede/sedeMain.jsp");

                }
                default: {
                    out.print("There not is values");
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
