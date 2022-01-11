<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Login Form</title>
        <link rel="stylesheet" href="../../../resources/css/login.css">
        <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
    </head>
    <%String msg=request.getParameter("msg");%>
    <body>
        <section class="container">
            <div class="login">
                <img src="../../../resources/img/banners/portada.jpg" height="115px" style="border-radius: 10px;"/><br/><br/><br/>
                <h1><img src="../../../resources/img/logos/logo_cepre.png" height="15px"/><br/>Ingreso al Sistema Contable de la CEPRE UPeU</h1>
                <form action="../../../LoginController">
                    <p><input type="text" name="txtUsername"  placeholder="Username"></p>
                    <p><input type="password" name="txtPassword"  placeholder="Password"></p>
                    <p class="remember_me">
                        <label>
                            <input type="checkbox" name="remember_me" id="remember_me">
                            Recordar la contraseña en este equipo
                        </label>
                    </p>
                    <input type="hidden" name="opt" value="1"/>
                    <p class="submit"><input type="submit" name="commit" value="Login"></p>
                    <p style="color: #DC143C; margin: 0 0 0 0 ;"><%if(msg!=null){out.print(msg);}%></p>
                </form>
            </div>
            <div class="login-help">
                <p>¿Has olvidado tu contraseña? <a href="MAILTO:josmarl567@gmail.com">Haz click aqui para recuperarla</a>.</p>
            </div>
        </section>
        <section class="about">
            <p class="about-links">
                <a href="http://www.upeu.edu.pe" target="_blank">UPeU</a>
                <a href="#" target="_parent">Mas informacion</a>
            </p>
            <p class="about-author">
                2013 <a href="#" target="_blank">Josmarl AgileSoft</a>
                <a href="#" target="_blank">@Todos los derechos reservados </a><br>
                Original Software by <a href="#" target="_blank">Jose Manuel Limachi Chavez</a>
        </section>
    </body>
</html>
