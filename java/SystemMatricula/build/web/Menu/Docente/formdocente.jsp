<%-- 
    Document   : formdocente
    Created on : 28-nov-2013, 18:12:54
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
<td colspan="3" bgcolor="blue" > Formulario - Del - Docente </td>
</tr>

<tr>
<td> Nombre:</td>
<td > <input type="text" name="nombre" value="<%=datoA.getNombre()%>" />  </td>

</tr>
<tr>
<td> Apellido paterno:</td>
<td > <input type="text" name="apellidopat" value="<%=datoA.getApellidopat()%> "/>  </td>

</tr>
<tr>
<td> Apellido materno:</td>
<td > <input type="text" name="apellidomat" value="<%=datoA.getApellidomat()%>" />  </td>

</tr>
<tr>
<td> Especialidad</td>
<td > <input type="text" name="especialidad" value="<%=datoA.getEspecialidad()%>" />  </td>

</tr>
<tr>
<td> Codigo</td>
<td > <input type="text" name="codigo"  value="<%=datoA.getCodigo()%>"/>  </td>

</tr>
<tr>
<td>Genero: </td>
<td> 
    M <input type="radio" name="sexo" value="M"  value="" />
    F <input type="radio" name="sexo" value="F" value="" />
</td>
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
