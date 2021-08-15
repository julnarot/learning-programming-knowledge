/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.cepre.dao.PeriodoDao;
import upeu.edu.pe.cepre.domain.PeriodoTo;

/**
 *
 * @author USUARIO
 */
public class PeriodoBussines {

    public PeriodoDao periodoDao;

    public void insertPeriodo(HttpServletRequest request) {
        PeriodoTo periodoTo = new PeriodoTo();
        periodoDao = new PeriodoDao();
        periodoTo.setNombre(request.getParameter("nombre"));
        periodoTo.setTipoPeriodo(request.getParameter("tipo_periodo"));
        periodoTo.setFechaInicio(request.getParameter("fecha_inicio"));
        periodoTo.setFechaFin(request.getParameter("fecha_fin"));
        periodoTo.setEstado(request.getParameter("estado"));
        periodoTo.setIdCampania(request.getParameter("id_campaña"));
        periodoTo.setIdPeriodoAnual(request.getParameter("id_periodo_anual"));
        periodoDao.insertPeriodo(periodoTo);
    }
}
