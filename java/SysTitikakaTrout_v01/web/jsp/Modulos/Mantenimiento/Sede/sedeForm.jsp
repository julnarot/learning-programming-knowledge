<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.titikaka.domain.FilialTo"%>
<%@page import="upeu.edu.pe.titikaka.domain.InstitucionTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de registro de sedes</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
    </head>
    <body>
        <%
            List<FilialTo> allFiliales = (List<FilialTo>) request.getSession().getAttribute("listFilial");
        %>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../SedeController">
                <h1>Registro y Administracion de Sedes</h1>
                <p>Por favor ingrese una Sede valida para su busqueda</p>
                <label for="busqueda">Sede
                    <span class="small">Ingresa una sede valida para la UPeU</span>
                </label>
                <input type="search" name="name" id="busqueda" required="required" results="5"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../SedeController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../SedeController?opt=1'">Listar</button>   
                </div>

            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../SedeController">
                <h1>Formulario de registro de Sedes</h1>
                <p>Por favor complete los campos que se requiere en la Sede</p>

                <label>Nombre
                    <span class="small">Ingrese un nombre para la filial</span>
                </label>
                <input type="text" name="nombre" id="name" required="required"/>

                <label>Direccion
                    <span class="small">Ingrese una direccion valida para la filial</span>
                </label>
                <input type="text" name="direccion" id="name" required="required"/>

                <label>Descripcion
                    <span class="small">Ingrese una descripcion valida</span>
                </label>
                <input type="text" name="descripcion" id="name" required="required"/>

                <label>Tipo de Sede
                    <span class="small">Seleccione un tipo de sede</span>
                </label>
                <select name="tipo_sede" id="name" required="required">
                    <option>Principal</option>
                    <option>Secundaria</option>
                </select>
                <label>Filial
                    <span class="small">Seleccione una filial para la sede</span>
                </label>
                <select name="id_filial">
                    <%for (FilialTo to : allFiliales) {%>
                    <option value="<%=to.getIdFilial()%>">
                        <%=to.getNombre()%>
                    </option>
                    <%}%>
                </select>
                <div class="spacer"></div>
                <button type="submit">Guardar</button>
                <div class="spacer"></div>
                <input type="hidden" name="opt" value="3"/>
            </form>
        </div>
    </body>
</html>
