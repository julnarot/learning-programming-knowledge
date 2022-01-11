<%-- 
    Document   : docente
    Created on : 22/11/2013, 04:38:28 AM
    Author     : seul
--%>
<%@page import="pe.edu.upeu.modelo.Docente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <div>
<form action="../../ControlMatriculas"  >
    <table   border="1"  bgcolor="blue" >
<tr>
<td colspan="3" bgcolor="blue" > Formulario - Del - Docente </td>
</tr>

<tr>
<td> Nombre:</td>
<td > <input type="text" name="nombre" value="" />  </td>

</tr>
<tr>
<td> Apellido paterno:</td>
<td > <input type="text" name="apellidopat" value="" />  </td>

</tr>
<tr>
<td> Apellido materno:</td>
<td > <input type="text" name="apellidomat" value="" />  </td>

</tr>
<tr>
<td> Especialidad</td>
<td > <input type="text" name="especialidad" value="" />  </td>

</tr>
<tr>
<td> Codigo</td>
<td > <input type="text" name="codigo"  value=""/>  </td>

</tr>
<tr>
<td>Genero: </td>
<td> 
    M <input type="radio" name="sexo" value="M"  value="" />
    F <input type="radio" name="sexo"  value="F" value="" />
</td>
</tr>


<tr>
<td colspan="3"> <center> 
    <input type="hidden" name="opc" value="G" />
    <input type="submit"  value="Guardar" /> </center>  
    </td>
</tr>

</table>
</form>

</div>
  
        <div>
        
        <table border="1">
            <thead>
                <tr>
                    <th>#</th>
                    <th>codigo</th>
                    <th>nombre</th>
                    <th>apellido paterno</th>
                    <th>apellido materno</th>
                    
                    <th>especialidad</th>
                    <th>sexo</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <%
              ArrayList<Docente> lista=  (ArrayList<Docente>)session.getAttribute("listar");
                 int i=0;
                 for(Docente to: lista){
                %>                
                <tr>
                    <td><%=++i%></td>
                    <td><%=to.getCodigo()%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getApellidopat()%></td>
                    <td><%=to.getApellidomat()%></td>                   
                    <td><%=to.getEspecialidad()%></td>
                    <td><%=to.getSexo()%></td>
                    <td>                         
                        <a href="../../ControlMatriculas?idDocente=<%=to.getIdDocente()%>&opc=E">Eliminar</a>
                        <a href="../../ControlMatriculas?idDocente=<%=to.getIdDocente()%>&opc=B">Editar</a>
                        <a href="../../ControlMatriculas?idDocente=<%=to.getIdDocente()%>&opc=S">Asignar</a>
                    </td>
                </tr>
                <% } %>
                
            </tbody>
        </table>


        
        
    </div>
                 </center>
                
          
    </body>
</html>
