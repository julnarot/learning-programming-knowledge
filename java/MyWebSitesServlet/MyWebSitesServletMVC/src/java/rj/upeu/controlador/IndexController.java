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
import javax.servlet.http.HttpSession;
import rj.upeu.business.UsuarioBussines;
import rj.upeu.modelo.MwUsuarioTo;
/**
 *
 * @author JONATAN
 * 
 */
@WebServlet(name = "IndexController", urlPatterns = {"/IndexController"})
public class IndexController extends HttpServlet {

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
            case 'V':{
                   UsuarioBussines UserBussi=new UsuarioBussines();
                    List<MwUsuarioTo> toUser= (List<MwUsuarioTo>)UserBussi.validarUsuario(request);
                    if(toUser.toArray().length==1){
                        for (MwUsuarioTo to : toUser) {
                        HttpSession SesionActual=request.getSession(true);
                        SesionActual.setAttribute("IdUsuario", to.getUsuarioId());
                       }                        
                        response.sendRedirect("Jota/Prinsipal.jsp");
                    }else{
                    response.sendRedirect("index.jsp");
                    }
                    } break;
            case 'I':{
                UsuarioBussines UserBussi=new UsuarioBussines();
                UserBussi.CrearUsuarioBus(request);
                UserBussi=new UsuarioBussines();
                request.getSession().setAttribute("ListaUsuario",UserBussi.ReportarUsuario());
               UserBussi.ReportarUsuario(); 
               response.sendRedirect("Jot/Modulos/Usuario/UsuarioLista.jsp");
                
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
