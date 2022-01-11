<%-- 
    Document   : menu
    Created on : 12-jun-2012, 11:07:15
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Accordion Menu Using jQuery</title>
<script type="text/javascript" language="javascript" src="../Recursos/js/menu/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function()
{
	//slides the element with class "menu_body" when paragraph with class "menu_head" is clicked 
	$("#firstpane p.menu_head").click(function()
    {
		$(this).css({backgroundImage:"url(../Recursos/img/down.png)"}).next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
       	$(this).siblings().css({backgroundImage:"url(../Recursos/img/left.png)"});
	});
	//slides the element with class "menu_body" when mouse is over the paragraph
	$("#secondpane p.menu_head").mouseover(function()
    {
	     $(this).css({backgroundImage:"url(../Recursos/img/down.png)"}).next("div.menu_body").slideDown(500).siblings("div.menu_body").slideUp("slow");
         $(this).siblings().css({backgroundImage:"url(../Recursos/img/left.png)"});
	});
});
</script>

<style type="text/css">
body {
	margin: 10px auto;
	font: 75%/120% Verdana,Arial, Helvetica, sans-serif;
}
.menu_list {	
	width: 150px;
}
.menu_head {
	padding: 5px 10px;
	cursor: pointer;
	position: relative;
	margin:1px;
    font-weight:bold;
    background: #eef4d3 url(../Recursos/img/left.png) center right no-repeat;
}
.menu_body {
	display:none;
}
.menu_body a{
  display:block;
  color:#006699;
  background-color:#EFEFEF;
  padding-left:10px;
  font-weight:bold;
  text-decoration:none;
}
.menu_body a:hover{
  color: #000000;
  text-decoration:underline;
  }
</style>
</head>
<body>
<div style="float:left" > <!--This is the first division of left-->
  <p align="center"><strong>Menu Prinsipal </strong></p>
  <div id="firstpane" class="menu_list"> <!--Code for menu starts here-->
		<p class="menu_head">Header-1</p>
		<div class="menu_body">
                        <a href="#">Link-1</a>
                        <a href="#">Link-2</a>	
		</div>
		<p class="menu_head">Lista Personas</p>
		<div class="menu_body">
			<a href="../../PersonaControl?opt=R" target="body">Reporta de Personas</a>
                        <a href="#">Link-2</a>
                        <a href="#">Link-3</a>	
		</div>
		<p class="menu_head">Cuentas</p>
		<div class="menu_body">
                        <a href="../../CuentaControl?opt=R">Cuentas Persona</a>
                        <a href="#">Caja Prinsipal</a>
                        <a href="#">Link-3</a>			
       </div>
  </div>  <!--Code for menu ends here-->
</div>



</body>
</html>
