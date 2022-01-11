/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.edu.bussines.CuentaBussines;

/**
 *
 * @author DIGESI
 */
@WebServlet(name = "CuentaControl", urlPatterns = {"/CuentaControl"})
public class CuentaControl extends HttpServlet {

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
      
        char opt=request.getParameter("opt").charAt(0);
       
        CuentaBussines ab;
        try {
            switch(opt){
                case '1':{
//                ab=new AlumnoBussines();
//                ab.insertarAlumno(request);
//                ab=new AlumnoBussines();
//                List listaAlumno=ab.reportarAlumno();
//                request.getSession().setAttribute("listaAlumno", listaAlumno);
//                response.sendRedirect("Cultura/Modulos/Alumno/MainPrueba.jsp");
                }break; 
               
                    
                case 'R':{
                ab=new CuentaBussines();
                List listaPerson=ab.Reportecuentas();
                request.getSession().setAttribute("listaCuen", listaPerson);                
                response.sendRedirect("Caja/Modulos/Cuentas/MainCuenta.jsp");
                }break; 
               
                  
                  
                default:{
                    System.out.println("No hay valores....");
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
