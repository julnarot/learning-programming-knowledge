/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.AlumnoDaoImp;
import pe.edu.upeu.dao.AlumnoDaoInt;
import pe.edu.upeu.modelo.Alumno;

/**
 *
 * @author seul
 */
public class AlumnoServicioImp implements AlumnoServicioInt{
    AlumnoDaoInt dao;

    public AlumnoServicioImp(AlumnoDaoInt dao) {
        dao = new AlumnoDaoImp();
    }

    @Override
    public List<Alumno> listaralumno() {
        return dao.getListAll();
    }

    @Override
    public void registrarAlumno(Alumno to) {
        dao.save(to);
    }

    @Override
    public void actualizarAlumno(Alumno to) {
        dao.update(to);
    }

    @Override
    public void eliminarAlumno(String idAlumno) {
        dao.delete(idAlumno);
    }

    @Override
    public Alumno buscarModoDePago(String idAlumno) {
        return dao.getById(idAlumno);
    }
    
    
   
}
