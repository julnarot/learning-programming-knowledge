<%-- 
    Document   : filialMain
    Created on : 17/05/2013, 10:47:10 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.cepre.domain.DetalleActividadTo"%>
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
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/listas.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/popup.css"/>
        <script type="text/javascript" src="../../../../resources/js/jquery.js"></script>
        <script type="text/javascript" src="../../../../resources/js/popup.js"></script>
    </head>
    <body>
        <%
            ActividadTo findLastPasajeByUser = (ActividadTo) request.getSession().getAttribute("lastPasajeByIdActividad");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form">
                <h1>UNIVERSIDAD PERUANA UNION</h1>
                <p>PLANILLA DE MOVILIDAD LOCAL</p>
                <div class="spacer"></div>
                <label>Nombre
                    <span class="small">Nombre del gasto en pasaje</span>
                </label>
                <input type="search" value="<%=findLastPasajeByUser.getNombre()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Departamento/Facultad
                    <span class="small">Deparatmento o facultad que solicito el gasto</span>
                </label>
                <input type="search" value="<%=findLastPasajeByUser.getDepartamentoTo().getNombre() + " " + findLastPasajeByUser.getFacultadTo().getNombre()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Descripcion
                    <span class="small">Descripcion del gasto en pasaje</span>
                </label>
                <input type="search" value="<%=findLastPasajeByUser.getDescripcion()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Mes
                    <span class="small">Mes correspondiente</span>
                </label>
                <input type="search" value="<%=findLastPasajeByUser.getMes()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Fecha
                    <span class="small">Fecha de regsitro del gasto</span>
                </label>
                <input type="search" value="<%=findLastPasajeByUser.getFecha()%>" disabled="disabled"/>
                <div class="spacer"></div>
                <label>Estado
                    <span class="small">Estado del registro</span>
                </label>
                <input type="search" value="<%
                    if (findLastPasajeByUser.getEstado().equals("1")) {
                        out.print("ACTIVO");
                    } else {
                        out.print("INACTIVO");
                    }
                       %>" disabled="disabled"/>
                <div class="spacer">
                    <button type="button" id="open" onclick="location.href = '#'">Agregar Descripcion</button>
                    <button type="button" onclick="location.href = '../../../../ActividadController?opt=4'">Eliminar Gasto</button>
                </div>
            </form>
        </div>
        <%
            if (request.getSession().getAttribute("listDetallePasaje") != null) {
                List<DetalleActividadTo> listDetallePasaje = (List<DetalleActividadTo>)request.getSession().getAttribute("listDetallePasaje");
        %>
        <table id="table" class="formTable">
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr> 
            <tr>
                <th colspan="7">Detalle de Pasajes</th>
            </tr>
            <tr id="thead">
                <th>#</th>
                <th>Dia</th>
                <th>Descripcion</th>
                <th>importe</th>
                <th>Opciones</th>
            </tr>
            <tbody>
                <%int i = 1;
                    for (DetalleActividadTo to : listDetallePasaje) {%>
                <tr>
                    <td><%=i++%></td>
                    <td><%=to.getDia()%></td>
                    <td><%=to.getDescripcion()%></td>
                    <td><%=to.getImporte()%></td>
                    <td>&nbsp;</td>
                </tr>
                <%}%>
            </tbody>
            <tfoot>
                <tr>
                    <th colspan="5"><button type="button" onclick="location.href='../../../../ActividadController?opt=5'">Guardar Gasto</button></th>
                </tr>
            </tfoot>
        </table>
        <%} else {
                out.print("No hay detalle de pasajes");
            }%>

        <div id="popup" style="display: none;">
            <div class="content-popup">
                <div class="close"><a href="#" id="close"><img src="../../../../resources/img/icons/close.png"/></a></div>
                <div id="stylized" class="popupForm">
                    <form class="popupForm" id="form" name="formInsert" method="post" action="../../../../DetalleActividadController">
                        <h1>Formulario de registro de gastos en pasajes</h1>
                        <p>Por favor complete los campos que se requiere en el gasto</p>
                        <div class="spacer"></div>
                        <label>Dia
                            <span class="small">Ingrese el dia para el gasto de pasajes</span>
                        </label>
                        <input type="date" name="dia" id="name" required="required"/>
                        <div class="spacer"></div>
                        <label>Descripcion
                            <span class="small">Ingrese una descripcion para el gasto de pasajes</span>
                        </label>
                        <input type="text" name="descripcion" id="name" required="required"/>
                        <div class="spacer"></div>
                        <label>Importe
                            <span class="small">Ingrese un monto para el gasto de pasajes</span>
                        </label>
                        <input type="text" name="importe" id="name" required="required"/>
                        <input type="hidden" name="id_actividad" value="<%=findLastPasajeByUser.getIdActividad()%>"/>
                        <div class="spacer"></div>
                        <button type="submit">Guardar</button>
                        <div class="spacer"></div>
                        <input type="hidden" name="opt" value="1"/>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
