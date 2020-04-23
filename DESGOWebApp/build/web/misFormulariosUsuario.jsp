<!DOCTYPE html>
<html lang="es">
    <head>        

        <meta http-equiv="content-type" content="text/html; utf-8">
        <%@page import="java.util.List"%>
        <%@page import="java.util.ArrayList"%>
        <%@page import="ec.com.desgo.modelo.*"%>
        <%@page import="ec.com.desgo.controlador.*"%>
        <%@page import="ec.com.desgo.servicios.*"%>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <title>DESGO Website Menu</title>
        <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
        <meta name="description" content="DESGO website" />
        <meta name="keywords" content="desgo" />
        <meta name="author" content="Desgo" />
        <!--Estilo general de la pagina-->
        <link rel="stylesheet" type="text/css" href="Formulario/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="Formulario/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="Formulario/css/component.css" />
        <script src="Formularios/js/modernizr.custom.js"></script>
        <!--Estilo del formulario-->
        <link rel="stylesheet" href="Formulario/css/estilosform.css">
        <!--Crear tablasde forma dinamica -->
        <script src="Formulario/dinamico/js/jquery-2.1.1.min.js"></script>
        <script src="Formulario/dinamico/js/bootstrap.js"></script>
        <script src="Formulario/js/dinamico.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/bootstrap.css">
        <!--Pestanias o tabs!-->
        <link rel="stylesheet" href="Formulario/css/estilos.css">
        <link rel="stylesheet" href="Formulario/css/font-awesome.css">
        <script src="Formulario/js/main.js"></script>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0 ">
        <link rel="stylesheet" href="Menu/css/estilos.css">    
        <script src="Menu/js/classie.js"></script>
        <script src="Menu/js/gnmenu.js"></script>
        <!--new submenu!-->
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="Formpart2/css/default.css" />
        <link rel="stylesheet" type="text/css" href="Formpart2/css/component.css" />
        <script src="Formpart2/js/modernizr.custom.js"></script>
        <!--Estilos de la tabla!-->
        <link href="Formulario/css/estilosTable.css" rel="stylesheet" type="text/css"/>
        <!--Script con la clave de desdarrollador dada por google maps-->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAFL8QXJfjhLQ4UVfTWAQ6W7H1wM2vqdc&libraries=drawing&sensor=false&callback=initMap"></script>
        <!--Pestañas Crud-->
        <script src="crudUser/CrudUser.js" type="text/javascript"></script>
        <link href="crudUser/Crudcss.css" rel="stylesheet" type="text/css"/>
        <script src="crudUser/submenu/submenuCrudUser.js" type="text/javascript"></script>
        <link href="crudUser/submenu/submenuCrudUser.css" rel="stylesheet" type="text/css"/>

        <link href="Perfil/css/perfilCss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">


    </head>
    <body  onload="javascript:cambiarPestanna(pestanas, pestana3);">
        <%
            String id = request.getParameter("idUser");
            String n = request.getParameter("name");
            String e = request.getParameter("empresa");
            String t = request.getParameter("tipo");
            String ColorDinamicoCelda=" ";
        %>
        <!--Script para cargar iduser lista-->



        <div class="container">
            <ul id="gn-menu" class="gn-menu-main" style="z-index: 8;">
                <li class="gn-trigger">
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
                                    <form action="DesgoS?a=30bfa040d6820b49c35db8bff22f0017a13b462e" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <input type="hidden" name="tipo" value="<%=t%>">
                                        <a class="gn-icon gn-icon-archive">
                                            <input type="submit" style="border: 0;width:80%;" value="Mis Formularios">
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
                        </div>

                    </nav>
                </li>
                <li style="float: left">
    <!--                    <h5> Bienvenido <%=request.getParameter("idUser") + " " + request.getParameter("name")%></h5>!-->
                    <h6 style="font-size: 150% ">&nbsp;Bienvenido&nbsp;<%=t%>&nbsp;</h6>
                </li>
            </ul>                    

            <br>
            <div class="contenedor">
                <center>
                    <div class="titulo">Mis Formularios</div>
                </center>
                <div id="pestanas">
                    <ul id=lista>
                        <li id="pestana3"><a href='javascript:cambiarPestanna(pestanas,pestana3);'>Usuario: <%=n%></a></li>
                    </ul>
                </div>

                <div id="contenidopestanas">
                    <div id="cpestana3">
                        <article class="contenedorP" >
                            <article class="partes"> 
                                <h2>Formularios</h2><br>
                                <label for="proyectoFormulario">Seleccione el proyecto:</label>
                                <select id="proyectoFormulario">
                                    <option value="volvo">Listar todos los proyectos</option>
                                    <option value="saab">Desgo</option>
                                    <option value="mercedes">Municipio</option>
                                    <option value="audi">Otros</option>
                                </select>
                                <center>
                                    <br>
                                    <hr>
                                    <br>
                                    <section style="width:100%; height:100%; overflow:auto;">
                                        <table class="tablasPersonas" >                                           
                                            <tr>
                                                <td hidden="">IDFORMULARIO</td>
                                                <td><h4>CÓDIGO FORMULARIO</h4></td>
                                                <td><h4>ESTADO</h4></td>
                                                <td><h4></h4></td>

                                            </tr>
                                            <%
                                                FormService rolesFS = new FormService();
                                                List<FormularioIds> listformsId = rolesFS.listarFormulariosId(Integer.parseInt(id));
                                                int contU = 0;
                                                String estadoFormulario="";
                                                for (FormularioIds cus : listformsId) {
                                                    if(cus.getEstadoF()==0){
                                                         estadoFormulario="No Actualizado";
                                                         ColorDinamicoCelda="#d3788f";
                                                     }else{
                                                         estadoFormulario="Actualizado";
                                                         ColorDinamicoCelda="#b2dba1";
                                                     }  

                                            %>
                                            <tr id="FF_<%=contU%>">
                                                <td id="FC_<%=contU%>0" hidden=""><%=cus.getIdFormulario()%></td>
                                                <td id="FC_<%=contU%>1" hidden=""><%=cus.getIdUsuarioF()%></td>
                                                <td id="FC_<%=contU%>2"><%=cus.getCodigoF()%></td>
                                                <td id="FC_<%=contU%>3" bgcolor="<%=ColorDinamicoCelda%>"><%=estadoFormulario%></td>
                                                <td id="FC_<%=contU%>4">
                                                    <a id="D<%=contU%>">
                                                        <form action="DesgoS?a=d92837bb331591b05aac92e158bd2902d6fcc4ea" method="post">
                                                            <input type="hidden" name="idUser" value="<%=id%>">
                                                            <input type="hidden" name="name" value="<%=n%>">
                                                            <input type="hidden" name="empresa" value="<%=e%>">
                                                            <input type="hidden" name="tipo" value="<%=t%>">
                                                            <input type="hidden" name="IdFormulario" value="<%=cus.getIdFormulario()%>">
                                                            <input type="hidden" name="codigoF" value="<%=cus.getCodigoF()%>">
                                                            <input type="hidden" name="formIds_IU" value="<%=cus.getIdentificacionUF()%>">
                                                            <input type="submit" style="border: 0.10; width:80%; background-color: #2aabd2" value="Detalle">
                                                        </form>
                                                    </a>
                                                </td>
                                            </tr>
                                            <%contU++;
                                                }%>
                                        </table>
                                    </section>
                                    <br>
                                    <hr>
                                    <br>
                                </center>
                            </article>
                        </article>
                    </div>
                </div>
            </div>


        </div><!-- /container -->      
        <script>
            new gnMenu(document.getElementById('gn-menu'));
            var idUser =<%=request.getParameter("idUser")%>;
            var name = "<%=request.getParameter("name")%>";
            console.log("iduser" + idUser + "name" + name);
        </script>
        <script>
            function detalle() {

            }
        </script>

    </body>
    <footer style="width:100%; max-width:100%; margin: 0px auto; position: relative; text-align: justify; bottom: 0;">
        <div class="container-footer-all" style="width: 100%">
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
                <div class="colum3" style="text-align: justify">
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
                        <label>desgoecuador @outlook.com</label>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-footer"  style="text-align: justify">
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
</html>