<%-- 
    Document   : MainPrueba
    Created on : 08-may-2012, 8:21:02
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="upeu.edu.to.CuentaTO" %>
<%@page language="java" import="java.util.List" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MainPrueba</title>
        <link  href="../../Jonatan/Recursos/css/style.css" rel="stylesheet" type="text/css" />
        <link  href="../../Jonatan/Recursos/css/lp1.css" rel="stylesheet" type="text/css" /> 
        <link  href="../../Jonatan/Recursos/css/jquery.autocomplete.css" rel="stylesheet" type="text/css" /> 
        <script type="text/javascript" src="../../Recursos/js/jquery.js" ></script>
        <script type="text/javascript" src="../../Recursos/js/jquery.autocomplete.js" ></script>
        <script type="text/javascript" src="../../Recursos/js/alumno.js" ></script>
        <script type="text/javascript" src="../../Recursos/js/funciones.js" ></script>
        
        <script type="text/javascript">
            function mostraFormInsert(){
                oculatrDivs();
                $("#divInsertar").show();
            }
            function ocultarFormInsert(){
                $("#divInsertar").hide();
            } 
            function mostrarEditForm(url){
                oculatrDivs();
                $.ajax({                
                type:"POST",
                url:url,
                data:"",
                success: function(data){                                                           
                  $("#divEditar").html(data);
                  $("#divEditar").show();    
                  
                }
                });
            }            
            function oculatrDivs(){
                $("#divInsertar").hide();
                $("#divEditar").hide();                
            }
        </script>
        
    </head>
    <body style="background-color: aliceblue" onload="posicionFocus('dato')">
    <center>
   
        
        <div id="divEditar" style="display: none">
        
        </div>
        
        
        <div id="divInsertar" style="display: none">
        <form name="Form Alumno" method="post" action="../../../AlumnoControl">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Formulario Insertar Alumno</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Código:</td>
                        <td><input type="text" name="codigo" id="codigo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="nombre" class="mamani" value="" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos:</td>
                        <td><input type="text" name="apellidos" value="" /></td>
                    </tr>
                    <tr>
                        <td>E.A.P:</td>
                        <td><select name="eap">
                                <option value="Sistemas">EAP Sistemas</option>
                                <option value="Civil">EAP Civil</option>
                                <option value="Alimentos">EAP Alimentos</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Sexo:</td>
                        <td>Masculino<input type="radio" name="sexo" value="M" />
                            Femenino<input type="radio" name="sexo" value="F" />
                        </td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Teléfono</td>
                        <td><input type="text" name="telefono" value="" /></td>
                    </tr>
                    <tr>
                        <td>Estado:</td>
                        <td>Activo<input type="radio" name="estado" value="1" checked="" />
                            Desactivo<input type="radio" name="estado" value="0" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"> 
                            <input type="hidden" name="opt" value="1"/>    
                            <input type="submit" value="Guardar" name="guardar" />
                            <input type="button" value="Cancelar" name="cancelar" onclick="ocultarFormInsert()" />
                        </td>
                       
                    </tr>
                   
                </tbody>
            </table>

        </form>
            
        </div>
        
        <br/>
<!--                SALTO DE LINEA, 
                    ABIERTO Y CERRADO A LA VEZ-->
<!-- class="mamani" -->
      

          <table border="1">
            <thead>
                <tr><%-- //filaaa--%>
                    <th colspan="5" style="color: brown; background-color: bisque">Reporte de Alumnos</th><%-- TH columnaa cuando estamos en HEAD--%>
                  
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>#</td><%--TD columna cuando estamos en cuerpo BODY--%>
                    <td>Fecha</td>
                    <td>Nombres</td>
                    <td>Concepto</td>
                    <td>Tipo de Pago</td>
                    <td>Debito</td>
                    <td>Credito</td>
                    
                </tr>
               <% 
              List<CuentaTO> lista=null;
              lista=(List<CuentaTO>)request.getSession().getAttribute("listaCuen");
              int i=0;
              if(lista!=null){
              for(CuentaTO to: lista){//este for no acepta nulos
         
                %> 
                <tr>
                  
                    <td><%=to.getCuentaIdC()%></td>
                    <td><%=to.getFecha()%></td>
                    <td><%=to.getNombresP()%></td>
                    <td><%=to.getConcepto()%></td>
                    <td><%=to.getTipopago()%></td>
                    <td><%=to.getDebito()%></td>
                    <td><%=to.getCredito()%></td>
                    
                    <td>
                        <a href="../../../AlumnoControl?opt=D&idAlumno=<%=to.getCuentaIdC()%>">Eliminar</a>
                        <a href="#" onclick="mostrarEditForm('../../../AlumnoControl?opt=E&idAlumno=<%=to.getCuentaIdC()%>')">Editar</a>                        
                    </td>
                </tr>
                <% }
                }  %>

            </tbody>
        </table>

        <a href="../../../index.jsp">Ir Main Principal</a>
       </center> 
    </body>
</html>
