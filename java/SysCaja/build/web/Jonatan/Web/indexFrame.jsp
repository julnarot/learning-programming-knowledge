<%-- 
    Document   : indexFrame
    Created on : 12-jun-2012, 11:00:09
    Author     : Alumno
--%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body style="padding: 0px 5px 5px 5px">  
            <div style="-moz-border-radius: 10px">
            <table style="width: 100%; height: 100%">
            <tr>
                <td colspan="2" style="background-color: dodgerblue">
                <%@include file="head.jsp" %>
                </td>
            </tr>
            <tr>
            <td style="width: 128px " >
            <div id="xmenu" style="height: 500px; width: 160px; background-color: dodgerblue "  >
                <iframe  name="menu" frameborder="0"  width="400%" height="110%" scrolling="no" src="menu.jsp"></iframe>
            </div>                           
            </td>
            
            <td >
            <div id="xbody" style=" width: 100%; height: 500px;  " >
            <iframe  name="body" frameborder="0" height="100%" width="100%" src="body.jsp"></iframe>
            </div>                        
            </td>

            </tr>  
            <tr>
                <td colspan="2" style="height: 30px; background-color: greenyellow">
            <%@include file="copy.jsp" %>
            </td>
            </tr>
            </table> 
            </div>
        </body>
    </html>
