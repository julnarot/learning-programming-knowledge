<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.titikaka.domain.PeriodoAnualTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuestos</title>
        <link rel="stylesheet" type="text/css" href="../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../resources/css/formsSearch.css"/>
    </head>
    <body>
        <%
            List<PeriodoAnualTo> listPeriodoAnual = (List<PeriodoAnualTo>) request.getSession().getAttribute("listPeriodoAnual");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../PresupuestoAnualController">
                <h1>Registro y Administracion de Presupuestos Anuales</h1>
                <p>Por favor ingrese un Periodo valida para su busqueda</p>

                <label for="busqueda">Presupuesto Anual
                    <span class="small">Busqueda de Presupuestos</span>
                </label>
                <input type="search" name="name" id="busqueda" required="required" results="5"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href = '../../../PresupuestoAnualController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href = '../../../PresupuestoAnualController?opt=1'">Listar</button>   
                </div>

            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="form" method="post" action="../../../PresupuestoAnualController">
                <h1>Formulario de registro de presupuestos anuales</h1>
                <p>Por favor complete los campos que se requiere en el presupuesto</p>

                <label>Nombre
                    <span class="small">Nombre del presupuesto</span>
                </label>
                <input type="text" name="nombre" id="name" required="required"/>

                <label>Monto
                    <span class="small">Agregue un monto en numeros</span>
                </label>
                <input type="number" name="monto" id="name" required="required"/>

                <label>Descripcion
                    <span class="small">Agregue una descripcion</span>
                </label>
                <input type="text" name="descripcion" id="name" required="required"/>

                <label>Periodo Anual
                    <span class="small">Seleccione un Periodo Anual</span>
                </label>
                <select name="id_periodo_anual">
                    <%for (PeriodoAnualTo to : listPeriodoAnual) {%>
                    <option value="<%=to.getIdPeriodoAnual()%>">
                        <%=to.getNombrePeriodoAnual()%>
                    </option>
                    <%}%>
                </select>
                
                <label>Estado
                    <span class="small">Seleccione un estado para el presupuesto anual</span>
                </label>
                <select name="estado">
                    <option value="1">Activo</option>
                    <option value="0">Inactivo</option>
                </select>
                <div class="spacer"></div>
                <button type="submit">Guardar</button>
                <div class="spacer"></div>
                <input type="hidden" name="opt" value="3"/>
            </form>
        </div>
    </body>
</html>
