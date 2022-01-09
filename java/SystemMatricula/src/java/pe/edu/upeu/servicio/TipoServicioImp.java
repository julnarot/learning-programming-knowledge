/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.TipoDaoImp;
import pe.edu.upeu.dao.TipoDaoInt;
import pe.edu.upeu.modelo.Tipo;

/**
 *
 * @author seul
 */
public class TipoServicioImp implements TipoServicioInt{
    TipoDaoInt dao;
    public TipoServicioImp(){
        dao= new TipoDaoImp();
    }
    @Override
    public List<Tipo> listartipo(){
    return dao.getListAll();
    }
    @Override
    public void guardartipo(Tipo to){
    dao.save(to);
    }
    
}
