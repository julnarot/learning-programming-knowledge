<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.FilialTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de registro de periodos</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
        <link rel="stylesheet" href="../../../../resources/css/style.min.css" type="text/css">
    </head>
    <body>
        <%
            List<FilialTo> listFilial = (List<FilialTo>) request.getSession().getAttribute("listFilial");
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
                    <button type="button" onclick="location.href='../../../../PeriodoAnualController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../PeriodoAnualController?opt=1'">Listar</button>   
                </div>

            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../PeriodoAnualController">
                <h1>Formulario de registro de Periodos Anuales</h1>
                <p>Por favor complete los campos que se requiere en el periodo anual</p>


                <label>Filial
                    <span class="small">Seleccione una filial para iniciar el periodo</span>
                </label>
                <select name="id_filial" id="name">
                    <%for (FilialTo to : listFilial) {%>
                    <option value="<%=to.getIdFilial()%>">
                        <%=to.getNombre()%>
                    </option>
                    <%}%>
                </select>
                <label>Nombre de Periodo
                    <span class="small">Ingrese un nombre para el periodo anual</span>
                </label>
                <input type="text" name="nombre_periodo_anual" id="name" required="required"/>

                <label>Fecha de Inicio
                    <span class="small">Seleccione una fecha de incio del periodo</span>
                </label>
                <input type="date" name="fecha_inicio" id="name" required="required"/>
                <label>Fecha de Finalizacion
                    <span class="small">Seleccione una fecha de finalizacion del periodo</span>
                </label>
                <input type="date" name="fecha_fin" id="name" required="required"/>


                <label>Estado
                    <span class="small">Seleccione una estado</span>
                </label>
                <select name="estado" id="name">
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
