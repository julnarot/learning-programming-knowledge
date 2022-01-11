<%-- 
    Document   : updateLibro
    Created on : 04/04/2013, 11:31:34 PM
    Author     : JONATAN
--%>

<%@page import="rj.upeu.modelo.MwLibroTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="../../Recursos/Estilos/Jstyle.css"/>
    </head>
    <body>
        
        <%
        List<MwLibroTo> Lista=null;
        Lista=(List<MwLibroTo>)request.getSession().getAttribute("ListarLibroId");                
         for(MwLibroTo datos: Lista){                
        %>
        <form action="../../../LibroController" id="FormReg">
            <table border="0">
                <thead>
                    <tr>
                        <th colspan="4">Modificando Libro</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Fecha Origen:</td>                             
                        <td><input type="text" name="FechaAltaJ" value="<%=datos.getFechaAlta()%>" disabled="disabled" /></td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>                    
                        <td><input type="text" name="NombreJ"  value="<%=datos.getNombre()%>" maxlength="20" /></td>
                    </tr>
                    <tr>
                        <td>Autor:</td>                    
                        <td><input type="text" name="AutorJ" value="<%=datos.getAutor()%>"  maxlength="20"/></td>
                    </tr>
                    <tr>
                        <td>Formato</td>                                            
                        <td><select name="ColorJ">
                                <option value="bk-book book-1" <% if(datos.getColor().equals("bk-book book-1")){out.print("selected");} %> >F1</option>
                                <option value="bk-book book-2" <% if(datos.getColor().equals("bk-book book-2")){out.print("selected");} %> >F2</option>
                                <option value="bk-book book-3" <% if(datos.getColor().equals("bk-book book-3")){out.print("selected");} %> >F3</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Portada:</td>                    
                        <td><input type="text" name="ImgPortadaJ" value="<%=datos.getImgPortada()%>"  maxlength="200"/></td>
                    </tr>
                    <tr>
                        <td>ContraPortada:</td>                    
                        <td><input type="text" name="ContraPortadaJ" value="<%=datos.getContraPortada()%>"  maxlength="200"/></td>
                    </tr>
                   <tr>
                        <td>Estado:</td>                    
                        <td>
                            Activo<input type="radio" name="EstadoJ" value="1" <% if(datos.getEstado().equals("1")){out.print("checked");} %> />
                            Desactivo<input type="radio" name="EstadoJ" value="0" <% if(datos.getEstado().equals("0")){out.print("checked");} %> />
                        </td>
                    </tr>
                    
                    <tr>
                        <td colspan="2" align="center"> 
                            <input type="hidden" name="opt" value="U"/>    
                            <input type="submit" value="Modificar"/>
                            <input type="hidden"  name="LibroIdJ" value="<%=datos.getLibro_id()%>"/>
                            <a href="../../../LibroController?opt=R"><input type="button" value="Cancelar" /></a>
                        </td>
                       
                    </tr>
                   
                </tbody>
            </table>
        </form>            
      <%  } %>
    </body>
</html>
