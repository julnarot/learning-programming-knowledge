/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Tipo;

/**
 *
 * @author seul
 */
public interface TipoServicioInt {
    public List<Tipo> listartipo();
    public void guardartipo(Tipo to);
}
