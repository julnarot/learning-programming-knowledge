<%-- 
    Document   : formMenu
    Created on : 27-sep-2012, 10:35:37
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:url value="guardarFormMenu.dmp" var="guardarMenu" />
        <fm:form modelAttribute="SauMenuModelo" method="post"  
                 action="${guardarMenu}">
            <fm:label path="idMenu">Id Menu</fm:label>
            <fm:input path="idMenu" /><br>            
            <fm:label path="nombre">Nombre</fm:label>
            <fm:input path="nombre" /><br>
            <fm:label path="estado">Estado</fm:label>
            <fm:input path="estado" /><br>
            <fm:label path="alias">Alias</fm:label>
            <fm:input path="alias" /><br>
            <!--  sddsfsdf -->
            
            <input type="submit" value="Enviar"  />
        </fm:form>
        
    </body>
</html>
