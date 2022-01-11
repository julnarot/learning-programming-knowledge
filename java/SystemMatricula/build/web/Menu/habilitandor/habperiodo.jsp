<%-- 
    Document   : habperiodo
    Created on : 27-nov-2013, 18:57:52
    Author     : pp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="pe.edu.upeu.modelo.Periodo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        
        <table border="1">
            <thead>
                <tr>
                    <th>#</th>
                    <th>nombre</th>
                    <th>inicio de periodo</th>
                    <th>cierre de periodo</th>
                    <th>costo</th>
                    <th>opciones</th>
                </tr>
            </thead>
            <tbody>
                <%
              ArrayList<Periodo> lista=  (ArrayList<Periodo>)session.getAttribute("listar");
                 int i=0;
                 for(Periodo to: lista){
                %>                
                <tr>
                    <td><%=++i%></td>
                    <td><%=to.getNombrePeriodo()%></td>
                    <td><%=to.getFechaInicio()%></td>
                    <td><%=to.getFechaFinal()%></td>
                    <td><%=to.getCostoDeMatricula()%></td>
                     <td>                         
                        <a href="../../ControlPeriodo?idperiodo=<%=to.getIdPeriodo()%>&opc='A'">Eliminar</a>
                        <a href="../../ControlPeriodo?idperiodo=<%=to.getIdPeriodo()%>&opc=4">Editar</a>
                    </td>
                </tr>
                <% } %>
                
            </tbody>
        </table>


        
        
    </div>
    </body>
</html>
