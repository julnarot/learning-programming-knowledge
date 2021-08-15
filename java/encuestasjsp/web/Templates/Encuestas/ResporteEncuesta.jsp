<%-- 
    Document   : ResporteEncuesta
    Created on : 01-ago-2014, 17:56:01
    Author     : jota
--%>

<%@page import="edu.jota.model.Encuesta" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Practica</title>

    <!-- Bootstrap -->    
    
    <link href="../../bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        <%
            int num = 1;
            List<Encuesta> lis = (List<Encuesta>)request.getSession().getAttribute("ListEncuesta");
        %>
        <a href="../../EncuestaServlet?opt=2">Agregar Encuesta</a>
        <a href="../../EncuestaServlet?opt=1"><h3 class="">Actualizar</h3></a>
        
        <div class="divider">
        <table border="2" class="table">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>EncuestaId</th>                        
                        <th>Pregunta</th>
                        <th>Fecha de Alta</th>
                        
                        <th colspan="2">OPSIONES</th>

                    </tr>
                    </thead>
                    <tbody>
                    <%
                        for (Encuesta dt : lis) {
                           
                    %>
                    <tr>                        
                        <td><%=num++%></td>
                        <td><%=dt.getIdEncuesta()%></td>
                        <td><%=dt.getPregunta()%></td>
                        <td><%=dt.getFechaAlta()%></td>
                        <td id="thnoStil">Edit</td>
                        <td id="thnoStil">Remove</td>
                        
                    </tr>
                    <%}%>
                        </tbody>
                </table>
                        
                        </div>
   <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->    
    <script src="../../bootstrap/js/bootstrap.min.js"></script>    
                        
    </body>
</html>
