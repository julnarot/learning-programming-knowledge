/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.SeccionDaoImp;
import pe.edu.upeu.dao.SeccionDaoInt;
import pe.edu.upeu.modelo.Seccion;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author seul
 */
public class SeccionServicioImp implements SeccionServicioInt{
    SeccionDaoInt dao;
    public SeccionServicioImp(){
        dao= new SeccionDaoImp();
    }
    @Override
    public List<Seccion> listarsecciones(){
    return dao.getListAll();
    }
    @Override
    public void guardarsecion(Seccion to){
        dao.save(to);
    }
    @Override
    public void eliminarsecion(String IdSeccion){
        dao.delete(IdSeccion);    
    }
    @Override
    public void actualizarseccion(Seccion to){
        dao.update(to);
    }
    @Override
    public Seccion buscarporid(String idSeccion){
        return dao.getById(idSeccion);
    }
    
    
}
