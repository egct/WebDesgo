<%@page import="ec.com.desgo.controlador.DesgoS"%>
<%@page import="ec.com.desgo.servicios.User"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>


        <meta http-equiv="content-type" content="text/html; utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>DESGO Website Menu</title>
        <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
        <meta name="description" content="A sidebar menu as seen on the DESGO website" />
        <meta name="keywords" content="Desgo menu" />
        <meta name="author" content="Desgo" />
        <!--		<link rel="shortcut icon" href="../favicon.ico">!-->
        <link rel="stylesheet" type="text/css" href="Menu/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="Menu/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="Menu/css/component.css" />
        <script src="Menu/js/modernizr.custom.js"></script>

        <!--Crear tablasde forma dinamica -->
        <script src="Formulario/dinamico/js/jquery-2.1.1.min.js"></script>
        <script src="Formulario/dinamico/js/bootstrap.js"></script>
        <script src="Formulario/js/dinamico.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/bootstrap.css">
        <!--Perfil -->
        <link href="Perfil/css/perfilCss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!--Contenedor general del tema del menu-->
        <div class="container">
            <%
                String id = request.getParameter("idUser");
                String n = request.getParameter("name");
                String e = request.getParameter("empresa");
                String t = request.getParameter("tipo");
                User busuario = (User) request.getAttribute("useraux");
            %>
            <!--Permite hacer una lista en donde se encuentran todas las opciones del menu-->
            <ul id="gn-menu" class="gn-menu-main" style="z-index: 8;">
                <li class="gn-trigger">

                    <!--Barra de tres lineas horizontales que despliega el menu-->
                    <a class="gn-icon gn-icon-menu"><span>Menu</span></a>
                    <nav class="gn-menu-wrapper">
                        <div class="gn-scroller">
                            <ul class="gn-menu">


                                <!--Segundo elemento de la lista que sirve para mostrar el nombre y redireccionar al perfil del usuario-->
                                <li>
                                <center><br><img src="Formulario/icon/user.png" style="width: 50%; height: 50%"></center>
                                <form action="DesgoS?a=f1c51add186473948772ee6bf159f006413d693a" method="post">
                                    <input type="hidden" name="idUser" value="<%=id%>">
                                    <input type="hidden" name="name" value="<%=n%>">
                                    <input type="hidden" name="empresa" value="<%=e%>">
                                    <input type="hidden" name="tipo" value="<%=t%>">
                                    <a>
                                        <input type="submit" style="border: 0;width:100%;" value="<%=e + ": " + n%>">
                                    </a>
                                </form>
                                </li>

                                <!--Tercer elemento de la lista es ir a la pagina para registrar el usuario-->
                                <li>
                                    <form action="DesgoS?a=9dbf7c1488382487931d10235fc84a74bff5d2f4" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon gn-icon-download">
                                            <input type="submit" style="border: 0;width:80%;" value="Administrar">
                                        </a>
                                    </form>
                                </li>                         
                                <li>
                                    <form action="DesgoS?a=3773b45def36f7906ee172a3a88b69a13dd4009a" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon gn-icon-archive">
                                            <input type="submit" style="border: 0;width:80%;" value="Mis Formularios">
                                        </a>
                                    </form>
                                </li>

                                <li>
                                    <form action="DesgoS?a=d65b1910633f1549f818bd804a2f10882ed36026" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon gn-icon-archive">
                                            <input type="submit" style="border: 0;width:80%;" value="Asignar Formularios">
                                        </a>
                                    </form>
                                </li>

                                <!--Una especie de manual de usuario o contactos que puedan ayudar al usuario-->
                                <li>
                                    <form action="DesgoS?a=d520317d32c646d6cf5813d217950930d878e68a" method="post">
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
            <div style="position: relative; z-index: -1">
                <article class="contenedorP" >
                    <center><img class="imagePerfil" src="Formulario/icon/user.png" /></center> 
                    <div class="partes"> 
                        <center>
                            <br>
                            <hr>
                            <br>
                            <table class="tablasP">
                                <tr>
                                    <td></td>
                                    <td class="firsc">Usuario:</td>
                                    <td><label><%= busuario.getUSUARIOUSUARIO()%></label></td>                                    
                                </tr>
                                <tr>
                                    <td></td>
                                    <td class="firsc">Empresa:</td>
                                    <td><label><%= busuario.getEMPRESAUSUARIO()%></td>
                                </tr>
                            </table>
                            <br>  
                            <hr>
                            <br>
                            <table class="tablasP">
                                <tr>
                                    <td></td>
                                    <td class="firsc">Tipo de usuario:</td>
                                    <td><label><%= busuario.getTipoUsuario().getNIVELTIPOUSUARIO()%></label></td>                                    
                                </tr>
                            </table>
                            <br>  
                            <hr>
                            <br>
                            <table class="tablasP">
                                <tr>
                                    <td></td>
                                    <td class="firsc">Nombres:</td>
                                    <td><label><%= busuario.getPersona().getPNOMBREPERSONA() + " " + busuario.getPersona().getSNOMBREPERSONA()%></label></td>                                    
                                </tr>
                                <tr>
                                    <td></td>
                                    <td class="firsc">Apellidos:</td>
                                    <td><label><%= busuario.getPersona().getPAPELLIDOPERSONA() + " " + busuario.getPersona().getSAPELLIDOPERSONA()%></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td class="firsc">Cédula:</td>
                                    <td><label><%= busuario.getPersona().getCEDULAPERSONA()%></td>
                                </tr>

                                <tr>
                                    <td></td>
                                    <td class="firsc">Teléfono:</td>
                                    <td><label><%= busuario.getPersona().getTELEFONOPERSONA()%></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td class="firsc">Correo:</td>
                                    <td><label><%= busuario.getPersona().getCORREOPERSONA()%></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td class="firsc">Cargo:</td>
                                    <td><label><%= busuario.getPersona().getCARGOPERSONA()%></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td class="firsc">Profesión:</td>
                                    <td><label><%= busuario.getPersona().getPROFESIONPERSONA()%></td>
                                </tr>

                            </table>
                            <br>    
                            <hr>
                        </center>
                    </div>
                    <br><br>
                    <div class="partes">
                        Mis formularios
                    </div> 
                </article>

            </div>          
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