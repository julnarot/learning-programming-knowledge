<%-- 
    Document   : designaciondedocenteagrado
    Created on : 28-nov-2013, 18:59:30
    Author     : pp
--%>

<%@page import="pe.edu.upeu.modelo.Docente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                    <%
    Docente datoA=null;
    datoA=(Docente)request.getSession().getAttribute("datos");
            
    %>
    <center>
        <div>
<form action="../../ControlMatriculas"  >
    <table   border="1"  bgcolor="blue" >
<tr>
<td colspan="3" bgcolor="blue" > Formulario - Del - Designacion </td>
</tr>

<tr>
<td> Nombre:</td>
<td> <input type="text" name="nombre" value="<%=datoA.getIdDocente()%>" /><%=datoA.getNombre()%></td>
</tr>




<tr>
<td colspan="3"> <center> 
    <input type="hidden" name="opc" value="U" />
    <input type="submit"  value="Guardar" /> </center>  
    </td>
</tr>

</table>
</form>

</div>
         </center>
    
    
    </body>
</html>
