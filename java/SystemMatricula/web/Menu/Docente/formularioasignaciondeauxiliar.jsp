<%-- 
    Document   : formularioasignaciondeauxiliar
    Created on : 28-nov-2013, 4:46:37
    Author     : pp
--%>

<%@page import="pe.edu.upeu.modelo.Auxiliar"%>
<%@page import="pe.edu.upeu.modelo.Periodo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pe.edu.upeu.modelo.Grado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                    <%
    Auxiliar dato=null;
    dato=(Auxiliar)request.getSession().getAttribute("dato");
            
    %>    
        <form action="../../ControlConserjes"  >
         <table border="1">
        
 <tr>
<td> Conserge:</td>
<td > <input type="text" name="auxiliar" value="<%=dato.getIdAuxiliar()%>" /><%=dato.getNombre()%> <%=dato.getApellidopat()%> <%=dato.getApellidomat()%></td>

</tr>                   
<tr>
<td>Grado: </td>
<td> 
    primero <input type="radio" name="nombregrado" value="primero"  />
    segundo <input type="radio" name="nombregrado"  value="segundo"/>
    tercero <input type="radio" name="nombregrado" value="tercero"  />
    cuarto <input type="radio" name="nombregrado"  value="cuarto"/>
    quinto <input type="radio" name="nombregrado" value="quinto"  />
    sexto <input type="radio" name="nombregrado"  value="sexto"/>
</td>
</tr>
<tr> 
<td>Periodo: </td>
<td> 
    <select name="periodo" >
    <% ArrayList<Periodo> toPeriodo=null;
     toPeriodo=(ArrayList<Periodo>)request.getSession().getAttribute("per");
     for(Periodo e: toPeriodo){
        %>    
        <option  value="<%=e.getIdPeriodo()%>"  ><%=e.getNombrePeriodo()%></option>

<% }%>
</select>
</td>
</tr>

<tr>
<td colspan="3"> <center> 
    <input type="hidden" name="opc" value="X" />
    <input type="submit"  value="Guardar" /> </center>  
    </td>
</tr>
              </table>
</form>

        <table border="1">
            <thead>
                <tr>
                    <th>#</th>
                    <th>grado</th>
                    <th>auxiliar</th>
                    <th>periodo</th>
                    
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <%
              ArrayList<Grado> listaa=  (ArrayList<Grado>)session.getAttribute("listarr");
                int i=0;
                 for(Grado to: listaa){
                %>                
                <tr>
                    <td><%=++i%></td>
                    <td><%=to.getNombreGrado()%></td>
                    <td><%=to.getIdAuxiliar().getNombre()%></td>
                    <td><%=to.getIdPeriodo().getNombrePeriodo()%></td>
                    <td>                         
                        <a href="../ControlConserjes?idauxiliar=<%=to.getIdGrado()%>&opc=3">Eliminar</a>
                        <a href="../ControlConserjes?idauxiliar=<%=to.getIdGrado()%>&opc=4">Editar</a>
                    </td>
                </tr>
                <% } %>
                
            </tbody>
        </table>
        
    </body>
</html>
