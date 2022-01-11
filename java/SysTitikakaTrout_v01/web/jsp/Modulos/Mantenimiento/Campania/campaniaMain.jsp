<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.titikaka.domain.CampaniaTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Campañas</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
    </head>
    <body>
        <%
            List<CampaniaTo> listCampania = (List<CampaniaTo>) request.getSession().getAttribute("listCampania");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../SedeController">
                <h1>Registro y Administracion de Campañas</h1>
                <p>Por favor ingrese una Campaña valida para su busqueda</p>
                <label for="busqueda">Filial
                    <span class="small">Busqueda de campañas</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../CampaniaController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../CampaniaController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <table id="table" class="formTable">
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <th colspan="7">Lista de Campañas</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Opciones</th>
            </tr>
            <tbody>
                <%int i = 1;
                    for (CampaniaTo to : listCampania) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getDescripcion()%></td>
                    <td>&nbsp;</td>
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
