<%-- 
    Document   : index
    Created on : 26-jun-2012, 22:52:38
    Author     : jonatan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  
 
    
     <body style="padding: 0px 5px 5px 5px">  
         
         
                <h1>Hello World!</h1>
        
        <a href="Jonatan/Admin/indexFrame.jsp">reporte</a>

    
    
            <div style="-moz-border-radius: 10px">
            <table style="width: 100%; height: 100%">
                
            <tr>
                <td colspan="2" style="background-color: dodgerblue">
                    <%@include file="Jonatan/Admin/head.jsp" %>
                </td>
            </tr>
            <tr>
            <td style="width: 128px " >
            <div id="xmenu" style="height: 500px; width: 160px; background-color: dodgerblue "  >
                <iframe  name="menu" frameborder="0"  width="400%" height="110%" scrolling="no" src="Jonatan/Admin/menu.jsp"></iframe>
            </div>                           
            </td>
            
            <td >
            <div id="xbody" style=" width: 100%; height: 500px;  " >
            <iframe  name="body" frameborder="0" height="100%" width="100%" src="Jonatan/Admin/body.jsp"></iframe>
            </div>                        
            </td>

            </tr>  
            <tr>
                <td colspan="2" style="height: 30px; background-color: greenyellow">
            <%@include file="Jonatan/Admin/copy.jsp" %>
            </td>
            </tr>
            </table> 
            </div>
        </body>
</html>
