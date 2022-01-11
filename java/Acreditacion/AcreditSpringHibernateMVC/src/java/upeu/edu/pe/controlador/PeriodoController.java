/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import upeu.edu.pe.modelo.SauPeriodo;
import upeu.edu.pe.modelo.ViewEstandar;
import upeu.edu.pe.servicio.PeriodoServicio;

/**
 *
 * @author Alumno
 */
@Controller
public class PeriodoController {
    @Autowired
    public PeriodoServicio periodoServicio;
    Log log=LogFactory.getLog(PeriodoController.class);    
  
    
  @RequestMapping(value="reporte", method= RequestMethod.GET)
   public ModelAndView irReporte(){         
       List<ViewEstandar> ddEstandars=periodoServicio.listacantidadEstandar();
      for (ViewEstandar viewEstandar : ddEstandars) {
          log.info("Holas" + viewEstandar.getCantidad()+"  "+viewEstandar.getNombre());
          
      }
      periodoServicio.insertarEstandarEval("20121022002", "20121015002");
      List<SauPeriodo> lista=periodoServicio.listaPeriodo();              
       Map<String, Object> modelo=new HashMap<String, Object>();
       modelo.put("listPeriodo", lista);
       modelo.put("msg", "Reporte de Periodo");
      
   return new ModelAndView("modulos/periodo/mainPeriodo", modelo);
   }
   
   @RequestMapping(value="periodoGuardar", method= RequestMethod.POST)
   public ModelAndView guardarPeriodo(@ModelAttribute("ModeloPeriodo") SauPeriodo periodo, BindingResult result) {  
       periodoServicio.insertarPeriodo(periodo);

   return new ModelAndView("redirect:reporte.dmp");
   }
   
   @RequestMapping(value="formPeriodo", method= RequestMethod.GET)
   public ModelAndView irFormulario(@ModelAttribute("ModeloPeriodo") SauPeriodo periodo, BindingResult result){   
       return new ModelAndView("modulos/periodo/formPeriodo");
   }
    @RequestMapping(value="eliminarPer", method= RequestMethod.GET)
   public ModelAndView eliminarPeriodo(HttpServletRequest request){
       String idPeriodo =request.getParameter("idPeriodoP")==null?"":request.getParameter("idPeriodoP");
       periodoServicio.eliminarPeriodo(idPeriodo);
   return new ModelAndView("redirect:reporte.dmp");
   }
    /*Editar Periodo*/
    @RequestMapping(value="editarPeriodo", method= RequestMethod.GET)
    public ModelAndView editarPeriodoForm(HttpServletRequest request){
    String idPeriodo=request.getParameter("idPeriodoP")==null?"":request.getParameter("idPeriodoP");
    SauPeriodo periodoTO=null;
    periodoTO=periodoServicio.buscarPeriodoId(idPeriodo);    
    return new ModelAndView("modulos/periodo/formEditPeriodo", "ActualizarModelo",periodoTO);    
    }
    
    @RequestMapping(value="actualizarPeriodo", method= RequestMethod.POST)
    public ModelAndView actualizarPeriodo(@ModelAttribute("ActualizarModelo") SauPeriodo periodo, BindingResult result){
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        String fechaRecepcionadaI=String.valueOf(periodo.getFechaInicio());        
        String fechaRecepcionadaF=String.valueOf(periodo.getFechaFin());        
        System.out.println(fechaRecepcionadaF);
        try {
            periodo.setFechaInicio(format.parse(fechaRecepcionadaI));
            periodo.setFechaFin(format.parse(fechaRecepcionadaF));
        } catch (ParseException ex) {
            Logger.getLogger(PeriodoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    periodoServicio.actualizarPeriodo(periodo);
    return new ModelAndView("redirect:reporte.dmp");
    }
} 






