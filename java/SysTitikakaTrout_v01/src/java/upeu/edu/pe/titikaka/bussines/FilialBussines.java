/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.FilialDao;
import upeu.edu.pe.titikaka.domain.FilialTo;

/**
 *
 * @author USUARIO
 */
public class FilialBussines {

    public FilialDao filialDao;

    public List reportFilial() {
        filialDao = new FilialDao();
        return filialDao.reportFilial();
    }
    public void insertFilial(HttpServletRequest request){
    FilialTo filialTo=new FilialTo();
    filialDao = new FilialDao();
    filialTo.setNombre(request.getParameter("nombre"));
    filialTo.setDescripcion(request.getParameter("descripcion"));
    filialTo.setDireccion(request.getParameter("direccion"));
    filialTo.setEstado(request.getParameter("estado"));
    filialTo.setEmail(request.getParameter("email"));
    filialTo.setTelefono(request.getParameter("telefono"));
    filialTo.setIdInstitucion(request.getParameter("id_institucion"));
    filialDao.insertFilial(filialTo);
    }
}
