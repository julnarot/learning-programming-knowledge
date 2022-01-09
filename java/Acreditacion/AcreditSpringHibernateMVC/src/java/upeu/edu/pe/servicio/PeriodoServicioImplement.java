/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import upeu.edu.pe.dao.PeriodoDao;
import upeu.edu.pe.modelo.SauPeriodo;
import upeu.edu.pe.modelo.ViewEstandar;

/**
 *
 * @author Alumno
 */
@Service
@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
public class PeriodoServicioImplement implements PeriodoServicio{    
   @Autowired
   public PeriodoDao periodoDao;
   
   @Override
   public List<SauPeriodo> listaPeriodo(){
   return periodoDao.listaPeriodo();
   }
   
   @Override
    public List<ViewEstandar> listacantidadEstandar(){
   return periodoDao.listacantidadEstandar();
   }
   
    @Override
   public void  insertarPeriodo(SauPeriodo periodo){
       periodoDao.insertarPeriodo(periodo);
   }
    @Override
   public void  insertarEstandarEval(String idPeriodo, String idEap ){
       periodoDao.insertarEstandarEval(idPeriodo, idEap);
   }
    
    @Override
    public void eliminarPeriodo(String idPeriodo){
    periodoDao.eliminarPeriodo(idPeriodo);
    }
    
    @Override
    public SauPeriodo buscarPeriodoId(String idPeriodo){
    return periodoDao.buscarIdPeriodo(idPeriodo);
    }
      
    @Override
    public void actualizarPeriodo(SauPeriodo periodo){
    periodoDao.actualizarPeriodo(periodo);
    }
}
