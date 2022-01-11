<%-- 
    Document   : MainLibro
    Created on : 18/03/2013, 10:40:11 PM
    Author     : JONATAN
--%>
<%@page import="rj.upeu.modelo.MwLibroTo" language="java"%>
<%@page import="rj.upeu.modelo.MwPaginaTo" language="java"%>
<%@page import="rj.upeu.business.PaginaBusiness" language="java"%>
<%@page import="java.util.List" language="java"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="../../Recursos/3DBookCss/default.css" />
	<link rel="stylesheet" type="text/css" href="../../Recursos/3DBookCss/component2.css" />
        <script src="../../Recursos/JScript/3dBookJs/modernizr.custom.js"></script>
    </head>
    <body>
       <%
        List<MwLibroTo> Lista=null;              
        Lista =(List<MwLibroTo>)request.getSession().getAttribute("ListaLibro");
        

        PaginaBusiness bus = new PaginaBusiness();        
        List<MwPaginaTo> Lista2 = null;
        //List<MwPaginaTo> Lista2 = bus.ReportarPaginaIdBus(id);
        
       %>

        
        <div class="container">	
			
			<header class="clearfix">
				<h5>Note Books</h5>	<a href="AddLibro.jsp">Add</a>
				
                                
			</header>
			<div class="main">
				<ul id="bk-list" class="bk-list clearfix">
					
                                    
                                    <%String color="";
                                    int cont=0;
                                     for(MwLibroTo Toto: Lista)
                                     {
                                         color=Toto.getColor().toString();
                                         Lista2 = bus.ReportarPaginaIdBus(Toto.getLibro_id());
     %>                                    
                                    <li>
                                        <div class="<%=color%>">
							<div class="bk-front">
								<div class="bk-cover">
									<h2>
                                                                            <span><%=Toto.getAutor()%></span>
									    <span><%=Toto.getNombre()%></span>
									</h2>
								</div>
								<div class="bk-cover-back"></div>
							</div>
							<div class="bk-page">
                                                            
								
                                                  <%
                                                for(MwPaginaTo Toto2: Lista2)
                                                        {
                                                    %>                                                    
                                                    <div class="bk-content">
                                                        <a href="../../../LibroController?opt=N&PaginaIdJ=<%=Toto2.getPagina_id()%>" title="editar">
                                                                    <p><%=Toto2.getContenido()%></p></a>
                                                    </div>
                                                    
                                                    
                                                    <%
                                                        } 
                                                    %>         
                                                       <a href="../../../LibroController?opt=G&LibroIdJ=<%=Toto.getLibro_id()%>"><img src="../../Recursos/Imagenes/Iconos/add.png" width="10" height="10" alt="add" align="right"/></a>

							</div>
							<div class="bk-back">
								<%=Toto.getContraPortada()%>
							</div>
							<div class="bk-right"></div>
							<div class="bk-left">
								<h2>
                                                                    <span><a href="../../../LibroController?opt=I&LibroIdJ=<%=Toto.getLibro_id()%>"><img src="../../Recursos/Imagenes/Iconos/modificar.png" width="17" height="19" alt="modificar" align="right"/></a>
                                                                                <%=Toto.getAutor()%></span>
									<span><%=Toto.getNombre()%></span>
								</h2>
							</div>
							<div class="bk-top"></div>
							<div class="bk-bottom"></div>
						</div>
					</li>
                                        <%}%>
					
				</ul>
				<div class="bookshelf"></div>
			</div>
		</div><!-- /container -->
                <script src="../../Recursos/JScript/Jquery/jquery-1.9.1.min.js"></script>
                <script src="../../Recursos/JScript/3dBookJs/books2.js"></script>
		<script>
			$(function() {

				Books.init();

			});
		</script>
    </body>
</html>

