<%-- 
    Document   : formPeriodo
    Created on : 11-oct-2012, 9:29:55
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <c:url var="periodoy" value="actualizarPeriodo.dmp" />        
        <fm:form modelAttribute="ActualizarModelo" method="post" action="${periodoy}">
            <!--fm:label path="idPeriodo">Id Periodo /fm:label-->
            <fm:hidden path="idPeriodo" /><br>
            
            <fm:label path="periodo">Periodo </fm:label>
            <fm:input path="periodo" /><br>
            <fm:label path="eatado">Estado</fm:label>
            <fm:input path="eatado" /><br>
            <fm:label path="fechaInicio">Fecha Inicio </fm:label>
            <fm:input path="fechaInicio" /><br>
            <fm:label path="fechaFin">Fecha Fin </fm:label>            
            <fm:input path="fechaFin"  />
            <input type="submit"  value="Registrar" name="registrar"/>
        </fm:form>        
    </body>
</html>