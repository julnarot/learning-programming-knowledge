/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import rj.upeu.business.LibroBusiness;
import rj.upeu.business.PaginaBusiness;
import rj.upeu.modelo.MwLibroTo;

/**
 *
 * @author USUARIO
 */
@WebServlet(name = "LibroController", urlPatterns = {"/LibroController"})
public class LibroController extends HttpServlet {

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
         
        try {
            switch(opt){
            case 'R':{
               LibroBusiness ab = new LibroBusiness();
               request.getSession().setAttribute("ListaLibro",ab.ReportarLibroBus());               
               response.sendRedirect("Jota/Modulos/Libro/MainLibro.jsp");
                    }break;
            case 'C':{
                LibroBusiness LibBussi=new LibroBusiness();
                String idq=LibBussi.CrearLibroBus(request);
                
                request.getSession().setAttribute("IdLi",idq);               
                response.sendRedirect("Jota/Modulos/Libro/AddPagina.jsp");
                                
                    }break; 
            case 'I':{
                LibroBusiness ab = new LibroBusiness();
                request.getSession().setAttribute("ListarLibroId", ab.ReportarLibroId(request));
                response.sendRedirect("Jota/Modulos/Libro/UpdateLibro.jsp");
                    }break;   
            case 'U':{                
                LibroBusiness LibrBussi=new LibroBusiness();                
                LibrBussi.ModificarLibro(request);
                LibroBusiness ab = new LibroBusiness();
                request.getSession().setAttribute("ListaLibro",ab.ReportarLibroBus());
                response.sendRedirect("Jota/Modulos/Libro/MainLibro.jsp");
                    }break;
            case 'M':{
                LibroBusiness libu = new LibroBusiness();
                libu.ModificarLibro(request);
               LibroBusiness ab = new LibroBusiness();
               request.getSession().setAttribute("ListaLibro",ab.ReportarLibroBus());               
               response.sendRedirect("Jota/Modulos/Libro/MainLibro.jsp"); 
                    }break;
            
            case 'N':{
                PaginaBusiness PagBussi=new PaginaBusiness();                
                request.getSession().setAttribute("ListaPaginaF",PagBussi.ReportarPaginaIdPagBus(request.getParameter("PaginaIdJ")==null?"":request.getParameter("PaginaIdJ")));               
                response.sendRedirect("Jota/Modulos/Libro/UpdatePagina.jsp");
                    }break;                                 
            
            case 'G':{                                                
                request.getSession().setAttribute("IdLi",request.getParameter("LibroIdJ")==null?"":request.getParameter("LibroIdJ"));               
                response.sendRedirect("Jota/Modulos/Libro/AddPagina.jsp");
                    }break;    
            case 'S':{
                PaginaBusiness PagBussi=new PaginaBusiness();
                PagBussi.AgregarPagina(request);
                
                LibroBusiness ab = new LibroBusiness();
                request.getSession().setAttribute("ListaLibro",ab.ReportarLibroBus());               
                response.sendRedirect("Jota/Modulos/Libro/MainLibro.jsp");
                    }break;     
                
                
                
                    default:System.exit(0);                    
                    }
        }catch(IOException e){System.out.println(e.getMessage());}
    
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
