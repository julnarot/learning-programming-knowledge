/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Alumno;

/**
 *
 * @author seul
 */
public interface AlumnoServicioInt {
     public List<Alumno> listaralumno();
    public  void registrarAlumno(Alumno to);
    public  void actualizarAlumno(Alumno to);
    public void eliminarAlumno(String idAlumno);
    public Alumno buscarModoDePago(String idAlumno);
}
