<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.SedeTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sedes</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
    </head>
    <body>
        <%
            List<SedeTo> listSede = (List<SedeTo>) request.getSession().getAttribute("listSede");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../SedeController">
                <h1>Registro y Administracion de Sedes</h1>
                <p>Por favor ingrese una Sede valida para su busqueda</p>
                <label for="busqueda">Sede
                    <span class="small">Ingresa una sede valida para la UPeU</span>
                </label>
                <input type="search" name="name" id="busqueda" required="required" results="5"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../SedeController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../SedeController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
            <table id="table" class="formTable">
                <tr>
                    <td colspan="7">&nbsp;</td>
                </tr>
                <tr>
                    <th colspan="7">Lista de Sedes</th>
                </tr>
                <tr id="thead">
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Direccion</th>
                    <th>Descripcion</th>
                    <th>Tipo de Sede</th>
                    <th>Filial</th>
                    <th>Opciones</th>
                </tr>
                <%int i = 1;
                for (SedeTo to : listSede) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getDireccion()%></td>
                    <td><%=to.getDescripcion()%></td>
                    <td><%=to.getTipoSede()%></td>
                    <td><%=to.getFilialTo().getNombre()%></td>
                    <td>&nbsp;</td>
                </tr>
                <%}%>
                <tfoot>
                    <tr>
                        <th colspan="7">&nbsp;</th>
                    </tr>
                </tfoot>
            </table>
    </body>
</html>
