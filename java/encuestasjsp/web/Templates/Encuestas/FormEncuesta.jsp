<%-- 
    Document   : FormEncuesta
    Created on : 01-ago-2014, 19:12:27
    Author     : jota
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
            <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Practica</title>

    <!-- Bootstrap -->    
    
    <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        <a href="../../EncuestaServlet?opt=1"><h3>Volver</h3></a>
        <form action="../../EncuestaServlet">
            <div class="">
                    <table border="1">
                        <tr>

                            <th>Pregunta</th>
                            <th><input type="text" name="IPregunta"/></th>

                        </tr>
                        <tr>

                            <th>FechaAlta</th>
                            <th><input type="text" name="IFecha"/></th>

                        </tr>
                        <tr>


                            <th colspan="2"><input type="hidden" name="opt" value="3"/><input type="submit" value="Aceptar"/></th>

                        </tr>

                    </table>
        
                </div>
        </form>
        
        
                        
   <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->    
    <script src="../../bootstrap/js/bootstrap.min.js"></script>    
        
    </body>
</html>
