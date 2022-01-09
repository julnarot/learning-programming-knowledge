/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


     $().ready(function() {
     $('#dato').autocomplete('../../../AlumnoControl', {
        delay:200,
        minChars:2,
        matchSubset:10,
        matchContains:1,
        cacheLength:10,       
        formatItem: function (row){
           // alert(row[1]);
            return "<span style='font-size:10px'>" + row[0] + "</br>  <b>"+row[1]+"</b>.</span>";
        },        
        extraParams:{
            opt:"F"
        },
        autoFill:false,
        onItemSelect: function(e){
           
            $("#formBuscar").submit();
        }
                
    });
    });