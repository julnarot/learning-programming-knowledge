<%-- 
    Document   : IndexFrame
    Created on : 29/10/2012, 05:54:31 PM
    Author     : wcruz
--%>

<%@page import="upeu.edu.pe.titikaka.domain.UsuarioTo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Titikaka Trout v0.1</title>
        <link rel="stylesheet" type="text/css" href="../../../resources/css/layout.css"/>
    </head>
    <%
        UsuarioTo userVal = (UsuarioTo) request.getSession().getAttribute("userValidated");
    %>
    <body>
        <header>
            <div>
                <a href="http://www.upeu.edu.pe" target="self">
                    <!--<img style="border:0px;" alt="Universidad Peruana Union" height="50px" src="../../../resources/img/logos/logo_upeu.png"/>-->
                </a>
            </div>
            <div style="right: 10px;top:15px;position: fixed;" >
                <a href="indexFrame.jsp">
                    <!--<img src="../../../resources/img/logos/logo_cepre.png" height="20px"/>-->
                </a>
            </div>
        </header>
        <menu>
              <%@include file="menu.jsp" %>    
        </menu>
        <article>
            <iframe name="content" height="100%" width="100%" style="border:none" src="body.jsp"></iframe>
        </article>
        <footer>
            <div style="bottom: 0px;right: 0px;position: absolute;">
                <img src="../../../resources/img/logos/logo_footer.png" height="45px"/>
            </div>
            <nav>Usuario: <%=userVal.getUsername()%></nav>
            <nav>Cargo: <%=userVal.getCargo()%></nav>
            
        </footer>
    </body>
</html>
