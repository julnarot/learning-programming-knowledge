<%-- 
    Document   : AddPagina
    Created on : 30/04/2013, 12:49:58 AM
    Author     : JONATAN
--%>

<%@page import="rj.upeu.modelo.MwPaginaTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String Idl=null;
        Idl=(String)request.getSession().getAttribute("IdLi");             
            
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
                
                        <td><input type="text" name="NumPaginaJ"  value="" /></td>
                    </tr>
                    <tr>
                        <td>Contenido:</td>
                        <td><textarea name="ContenidoJ" rows="4" cols="20">                            
                            </textarea></td>
                    </tr>
                   
                    <tr>
                        <td colspan="2" align="center"> 
                            <input type="hidden" name="opt" value="S"/>    
                            <input type="submit" value="Agregar"/>
                            <input type="hidden"  name="LibroIdJ" value="<%=Idl%>"/>
                            <a href="../../../LibroController?opt=R"><input type="button" value="Cancelar" /></a>
                        </td>                       
                    </tr>                   
                </tbody>
            </table>

        </form>
            
      
    </body>
</html>
