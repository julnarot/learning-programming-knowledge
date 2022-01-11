/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.PeriodoDaoImp;
import pe.edu.upeu.dao.PeriodoDaoInt;
import pe.edu.upeu.modelo.Periodo;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author seul
 */
public class PeriodoServicioImp  implements PeriodoServicioInt{
    PeriodoDaoInt dao;
    public PeriodoServicioImp(){
        dao = new PeriodoDaoImp();
    }
    @Override
    public List<Periodo> listperiodo(){ return dao.getListAll(); }
    @Override
    public void guardarperiodo(Periodo to){ dao.save(to);    }
    @Override
    public void eliminar(String idPeriodo){ dao.delete(idPeriodo);   }
    @Override
    public void editar(Periodo to){ dao.update(to);}
    public Periodo buscarporid(String idPeriodo){
        return dao.getById(idPeriodo);
    }
}
