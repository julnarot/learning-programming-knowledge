<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.titikaka.domain.BloqueTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>bloque - Jaulas</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
    </head>
    <body>
        <%
            List<BloqueTo> listBloque = (List<BloqueTo>) request.getSession().getAttribute("listBloque");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../BloqueController">
                <h1>Registro y Administracion de bloques</h1>
                <p>Por favor ingrese un Bloque valida para su busqueda</p>
                <label for="busqueda">Bloque
                    <span class="small">Busqueda de Bloques</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../BloqueController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../BloqueController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <table id="table" class="formTable">
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <th colspan="7">Lista de Bloques</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Nombre</th>
                <th>Total Peces</th>
                <th>Total Pesos</th>
                <th>Estado</th>
                <th>Opciones</th>
            </tr>
            <tbody>
                <%int i = 1;
                    for (BloqueTo to : listBloque) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getTotalpeces()%></td>
                    <td><%=to.getTotalpeso()%></td>
                    <td><%=to.getEstado()%></td>
                    
                    
                    <td>
                        <button type="button" class="editar">Editar</button>
                        <button type="button" class="eliminar">Eliminar</button>
                    </td>
                </tr>
                <%}%>
            </tbody>
            <tfoot>
                <tr>
                    <th colspan="7">&nbsp;</th>
                </tr>
            </tfoot>
        </table>
    </body>
</html>
