<%-- 
    Document   : conserje
    Created on : 28-nov-2013, 3:50:38
    Author     : pp
--%>

<%@page import="pe.edu.upeu.modelo.Periodo"%>
<%@page import="pe.edu.upeu.modelo.Grado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pe.edu.upeu.modelo.Auxiliar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          
        
        <div>

<a href="index3.jsp" > Salto A Inicio</a>


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

</div>
  
        <div>
        
        <table border="1">
            <thead>
                <tr>
                    <th>#</th>
                    <th>#</th>
                    <th>codigo</th>
                    <th>nombre</th>
                    <th>apellido paterno</th>
                    <th>apellido materno</th>
                    <th>dni</th>
                    <th>sexo</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <%
              ArrayList<Auxiliar> lista=  (ArrayList<Auxiliar>)session.getAttribute("listar");
                 int i=0;
                 for(Auxiliar to: lista){
                %>                
                <tr>
                    <td><%=++i%></td>
                    <td><%=to.getIdAuxiliar()%></td>
                    <td><%=to.getCodigo()%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getApellidopat()%></td>
                    <td><%=to.getApellidomat()%></td>                    
                    <td><%=to.getDni()%></td>
                    <td><%=to.getSexo()%></td>
                    <td>                         
                        <a href="../../ControlConserjes?idauxiliar=<%=to.getIdAuxiliar()%>&opc=a">Eliminar</a>
                        <a href="../../ControlConserjes?idauxiliar=<%=to.getIdAuxiliar()%>&opc=b">Editar</a>
                        <a href="../../ControlConserjes?idauxiliar=<%=to.getIdAuxiliar()%>&opc=c"  target="body">Asignar</a>
                    </td>
                </tr>
                <% } %>
                
            </tbody>
        </table>
               
    </div>
        
                
    </body>
</html>
