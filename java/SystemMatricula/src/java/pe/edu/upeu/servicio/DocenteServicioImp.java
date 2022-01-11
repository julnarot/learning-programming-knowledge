/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.DocenteDaoImp;
import pe.edu.upeu.dao.DocenteDaoInt;
import pe.edu.upeu.modelo.Docente;

/**
 *
 * @author seul
 */
public class DocenteServicioImp implements DocenteServicioInt{
    DocenteDaoInt dao;

    public DocenteServicioImp() {
        dao = new DocenteDaoImp();
        
    }
    @Override
    public List<Docente> listardocente(){
        return dao.getListAll();
    }
    @Override
    public void registrardocente(Docente to){
        dao.save(to);
    }
    @Override
    public void actualizardocente(Docente to){
        dao.update(to);
    }
    @Override
    public void eliminardocente(String idDocente){
        dao.delete(idDocente);
    } 
    @Override
    public Docente buscarporid(String idDocente){
        return dao.getById(idDocente);
    }
}