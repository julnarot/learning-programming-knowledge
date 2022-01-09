/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Grado;

/**
 *
 * @author seul
 */
public interface GradoServicioInt {
    public List<Grado> listargrado();
    public void guardargrado(Grado to);
    public void actualizargrado(Grado to);
    public void eliminargrado(String idgrado);
    public Grado buscarporid(String idGrado);
    
}
