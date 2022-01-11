/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.cepre.domain.DetalleActividadTo;
import upeu.edu.pe.cepre.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class DetalleActividadDao extends DBConn {
    
    public boolean insertDetallePasaje(DetalleActividadTo detalleActividadTo) {
        
        boolean result = false;
        
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_detalle_actividad(dia,"
                    + "descripcion,importe,id_actividad) "
                    + "values(?,?,?,?)");
            ps.setString(1, detalleActividadTo.getDia());
            ps.setString(2, detalleActividadTo.getDescripcion());
            ps.setDouble(3, detalleActividadTo.getImporte());
            ps.setString(4, detalleActividadTo.getIdActividad());
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
    
    public List listDetallePasajeByIdActividad(String idActividad) {
        
        List<DetalleActividadTo> listDetallePasaje = new ArrayList<DetalleActividadTo>();
        DetalleActividadTo detalleActividadTo;
        
        try {
            getConexionDb();
            ps = con.prepareStatement("select * from sca_detalle_actividad where id_actividad=?");
            ps.setString(1, idActividad);
            rs = ps.executeQuery();
            while (rs.next()) {
                detalleActividadTo = new DetalleActividadTo();
                detalleActividadTo.setIdDetalleActividad(rs.getString("id_detalle_actividad"));
                detalleActividadTo.setDescripcion(rs.getString("descripcion"));
                detalleActividadTo.setDia(rs.getString("dia"));
                detalleActividadTo.setImporte(rs.getDouble("importe"));
                detalleActividadTo.setIdActividad(rs.getString("id_actividad"));
                listDetallePasaje.add(detalleActividadTo);
            }
            
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listDetallePasaje;
    }
    
    public DetalleActividadTo sumaImporteDetallePasaje(String idActividad) {
        DetalleActividadTo detalleActividadTo = new DetalleActividadTo();
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT SUM(IMPORTE) AS importe,id_actividad "
                    + "FROM sca_detalle_actividad "
                    + "WHERE id_actividad=?");
            ps.setString(1, idActividad);
            rs = ps.executeQuery();
            if (rs.next()) {
                detalleActividadTo.setIdActividad(rs.getString("id_actividad"));
                detalleActividadTo.setImporte(rs.getDouble("importe"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            getCerrarConexion();
        }
        return detalleActividadTo;
    }
}
