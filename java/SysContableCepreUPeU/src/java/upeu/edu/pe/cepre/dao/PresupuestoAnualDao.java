/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.cepre.domain.PeriodoAnualTo;
import upeu.edu.pe.cepre.domain.PresupuestoAnualTo;
import upeu.edu.pe.cepre.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class PresupuestoAnualDao extends DBConn {

    public boolean insertPresupuestoAnual(PresupuestoAnualTo presupuestoAnualTo) {

        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_presupuesto_anual(nombre,"
                    + "monto,descripcion,id_periodo_anual,estado) "
                    + "values(?,?,?,?,?)");
            ps.setString(1, presupuestoAnualTo.getNombre());
            ps.setDouble(2, presupuestoAnualTo.getMonto());
            ps.setString(3, presupuestoAnualTo.getDescripcion());
            ps.setString(4, presupuestoAnualTo.getIdPeriodoAnual());
            ps.setString(5, presupuestoAnualTo.getEstado());
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

    public List allPresupuestoAnual() {
        List<PresupuestoAnualTo> listPresupuestoAnual = new ArrayList<PresupuestoAnualTo>();
        PresupuestoAnualTo presupuestoAnualTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("select prea.nombre,prea.monto,prea.descripcion,"
                    + "prea.id_periodo_anual,prea.estado,pa.nombre_periodo_anual "
                    + "from sca_presupuesto_anual prea "
                    + "inner join sca_periodo_anual pa "
                    + "on prea.id_periodo_anual=pa.id_periodo_anual");
            rs = ps.executeQuery();
            while (rs.next()) {
                presupuestoAnualTo = new PresupuestoAnualTo();
                presupuestoAnualTo.setNombre(rs.getString("nombre"));
                presupuestoAnualTo.setMonto(rs.getDouble("monto"));
                presupuestoAnualTo.setDescripcion(rs.getString("descripcion"));
                presupuestoAnualTo.setIdPeriodoAnual(rs.getString("id_periodo_anual"));
                presupuestoAnualTo.setEstado(rs.getString("estado"));
                PeriodoAnualTo periodoAnualTo = new PeriodoAnualTo();
                periodoAnualTo.setNombrePeriodoAnual(rs.getString("nombre_periodo_anual"));
                presupuestoAnualTo.setPeriodoAnualTo(periodoAnualTo);
                listPresupuestoAnual.add(presupuestoAnualTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listPresupuestoAnual;
    }

    
}
