/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.pe.cepre.dao.PresupuestoAnualDao;
import upeu.edu.pe.cepre.domain.PresupuestoAnualTo;

/**
 *
 * @author USUARIO
 */
public class PresupuestoAnualBussines {

    public PresupuestoAnualDao presupuestoAnualDao;

    public void insertPresupuestoAnual(HttpServletRequest request) {
        PresupuestoAnualTo presupuestoAnualTo = new PresupuestoAnualTo();
        presupuestoAnualDao = new PresupuestoAnualDao();
        presupuestoAnualTo.setNombre(request.getParameter("nombre"));
        presupuestoAnualTo.setMonto(Double.parseDouble(request.getParameter("monto")));
        presupuestoAnualTo.setDescripcion(request.getParameter("descripcion"));
        presupuestoAnualTo.setIdPeriodoAnual(request.getParameter("id_periodo_anual"));
        presupuestoAnualTo.setEstado(request.getParameter("estado"));
        presupuestoAnualDao.insertPresupuestoAnual(presupuestoAnualTo);
    }

    public List allPresupuestosAnuales() {
        presupuestoAnualDao = new PresupuestoAnualDao();
        return presupuestoAnualDao.allPresupuestoAnual();
    }
}
