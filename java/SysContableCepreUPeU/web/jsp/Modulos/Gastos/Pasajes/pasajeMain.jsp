<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.utils.FechaUtils"%>
<%@page import="upeu.edu.pe.cepre.domain.ActividadTo"%>
<%@page import="upeu.edu.pe.cepre.domain.CampaniaTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de pasajes</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
    </head>
    <body>
        <%
            List<ActividadTo> listPasaje = (List<ActividadTo>) request.getSession().getAttribute("listPasajes");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../SedeController">
                <h1>Registro y Administracion de Gastos en Pasajes</h1>
                <p>PPor favor ingrese un mes para la busqueda de pasajes</p>
                <label for="busqueda">Mes
                    <span class="small">Busqueda de pasajes</span>
                </label>
                <input type="search" name="name" id="busqueda" required="required" results="5"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../ActividadController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../ActividadController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <table id="table" class="formTable">
            <tr>
                <td colspan="8">&nbsp;</td>
            </tr> 
            <tr>
                <th colspan="8">Lista de Gastos en Pasajes</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Mes</th>
                <th>Fecha</th>
                <th>Total</th>
                <th>Estado</th>
                <th>Opciones</th>
            </tr>
            <tbody>
                <%int i = 1;
                    FechaUtils mes = new FechaUtils();
                    for (ActividadTo to : listPasaje) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getDescripcion()%></td>
                    <td><%=mes.MesEnLetras(to.getMes())%></td>
                    <td><%=to.getFecha()%></td>
                    <td><%=to.getCosto()%>o</td>
                    <td><%if (to.getEstado().equals("1")) {
                            out.print("ACTIVO");
                        } else {
                            out.print("INACTIVO");
                        }%></td>
                    <td>
                        <button type="button" class="editar">Editar</button>
                        <button type="button" class="eliminar">Eliminar</button>
                    </td>
                </tr>
                <%}%>
            </tbody>
            <tfoot>
                <tr>
                    <th colspan="8">&nbsp;</th>
                </tr>
            </tfoot>
        </table>
    </body>
</html>
