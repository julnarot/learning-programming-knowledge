/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.cepre.dao.CampaniaDao;
import upeu.edu.pe.cepre.domain.CampaniaTo;

/**
 *
 * @author USUARIO
 */
public class CampaniaBussines {

    public CampaniaDao campañaDao;

    public void insertCampania(HttpServletRequest request) {
        CampaniaTo campañaTo = new CampaniaTo();
        campañaDao = new CampaniaDao();
        campañaTo.setNombre(request.getParameter("nombre"));
        campañaTo.setDescripcion(request.getParameter("descripcion"));
        campañaDao.insertCampania(campañaTo);
    }

    public List allCampanias() {
        campañaDao = new CampaniaDao();
        return campañaDao.allCampanias();
    }
}
