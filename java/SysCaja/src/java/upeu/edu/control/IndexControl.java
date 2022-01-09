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
import upeu.edu.to.UsuarioTO;

/**
 *
 * @author Intel
 */
@WebServlet(name = "IndexControl", urlPatterns = {"/IndexControl"})
public class IndexControl extends HttpServlet {

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
//        UsuarioBussines usuarService;
//        try {
//            switch(opt){
//            case 'V':{
//            usuarService=new UsuarioBussines();
//            List<UsuarioTO> toUser= (List<UsuarioTO>)usuarService.validarUsuario(request);
//            if(toUser.toArray().length==1){
//                for (UsuarioTO to : toUser) {
//                  request.getSession().setAttribute("IdUsuario", to.getIdUsuario());
//                }
//                response.sendRedirect("Cultura/Admin/indexFrame.jsp");
//            }else{
//             response.sendRedirect("index.jsp");
//            }
//            
//            } break;
//            default:System.exit(0);
//            }
//            
//            
//        } finally {            
//            out.close();
//        }
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
