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
        <title>Formulario de registro de Bloques</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
    </head>
    <body>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../BloqueController">
                <h1>Registro y Administracion de Bloques</h1>
                <p>Por favor ingrese un Bloque valida para su busqueda</p>
                <label for="busqueda">Bloque
                    <span class="small">Busqueda de bloques</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../BloqueController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../BloqueController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="formInsert" method="post" action="../../../../BloqueController">
                <h1>Formulario de registro de Bloques</h1>
                <p>Por favor complete los campos que se requiere en la Bloque</p>

                <label>Nombre
                    <span class="small">Ingrese un nombre para el bloque</span>
                </label>
                <input type="text" name="nombre" id="name" required="required"/>

                <label>Total de Peces
                    <span class="small">Ingrese el total de peces</span>
                </label>
                <input type="text" name="totalpeces" id="name" required="required"/>
                
                <label>Peso Total 
                    <span class="small">Ingrese el peso Total</span>
                </label>
                <input type="text" name="totalpeso" id="name" required="required"/>
                
                 <label>Estado
                    <span class="small">Seleccione un estado</span>
                </label>
                <select name="estado" id="name" required="required">
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
