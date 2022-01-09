/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.business;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import rj.upeu.dao.PaginaDAO;
import rj.upeu.modelo.MwPaginaTo;

/**
 *
 * @author @JONATAN
 */
public class PaginaBusiness {
private PaginaDAO daopag;

public List<MwPaginaTo> ReportarPaginaIdBus(String id){     
    daopag=new PaginaDAO();
    return  daopag.ListarPaginaId(id);
    }
public List<MwPaginaTo> ReportarPaginaIdPagBus(String id){     
    daopag=new PaginaDAO();
    return  daopag.ListarPaginaIdPag(id);
    }

public boolean AgregarPagina(HttpServletRequest rq){
    daopag=new PaginaDAO();
    MwPaginaTo to=new MwPaginaTo();
    to.setContenido(rq.getParameter("ContenidoJ")==null?"":rq.getParameter("ContenidoJ"));
    to.setNumPagina(rq.getParameter("NumPaginaJ")==null?"":rq.getParameter("NumPaginaJ"));
    to.setLibroId(rq.getParameter("LibroIdJ")==null?"":rq.getParameter("LibroIdJ"));
    return daopag.AgregarPagina(to);
    }
    public void ModificarPagina(HttpServletRequest rq){
      MwPaginaTo to=new MwPaginaTo();      
      daopag=new PaginaDAO();
        to.setContenido(rq.getParameter("ContenidoJ")==null?"":rq.getParameter("ContenidoJ"));
        to.setNumPagina(rq.getParameter("NumPaginaJ")==null?"":rq.getParameter("NumPaginaJ"));
        String id=rq.getParameter("PaginaIdJ")==null?"":rq.getParameter("PaginaIdJ");
        System.out.println("modificando desde bussines");
        daopag.ModificarPagina(to,id);
    }
    
    
}
