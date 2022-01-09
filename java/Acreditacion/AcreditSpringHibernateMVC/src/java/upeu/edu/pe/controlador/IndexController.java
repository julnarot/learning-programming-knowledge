/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.controlador;


import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.persistence.annotations.VirtualAccessMethods;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import upeu.edu.pe.modelo.SauMenu;

/**
 *
 * @author Alumno
 */
@Controller
public class IndexController {
  
   Log logger=LogFactory.getLog(IndexController.class);
    
    @RequestMapping(value="index", method= RequestMethod.GET)
    public ModelAndView inicio(){        
        logger.info("Paso por el Index.....>");        
    return new ModelAndView("index");
    }
    @RequestMapping(value="frame", method= RequestMethod.POST)
    public ModelAndView inicioFrame(){        
        logger.info("Paso por el Index.....>");        
    return new ModelAndView("admin/indexFrame");
    }
    @RequestMapping(value="menu", method= RequestMethod.GET)
    public ModelAndView inicioMenu(){        
        logger.info("Paso por el Index.....>");        
    return new ModelAndView("admin/menu");
    }
    @RequestMapping(value="home", method= RequestMethod.GET)
    public ModelAndView inicioHome(){        
        logger.info("Paso por el Index.....>");        
    return new ModelAndView("admin/home");
    }
    
    
    @RequestMapping(value="main", method= RequestMethod.GET)
    public ModelAndView irMain(){
          Map<String, Object> modelo=new HashMap<String, Object>();
            modelo.put("nombre", "David M P");
            modelo.put("resultado", "Resultado:"+ (47+55) +" ");  
            
            logger.info("Resultado: "+ (47+55));     
        return new ModelAndView("mainPrueba", modelo);        
    }
    
    @RequestMapping(value="periodo", method= RequestMethod.GET)
    public ModelAndView irPeriodo(){
    
        return new ModelAndView("modulos/periodo/mainPeriodo");        
    }
     @RequestMapping(value="operacion", method= RequestMethod.GET)
    public ModelAndView operacion(){         
  
            return new ModelAndView("redirect:main.dmp" );    
    }
     
            
    @RequestMapping(value="recibeDato", method= RequestMethod.POST) 
     public ModelAndView datos(HttpServletRequest r){     
        String dato=r.getParameter("nombre");
        
        logger.info(dato);
        
        return new ModelAndView("redirect:main.dmp");     
     }
    
    
    
    
    
    
    @RequestMapping(value="formMenu", method= RequestMethod.GET)
    public ModelAndView irFormularioMenu(@ModelAttribute("SauMenuModelo") SauMenu menuTO, 
    BindingResult result){    
    return new ModelAndView("formMenu");
    }
    
    @RequestMapping(value="guardarFormMenu", method= RequestMethod.POST)
    public ModelAndView guardarFormMenu(@ModelAttribute("SauMenuModelo") SauMenu menuTO,
    BindingResult result){
        logger.info("Nombre: " +menuTO.getNombre());        
    return new ModelAndView("redirect:main.dmp");
    }
    
    
}
