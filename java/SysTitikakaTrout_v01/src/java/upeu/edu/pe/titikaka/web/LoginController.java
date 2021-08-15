/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.edu.pe.titikaka.bussines.UsuarioBussines;
import upeu.edu.pe.titikaka.domain.UsuarioTo;
import upeu.edu.pe.titikaka.utils.STRCrypto;

/**
 *
 * @author USUARIO
 */
public class LoginController extends HttpServlet {

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
        UsuarioBussines usuarioBussines;
        STRCrypto crypto = new STRCrypto();
        try {
            switch (opt) {
                case 1: {
                    String user = request.getParameter("txtUsername");
                    String pass = crypto.encrypt(request.getParameter("txtPassword"));
                    System.out.println(pass);
                    if (user != null & pass != null) {
                        usuarioBussines = new UsuarioBussines();
                        if (usuarioBussines.validateUser(request, user, pass).getIdUsuario() != null) {
                            UsuarioTo userVal = usuarioBussines.validateUser(request, user, pass);
                            request.getSession().setAttribute("userValidated", userVal);
                            System.out.println(userVal.getUsername());
                            response.sendRedirect("jsp/Frames/User/indexFrame.jsp");
                        } else {
                            response.sendRedirect("jsp/Modulos/Seguridad/loginForm.jsp?msg='No existe este usuario'");
                        }
                    } else {
                        response.sendRedirect("jsp/Modulos/Seguridad/loginForm.jsp?msg='No existe este usuario'");
                    }

                }break;
                case 2: {
                    request.getSession().removeAttribute("userValidated");
                    request.getSession().invalidate();
                    response.sendRedirect("../SysContableCepreUPeU");
                }
                break;
                default:
                    System.out.print("no hay valores");
            }

        } catch (Exception e) {
            e.getMessage();
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
