/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.ActividadDao;
import upeu.edu.pe.titikaka.domain.ActividadTo;

/**
 *
 * @author USUARIO
 */
public class ActividadBussines {

    public ActividadDao actividadDao;

    public void insertPasajes(HttpServletRequest request) {

        ActividadTo actividadTo = new ActividadTo();
        actividadDao = new ActividadDao();
        actividadTo.setNombre(request.getParameter("nombre"));
        actividadTo.setDescripcion(request.getParameter("descripcion"));
        actividadTo.setIdDepartamento(request.getParameter("id_departamento"));
        actividadTo.setIdFacultad(request.getParameter("id_facultad"));
        actividadTo.setFecha(request.getParameter("fecha"));
        actividadTo.setMes(request.getParameter("mes"));
        actividadTo.setEstado(request.getParameter("estado"));
        actividadTo.setCodigo(request.getParameter("codigo"));
        actividadTo.setTipo(request.getParameter("tipo"));
        actividadTo.setIdPresupuesto(request.getParameter("id_presupuesto"));
        actividadTo.setIdUsuario(request.getParameter("id_usuario"));
        actividadDao.insertPasajes(actividadTo);
    }

    public List allPasajes() {
        actividadDao = new ActividadDao();
        return actividadDao.allPasajes();
    }

    public ActividadTo findLastIdGastoPasajesByIdUsuario(String idUsuario) {
        actividadDao = new ActividadDao();
        return actividadDao.findLastIdGastoPasajesByIdUsuario(idUsuario);
    }

    public ActividadTo findLastGastoPasajesByIdActividad(String idActividad) {
        actividadDao = new ActividadDao();
        return actividadDao.findLastGastoPasajesById(idActividad);
    }

    public void deleteGastoPasaje(String idActividad) {
        actividadDao = new ActividadDao();
        actividadDao.deleteGastoPasaje(idActividad);
    }

    public void updatePasajeFinalInsert(double costo, String idActividad) {
        actividadDao = new ActividadDao();
        actividadDao.updatePasajeFinalInsert(costo, idActividad);
    }
}
