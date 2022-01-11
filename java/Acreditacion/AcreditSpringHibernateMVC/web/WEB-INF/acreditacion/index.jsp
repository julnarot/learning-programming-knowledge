<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/start/jquery-ui-1.9.0.custom.css" />">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/lp1.css" />">
        
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-1.8.2.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-ui-1.9.0.custom.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/ajax/funcionesUtils.js"/>"></script>        
    </head>
    <body onload="divAcordionMostrar()">
        <div align="center">
        <div id="divAcordion" style="width: 30%" >
            <h3> Formulario de Autentificacion </h3>
            <div>
                <c:url value="frame.dmp" var="urlPrincipal" />    
                <fm:form action="${urlPrincipal}" method="post">
                    <table>
                        <tr>
                            <td>Usuario:</td>
                            <td><input type="text" name="usuario" value="" /></td>
                        </tr>
                        <tr>
                            <td>Clave:</td>
                            <td><input type="password" name="clave" value="" /></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="right"> <input type="submit" id="btnEnviar" value="Ingresar" /></td>                            
                        </tr>
                        
                    </table>                    
                </fm:form>
            </div>
            
        </div>
        </div>
                

                
               
    </body>
</html>
