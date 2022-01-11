<%-- 
    Document   : redirect
    Created on : 08/04/2013, 11:21:23 PM
    Author     : USUARIO
--%>

<%@page import="upeu.edu.pe.titikaka.utils.STRCrypto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            STRCrypto crypto = new STRCrypto();
            try {
                response.sendRedirect(crypto.decrypt("SmvPMalc+lzPzjqnuUdS2ZoMfX3OAGudT1ngVa85wCN2tagt1b+GOg=="));
            } catch (Exception e) {
                e.getMessage();
            }
        %>
    </body>
</html>
