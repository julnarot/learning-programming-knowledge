<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de registro de campa�as</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
    </head>
    <body>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../CampaniaController">
                <h1>Registro y Administracion de Campa�as</h1>
                <p>Por favor ingrese una Campa�a valida para su busqueda</p>
                <label for="busqueda">Filial
                    <span class="small">Busqueda de campa�as</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../CampaniaController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../CampaniaController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../CampaniaController">
                <h1>Formulario de registro de Campa�as</h1>
                <p>Por favor complete los campos que se requiere en la Campa�a</p>

                <label>Nombre
                    <span class="small">Ingrese un nombre para la campa�a</span>
                </label>
                <input type="text" name="nombre" id="name" required="required"/>

                <label>Descripcion
                    <span class="small">Ingrese una descripcion  para la campa�a</span>
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
