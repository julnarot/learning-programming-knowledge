/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import upeu.edu.pe.titikaka.domain.PeriodoTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class PeriodoDao extends DBConn {

    public boolean insertPeriodo(PeriodoTo periodoTo) {
        boolean result=false;
        try {
            ps=con.prepareStatement("insert into sca_periodo(nombre,tipo_periodo,"
                    + "fecha_inicio,fecha_fin,estado,id_periodo_anual,id_campaña) "
                    + "values(?,?,?,?,?,?,?)");
            ps.setString(1, periodoTo.getNombre());
            ps.setString(2, periodoTo.getTipoPeriodo());
            ps.setString(3, periodoTo.getFechaInicio());
            ps.setString(4, periodoTo.getFechaFin());
            ps.setString(5, periodoTo.getEstado());
            ps.setString(6, periodoTo.getIdPeriodoAnual());
            ps.setString(7, periodoTo.getIdCampania());
            if(ps.executeUpdate()==1){result=true;}
            else{result=false;}
            getConexionDb();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            getCerrarConexion();    
        }
        return result;
    }
}
