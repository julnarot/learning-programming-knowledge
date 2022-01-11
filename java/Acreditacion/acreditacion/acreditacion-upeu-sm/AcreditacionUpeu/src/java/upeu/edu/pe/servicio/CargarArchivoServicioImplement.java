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
import upeu.edu.pe.dao.CargarArchivoDao;
import upeu.edu.pe.modelo.SacuCargarArchivo;

/**
 *
 * @author nancy
 */
@Service
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class CargarArchivoServicioImplement implements CargarArchivoServicio{
    @Autowired
    public CargarArchivoDao cargarArchivoDao;
    
    @Override
    
    public List<SacuCargarArchivo> listaArchivos(){
        return cargarArchivoDao.listaArchivos();
    }
    
    @Override
    
    public void ingresarArchivo(SacuCargarArchivo CargarArchivo){
        cargarArchivoDao.ingresarArchivo(CargarArchivo);
        
    }
    
    @Override
    
    public SacuCargarArchivo obtenerListadoCargaArchivo(String idDireccion){
        return cargarArchivoDao.obtenerListadoCargaArchivo(idDireccion);
    }
    
    @Override
    
    public void eliminarCargaArchivo(String idDireccion){
        cargarArchivoDao.eliminarCargaArchivo(idDireccion);
    }
}
