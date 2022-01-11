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
import upeu.edu.pe.dao.AdministradorDao;
import upeu.edu.pe.modelo.SacuEstandar;

/**
 *
 * @author PC
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AdministradorServicioImplement implements AdministradorServicio {

    @Autowired
    AdministradorDao administradorDao;
    
    @Override
    public List<SacuEstandar> listaEstandar(){
    
        return administradorDao.listarEstandares();
    }
    @Override
    public void eliminarEstandar(String idEstandar){
    administradorDao.eliminarEstandar(idEstandar);
    }
    @Override
    public void actualizarEstandar(SacuEstandar estandar){
    administradorDao.actualizarEstandar(estandar);
    }
    @Override
    public SacuEstandar buscarEstandarId(String EstandarId){
    return administradorDao.buscarIdEstandar(EstandarId);
    }
        
    }
    

