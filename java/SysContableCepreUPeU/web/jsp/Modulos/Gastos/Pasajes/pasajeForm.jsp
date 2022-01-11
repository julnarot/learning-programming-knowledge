<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.UsuarioTo"%>
<%@page import="upeu.edu.pe.cepre.domain.PresupuestoTo"%>
<%@page import="upeu.edu.pe.cepre.domain.DepartamentoTo"%>
<%@page import="upeu.edu.pe.cepre.domain.FacultadTo"%>
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
    <body>
        <%
            List<FacultadTo> listFacultades = (List<FacultadTo>) request.getSession().getAttribute("listFacultades");
            List<PresupuestoTo> listPresupuestos = (List<PresupuestoTo>) request.getSession().getAttribute("listPresupuestos");
            List<DepartamentoTo> listDepartamentos = (List<DepartamentoTo>) request.getSession().getAttribute("listDepartamentos");
            UsuarioTo usuarioTo = (UsuarioTo)request.getSession().getAttribute("userValidated");
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
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../ActividadController">
                <h1>Formulario de registro de gastos en pasajes</h1>
                <p>Por favor complete los campos que se requiere en la Campaña</p>


                <label>Presupuesto
                    <span class="small">Seleccione el presupuesto al que desea ingresar el gasto</span>
                </label>
                <select name="id_presupuesto">
                    <%for (PresupuestoTo to : listPresupuestos) {%>
                    <option value="<%=to.getIdPresupuesto()%>">
                        <%=to.getNombre()%> - <%=to.getPresupuestoAnualTo().getNombre()%> - <%=to.getPeriodoTo().getCampaniaTo().getNombre()%>
                    </option>
                    <%}%>
                </select>
                <div class="spacer"></div>
                <label>Nombre
                    <span class="small">Ingrese un nombre para el gasto de pasajes</span>
                </label>
                <input type="text" name="nombre" id="name" required="required"/>
                <label>Codigo
                    <span class="small">Ingrese un codigo para el gasto</span>
                </label>
                <input type="text" name="codigo" id="name" required="required"/>

                <label>Descripcion
                    <span class="small">Ingrese una descripcion del gasto</span>
                </label>
                <input type="text" name="descripcion" id="name" required="required"/>

                <label>Departamento
                    <span class="small">Seleccione un departamento</span>
                </label>
                <select name="id_departamento">
                    <option value="0">Seleccione un departamento</option>
                    <option value="0">Ningun departamento</option>
                    <%for (DepartamentoTo to : listDepartamentos) {%>
                    <option value="<%=to.getIdDepartamento()%>">
                        <%=to.getNombre()%>
                    </option>
                    <%}%>
                </select>

                <label>Facultad
                    <span class="small">Seleccione una facultad</span>
                </label>
                <select name="id_facultad">
                    <option value="0">Seleccione una facultad</option>
                    <option value="0">Ninguna facultad</option>
                    <%for (FacultadTo to : listFacultades) {%>
                    <option value="<%=to.getIdFacultad()%>">
                        <%=to.getNombre()%>
                    </option>
                    <%}%>
                </select>


                <label>Fecha
                    <span class="small">Ingrese la fecha del registro</span>
                </label>
                <input type="date" name="fecha" id="name" required="required"/>
                <label>Mes
                    <span class="small">Ingrese el mes de registro del gasto</span>
                </label>
                <select name="mes">
                    <option value="0">Seleccione un mes</option>
                    <option value="1">Enero</option>
                    <option value="2">Febrero</option>
                    <option value="3">Marzo</option>
                    <option value="4">Abril</option>
                    <option value="5">Mayo</option>
                    <option value="6">Junio</option>
                    <option value="7">Julio</option>
                    <option value="8">Agosto</option>
                    <option value="9">Septiembre</option>
                    <option value="10">Octubre</option>
                    <option value="11">Noviembre</option>
                    <option value="12">Diciembre</option>
                </select>
                <label>Estado
                    <span class="small">Ingrese el estado del registro</span>
                </label>
                <select name="estado">
                    <option value="1">Activo</option>
                    <option value="0">Inactivo</option>
                </select>
                <div class="spacer"></div>
                <button type="submit">Guardar</button>
                <div class="spacer"></div>
                <input type="hidden" name="tipo" value="pasaje"/>
                <input type="hidden" name="id_usuario" value="<%=usuarioTo.getIdUsuario()%>"/>
                <input type="hidden" name="opt" value="3"/>
            </form>
        </div>
    </body>
</html>
