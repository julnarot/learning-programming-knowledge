<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
<table>
    <tr><td colspan="3"><a href="index.php?opcion=2">nuevo</a></td></tr>
	<tr>
            <td>Codigo</td>
            <td>Titulo</td>
            <td>Estado</td>
            <td>Opcion</td>
        </tr>
        
	<?php

		foreach ($books as $book)
		{
            echo '<tr>
                        <td>'.$book->getCodigo().'</td>
                        <td>'.$book->getNombre().'</td>
                        <td>'.$book->getEstado().'</td>
                        <td>
                        <a href="index.php?opcion=5&codigo='.$book->getCodigo().'">Eliminar</a>
                        <a href="index.php?opcion=6&codigo='.$book->getCodigo().'">actualizar</a>    
                        </td>
                  </tr>';
		}
	?>
</table>
    </body>
</html>
