/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import upeu.edu.pe.modelo.SacuCargarArchivo;
import upeu.edu.pe.servicio.CargarArchivoServicio;

/**
 *
 * @author nancy
 */
@Controller 
public class CargarArchivoControl {
    
    @Autowired
    
    public CargarArchivoServicio cargarArchivoServicio;
    Log log=LogFactory.getLog(CargarArchivoControl.class);
    
    @RequestMapping(value="reporteDocumentos",method= RequestMethod.GET)
    public ModelAndView irReporte(){
        List<SacuCargarArchivo> lista=cargarArchivoServicio.listaArchivos();
        
        Map<String, Object> modelo=new HashMap<String, Object>();
        modelo.put("listaArchivos", lista);
        modelo.put("msg", "reporte de archivos");
        
        return new ModelAndView("modulos/responsable/cargarArchivo",modelo);
    }
    
    @RequestMapping(value="cargarArchivoGuardar", method= RequestMethod.POST)
    public ModelAndView guardarCargarArchivo(@ModelAttribute("ModeloCargarArchivo") 
            SacuCargarArchivo CargarArchivo, BindingResult result){
        cargarArchivoServicio.ingresarArchivo(CargarArchivo);
        
       
        return new ModelAndView("index");
    }
    
    @RequestMapping(value="formCargarArchivo", method= RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloCargarArchivo") 
            SacuCargarArchivo CargarArchivo, BindingResult result){
        return new ModelAndView("modulos/responsable/formCargarArchivo");
    }
    
    @RequestMapping(value="eliminarCargaArchivo", method= RequestMethod.GET)
    public ModelAndView elimainarCargaArchivo(HttpServletRequest request){
        String idDireccion=request.getParameter("idDireccionC")==null?"":request.getParameter("idDireccionC");
        cargarArchivoServicio.eliminarCargaArchivo(idDireccion);
        return new ModelAndView("redirect:reporteDocumentos.ads");
        
    }
}
