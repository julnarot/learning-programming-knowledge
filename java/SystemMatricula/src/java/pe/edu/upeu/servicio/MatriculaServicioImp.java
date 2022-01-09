/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import pe.edu.upeu.dao.MatriculaDaoImp;
import pe.edu.upeu.dao.MatriculaDaoInt;
import pe.edu.upeu.modelo.Matricula;

/**
 *
 * @author seul
 */
public class MatriculaServicioImp implements MatriculaServicioInt{
    MatriculaDaoInt DAO;
    public MatriculaServicioImp(){
    DAO= new MatriculaDaoImp();
    }
    @Override
    public void guardarmatriculados(Matricula to){
    DAO.save(to);
    }
    @Override
    public void actualizarmatricula(Matricula to){
    DAO.update(to);
    }
    @Override
    public void eliminarmatricula(String idMatricula){
    DAO.delete(idMatricula);
    }
    
    
}
