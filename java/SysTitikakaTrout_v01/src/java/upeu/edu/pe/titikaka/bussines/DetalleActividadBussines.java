/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.DetalleActividadDao;
import upeu.edu.pe.titikaka.domain.DetalleActividadTo;

/**
 *
 * @author USUARIO
 */
public class DetalleActividadBussines {

    public DetalleActividadDao detalleActividadDao;

    public void insertDetallePasaje(HttpServletRequest request) {
        DetalleActividadTo detalleActividadTo = new DetalleActividadTo();
        detalleActividadDao = new DetalleActividadDao();
        detalleActividadTo.setDia(request.getParameter("dia"));
        detalleActividadTo.setDescripcion(request.getParameter("descripcion"));
        detalleActividadTo.setImporte(Double.parseDouble(request.getParameter("importe")));
        detalleActividadTo.setIdActividad(request.getParameter("id_actividad"));
        detalleActividadDao.insertDetallePasaje(detalleActividadTo);
    }

    public List listDetallePasajeByIdActividad(String idActividad) {
        detalleActividadDao = new DetalleActividadDao();
        return detalleActividadDao.listDetallePasajeByIdActividad(idActividad);
    }

    public DetalleActividadTo sumaImporteDetallePasaje(String idActividad) {
        detalleActividadDao = new DetalleActividadDao();
        return detalleActividadDao.sumaImporteDetallePasaje(idActividad);
    }
}
