/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.FilialTo;
import upeu.edu.pe.titikaka.domain.PeriodoAnualTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class PeriodoAnualDao extends DBConn {

    public boolean insertPeriodoAnual(PeriodoAnualTo periodoAnualTo) {
        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_periodo_anual(nombre_periodo_anual,"
                    + "fecha_inicio,fecha_fin,id_filial,estado) "
                    + "values(?,?,?,?,?)");
            ps.setString(1, periodoAnualTo.getNombrePeriodoAnual());
            ps.setString(2, periodoAnualTo.getFechaInicio());
            ps.setString(3, periodoAnualTo.getFechaFin());
            ps.setString(4, periodoAnualTo.getIdFilial());
            ps.setString(5, periodoAnualTo.getEstado());
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

    public List allPeriodosAnuales() {
        List<PeriodoAnualTo> listPeriodoAnual = new ArrayList<PeriodoAnualTo>();
        PeriodoAnualTo periodoAnualTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("select pa.id_periodo_anual,pa.nombre_periodo_anual,"
                    + "pa.fecha_inicio,pa.fecha_fin,pa.estado,pa.id_filial,f.nombre "
                    + "from sca_periodo_anual pa "
                    + "inner join sca_filial f "
                    + "on pa.id_filial=f.id_filial");
            rs = ps.executeQuery();
            while (rs.next()) {
                periodoAnualTo = new PeriodoAnualTo();
                periodoAnualTo.setNombrePeriodoAnual(rs.getString("nombre_periodo_anual"));
                periodoAnualTo.setFechaInicio(rs.getString("fecha_inicio"));
                periodoAnualTo.setFechaFin(rs.getString("fecha_fin"));
                periodoAnualTo.setIdFilial(rs.getString("id_filial"));
                FilialTo filialTo = new FilialTo();
                filialTo.setNombre(rs.getString("f.nombre"));
                periodoAnualTo.setFilialTo(filialTo);
                periodoAnualTo.setEstado(rs.getString("estado"));
                periodoAnualTo.setIdPeriodoAnual(rs.getString("id_periodo_anual"));
                listPeriodoAnual.add(periodoAnualTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listPeriodoAnual;
    }

    public PeriodoAnualTo allPeriodosAnualesById(String idPeriodoAnual) {
        PeriodoAnualTo periodoAnualTo = new PeriodoAnualTo();
        try {
            getConexionDb();
            ps = con.prepareStatement("select pa.id_periodo_anual,"
                    + "pa.id_periodo_anual,pa.nombre_periodo_anual,"
                    + "pa.fecha_inicio,pa.fecha_fin,pa.estado,pa.id_filial,f.nombre "
                    + "from sca_periodo_anual pa "
                    + "inner join sca_filial f "
                    + "on pa.id_filial=f.id_filial where pa.id_periodo_anual=?");
            ps.setString(1, idPeriodoAnual);
            rs = ps.executeQuery();
            if (rs.next()) {
                periodoAnualTo.setIdPeriodoAnual(rs.getString("id_periodo_anual"));
                periodoAnualTo.setNombrePeriodoAnual(rs.getString("nombre_periodo_anual"));
                periodoAnualTo.setFechaInicio(rs.getString("fecha_inicio"));
                periodoAnualTo.setFechaFin(rs.getString("fecha_fin"));
                periodoAnualTo.setIdFilial(rs.getString("id_filial"));
                FilialTo filialTo = new FilialTo();
                filialTo.setNombre(rs.getString("f.nombre"));
                periodoAnualTo.setFilialTo(filialTo);
                periodoAnualTo.setEstado(rs.getString("estado"));
                periodoAnualTo.setIdPeriodoAnual(rs.getString("id_periodo_anual"));

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return periodoAnualTo;
    }
}
