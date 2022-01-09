/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.dao;

import java.util.List;
import upeu.edu.pe.modelo.SauPeriodo;
import upeu.edu.pe.modelo.ViewEstandar;

/**
 *
 * @author Alumno
 */
public interface PeriodoDao {
     public List<SauPeriodo> listaPeriodo();  
     public List<ViewEstandar> listacantidadEstandar();
     public void insertarEstandarEval(String idPeriodo, String idEap );
     public void insertarPeriodo(SauPeriodo periodo );
     public void eliminarPeriodo(String idPeriodo);
     public SauPeriodo buscarIdPeriodo(String idPeriodo);
     public void actualizarPeriodo(SauPeriodo periodo);
}
