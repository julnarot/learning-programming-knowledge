/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.jota.controller;

import edu.jota.dao.EncuestaDAO;
import edu.jota.model.Encuesta;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author jota
 */
@WebServlet(name = "EncuestaServlet", urlPatterns = {"/EncuestaServlet"})
public class EncuestaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");                

        int opt = Integer.parseInt(request.getParameter("opt"));
        System.out.println("#:"+opt);
        EncuestaDAO EncuestaManag = new EncuestaDAO();
        List<Encuesta> listaencuesta = new ArrayList<Encuesta>();
        Encuesta enc = new Encuesta();            
        String Pregunta = "";
        Date Fecha=null;
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");                    
        
        switch (opt) {
            
            case 1: {

                listaencuesta = EncuestaManag.ReporteEncuesta();
                request.getSession().setAttribute("ListEncuesta", listaencuesta);
                response.sendRedirect("Templates/Encuestas/ResporteEncuesta.jsp");

            }
            break;
                
            case 2: {
                response.sendRedirect("Templates/Encuestas/FormEncuesta.jsp");              
            }break; 
            case 3: {
                //response.sendRedirect("Templates/Encuestas/FormEncuesta.jsp");
                
                //Obteniendo Fecha en Var
                Pregunta = request.getParameter("IPregunta");
            try {
                //                Fecha    = request.getParameter("IFecha");
               Fecha = (Date) formatter.parse(request.getParameter("IFecha"));
            } catch (ParseException ex) {
                Logger.getLogger(EncuestaServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
                enc.setPregunta(Pregunta);
                enc.setFechaAlta(Fecha);
                if(EncuestaManag.AgregarEncuesta(enc))
                {
                    System.out.println("Ingresado");
                }else
                System.out.println("error");
                
                
                listaencuesta = EncuestaManag.ReporteEncuesta();
                request.getSession().setAttribute("ListEncuesta", listaencuesta);
                response.sendRedirect("Templates/Encuestas/ResporteEncuesta.jsp");
            }
            break;
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
