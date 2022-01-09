/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import pe.edu.upeu.modelo.Matricula;

/**
 *
 * @author seul
 */
public interface MatriculaServicioInt {
    public void guardarmatriculados(Matricula to);
    public void actualizarmatricula(Matricula to);
    public void eliminarmatricula(String idMatricula);
}
