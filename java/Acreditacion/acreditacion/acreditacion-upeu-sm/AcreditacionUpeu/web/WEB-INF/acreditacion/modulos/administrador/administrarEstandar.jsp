<%-- 
    Document   : administrarEstandar
    Created on : 14-nov-2012, 19:25:38
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm" %>
<!DOCTYPE html>
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
    </head>
    <body>
        <h3>Reportes Estandares</h3>
       

        <c:if test="${!empty listaEstandar}">
            <div id="cuadroReporte">
                <h3>Reportes Estandares</h3>
                <div>
                    <table border="1">
                        <thead>
                            <tr>
                                <th colspan="6">
                                    Estandares
                                    <br>
                                    Nombre Estandar<input type="text" name="nombreEstandar" value="" /><input type="submit" value="busqueda" />
                                    <c:if test="${empty listaEstandar}"> <input type="submit" value="add" /> </c:if>
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
                            <c:forEach items="${listaEstandar}" var="p">
                                <tr>
                                    <td><c:out value="${p.idEstandar}" /></td>
                                    <td><c:out value="${p.nombre}" /></td>
                                    <td><c:out value="${p.nroEstandar}" /></td>
                                    <td><c:out value="${p.descripcion}" /></td>
                                    <td><c:out value="${p.idTipoEstandar.nombre}" /></td>
                                    <td><c:out value="${p.estado}" /></td>
                                    <td> 
                                        <a href="eliminarEstandar.ads?idEstandarP=${p.idEstandar}">Eliminar</a> 
                                        <a href="editarEstandar.ads?idEstandarP=${p.idEstandar}">Editar</a> 
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
