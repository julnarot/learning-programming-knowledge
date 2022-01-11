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
        <?php 
        $nombre="";
        $estado="";
        $codigo="";
        $opcion="3";
        foreach ($book as $to) {
        $opcion="7";
        $nombre=$to->getNombre();
        $estado=$to->getEstado();
        $codigo=$to->getCodigo();            
        }
        
        ?>
        <form action="index.php">
        <table border="0">
            <thead>
                <tr>
                    <th colspan="2" style="background-color: antiquewhite" >Registro de Nombre</th>                    
                </tr>
            </thead>
            <tbody>                
                <tr>
                    <td>nombre:</td>
                    <td><input type="text" name="nombre" value="<?php echo $nombre ?>" /></td>
                </tr>
                <tr>
                    <td>Estado:</td>
                    <td><input type="text" name="estado" value="<?php echo $estado?>" /></td>
                </tr>
                <tr>
                    <td colspan="2">                        
                        <input type="hidden" name="opcion" value="<?php echo $opcion ?>" />
                        <input type="hidden" name="codigo" value="<?php echo $codigo ?>" />
                        <input type="submit" value="enviar" /></td>                    
                </tr>
            </tbody>
        </table>
        </form>
    </body>
</html>
