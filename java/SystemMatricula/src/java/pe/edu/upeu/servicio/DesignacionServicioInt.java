/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Designacion;

/**
 *
 * @author seul
 */
public interface DesignacionServicioInt {
    public List<Designacion> listardesignacion();
    public void guardardedesignacion(Designacion to);
    public void eliminardesignacion(String IdDesignacion);
    public void actualizardesignacion(Designacion to);
    public Designacion buscarporid(String IdDesignacion);
}
