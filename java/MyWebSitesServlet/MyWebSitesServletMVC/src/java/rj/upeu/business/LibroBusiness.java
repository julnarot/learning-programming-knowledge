/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.business;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import rj.upeu.dao.LibroDao;
import rj.upeu.modelo.MwLibroTo;

/**
 *
 * @author @JONATAN
 */
public class LibroBusiness {
private LibroDao daolibro;
public String CrearLibroBus(HttpServletRequest rq){
    daolibro=new LibroDao();
    MwLibroTo to=new MwLibroTo();
    to.setAutor(rq.getParameter("AutorJ")==null?"":rq.getParameter("AutorJ"));
    to.setNombre(rq.getParameter("NombreJ")==null?"":rq.getParameter("NombreJ"));
    to.setColor(rq.getParameter("ColorJ")==null?"":rq.getParameter("ColorJ"));    
    to.setImgPortada(rq.getParameter("ImgPortadaJ")==null?"":rq.getParameter("ImgPortadaJ"));
    to.setContraPortada(rq.getParameter("ContraPortadaJ")==null?"":rq.getParameter("ContraPortadaJ"));    
    return daolibro.AgregarLibro(to);
    }
    
    public List<MwLibroTo> ReportarLibroBus(){     
    daolibro=new LibroDao();
    return  daolibro.ListarLibro();     
    }
    
    public List<MwLibroTo> ReportarLibroId(HttpServletRequest rq){
    daolibro=new LibroDao();
    String IdL=rq.getParameter("LibroIdJ")==null?"":rq.getParameter("LibroIdJ");
    return  daolibro.ReportarLibroId(IdL);
    }
    public boolean ModificarLibro(HttpServletRequest rq)
    {
        daolibro=new LibroDao();
        MwLibroTo to=new MwLibroTo();
    to.setAutor(rq.getParameter("AutorJ")==null?"":rq.getParameter("AutorJ"));
    to.setNombre(rq.getParameter("NombreJ")==null?"":rq.getParameter("NombreJ"));
    to.setColor(rq.getParameter("ColorJ")==null?"":rq.getParameter("ColorJ"));    
    to.setImgPortada(rq.getParameter("ImgPortadaJ")==null?"":rq.getParameter("ImgPortadaJ"));
    to.setContraPortada(rq.getParameter("ContraPortadaJ")==null?"":rq.getParameter("ContraPortadaJ"));
    to.setEstado(rq.getParameter("EstadoJ")==null?"":rq.getParameter("EstadoJ"));
    String idl=rq.getParameter("LibroIdJ")==null?"":rq.getParameter("LibroIdJ");
       return daolibro.ModificarLibro(to, idl);
    }
    
    
}
