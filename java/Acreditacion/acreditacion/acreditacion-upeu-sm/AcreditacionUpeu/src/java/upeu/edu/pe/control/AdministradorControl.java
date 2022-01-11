/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import upeu.edu.pe.modelo.SacuEstandar;
import upeu.edu.pe.servicio.AdministradorServicio;

/**
 *
 * @author PC
 */
@Controller
public class AdministradorControl {

    @Autowired
    AdministradorServicio administradorServicio;

    @RequestMapping(value="reportarEstandar", method= RequestMethod.GET)
    public ModelAndView irListarEstandar() {
        List<SacuEstandar> lista = administradorServicio.listaEstandar();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaEstandar", lista);
        modelo.put("msg", "Reporte de Periodo");
        return new ModelAndView("modulos/administrador/administrarEstandar", modelo);
    }
    @RequestMapping(value = "eliminarEstandar", method = RequestMethod.GET)
    public ModelAndView eliminarEstandar(HttpServletRequest request) {
        String idPeriodo = request.getParameter("idEstandarP") == null ? "" : request.getParameter("idEstandarP");
        administradorServicio.eliminarEstandar(idPeriodo);
        return new ModelAndView("redirect:reportarEstandar.ads");
    }
     @RequestMapping(value = "editarEstandar", method = RequestMethod.GET)
    public ModelAndView editarEstandarForm(HttpServletRequest request) {
        String idEstandar = request.getParameter("idEstandarP") == null ? "" : request.getParameter("idEstandarP");
        SacuEstandar estandarTO = null;
        estandarTO = administradorServicio.buscarEstandarId(idEstandar);
        return new ModelAndView("modulos/periodo/formEditPeriodo", "ActualizarModelo", estandarTO);
    }
}
