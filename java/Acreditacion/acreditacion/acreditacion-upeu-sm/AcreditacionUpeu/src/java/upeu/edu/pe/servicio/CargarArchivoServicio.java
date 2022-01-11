/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.servicio;

import java.util.List;
import upeu.edu.pe.modelo.SacuCargarArchivo;

/**
 *
 * @author nancy
 */
public interface CargarArchivoServicio {
    public List<SacuCargarArchivo> listaArchivos();
    public void ingresarArchivo(SacuCargarArchivo CargarArchivo);
    public SacuCargarArchivo obtenerListadoCargaArchivo(String idDireccion);
    public void eliminarCargaArchivo(String idDireccion);
    
}
