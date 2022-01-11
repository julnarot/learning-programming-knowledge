/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

           
function mainPeriodoEjecuta(){
        $( "#cuadroReporte" ).accordion();
//        $( "#cuadroReporte2" ).accordion();
        $( "#boton" ).button();
        $( "#btnBuscar" ).button();
        $( "#btnNuevo" ).button();
}
function mainPeriodoEjecuta2(){
        $( "#cuadroReporteR" ).accordion();
}

function divAcordionMostrar(){
        $( "#divAcordion" ).accordion();
        $( "#btnEnviar" ).button();
}

function closeX(parametro){
    var campos = parametro.split(",");
    for (x=0; x< campos.length; x++){
    $("#"+campos[x]).hide();
    }
    $('#bgtransparent').remove();
}



function accionURL(objUrl){
location.href=objUrl;
}       