/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Periodo;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author seul
 */
public interface PeriodoServicioInt  {
    public List<Periodo> listperiodo();
    public void guardarperiodo(Periodo to);
    public void eliminar(String idPeriodo);
    public void editar(Periodo to);
    public Periodo buscarporid(String idPeriodo);
}
