/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.DesigancionDaoInt;
import pe.edu.upeu.dao.DesignacionDaoImp;
import pe.edu.upeu.modelo.Designacion;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author seul
 */
public class DesignacionServicioImp implements DesignacionServicioInt{
    DesigancionDaoInt dao;
    public DesignacionServicioImp(){
    dao = new DesignacionDaoImp();
    }
    @Override
    public List<Designacion> listardesignacion(){ return dao.getListAll();}
    @Override
    public void guardardedesignacion(Designacion to){ dao.save(to);}
    @Override
    public void eliminardesignacion(String IdDesignacion){ dao.delete(IdDesignacion);  }
    @Override
    public void actualizardesignacion(Designacion to){ dao.update(to);}
    @Override
     public Designacion buscarporid(String IdDesignacion){return dao.getById(IdDesignacion); }
            
}
