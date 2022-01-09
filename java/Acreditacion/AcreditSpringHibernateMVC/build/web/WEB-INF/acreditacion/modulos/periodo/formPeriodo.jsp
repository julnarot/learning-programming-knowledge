<%-- 
    Document   : formPeriodo
    Created on : 11-oct-2012, 9:29:55
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/start/jquery-ui-1.9.0.custom.css" />">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/lp1.css" />">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/style.css" />">
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-1.8.2.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-ui-1.9.0.custom.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/ajax/funcionesUtils.js"/>"></script>        
        <script type="text/javascript" src="<c:url value="/recursos/i18n/jquery.ui.datepicker-es.js"/>"></script>        
        <title>JSP Page</title>
        <script type="text/javascript">
            $(function(){                
                $("#fechaInicio").datepicker($.datepicker.regional["es"]);
                $("#fechaFin").datepicker($.datepicker.regional["es"]);
                $("#button").button();
                $("#Cancelar").button();
            });
                        
        </script>
            
        
    </head>
    
    <body >        
    
        <div id="cuadroReporteF"  style="width: 30%">
            <c:url var="periodoy" value="periodoGuardar.dmp" />        
                                    <fm:form modelAttribute="ModeloPeriodo" method="post" action="${periodoy}">
                                        <table>
                                            <tr>
                                                <th colspan="6"> <b>Formulario de Registro de Periodos</b></th> 
                                            </tr>
                                        <tr><td>              
                                        <fm:label path="idPeriodo">Id Periodo </fm:label>
                                        </td><td>
                                        <fm:input path="idPeriodo" />
                                        </td></tr>
                                        <tr><td> 
                                        <fm:label path="periodo">Periodo </fm:label>
                                        </td><td>
                                        <fm:input path="periodo" cssClass="" />
                                        </td></tr>
                                        <tr><td>
                                        <fm:label path="eatado">Estado</fm:label>
                                        </td><td>
                                            <fm:input path="eatado" size="10" />
                                        </td></tr>
                                        <tr><td>
                                        <fm:label path="fechaInicio">Fecha Inicio </fm:label>
                                        </td><td>
                                            <fm:input path="fechaInicio" id="fechaInicio" />
                                        </td></tr>
                                        <tr><td>
                                        <fm:label path="fechaFin">Fecha Fin </fm:label>
                                        </td><td>
                                        <fm:input path="fechaFin" id="fechaFin" />
                                        </td></tr>
                                        <tr><td colspan="2" >
                                                <center>
                                        <input type="submit" id="button"  value="Registrar" name="registrar"/>
                                        <input type="button" id="Cancelar"   value="Cancelar" onclick="accionURL('reporte.dmp')"  name="Cancelar"/>
                                        </center>
                                        </td></tr>
                                        </table>
                                    </fm:form>           
            </div>
    </body>
</html>