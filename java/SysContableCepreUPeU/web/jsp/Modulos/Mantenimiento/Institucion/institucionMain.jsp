<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.InstitucionTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Instituciones</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
    </head>
    <body>
        <%
            List<InstitucionTo> listInstitucion = (List<InstitucionTo>) request.getSession().getAttribute("listInstitucion");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../InstitucionController">
                <h1>Registro y Administracion de Instituciones</h1>
                <p>Por favor ingrese una Institucion valida para su busqueda</p>
                <label for="busqueda">Institucion
                    <span class="small">Busqueda de instituciones</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href = '../../../../InstitucionController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href = '../../../../InstitucionController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <table id="table" class="formTable">
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <th colspan="7">Lista de Instituciones</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Razon Social</th>
                <th>RUC</th>
                <th>Direccion</th>
                <th>Email</th>
                <th>Estado</th>
                <th>Opciones</th>
            </tr>
            <%int i = 1;
                for (InstitucionTo to : listInstitucion) {%>
            <tr>
                <td><%=i++%></td>
                <td><%=to.getRazonSocial()%></td>
                <td><%=to.getRuc()%></td>
                <td><%=to.getDireccion()%></td>
                <td><%=to.getEmail()%></td>
                <td><%if (to.getEstado().equals("1")) {
                        out.print("ACTIVO");
                    } else {
                        out.print("INACTIVO");
                    }%>
                </td>
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
