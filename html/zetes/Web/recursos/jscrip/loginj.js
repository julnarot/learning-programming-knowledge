  function loggin(form)
{
    if(form.correo.value=="admin" && form.clave.value=="123")
    {
        
             location.href="demo/demo.html";
    }else
        {
            alert("Error Email ["+form.correo.value+"] o contrasenia incorrecta ")            
        }
}