/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.CampaniaDao;
import upeu.edu.pe.titikaka.domain.CampaniaTo;

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
