/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.cepre.dao.SedeDao;
import upeu.edu.pe.cepre.domain.SedeTo;

/**
 *
 * @author USUARIO
 */
public class SedeBussines {

    public SedeDao sedeDao;

    public void insertSede(HttpServletRequest request) {
        SedeTo sedeTo = new SedeTo();
        sedeDao = new SedeDao();
        sedeTo.setDescripcion(request.getParameter("descripcion"));
        sedeTo.setDireccion(request.getParameter("direccion"));
        sedeTo.setIdFilial(request.getParameter("id_filial"));
        sedeTo.setNombre(request.getParameter("nombre"));
        sedeTo.setTipoSede(request.getParameter("tipo_sede"));
        sedeDao.insertSede(sedeTo);

    }

    public List AllSedes() {
        sedeDao = new SedeDao();
        return sedeDao.AllSedes();
    }
}
