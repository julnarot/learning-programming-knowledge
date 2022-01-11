/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.GradoDaoImp;
import pe.edu.upeu.dao.GradoDaoInt;
import pe.edu.upeu.modelo.Docente;
import pe.edu.upeu.modelo.Grado;

/**
 *
 * @author seul
 */
public class GradoServicioImp implements GradoServicioInt{
    GradoDaoInt dao;
    public GradoServicioImp(){
        dao = new GradoDaoImp();
    }
    @Override
    public List<Grado> listargrado(){ return dao.getListAll();    }
    @Override
    public void guardargrado(Grado to){ dao.save(to);}
    @Override
    public void actualizargrado(Grado to){ dao.update(to);}
    @Override
    public void eliminargrado(String idgrado){  dao.delete(idgrado);}
    @Override
    public Grado buscarporid(String idGrado){
        return dao.getById(idGrado);
    }
}
