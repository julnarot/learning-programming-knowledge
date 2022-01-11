/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.business;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import rj.upeu.dao.UsuarioDAO;
import rj.upeu.modelo.MwUsuarioTo;

/**
 *
 * @author JONATAN
 */
public class UsuarioBussines {
    
    UsuarioDAO daoUser;
    public List validarUsuario(HttpServletRequest r){
    daoUser=new UsuarioDAO();
    List lista=null;
        try {
            String usuario=r.getParameter("aliasJ")==null? "":r.getParameter("aliasJ");
            String llave=r.getParameter("claveJ")==null? "":r.getParameter("claveJ");
            lista=daoUser.UsuarioValidate(usuario, llave);    
        } catch (Exception e) {
            System.out.println(e.getMessage()+e.getLocalizedMessage());
        }
    return lista;
    }
    public boolean CrearUsuarioBus(HttpServletRequest rq){
    daoUser=new UsuarioDAO();
    MwUsuarioTo to=new MwUsuarioTo();
    to.setAlias(rq.getParameter("aliasJ")==null?"":rq.getParameter("aliasJ"));
    to.setClave(rq.getParameter("claveJ")==null?"":rq.getParameter("claveJ"));
    return daoUser.CrearUsuario(to);
    }
    
    
        public List<MwUsuarioTo> ReportarUsuario(){     
     UsuarioDAO dao=new UsuarioDAO();
     return  dao.reportarUsuario();     
    }

}
