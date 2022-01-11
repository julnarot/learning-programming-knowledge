<%-- 
    Document   : AddLibro
    Created on : 18/03/2013, 10:40:26 PM
    Author     : JONATAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="../../../LibroController">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Agregando Book</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Autor:</td>                    
                        <td><input type="text" name="AutorJ"  value="" /></td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>                    
                        <td><input type="text" name="NombreJ"  value="" /></td>
                    </tr>
                    <tr>
                        <td>Formato</td>
                        <td><select name="ColorJ" required>
                                <option value="bk-book book-1">Naranja</option>
                                <option value="bk-book book-2">Negro</option>
                                <option value="bk-book book-3">Esmeralda</option>
                            </select>
                        </td>
                    </tr>
                   
                    <tr>
                        <td colspan="2" align="center"> 
                            <input type="hidden" name="ImgPortadaJ" value="sin imagen" />
                            <input type="hidden" name="ContraPortadaJ" value="sin imagen" />
                            <input type="hidden" name="opt" value="C" />
                            <input type="submit" value="Agregar"/>
                            <a href="../../../LibroController?opt=R"><input type="button" value="Cancelar" /></a>
                        </td>                       
                    </tr>                   
                </tbody>
            </table>

        </form>
        
        
        
      
            
    </body>
</html>
