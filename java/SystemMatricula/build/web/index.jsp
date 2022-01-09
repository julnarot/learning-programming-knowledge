<%-- 
    Document   : index
    Created on : 25/11/2013, 10:11:57 PM
    Author     : seul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"type="text/css" href="Recursos/css/style.css"/>
    </head>
    <body>
        
        <div class="upeu">

            <h1> System  </h1>
        </div>

        <div id="formLogin">

            <form method="POST" action="IndexControl?opc=V">
                <table>
                    <tbody>
                        <tr>
                            <td>Usuario:</td>
                            <td>Passwor:</td>
                        </tr>
                        <tr>
                            <td>
                                <input type="text" name="usuario" size="20"/> <%--salto de linea <br />--%>
                            </td>
                            <td>
                                <input type="password" name=" clave" size="20"/> 
                            </td>
                            <td colspan="2">
                                <input type="submit" value="Ingresar" />
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>

        </div>
        <hr width=70% align="center" >
      
    </body>
</html>
