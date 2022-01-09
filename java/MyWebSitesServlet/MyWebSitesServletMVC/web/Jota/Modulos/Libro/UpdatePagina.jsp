<%-- 
    Document   : UpdatePagina
    Created on : 29/04/2013, 07:59:54 PM
    Author     : JONATAN
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="rj.upeu.modelo.MwPaginaTo" language="java"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
              <%
        List<MwPaginaTo> Lista=null;
        Lista=(List<MwPaginaTo>)request.getSession().getAttribute("ListaPaginaF");                
         for(MwPaginaTo datos: Lista){                
        %>
        <form action="../../../LibroController">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Formulario Modificar Pagina</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Pagina:</td>    
                
                        <td><input type="text" name="NumPaginaJ" disabled="disabled" value="<%=datos.getNumPagina()%>" /></td>
                    </tr>
                    <tr>
                        <td>Contenido:</td>
                        <td><textarea name="ContenidoJ" rows="4" cols="20">
                            <%=datos.getContenido()%>
                            </textarea></td>
                    </tr>
                   
                    <tr>
                        <td colspan="2" align="center"> 
                            <input type="hidden" name="opt" value="U"/>    
                            <input type="submit" value="Modificar"/>
                            <input type="hidden"  name="PaginaIdJ" value="<%=datos.getPagina_id()%>"/>
                            <a href="../../../LibroController?opt=R"><input type="button" value="Cancelar" /></a>
                        </td>
                       
                    </tr>
                   
                </tbody>
            </table>
        </form>            
      <%  } %>
    </body>
</html>
