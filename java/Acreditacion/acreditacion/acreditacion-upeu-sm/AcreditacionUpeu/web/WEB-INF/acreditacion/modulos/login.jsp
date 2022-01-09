<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bien venidos al sistema de Auntoevaluacion Upeu</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/start/jquery-ui-1.9.0.custom.css" />">
        <link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/lp1.css" />">
        
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-1.8.2.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/js/jquery-ui-1.9.0.custom.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/recursos/ajax/funcionesUtils.js"/>"></script>        
    </head>
    <body onload="divAcordionMostrar()">
        <div align="center">
        <div id="divAcordion" style="width: 30%" >
            <h3> Formulario de Autentificacion </h3>
            <div>
                <c:url value="frame.dmp" var="urlPrincipal" />    
                <fm:form action="${urlPrincipal}" method="post">
                    <table border="0" align="center" style="margin: 4px" >
                        <tr>
                            <td colspan="1" align="center" style="font-size:14px"  >
                                <p class="link1" ><em><b>Acceso al sistema de Autoevaluacion Upeu </b></em></p>
                            </td>
                        </tr>
                        <tr>
                                <td align="center" colspan="1" >Indentifiquese:</td>
                        </tr>

                        <tr>
                                <td colspan='1' height='2'></td>
                        </tr>
                        <tr>
                            <td colspan="1" align="center">
                                <form  method="post" action="javascript:validaxion()" name="fm" >
                                   <table >
                                    <tr>
                                                <td>Usuario:</td>
                                                <td><input type="text"  name="username"  size="15" autocomplete="off"/></td>
                                        </tr>
                                        <tr>
                                                <td colspan='2' height='2'></td>
                                        </tr>
                                        <tr>
                                                <td>Clave:</td>
                                                <td><input type="password" name="password"  size="15" autocomplete="off"/></td>
                                        </tr>
                                        <tr>
                                                <td colspan='2' height='2'></td>
                                        </tr>
                                        <tr >
                                                <td colspan="2"  align="center" >                                                    
                                                    <input type="submit" value="Entrar" class="button2" />&nbsp;&nbsp;
                                                    
                                                </td>
                                        </tr>
                                        <tr>
                                        <td colspan="2" >
                                            <div class="myerror" align="center">
                                                    <a id="login_error"></a>
                                                </div>
                                         </td>
                                         </tr>

                                   </table>
                                   </form>
                          </td>
                         </tr>
                        </table>                   
                </fm:form>
            </div>
            
        </div>
        </div>
                <a href="reponsable.ads">ir al responsable</a> <br>
                <a href="administrador.ads">ir al admistrador</a><br>
                <a href="evaluador.ads">ir al evaluador</a><br>
                <a href="visor.ads">ir al visor</a><br>

                
               
    </body>
</html>
<script type="text/javascript">
function validaxion(){
     var error = "";
     $('#llave').val("");
	if (!$("#username").val()){
		error += "Introduce el usuario<br>";
		$('#username').focus();
	}
	if (!$("#password").val()){
		error += "Introduce la contraseña";
		if ($("#username").val())
		 $('#password').focus();
	}      
    if(error.length > 0){
	   $("#login_error").html('');
	   $("#login_error").append(error);
	   $("#login_error").slideDown();           
	}else{
	$('#login_error').css('display','none');
	$('#login_cargando').css('display','block');
        var objParameter = "";

        $.ajax({
                type: 'POST',
		url: 'validar/login.html',		
		data: 'username=' + encodeURIComponent($('#username').val()) + '&password=' + encodeURIComponent($('#password').val()) + '&web=validaxion',
		success: function(data){  
                    //alert(data);
                    objParameter=$.trim(data).split("|");                    
                    if($.trim(objParameter[0])=="5"){
                                if($.trim(objParameter[1])=='Exito'){
                                        window.location=$.trim(objParameter[2]);
                                }
                                else {
				$('#login_error').html("Acceso no Autorizado");
				$('#login_error').css('display','block');                                
                                }                         
                         }else{
				$('#login_error').html($.trim(objParameter[1]));
				$('#login_error').css('display','block');
				$('#username').focus();                                
                         } 
            }
         })        
	}
}

</script>