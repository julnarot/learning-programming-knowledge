<%-- 
    Document   : updateauxiliar
    Created on : 28-nov-2013, 5:06:15
    Author     : pp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <<form action="../../ControlConserjes"  >
    <table   border="1"  bgcolor="blue" >
<tr>
<td colspan="3" bgcolor="blue" > Formulario - Del - Conserjes </td>
</tr>


<tr>
<td> Codigo:</td>
<td > <input type="text" name="codigo"  value=""/>  </td>

</tr>
<tr>
<td> Nombre:</td>
<td > <input type="text" name="nombre"  />  </td>

</tr>
<tr>
<td> Apellido paterno:</td>
<td > <input type="text" name="apellidopat"  />  </td>

</tr>
<tr>
<td> Apellido materno:</td>
<td > <input type="text" name="apellidomat"  />  </td>

</tr>
<tr>
<td> Dni</td>
<td > <input type="text" name="dni"  />  </td>

</tr>
<tr>
<td>Genero: </td>
<td> 
    M <input type="radio" name="sexo" value="M"  />
    F <input type="radio" name="sexo"  value="F"/>
</td>
</tr>


<tr>
<td colspan="3"> <center> 
    <input type="hidden" name="opc" value="2" />
    <input type="submit"  value="Guardar" /> </center>  </td>
</tr>

</table>
<form action="../../ControlConserjes"  >
    <table   border="1"  bgcolor="blue" >
<tr>
<td colspan="3" bgcolor="blue" > Formulario - Del - Conserjes </td>
</tr>


<tr>
<td> Codigo:</td>
<td > <input type="text" name="codigo"  />  </td>

</tr>
<tr>
<td> Nombre:</td>
<td > <input type="text" name="nombre"  />  </td>

</tr>
<tr>
<td> Apellido paterno:</td>
<td > <input type="text" name="apellidopat"  />  </td>

</tr>
<tr>
<td> Apellido materno:</td>
<td > <input type="text" name="apellidomat"  />  </td>

</tr>
<tr>
<td> Dni</td>
<td > <input type="text" name="dni"  />  </td>

</tr>
<tr>
<td>Genero: </td>
<td> 
    M <input type="radio" name="sexo" value="M"  />
    F <input type="radio" name="sexo"  value="F"/>
</td>
</tr>


<tr>
<td colspan="3"> <center> 
    <input type="hidden" name="opc" value="2" />
    <input type="submit"  value="Guardar" /> </center>  </td>
</tr>

</table>
</form>
    </body>
</html>
