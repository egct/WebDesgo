<%@page import="ec.com.desgo.controlador.DesgoS"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>


        <meta http-equiv="content-type" content="text/html; utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>DESGO Website Menu</title>
        <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
        <meta name="description" content="A sidebar menu as seen on the Google Nexus 7 website" />
        <meta name="keywords" content="google nexus 7 menu, css transitions, sidebar, side menu, slide out menu" />
        <meta name="author" content="Codrops" />
        <!--		<link rel="shortcut icon" href="../favicon.ico">!-->
        <link rel="stylesheet" type="text/css" href="Menu/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="Menu/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="Menu/css/component.css" />
        <script src="Menu/js/modernizr.custom.js"></script>



    </head>
    <body>
        <%
            String id = request.getParameter("idUser");
            String n = request.getParameter("name");
            String e = request.getParameter("empresa");
            String t = request.getParameter("tipo");
        %>
        <!--Contenedor general del tema del menu-->
        <div class="container">

            <!--Permite hacer una lista en donde se encuentran todas las opciones del menu-->
            <ul id="gn-menu" class="gn-menu-main" style="z-index: 8;">
                <li class="gn-trigger">

                    <!--Barra de tres lineas horizontales que despliega el menu-->
                    <a class="gn-icon gn-icon-menu"><span>Menu</span></a>
                    <nav class="gn-menu-wrapper">
                        <div class="gn-scroller">
                            <ul class="gn-menu">

                                <li>
                                <center><br><img src="Formulario/icon/user.png" style="width: 50%; height: 50%"></center>
                                <form action="DesgoS?a=ec52f08d101d7f813c031c3f50a41a39db7f8436" method="post">
                                    <input type="hidden" name="idUser" value="<%=id%>">
                                    <input type="hidden" name="name" value="<%=n%>">
                                    <input type="hidden" name="empresa" value="<%=e%>">
                                    <input type="hidden" name="tipo" value="<%=t%>">
                                    <a>
                                        <input type="submit" style="border: 0;width:100%;" value="<%=e + ": " + n%>">
                                    </a>
                                </form>
                                </li>
                                <li>
                                    <form action="DesgoS?a=d92837bb331591b05aac92e158bd2902d6fcc4ea" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon gn-icon-archive">
                                            <input type="submit" style="border: 0;width:80%;" value="Formulario">
                                        </a>
                                    </form>
                                </li>

                                <!--Una especie de manual de usuario o contactos que puedan ayudar al usuario-->
                                <li>
                                    <form action="DesgoS?a=eaa524a78a79eda3a4a6fcbca36b2470e95ba4d4" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon gn-icon-help">
                                            <input type="submit" style="border: 0;width:80%;" value="Ayuda">
                                        </a>
                                    </form>
                                </li>
                                <li> 
                                    <form action="DesgoS?a=684ce6a058b8e008f2a5199ef912b84620c49758" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon codrops-icon-prev">
                                            <input type="submit" style="border: 0;width:80%;" value="Salir">
                                        </a>
                                    </form>                                    
                                </li> 
                            </ul>
                        </div><!-- /gn-scroller -->
                    </nav>
                </li>
                <li style="float: left">
<!--                    <h5> Bienvenido <%=request.getParameter("idUser") + " " + request.getParameter("name")%></h5>!-->
                    <h6 style="font-size: 150% ">&nbsp;Bienvenido&nbsp;<%=t%>&nbsp;</h6>
                </li>

            </ul>
            <header>
                <!--Spam o link de los trabajos a futuro que tendra la empresa-->
                <h1>DESGO Website<span>Futuros proyectos <a href="#">DESGO</a>...</span></h1>	
                <h1>Página en mantenimiento<span> #!<a href="#">.....</a>...</span></h1>	

            </header> 
        </div><!-- Fin del container -->

        <!--Scripts que nos permiten desplegar el menu-->
        <script src="Menu/js/classie.js"></script>
        <script src="Menu/js/gnmenu.js"></script>

        <!--Scripts para la recuperacion de datos del usuario para colocarlos en la parte superior-->
        <script>
            new gnMenu(document.getElementById('gn-menu'));
            var idUser =<%=request.getParameter("idUser")%>;
            var name = "<%=request.getParameter("name")%>";
            var empresa = "<%=request.getParameter("empresa")%>";
            console.log("iduser" + idUser + "name" + name + "empre" + empresa);
        </script>
    </body>

    <footer style="width:100%; max-width:100%; margin: 0px auto; position: relative; text-align: justify; ">

        <div class="container-footer-all">

            <div class="container-body">

                <div class="colum1">
                    <h1>Mas informacion de la compañia</h1>

                    <p>La empresa DESGO es una iniciativa que realiza su actividad en el
                        ámbito del desarrollo de aplicaciones web y móviles integradas, 
                        enfocados en las áreas geográfica, ambiental y social; así mismo 
                        como explora en nuevas tecnologías aplicables a la elaboración de 
                        geoportales y análisis de big data.

                        DESGO brinda un espacio para la creación de nuevas ideas que 
                        potencialice a la juventud con el objetivo de integrar grupos 
                        multidisciplinarios que desarrollen productos para el beneficio
                        de la comunidad y el progreso del país
                    </p>

                </div>

                <div class="colum2">

                    <h1>Redes Sociales</h1>

                    <div class="row" >
                        <img src="Menu/icon/facebook.png" >
                        <a href="https://www.facebook.com/">
                            <label>Siguenos en Facebook</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/twitter.png">
                        <a href="https://www.Twitter.com/">
                            <label>Siguenos en Twitter</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/instagram.png">
                        <a href="https://www.Instagram.com/">
                            <label>Siguenos en Instagram</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/google-plus.png">
                        <a href="https://www.Instagram.com/">
                            <label>Siguenos en Google Plus</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/pinterest.png">
                        <label>Siguenos en Pinteres</label>
                    </div>


                </div>

                <div class="colum3">

                    <h1>Informacion Contactos</h1>

                    <div class="row2">
                        <img src="Menu/icon/house.png">
                        <label>Florinda de Alvear y 
                            Joaquín Gallegos Lara E17-25</label>
                    </div>

                    <div class="row2">
                        <img src="Menu/icon/smartphone.png">
                        <label>0997589895</label>
                    </div>

                    <div class="row2">
                        <img src="Menu/icon/contact.png">
                        <label>desgoecuador@outlook.com</label>
                    </div>

                </div>

            </div>

        </div>

        <div class="container-footer">
            <div class="footer">
                <div class="copyright">
                    © 2019 Todos los Derechos Reservados | <a href="">DESGO</a>
                </div>

                <div class="information">
                    <a href="">Informacion Compañia</a> | <a href="">Privacion y Politica</a> | <a href="">Terminos y Condiciones</a>
                </div>
            </div>

        </div>

    </footer>  

    <link rel="stylesheet" href="Menu/css/estilos.css">    

</html>