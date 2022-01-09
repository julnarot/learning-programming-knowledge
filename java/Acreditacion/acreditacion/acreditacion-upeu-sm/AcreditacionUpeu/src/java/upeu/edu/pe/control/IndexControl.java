/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User07
 */
@Controller
public class IndexControl {
    
    @RequestMapping(value="login", method= RequestMethod.GET)
    public ModelAndView inicio(){        
             
    return new ModelAndView("modulos/login");
    }
    @RequestMapping(value="frame", method= RequestMethod.POST)
    public ModelAndView inicioFrame(){        
               
    return new ModelAndView("admin/indexFrame");
    }
    @RequestMapping(value="menu", method= RequestMethod.GET)
    public ModelAndView inicioMenu(){        
          
    return new ModelAndView("admin/menu");
    }
    @RequestMapping(value="home", method= RequestMethod.GET)
    public ModelAndView inicioHome(){        
              
    return new ModelAndView("admin/home");
    }
    
    //metodos de ayuda solo para ir mientras esta en prueba
    
    @RequestMapping(value="reponsable", method= RequestMethod.GET)
    public ModelAndView responsable(){        
    return new ModelAndView("modulos/responsable/responsable");
    }
    
    @RequestMapping(value="administrador", method= RequestMethod.GET)
    public ModelAndView admin(){        
    return new ModelAndView("modulos/administrador/administrador");
    }
    
    @RequestMapping(value="evaluador", method= RequestMethod.GET)
    public ModelAndView eval(){        
    return new ModelAndView("modulos/evaluador/evaluador");
    }
    
    @RequestMapping(value="visor", method= RequestMethod.GET)
    public ModelAndView visor(){        
    return new ModelAndView("modulos/visor/vistageneral");
    
}
}
