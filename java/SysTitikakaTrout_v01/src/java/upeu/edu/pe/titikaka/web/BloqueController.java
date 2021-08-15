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
import upeu.edu.pe.titikaka.bussines.BloqueBussines;

/**
 *
 * @author USUARIO
 */
public class BloqueController extends HttpServlet {

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
        int opt=Integer.parseInt(request.getParameter("opt"));
        BloqueBussines bloqueBussines;
        try {
           
             switch (opt) {
             case 1: {
                   bloqueBussines = new BloqueBussines();
                   List listBloque = bloqueBussines.reportBloque();
                   request.getSession().setAttribute("listBloque", listBloque);
                   response.sendRedirect("jsp/Modulos/Mantenimiento/Bloque/bloqueMain.jsp");
                }
                break;
                case 2: {
                    bloqueBussines = new BloqueBussines();
                    List listBloque = bloqueBussines.reportBloque();
                    request.getSession().setAttribute("listBloque", listBloque);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/Bloque/bloqueForm.jsp");
                
                
                }
                break;
                case 3: {
                    bloqueBussines = new BloqueBussines();
                    bloqueBussines.insertBloque(request);
                    //filialBussines = new FilialBussines();
                    List listBloque = bloqueBussines.reportBloque();
                    request.getSession().setAttribute("listaBloque", listBloque);
                    response.sendRedirect("jsp/Modulos/Mantenimiento/Bloque/bloqueMain.jsp");
                    
               }
             break;
                default: {
                    out.print("there are not values");
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
