/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.BloqueDao;
import upeu.edu.pe.titikaka.domain.BloqueTo;

/**
 *
 * @author USUARIO
 */
public class BloqueBussines {

    public BloqueDao bloqueDao;

    public void insertBloque(HttpServletRequest request) {
        BloqueTo bloqueTo = new BloqueTo();
        bloqueDao = new BloqueDao();
        bloqueTo.setNombre(request.getParameter("nombre"));
        bloqueTo.setTotalpeces(request.getParameter("totalpeces"));
        bloqueTo.setTotalpeso(request.getParameter("totalpeso"));
        bloqueTo.setEstado(request.getParameter("estado"));
        bloqueDao.insertBloque(bloqueTo);
    }
    
        public List reportBloque() {
            bloqueDao = new BloqueDao();
            return bloqueDao.allBloque();
    }
    
    /*
    public List allBloque() {
        bloqueDao = new BloqueDao();
        return bloqueDao.allBloque();
    }

    public ActividadTo findLastIdGastoPasajesByIdUsuario(String idUsuario) {
        bloqueDao = new BloqueDao();
        return bloqueDao.findLastIdGastoPasajesByIdUsuario(idUsuario);
    }

    public ActividadTo findLastGastoPasajesByIdActividad(String idActividad) {
        bloqueDao = new BloqueDao();
        return bloqueDao.findLastGastoPasajesById(idActividad);
    }

    public void deleteGastoPasaje(String idActividad) {
        bloqueDao = new BloqueDao();
        bloqueDao.deleteGastoPasaje(idActividad);
    }

    public void updatePasajeFinalInsert(double costo, String idActividad) {
        bloqueDao = new BloqueDao();
        bloqueDao.updatePasajeFinalInsert(costo, idActividad);
    }
    */
}

