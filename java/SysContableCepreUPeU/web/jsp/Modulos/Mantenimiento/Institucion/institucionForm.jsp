<%--
    Document   : test
    Created on : 09/04/2013, 12:36:05 AM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Instituciones</title>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/forms.css"/>
        <link rel="stylesheet" type="text/css" href="../../../../resources/css/formsSearch.css"/>
    </head>
    <body>
        <div class="myformBusqueda" id="stylizedBusqueda">
            <form id="form" name="form" method="post" action="../../../../InstitucionController">
                <h1>Registro y Administracion de Instituciones</h1>
                <p>Por favor ingrese una Institucion valida para su busqueda</p>
                <label for="busqueda">Institucion
                    <span class="small">Busqueda de instituciones</span>
                </label>
                <input type="search" name="name" id="busqueda" results="5" required="required"/>
                <button type="submit">Buscar</button>
                <div class="spacer" style="text-align: match-parent;">
                    <button type="button" onclick="location.href='../../../../InstitucionController?opt=2'">Nuevo</button>
                    <button type="button" onclick="location.href='../../../../InstitucionController?opt=1'">Listar</button>   
                </div>
            </form>
        </div>
        <div id="stylized" class="myform">
            <form id="form" name="form" method="post" action="../../../../InstitucionController">
                <h1>Formulario de registro de Instituciones</h1>
                <p>Por favor complete los campos que se requiere en la institucion</p>
                <label>Razon Social
                    <span class="small">Ingrese una razon social valida</span>
                </label>
                <input type="text" name="razonSocial" id="name" required="required"/>

                <label>RUC
                    <span class="small">Ingrese un RUC valido</span>
                </label>
                <input type="number" name="ruc" id="name" required="required"/>

                <label>Direccion
                    <span class="small">Ingrese una direccion valida</span>
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

                <label>FAX
                    <span class="small">Ingrese un FAX valido</span>
                </label>
                <input type="text" name="fax" id="name" required="required"/>

                <label>Email
                    <span class="small">Ingrese un email valido</span>
                </label>
                <input type="email" name="email" id="name" required="required"/>

                <label>Pagina
                    <span class="small">Ingrese una pagina web valida</span>
                </label>
                <input type="url" name="pagina" id="name" required="required"/>


                <label>Estado
                    <span class="small">Seleccione un estado</span>
                </label>
                <select name="estado" id="name" required="required">
                    <option value="1">Activo</option>
                    <option value="0">Inactivo</option>
                </select>

                <button type="submit">Guardar</button>
                <div class="spacer"></div>
                <input type="hidden" name="opt" value="3"/>
            </form>
        </div>
    </body>
</html>
