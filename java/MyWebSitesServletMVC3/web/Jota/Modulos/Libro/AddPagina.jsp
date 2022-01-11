<%-- 
    Document   : AddPagina
    Created on : 30/04/2013, 12:49:58 AM
    Author     : JONATAN
--%>

<%@page import="rj.upeu.modelo.MwPaginaTo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../../Recursos/JScript/Jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
        <script src="../../Recursos/JScript/Jquery/jquery.textareaCounter.plugin.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="../../Recursos/Estilos/Jstyle.css"/>
    <script type="text/javascript">
			var info;
			$(document).ready(function(){
				var options = {
					'maxCharacterSize': -2,
					'originalStyle': 'originalTextareaInfo',
					'warningStyle' : 'warningTextareaInfo',
					'warningNumber': 40
				};
				$('#testTextarea').textareaCount(options);
			});
		</script>
    </head>
    <body>
        <%
        String Idl=null;
        Idl=(String)request.getSession().getAttribute("IdLi");             
            
        %>
        <form action="../../../LibroController" id="FormReg">
            <table border="0">
                <thead>
                    <tr>
                        <th colspan="4">Agregando Pagina</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Pagina:</td>    
                
                        <td><input type="text" name="NumPaginaJ"  value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Contenido:</td>
                        <td><textarea name="ContenidoJ" rows="4" cols="20" id="testTextarea" required=""></textarea></td>
                    </tr>
                   
                    <tr>
                        <td colspan="2" align="center"> 
                            <input type="hidden" name="opt" value="S"/>    
                            <input type="submit" value="Agregar"/>
                            <input type="hidden"  name="LibroIdJ" value="<%=Idl%>"/>
                            <a href="../../../LibroController?opt=R"><input type="button" value="Cancelar" /></a>
                        </td>                       
                    </tr>                   
                </tbody>
            </table>

        </form>
            
      
    </body>
</html>
