/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.ActividadTo;
import upeu.edu.pe.titikaka.domain.DepartamentoTo;
import upeu.edu.pe.titikaka.domain.FacultadTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class ActividadDao extends DBConn {

    public boolean insertPasajes(ActividadTo actividadTo) {

        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_actividad(nombre,"
                    + "id_departamento,id_facultad,fecha,codigo,mes,estado,tipo,"
                    + "descripcion,id_presupuesto,id_usuario) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, actividadTo.getNombre());
            ps.setString(2, actividadTo.getIdDepartamento());
            ps.setString(3, actividadTo.getIdFacultad());
            ps.setString(4, actividadTo.getFecha());
            ps.setString(5, actividadTo.getCodigo());
            ps.setString(6, actividadTo.getMes());
            ps.setString(7, actividadTo.getEstado());
            ps.setString(8, actividadTo.getTipo());
            ps.setString(9, actividadTo.getDescripcion());
            ps.setString(10, actividadTo.getIdPresupuesto());
            ps.setString(11, actividadTo.getIdUsuario());
            if (ps.executeUpdate() == 1) {
                result = true;
            } else {
                result = false;
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return result;
    }

    public List allPasajes() {
        List<ActividadTo> listPasajes = new ArrayList<ActividadTo>();
        ActividadTo actividadTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT * FROM sca_actividad a "
                    + "INNER JOIN sca_presupuesto p "
                    + "ON a.id_presupuesto=p.id_presupuesto "
                    + "LEFT JOIN sca_facultad fa "
                    + "ON a.id_facultad=fa.id_facultad "
                    + "LEFT JOIN sca_departamento d "
                    + "ON a.id_departamento=d.id_departamento "
                    + "INNER JOIN sca_usuario u "
                    + "ON a.id_usuario=u.id_usuario");
            rs = ps.executeQuery();
            while (rs.next()) {
                actividadTo = new ActividadTo();
                actividadTo.setNombre(rs.getString("nombre"));
                actividadTo.setCodigo(rs.getString("codigo"));
                actividadTo.setDescripcion(rs.getString("descripcion"));
                actividadTo.setMes(rs.getString("mes"));
                actividadTo.setEstado(rs.getString("estado"));
                actividadTo.setFecha(rs.getString("fecha"));
                actividadTo.setCosto(rs.getDouble("costo"));
                DepartamentoTo departamentoTo = new DepartamentoTo();
                departamentoTo.setNombre(rs.getString("d.nombre"));
                actividadTo.setDepartamentoTo(departamentoTo);
                FacultadTo facultadTo = new FacultadTo();
                facultadTo.setNombre(rs.getString("fa.nombre"));
                actividadTo.setFacultadTo(facultadTo);
                listPasajes.add(actividadTo);

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listPasajes;

    }

    public ActividadTo findLastIdGastoPasajesByIdUsuario(String idUsuario) {

        ActividadTo actividadTo = new ActividadTo();
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT MAX(id_actividad) AS id FROM sca_actividad WHERE id_usuario=?");
            ps.setString(1, idUsuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                actividadTo.setIdActividad(rs.getString("id"));
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return actividadTo;
    }

    public ActividadTo findLastGastoPasajesById(String idActividad) {

        ActividadTo actividadTo = new ActividadTo();
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT * FROM sca_actividad a "
                    + "INNER JOIN sca_presupuesto p "
                    + "ON a.id_presupuesto=p.id_presupuesto "
                    + "LEFT JOIN sca_facultad fa "
                    + "ON a.id_facultad=fa.id_facultad "
                    + "LEFT JOIN sca_departamento d "
                    + "ON a.id_departamento=d.id_departamento "
                    + "INNER JOIN sca_usuario u "
                    + "ON a.id_usuario=u.id_usuario "
                    + "WHERE a.id_actividad=?");
            ps.setString(1, idActividad);
            rs = ps.executeQuery();
            if (rs.next()) {
                actividadTo.setIdActividad(rs.getString("id_actividad"));
                actividadTo.setNombre(rs.getString("nombre"));
                actividadTo.setCodigo(rs.getString("codigo"));
                actividadTo.setDescripcion(rs.getString("descripcion"));
                actividadTo.setMes(rs.getString("mes"));
                actividadTo.setEstado(rs.getString("estado"));
                actividadTo.setFecha(rs.getString("fecha"));
                DepartamentoTo departamentoTo = new DepartamentoTo();
                departamentoTo.setNombre(rs.getString("d.nombre"));
                actividadTo.setDepartamentoTo(departamentoTo);
                FacultadTo facultadTo = new FacultadTo();
                facultadTo.setNombre(rs.getString("fa.nombre"));
                actividadTo.setFacultadTo(facultadTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return actividadTo;
    }

    public boolean deleteGastoPasaje(String idActividad) {
        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("delete from sca_actividad where id_actividad=?");
            psId = con.prepareStatement("delete from sca_detalle_actividad where id_actividad=?");
            ps.setString(1, idActividad);
            psId.setString(1, idActividad);
            if (ps.executeUpdate() == 1 && psId.executeUpdate() == 1) {
                result = true;
            } else {
                result = false;
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return result;
    }

    public void updatePasajeFinalInsert(double costo, String idActividad) {

        try {
            getConexionDb();
            ps = con.prepareStatement("update sca_actividad set costo=? where id_Actividad=?");
            ps.setDouble(1, costo);
            ps.setString(2, idActividad);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            getCerrarConexion();
        }

    }
}
