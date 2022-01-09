<%-- 
    Document   : mainPeriodo
    Created on : 27-sep-2012, 8:43:05
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/start/jquery-ui-1.9.0.custom.css" />">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/lp1.css" />">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/style.css" />">
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-1.8.2.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-ui-1.9.0.custom.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery.ui.progressbar.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/ajax/funcionesUtils.js"/>"></script>
        
        <title>JSP Page</title>
       
        <script type="text/javascript">
           
           function progresBarDmp()
           {  
                    $( "#btnNuevo" ).click(function() {  
                        $("#progressbar" ).progressbar();
//                        $("#progressbar" ).progressbar().animate(params, 100, easing, callback);
//                        var i = 10;
//
//                                setTimeout(function(){
//                                etInterval(function(){
//                                $("#progressbar").progressbar( "value", i ); 
//                                i=i+10;                 
//                                },10);                                    
//                                 $("#progressbar").hide();
//                                }                               
//                                ,200);
                    var val = $("#progressbar").progressbar("option", "value");
                    $("#progressbar").progressbar("option", "value", val-10);
                    setTimeout(function(){
                        $("#progressbar").hide();
                    },100);
                    });

  
           }
           
           
           
         function mostrarFormulario(){
             $.ajax({
                  type:"GET",
                  url:"formPeriodo.dmp",
                  data:"",
                  success: function(rdata){                        
                     $("#cuadroReporteR").html(rdata);                                  
                     $("#cuadroReporteR").show();
 
                     
                    }
                    }
                );             
         }   
        </script>    
    </head>
    <body onload="mainPeriodoEjecuta()">

        <div id="cuadroReporteR" align="center" style="display: none" class="cuadroReporteR" title="Autenticaci&oacute;n Administrador">
            
        </div>   
        
        <div align="center">
            <div id="progressbar" align="center"  style="width: 50%;"></div>
            
        <c:if test="${!empty listPeriodo}">
            <div id="cuadroReporte"  align="center" style="width: 80%;">                

                        <h3>Administrar Periodo</h3>
                        <div>
                            
                        <div id="divFormBuscar" >
                            Periodo 
                            <input type="text" name="periodo" value="" />
                            <input type="submit" id="btnBuscar" value="Buscar" />
                            
                            <input type="button" id="btnNuevo"  onclick="mostrarFormulario(); progresBarDmp()" value="Nuevo" />
                            
                        </div>
                            
                        <div id="divMostrarMsg" style="display: none" >

                        </div>                            
                <table border="1">
                <thead>
                    <tr>
                        <th colspan="6"> Reporte de Periodos</th>                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id Periodo</td>
                        <td>Periodo</td>
                        <td>Estado</td>
                        <td>Fecha Ini</td>
                        <td>Fecha Fin</td>
                        <td>Opciones</td>
                    </tr>
                    <c:forEach items="${listPeriodo}" var="p">                                            
                    <tr>
                        <td><c:out value="${p.idPeriodo}" /></td>
                        <td><c:out value="${p.periodo}" /></td>
                        <td><c:out value="${p.eatado}" /></td>
                        <td><c:out value="${p.fechaInicio}"  /></td>
                        <td><c:out value="${p.fechaFin}"  /> </td>
                        <td> 
                            <a href="eliminarPer.dmp?idPeriodoP=${p.idPeriodo}">Eliminar</a> 
                            <a href="editarPeriodo.dmp?idPeriodoP=${p.idPeriodo}">Editar</a> 
                        
                        </td>
                        
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            </div>
                    
          </div>
        </c:if>
    </div>
    </body>
</html>
