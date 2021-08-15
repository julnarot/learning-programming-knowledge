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
import upeu.edu.pe.cepre.bussines.ActividadBussines;
import upeu.edu.pe.cepre.bussines.DepartamentoBussines;
import upeu.edu.pe.cepre.bussines.DetalleActividadBussines;
import upeu.edu.pe.cepre.bussines.FacultadBussines;
import upeu.edu.pe.cepre.bussines.PresupuestoBussines;
import upeu.edu.pe.cepre.domain.ActividadTo;
import upeu.edu.pe.cepre.domain.DetalleActividadTo;
import upeu.edu.pe.cepre.domain.UsuarioTo;

/**
 *
 * @author USUARIO
 */
public class ActividadController extends HttpServlet {

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
        ActividadBussines actividadBussines;
        FacultadBussines facultadBussines;
        DepartamentoBussines departamentoBussines;
        PresupuestoBussines presupuestoBussines;
        DetalleActividadBussines detalleActividadBussines;
        try {

            switch (opt) {

                case 1: {
                    actividadBussines = new ActividadBussines();
                    List listPasajes = actividadBussines.allPasajes();
                    request.getSession().setAttribute("listPasajes", listPasajes);
                    response.sendRedirect("jsp/Modulos/Gastos/Pasajes/pasajeMain.jsp");
                }
                break;
                case 2: {
                    facultadBussines = new FacultadBussines();
                    List listFacultades = facultadBussines.allFacultades();
                    request.getSession().setAttribute("listFacultades", listFacultades);
                    departamentoBussines = new DepartamentoBussines();
                    List listDepartamentos = departamentoBussines.allDepartamentos();
                    request.getSession().setAttribute("listDepartamentos", listDepartamentos);
                    presupuestoBussines = new PresupuestoBussines();
                    List listPresupuestos = presupuestoBussines.allPresupuestos();
                    request.getSession().setAttribute("listPresupuestos", listPresupuestos);
                    response.sendRedirect("jsp/Modulos/Gastos/Pasajes/pasajeForm.jsp");
                }
                break;

                case 3: {
                    //inserta pasajes y recupera el id usuario
                    actividadBussines = new ActividadBussines();
                    actividadBussines.insertPasajes(request);
                    UsuarioTo usuarioToVal = (UsuarioTo) request.getSession().getAttribute("userValidated");
                    //recupera el ultimo id del pasaje por el id del usuario
                    //actividadBussines = new ActividadBussines();
                    ActividadTo findLastPasajeByUser = actividadBussines.findLastIdGastoPasajesByIdUsuario(usuarioToVal.getIdUsuario());
                    //lista la ultima actividad del usuario por medio del id actividad recuperado anteriormente
                    //actividadBussines = new ActividadBussines();
                    ActividadTo lastPasajeByIdActividad = actividadBussines.findLastGastoPasajesByIdActividad(findLastPasajeByUser.getIdActividad());
                    request.getSession().setAttribute("lastPasajeByIdActividad", lastPasajeByIdActividad);
                    response.sendRedirect("jsp/Modulos/Gastos/Pasajes/detallePasajeMain.jsp");
                }
                break;
                case 4: {
                    actividadBussines = new ActividadBussines();
                    UsuarioTo usuarioToVal = (UsuarioTo) request.getSession().getAttribute("userValidated");
                    ActividadTo findLastPasajeByUser = actividadBussines.findLastIdGastoPasajesByIdUsuario(usuarioToVal.getIdUsuario());
                    actividadBussines.deleteGastoPasaje(findLastPasajeByUser.getIdActividad());
                    List listPasajes = actividadBussines.allPasajes();
                    request.getSession().setAttribute("listPasajes", listPasajes);
                    request.getSession().removeAttribute("listDetallePasaje");
                    response.sendRedirect("jsp/Modulos/Gastos/Pasajes/pasajeMain.jsp");
                }
                break;

                case 5: {
                    actividadBussines = new ActividadBussines();
                    UsuarioTo usuarioToVal = (UsuarioTo) request.getSession().getAttribute("userValidated");
                    ActividadTo findLastPasajeByUser = actividadBussines.findLastIdGastoPasajesByIdUsuario(usuarioToVal.getIdUsuario());
                    detalleActividadBussines = new DetalleActividadBussines();
                    DetalleActividadTo detalleActividadTo = detalleActividadBussines.sumaImporteDetallePasaje(findLastPasajeByUser.getIdActividad());
                    actividadBussines.updatePasajeFinalInsert(detalleActividadTo.getImporte(), detalleActividadTo.getIdActividad());
                    request.getSession().removeAttribute("listDetallePasaje");
                    request.getSession().removeAttribute("lastPasajeByIdActividad");
                    List listPasajes = actividadBussines.allPasajes();
                    request.getSession().setAttribute("listPasajes", listPasajes);
                    response.sendRedirect("jsp/Modulos/Gastos/Pasajes/pasajeMain.jsp");
                }

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
