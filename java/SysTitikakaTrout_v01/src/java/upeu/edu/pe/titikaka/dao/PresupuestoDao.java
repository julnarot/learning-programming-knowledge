/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.*;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class PresupuestoDao extends DBConn {

    public List allPresupuestos() {

        List<PresupuestoTo> listPresupuesto = new ArrayList<PresupuestoTo>();
        PresupuestoTo presupuestoTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT * FROM sca_presupuesto p "
                    + "LEFT JOIN sca_periodo pe "
                    + "ON p.id_periodo=pe.id_periodo "
                    + "LEFT JOIN sca_sede s "
                    + "ON p.id_sede=s.id_sede "
                    + "LEFT JOIN sca_presupuesto_anual pa "
                    + "ON p.id_presupuesto_anual=pa.id_presupuesto_anual "
                    + "LEFT JOIN sca_campaña c "
                    + "ON pe.id_campaña=c.id_campaña");
            rs = ps.executeQuery();
            while (rs.next()) {
                presupuestoTo = new PresupuestoTo();
                presupuestoTo.setNombre(rs.getString("nombre"));
                presupuestoTo.setDescripcion(rs.getString("descripcion"));
                presupuestoTo.setEstado(rs.getString("estado"));
                presupuestoTo.setFechaFin(rs.getString("fecha_fin"));
                presupuestoTo.setFechaInicio(rs.getString("fecha_inicio"));
                presupuestoTo.setIdPeriodo(rs.getString("id_periodo"));
                presupuestoTo.setIdPresupuesto(rs.getString("id_presupuesto"));
                presupuestoTo.setIdPresupuestoAnual(rs.getString("id_presupuesto_anual"));
                presupuestoTo.setIdSede(rs.getString("id_sede"));
                presupuestoTo.setSaldoInicial(rs.getDouble("saldo_inicial"));
                presupuestoTo.setSaldoFinal(rs.getDouble("saldo_final"));
                presupuestoTo.setTipo(rs.getString("tipo"));
                presupuestoTo.setTipoMoneda("tipo_moneda");
                SedeTo sedeTo = new SedeTo();
                sedeTo.setNombre(rs.getString("s.nombre"));
                presupuestoTo.setSedeTo(sedeTo);
                PresupuestoAnualTo presupuestoAnualTo = new PresupuestoAnualTo();
                presupuestoAnualTo.setNombre(rs.getString("pa.nombre"));
                presupuestoTo.setPresupuestoAnualTo(presupuestoAnualTo);
                PeriodoTo periodoTo = new PeriodoTo();
                periodoTo.setNombre(rs.getString("pe.nombre"));
                presupuestoTo.setPeriodoTo(periodoTo);
                CampaniaTo campaniaTo = new CampaniaTo();
                campaniaTo.setNombre(rs.getString("c.nombre"));
                periodoTo.setCampaniaTo(campaniaTo);
                listPresupuesto.add(presupuestoTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listPresupuesto;

    }
}
