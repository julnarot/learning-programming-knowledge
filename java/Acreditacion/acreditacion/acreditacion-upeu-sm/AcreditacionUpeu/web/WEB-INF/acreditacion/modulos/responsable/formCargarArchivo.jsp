<%-- 
    Document   : formCargarArchivo
    Created on : 17-nov-2012, 22:36:35
    Author     : nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                $("#fechaAsignacion").datepicker($.datepicker.regional["es"]);
            });
                        
        </script>
            
        
    </head>
    
    <body >        
    
        <div id="cuadroReporteR" style="width: 30%">
                        <h3>Reportes de documeentos</h3>
                        <div>
        <c:url var="urly" value="cargarArchivoGuardar.ads" />        
        <fm:form modelAttribute="ModeloCargarArchivo" method="post" action="${urly}">
            <fm:label path="idDireccion">Id direccion </fm:label>
            <fm:input path="idDireccion" /><br>
            <fm:label path="url">url </fm:label>
            <fm:input path="url" /><br>
            <fm:label path="fechaSubida">fecha subida</fm:label>
            <fm:input path="fechaSubida" /><br>
            <fm:label path="fechaAsignacion" >Fecha de asignacion </fm:label>
            <fm:input path="fechaAsignacion" /><br>
            <fm:label path="periodo">periodo </fm:label>            
            <fm:input path="periodo"  />

        </fm:form>  
            </div>             
            </div>
    </body>
</html>