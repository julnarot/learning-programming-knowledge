<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.PeriodoAnualTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Periodos Anuales</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
        <link rel="stylesheet" href="../../../../resources/css/style.min.css" type="text/css">
    </head>
    <body>
        <%
            List<PeriodoAnualTo> listPeriodoAnual = (List<PeriodoAnualTo>) request.getSession().getAttribute("listPeriodoAnual");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../PeriodoAnualController">
                <h1>Registro y Administracion de Periodos Anuales</h1>
                <p>Por favor ingrese una Periodo valida para su busqueda</p>
                <label for="busqueda">Periodo Anual
                    <span class="small">Busqueda de periodos</span>
                </label>
                <input type="search" name="name" results="5" id="busqueda" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href = '../../../../PeriodoAnualController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href = '../../../../PeriodoAnualController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <table id="table" class="formTable">
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <th colspan="7">Lista de Periodos Anuales</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Nombre del Periodo Anual</th>
                <th>Fecha de inicio</th>
                <th>Fecha de finalizacion</th>
                <th>Filial</th>
                <th>Estado</th>
                <th>Opciones</th>
            </tr>
            <%int i = 1;
                for (PeriodoAnualTo to : listPeriodoAnual) {%>
            <tr>
                <td><%=i++%></td>
                <td><%=to.getNombrePeriodoAnual()%></td>
                <td><%=to.getFechaInicio()%></td>
                <td><%=to.getFechaFin()%></td>
                <td><%=to.getFilialTo().getNombre()%></td>
                <td><%if (to.getEstado().equals("1")) {
                        out.print("ACTIVO");
                    } else {
                        out.print("INACTIVO");
                    }%></td>
                <td>
                    <span class="button small pop2 x-content" data-bpopup="&lt;iframe width=&quot;640&quot; height=&quot;360&quot; src=&quot;../../../../PeriodoAnualController?opt=4&id_periodo_anual=<%=to.getIdPeriodoAnual()%>&quot; frameborder=&quot;0&quot; allowfullscreen&gt;&lt;/iframe&gt;">Agregar Campañas</span>
                </td>
            </tr>
            <%}%>
            <tfoot>
                <tr>
                    <th colspan="7">&nbsp;</th>
                </tr>
            </tfoot>
        </table>

        <div id="popup2">
            <span class="button b-close"><span>X</span></span>
            <div class="content"></div>
        </div>
        <script>window.jQuery || document.write('<script src="../../../../resources/js/jquery-1.9.1.min.js"><\/script>')</script>
        <script src="../../../../resources/js/jquery.bpopup-0.9.3.min.js"></script>
        <script src="../../../../resources/js/scripting.min.js"></script>
    </body>
</html>
