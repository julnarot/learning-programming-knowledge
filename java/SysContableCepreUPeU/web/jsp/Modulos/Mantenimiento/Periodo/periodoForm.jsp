<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.PeriodoAnualTo"%>
<%@page import="upeu.edu.pe.cepre.domain.CampaniaTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de registro de campañas</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
    </head>
    <body class="body">

        <%
            PeriodoAnualTo periodoAnualToById = (PeriodoAnualTo) request.getSession().getAttribute("periodoAnualById");
            List<CampaniaTo> listCampanias = (List<CampaniaTo>) request.getSession().getAttribute("listCampanias");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form">
                <h1>Formulario de Registro de Periodos de tipo campaña para los periodos anuales</h1>
                <p>Por favor ingrese todos los campos obligatorios del registro</p>
                <div class="spacer"></div>
                <label>Nombre
                    <span class="small">Nombre del periodo anual</span>
                </label>
                <input type="search" value="<%=periodoAnualToById.getNombrePeriodoAnual()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Fecha de Inicio
                    <span class="small">Fecha de inicio del periodo anual</span>
                </label>
                <input type="search" value="<%=periodoAnualToById.getFechaInicio()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Fecha de Finalizacion
                    <span class="small">Fecha de finalizacion del periodo anual</span>
                </label>
                <input type="search" value="<%=periodoAnualToById.getFechaFin()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Estado
                    <span class="small">Estado del periodo anual</span>
                </label>
                <input type="search" value="<%=periodoAnualToById.getEstado()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <div class="spacer"></div>
                <div class="spacer">
                    <button type="button" id="open" onclick="location.href = '#'">Agregar Descripcion</button>
                    <button type="button" onclick="location.href = '../../../../ActividadController?opt=4'">Eliminar Gasto</button>
                </div>
            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../CampaniaController">
                <h1>Formulario de registro de Campañas</h1>
                <p>Por favor complete los campos que se requiere en la Campaña</p>

                <label>Nombre
                    <span class="small">Ingrese un nombre para la campaña</span>
                </label>
                <input type="text" name="nombre" id="name" required="required"/>
                <div class="spacer"></div>
                <label>Descripcion
                    <span class="small">Ingrese una descripcion  para la campaña</span>
                </label>
                <input type="text" name="descripcion" id="name" required="required"/>

                <div class="spacer"></div>
                <button type="submit">Guardar</button>
                <div class="spacer"></div>
                <input type="hidden" name="opt" value="3"/>
            </form>
        </div>
    </body>
</html>

