<%-- 
    Document   : Prinsipal
    Created on : 14/03/2013, 06:06:25 PM
    Author     : JONATAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="en" class="no-js demo-2">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Main Page</title>
        <link href="Recursos/Imagenes/Iconos/main.ico" type="image/x-icon" rel="shortcut icon" />
        <link rel="icon" type="image/png" href="Recursos/Imagenes/Iconos/main.png" /> 
        <link rel="stylesheet" type="text/css" href="Recursos/Estilos/PrinsipalCss/demo.css" />
        <link rel="stylesheet" type="text/css" href="Recursos/Estilos/PrinsipalCss/style.css" />
        <script type="text/javascript" src="Recursos/JScript/PrinsipalJs/modernizr.custom.79639.js"></script> 
		<!--[if lte IE 8]>
			 <link rel="stylesheet" type="text/css" href="Recursos/Estilos/PrinsipalCss/simple.css" />
		<![endif]-->
    </head>
    <body>
        <div class="container">
		
			<!-- Codrops top bar -->
           <!--/ Codrops top bar -->
			
			<div class="st-container">
			
				<input type="radio" name="radio-set" checked="checked" id="st-control-1"/>
				<a href="#st-panel-1">Galeria</a>
				<input type="radio" name="radio-set" id="st-control-2"/>
				<a href="#st-panel-2">Video</a>
				<input type="radio" name="radio-set" id="st-control-3"/>
				<a href="#st-panel-3">Musica</a>
				<input type="radio" name="radio-set" id="st-control-4"/>
				<a href="#st-panel-4">Archivos</a>
				<input type="radio" name="radio-set" id="st-control-5"/>
				<a href="#st-panel-5">Gestionar</a>
				
				<div class="st-scroll">
				
					<!-- Placeholder text from http://hipsteripsum.me/ -->
					
					<section class="st-panel" id="st-panel-1">
						<div class="st-deco" data-icon="Q"></div>
						<h2>Galeria</h2>
						<p>Pagina en Mantenimientoo
					</section>
					
					<section class="st-panel st-color" id="st-panel-2">
						<div class="st-deco" data-icon="Q"></div>
						<h2>Video</h2>
						<p>Pagina en Mantenimientoo</p>
					</section>
					
					<section class="st-panel" id="st-panel-3">
<!--						<div class="st-deco" data-icon="B"></div>-->
						<iframe  name="body" frameborder="0" height="100%" width="100%" src="Web/Music/Music.jsp"></iframe>
					</section>
					
					<section class="st-panel st-color" id="st-panel-4">
                                            <iframe  name="body" frameborder="0" height="100%" width="100%" src="../LibroController?opt=R"></iframe>
                                            
					</section>
					
					<section class="st-panel" id="st-panel-5">
						<div class="st-deco" data-icon="Ç"></div>
						<h2>Gestionar</h2>
						<p>Requiere Inicion de Session 
<!--                                                <a href="../LibroController?opt=R">ReportarLibros</a>-->
                                                <a href="#">Go!</a></p>
                                                </p>
					</section>

				</div><!-- // st-scroll -->
				
			</div><!-- // st-container -->
			
        </div>
    </body>
</html>
