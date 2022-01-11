<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="java.util.List"%>
<%@page import="upeu.edu.pe.titikaka.domain.FilialTo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Filiales</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
    </head>
    <body>
        <%
            List<FilialTo> listaFilial = (List<FilialTo>) request.getSession().getAttribute("listaFilial");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../FilialController">
                <h1>Registro y Administracion de Filiales</h1>
                <p>Por favor ingrese una filial valida para su busqueda</p>
                <label for="busqueda">Filial
                    <span class="small">Ingresa un filial valida para la UPeU</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../FilialController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../FilialController?opt=1'">Listar</button>     
                </div>
            </form>
        </div>
            <table id="table" class="formTable">
                <tr>
                    <td colspan="7">&nbsp;</td>
                </tr>
                <tr>
                    <th colspan="7">Lista de Filiales</th>
                </tr>
                <tr id="thead">
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Email</th>
                    <th>Descripcion</th>
                    <th>Institucion</th>
                </tr>
                <%int i = 1;
                for (FilialTo to : listaFilial) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getDireccion()%></td>
                    <td><%=to.getTelefono()%></td>
                    <td><%=to.getEmail()%></td>
                    <td><%=to.getDescripcion()%></td>
                    <td><%=to.getInstitucionTo().getRazonSocial()%></td>
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
