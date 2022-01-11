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
import upeu.edu.bussines.PersonasBussines;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "PersonaControl", urlPatterns = {"/PersonaControl"})
public class PersonaControl extends HttpServlet {

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
       
        PersonasBussines ab;
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
                case 'A':{
//                ab=new AlumnoBussines();
//                ab.actualizarAlumno(request);
//                ab=new AlumnoBussines();
//                List listaAlumno=ab.reportarAlumno();
//                request.getSession().setAttribute("listaAlumno", listaAlumno);
//                response.sendRedirect("Cultura/Modulos/Alumno/MainPrueba.jsp");
                }break; 
                case 'R':{
                ab=new PersonasBussines();
                List listaPerson=ab.reportarPersonas();
                request.getSession().setAttribute("listaPersona", listaPerson);                
                response.sendRedirect("Caja/Modulos/Persona/MainPersona.jsp");
                }break; 
                case 'D':{
//                ab=new AlumnoBussines();
//                int idAlumno =Integer.parseInt(request.getParameter("idAlumno"));
//                ab.eliminarAlumno(idAlumno);
//
//                ab=new AlumnoBussines();
//                List listaAlumno=ab.reportarAlumno();
//                request.getSession().setAttribute("listaAlumno", listaAlumno);                
//                response.sendRedirect("Cultura/Modulos/Alumno/MainPrueba.jsp");                
                }break; 
                case 'B': {
//                String dato=request.getParameter("dato");
//                ab=new AlumnoBussines();    
//                List lista=ab.buscarAlumnoDato(dato);
//                request.getSession().setAttribute("listaAlumno", lista);
//                response.sendRedirect("Cultura/Modulos/Alumno/MainPrueba.jsp");
                } break;

                case 'E': {  
//                ab=new AlumnoBussines();
//                String idAlumno =request.getParameter("idAlumno");
//                AlumnoTO datoAlumno=ab.buscarAlumnoId(idAlumno);
//                request.getSession().setAttribute("datosAlumno", datoAlumno);                
//                response.sendRedirect("Cultura/Modulos/Exonerados/mainExonerados.jsp");
                } break;
                    
                case 'F': {  
//                ab=new AlumnoBussines();
//                 String dato=request.getParameter("q")==null?"":request.getParameter("q");
//                List<AlumnoTO> lista=ab.buscarAlumnoDato(dato);
//                    if(lista.toArray().length>0){
//                    for (AlumnoTO to : lista) {
//                        out.print(to.getCodigo()+"|"+to.getNombre()+"\n");
//                    }}else{out.print("No Existe"+"| \n");}
//                
                } 
                break;
                case 'S': {  
//                ab=new AlumnoBussines();                 
//                List lista=ab.estadiscticAlumnoEap();
//                request.getSession().setAttribute("DataEstadisticaEap", lista);                
//                response.sendRedirect("Cultura/Modulos/Estadistica/StatisticEap.jsp");
                } break;
                  
                  
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
        System.out.println("GEttttttt....."+request.getParameter("nombre"));
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
        System.out.println("POSttttttt....."+request.getParameter("nombre"));
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
