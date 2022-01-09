/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.controlador;

//import edu.upeu.modelo.CpPeriodo;
//import edu.upeu.servicio.PeriodoServicio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alumno
 */
@Controller
public class IndexControl {
//    @Autowired
//    public PeriodoServicio PeriodoServicio;

    
    
    
   
@RequestMapping(value="inicio", method= RequestMethod.GET)
    public ModelAndView inicio(){                     
    return new ModelAndView("index");
    }
// 
//
//@RequestMapping(value="admin", method=RequestMethod.GET)    
//public ModelAndView admin()
//{    
//return new ModelAndView("admin/admin");
//}
//
//@RequestMapping(value="periodo", method=RequestMethod.GET)    
//public ModelAndView mainperiodo()
//{      
// Map<String, Object> modelo=new HashMap<String, Object>(); 
// List<CpPeriodo>  lista= PeriodoServicio.ListarPeriodo();
// modelo.put("reporte", lista);         
// modelo.put("msg", "Holassss");                
//                 
//return new ModelAndView("modulos/periodo/mainPeriodo", modelo);
//}
//
//
//
//@RequestMapping(value="resultado", method=RequestMethod.GET)    
//public ModelAndView resultado()
//{    
//return new ModelAndView("redirect:admin.mdz");
//}



}
