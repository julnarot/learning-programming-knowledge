<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.titikaka.domain.InstitucionTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
    </head>
    <body>
        <%
            List<InstitucionTo> allInstituciones = (List<InstitucionTo>) request.getSession().getAttribute("listInstitucion");
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
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../FilialController">
                <h1>Formulario de registro de Filiales</h1>
                <p>Por favor complete los campos que se requiere en la filial</p>

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

                <label>Telefono
                    <span class="small">Ingrese un telefono valido</span>
                </label>
                <input type="number" name="telefono" id="name" required="required"/>

                <label>Email
                    <span class="small">Ingrese un email valido</span>
                </label>
                <input type="email" name="email" id="name" required="required"/>

                <label>Estado
                    <span class="small">Seleccione un estado</span>
                </label>
                <select name="estado" id="name" required="required">
                    <option value="1">Activo</option>
                    <option value="0">Inactivo</option>
                </select>
                <label>Institucion
                    <span class="small">Seleccione una institucion para la filial</span>
                </label>
                <select name="id_institucion">
                    <%for (InstitucionTo to : allInstituciones) {%>
                    <option value="<%=to.getIdInstitucion()%>">
                        <%=to.getRazonSocial()%>
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
