<%-- 
    Document   : cargarArchivo
    Created on : 17-nov-2012, 22:23:07
    Author     : nancy
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm" %>
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
        <script type="text/javascript" src="<c:url value="/recursos/ajax/funcionesUtils.js"/>"></script>
        <title>JSP Page</title>
        
        
         <center><h1>REPORTE DOCUMENTOS</h1></center>
        

            <Center>
                <div>

            <c:url value="BUSQUEDA:ESTANDAR"/>
            <br>
            <br>
        <c:url value="DIMENSION"/>
       
        <select name="--seleccionar--">
                <option>--seleccionar--</option>
                <option></option>
            </select>
        <c:url value="FACTORES"/>
        
        <select name="--seleccionar--">
                <option>--seleccionar--</option>
                <option></option>
            </select>
        <br>
        <br>
        <c:url value="CRITERIOS"/>
        <select name="--seleccionar--">
                <option>--seleccionar--</option>
                <option></option>
            </select>
        <br>
        <br>
        
        <input type="submit" value="buscar" name="Buscar" />
        <input type="submit" value="documentos subidos" name="Documentos Subidos" />
      
        </div>
            </Center>
        <br>
        <br>
        <br>
        <center>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>nro estandar</th>
                        <th>nro</th>
                        <th>documentos</th>
                        <th>subir archivo</th>
                        <th>plan de mejora</th>
                    </tr>
                </thead>
                <tr>
                    <td>
                        Contenindooo!!!
                        
                    </td>
               </tr>
                
            </table>

        </div>
            </center>
       
        
        <script type="text/javascript">
            
            
            
            
            
            
         function mostrarFormulario(){
             $("#cuadroReporteR" ).accordion();
             $.ajax({
                  type:"GET",
                  url:"formCargarArchivo.ads",
                  data:"",
                  success: function(rdata){                      
                     $("#cuadroReporte2").html(rdata);
                     $("#cuadroReporte2").show();
                    }
                    }
                );             
         }   
        </script>    
    </head>
    <body>

        <h3>Reportes doc</h3>
       

        <c:if test="${!empty listaArchivos}">
            <div id="cuadroReporte">
                <h3>Reportes docs</h3>
                <div>
                    <table border="1">
                        <thead>
                            <tr>
                                <th colspan="6">
                                    archivos
                                    <br>
                                    Nombre archivo<input type="text" name="nombrearchivo" value="" /><input type="submit" value="busqueda" />
                                    <c:if test="${empty listaArchivo}"> <input type="submit" value="add" /> </c:if>
                                </th>
                                

                            </tr>
                        </thead>
                        <tbody>
                            <tr><td>id Estandar</td>
                                <td>Nombre</td>
                                <td>Nro Estandar</td>
                                <td>Criterio</td>
                                <td>Tipo</td>
                                <td>Estado</td>
                                <td>Opciones</td>
                            </tr>
                            <c:forEach items="${listaArchivos}" var="c">
                                <tr>
                                    <td><c:out value="${c.idDireccion}" /></td>
                                    <td><c:out value="${c.url}" /></td>
                                    <td><c:out value="${c.fechaSubida}" /></td>
                                    <td><c:out value="${c.feachaAsignacion}" /></td>
                                    <td><c:out value="${c.periodo}" /></td>
                                   
                                    <td> 
                                        <a href="eliminarCargaArchivo.ads?idEstandarC=${p.idDireccion}">Eliminar</a> 
                                        
                                    </td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>


        </c:if>


    </body>
</html>
