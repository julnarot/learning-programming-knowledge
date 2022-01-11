<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.PresupuestoAnualTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuestos</title>
        <link rel="stylesheet" type="text/css" href="../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" type="text/css" href="../../../resources/css/listas.css"/>
        <link rel="stylesheet" type="text/css" href="../../../resources/css/popup.css"/>
        <script type="text/javascript" src="../../../resources/js/jquery.js"></script>
        <script type="text/javascript" src="../../../resources/js/popup.js"></script>
    </head>
    <body>
        <%
            List<PresupuestoAnualTo> listPresupuestoAnual = (List<PresupuestoAnualTo>) request.getSession().getAttribute("listPresupuestoAnual");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../PresupuestoAnualController">
                <h1>Registro y Administracion de Presupuestos Anuales</h1>
                <p>Por favor ingrese un Periodo para la busqueda de presupuestos</p>
                <label for="busqueda">Presupuesto Anual
                    <span class="small">Busqueda de Presupuestos</span>
                </label>
                <input type="search" name="name" id="busqueda" required="required" results="5"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../PresupuestoAnualController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../PresupuestoAnualController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <table id="table" class="formTable">
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <th colspan="7">Lista de Presupuestos Anuales</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Nombre del Presupuesto Anual</th>
                <th>Monto</th>
                <th>Decripcion</th>
                <th>Periodo Anual</th>
                <th>Estado</th>
                <th>Opciones</th>
            </tr>
            <tbody>
                <%int i = 1;
                    for (PresupuestoAnualTo to : listPresupuestoAnual) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getNombre()%></td>
                    <td><%=to.getMonto()%></td>
                    <td><%=to.getDescripcion()%></td>
                    <td><%=to.getPeriodoAnualTo().getNombrePeriodoAnual()%></td>
                    <td><%if(to.getEstado().equals("1")){out.print("ACTIVO");}else{out.print("INACTIVO");}%></td>
                    <td><button type="button" onclick="location.href='../../../PresupuestoController?opt=2'">Agregar Campañas</button>
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
