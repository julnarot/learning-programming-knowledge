/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.titikaka.dao.PeriodoAnualDao;
import upeu.edu.pe.titikaka.domain.PeriodoAnualTo;
import upeu.edu.pe.titikaka.domain.PresupuestoAnualTo;

/**
 *
 * @author USUARIO
 */
public class PeriodoAnualBussines {

    public PeriodoAnualDao periodoAnualDao;

    public void insertPeriodoAnual(HttpServletRequest request) {
        PeriodoAnualTo periodoAnualTo = new PeriodoAnualTo();
        periodoAnualDao = new PeriodoAnualDao();
        periodoAnualTo.setNombrePeriodoAnual(request.getParameter("nombre_periodo_anual"));
        periodoAnualTo.setFechaInicio(request.getParameter("fecha_inicio"));
        periodoAnualTo.setFechaFin(request.getParameter("fecha_fin"));
        periodoAnualTo.setIdFilial(request.getParameter("id_filial"));
        periodoAnualTo.setEstado(request.getParameter("estado"));
        periodoAnualDao.insertPeriodoAnual(periodoAnualTo);
    }

    public List allPeriodosAnuales() {
        periodoAnualDao = new PeriodoAnualDao();
        return periodoAnualDao.allPeriodosAnuales();
    }

    public PeriodoAnualTo allPeriodosAnualesById(String idPeriodoAnual) {
        periodoAnualDao = new PeriodoAnualDao();
        return periodoAnualDao.allPeriodosAnualesById(idPeriodoAnual);
    }
}