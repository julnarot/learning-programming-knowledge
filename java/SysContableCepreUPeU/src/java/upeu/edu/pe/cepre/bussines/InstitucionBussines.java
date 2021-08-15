/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.cepre.dao.InstitucionDao;
import upeu.edu.pe.cepre.domain.InstitucionTo;

/**
 *
 * @author USUARIO
 */
public class InstitucionBussines {

    public InstitucionDao institucionDao;

    public void insertInstitucion(HttpServletRequest request) {
        InstitucionTo institucionTo = new InstitucionTo();
        institucionDao = new InstitucionDao();
        institucionTo.setRazonSocial(request.getParameter("razonSocial"));
        institucionTo.setRuc(request.getParameter("ruc"));
        institucionTo.setDireccion(request.getParameter("direccion"));
        institucionTo.setDescripcion(request.getParameter("descripcion"));
        institucionTo.setTelefono(request.getParameter("telefono"));
        institucionTo.setFax(request.getParameter("fax"));
        institucionTo.setEmail(request.getParameter("email"));
        institucionTo.setPagina(request.getParameter("pagina"));
        institucionTo.setEstado(request.getParameter("estado"));
        institucionDao.insertInstitucion(institucionTo);
    }

    public List allInstituciones() {
        institucionDao = new InstitucionDao();
        return institucionDao.allInstituciones();
    }
}
