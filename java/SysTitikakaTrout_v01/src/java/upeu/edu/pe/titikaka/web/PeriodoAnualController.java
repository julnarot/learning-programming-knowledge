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
import upeu.edu.pe.titikaka.bussines.CampaniaBussines;
import upeu.edu.pe.titikaka.bussines.FilialBussines;
import upeu.edu.pe.titikaka.bussines.PeriodoAnualBussines;
import upeu.edu.pe.titikaka.domain.PeriodoAnualTo;

/**
 *
 * @author USUARIO
 */
public class PeriodoAnualController extends HttpServlet {

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
        PeriodoAnualBussines periodoAnualBussines;
        FilialBussines filialBussines;
        CampaniaBussines campaniaBussines;
        try {

            switch (opt) {
                case 1: {
                    periodoAnualBussines = new PeriodoAnualBussines();
                    List listPeriodoAnual = periodoAnualBussines.allPeriodosAnuales();
                    request.getSession().setAttribute("listPeriodoAnual", listPeriodoAnual);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/PeriodoAnual/periodoAnualMain.jsp");
                }
                break;
                case 2: {
                    filialBussines = new FilialBussines();
                    List listFilial = filialBussines.reportFilial();
                    request.getSession().setAttribute("listFilial", listFilial);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/PeriodoAnual/periodoAnualForm.jsp");
                }
                break;
                case 3: {
                    periodoAnualBussines = new PeriodoAnualBussines();
                    periodoAnualBussines.insertPeriodoAnual(request);

                    //periodoAnualBussines = new PeriodoAnualBussines();
                    List listPeriodoAnual = periodoAnualBussines.allPeriodosAnuales();
                    request.getSession().setAttribute("listPeriodoAnual", listPeriodoAnual);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/PeriodoAnual/periodoAnualMain.jsp");
                }
                break;
                case 4:{
                    periodoAnualBussines = new PeriodoAnualBussines();
                    String idPeriodoAnual = request.getParameter("id_periodo_anual");
                    PeriodoAnualTo periodoAnualToById = periodoAnualBussines.allPeriodosAnualesById(idPeriodoAnual);
                    request.getSession().setAttribute("periodoAnualById", periodoAnualToById);
                    campaniaBussines = new CampaniaBussines();
                    List listCampanias = campaniaBussines.allCampanias();
                    request.getSession().setAttribute("listCampanias", listCampanias);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/Periodo/periodoForm.jsp");
                }break;
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
