/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.controlador;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import upeu.edu.pe.util.DBconn;

/**
 *
 * @author Intel
 */
@Controller
public class ReportesControlador {
    
    DBconn conn = new DBconn();
@RequestMapping(value="informe", method=RequestMethod.GET)    
public ModelAndView inicio()
{    
return new ModelAndView("index");
}
 

@RequestMapping(value = "informeEstandar", method = RequestMethod.GET)
public ModelAndView handleReportPDFDmp(HttpServletRequest request,  HttpServletResponse response) throws Exception {    
String codigo = request.getParameter("codigo");
Map parametros = new HashMap();
 parametros.put("pNEstandar", codigo);    
JasperReport jasperReport = null;
JasperPrint jasperPrint;
HttpServletRequestWrapper srw = new HttpServletRequestWrapper(request);
String path = srw.getRealPath("") + "/WEB-INF/acreditacion/modulos/reportes/ListaEstandar.jasper";
byte[] reporte = null;
response.setHeader("Content-Disposition", "attachment; filename=\"InformeEstandar.pdf\";");
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
response.setContentType("application/pdf");
ServletOutputStream out = response.getOutputStream();
try {
    jasperReport = (JasperReport) JRLoader.loadObject(path);
    jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, conn.getConnection());
    JRExporter exporter = new JRPdfExporter();
    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
    exporter.exportReport();

} catch (JRException ex) {
    Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
}

return null;
}    
}
