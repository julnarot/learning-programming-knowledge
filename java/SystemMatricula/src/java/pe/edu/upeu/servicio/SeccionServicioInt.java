/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Seccion;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author seul
 */
public interface SeccionServicioInt {
    public List<Seccion> listarsecciones();
    public void guardarsecion(Seccion to);
    public void eliminarsecion(String IdSeccion);
    public void actualizarseccion(Seccion to);
    public Seccion buscarporid(String idSeccion);
}
