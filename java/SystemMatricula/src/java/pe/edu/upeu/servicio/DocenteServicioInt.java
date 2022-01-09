/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Docente;

/**
 *
 * @author seul
 */
public interface DocenteServicioInt {
      public List<Docente> listardocente();
    public void registrardocente(Docente to);
    public void actualizardocente(Docente to);
    public void eliminardocente(String id);
    public Docente buscarporid(String idDocente);
}
