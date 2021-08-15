/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.UsuarioDao;
import upeu.edu.pe.titikaka.domain.UsuarioTo;

/**
 *
 * @author USUARIO
 */
public class UsuarioBussines {
    
    public UsuarioDao usuarioDao;
        public UsuarioTo validateUser(HttpServletRequest request,String username, String password) {
        usuarioDao=new UsuarioDao();
        return usuarioDao.validateUser(username, password);
    }
    
}
