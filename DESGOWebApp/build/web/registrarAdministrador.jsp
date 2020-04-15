<%@page import="ec.com.desgo.controlador.DesgoS"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>


        <meta http-equiv="content-type" content="text/html; utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>DESGO Website Menu</title>
        <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
        <meta name="Desgo" content="Codrops" />

        <!--Hojas de estilo del formulario de registrart-->
        <link rel="stylesheet" type="text/css" href="Registrar/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="Registrar/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="Registrar/css/component.css" />
        <link rel="stylesheet" href="Registrar/css/bootstrap.min.css">
        <link rel="stylesheet" href="Registrar/css/estiloreg.css">
        <link rel="stylesheet" type="text/css" href="Login/fonts/iconic/css/material-design-iconic-font.min.css">

        <!--Scripts para el formulario de registrar!-->
        <script src="Registrar/js/modernizr.custom.js"></script>
        <link href="Registrar/css/estiloSelect.css" rel="stylesheet" type="text/css"/>
        <script src="Registrar/js/classie.js"></script>
        <script src="Registrar/js/gnmenu.js"></script>
    </head>	
    <body>

        <!--Contenedor general del tema del menu-->
        <div class="container">
            <%
                String id = request.getParameter("idUser");
                String n = request.getParameter("name");
                String e = request.getParameter("empresa");
            %>
            <!--Permite hacer una lista en donde se encuentran todas las opciones del menu-->
            <ul id="gn-menu" class="gn-menu-main" style="z-index: 8;">
                <li class="gn-trigger">

                    <!--Barra de tres lineas horizontales que despliega el menu-->
                    <a class="gn-icon gn-icon-menu"><span>Menu</span></a>
                    <nav class="gn-menu-wrapper">
                        <div class="gn-scroller">
                            <ul class="gn-menu">

                                <!--Primer elemento de la lista que es buscar-->
                                <li class="gn-search-item">
                                    <input placeholder="Search" type="search" class="gn-search">
                                    <a class="gn-icon gn-icon-search"><span>Search</span></a>
                                </li>

                                <li>
                                    <div class="row">  
                                        <img src="Formulario/icon/user.png" style="margin-left:25px; margin-top: 20px;">
                                        <a href="menu_perfil.jsp?idUser=<%=request.getParameter("idUser")%>&name=<%=request.getParameter("name")%>&empresa=<%=request.getParameter("empresa")%>">
                                            <label><%=request.getParameter("idUser") + " " + request.getParameter("name")%></label>
                                        </a>
                                    </div>
                                </li>
                                <!--Tercer elemento de la lista es ir a la pagina para registrar el usuario-->
                                <li>
                                    <form action="DesgoS?a=8a2cd179db7c28e3faa4673da66f1a4faea44cb1" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
                                        <a class="gn-icon gn-icon-download">
                                            <input type="submit" style="border: 0;width:80%;" value="Administrar">
                                        </a>
                                    </form>
                                </li>                         
                                <li>
                                    <form action="DesgoS?a=2c3279f6b1dce58a4d197fb68d3515bab8f5129a" method="post">
                                        <input type="hidden" name="idUser" value="<%=id%>">
                                        <input type="hidden" name="name" value="<%=n%>">
                                        <input type="hidden" name="empresa" value="<%=e%>">
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
                    <h6 style="font-size: 150% ">  Bienvenido</h6>
                </li>

            </ul>
        </div><!-- Finaliza el container -->

        <!--Scripts que nos permiten desplegar el menu-->

        <!--Scripts para la recuperacion de datos del usuario para colocarlos en la parte superior-->
        <script>
            new gnMenu(document.getElementById('gn-menu'));
            var idUser =<%=request.getParameter("idUser")%>;
            var name = "<%=request.getParameter("name")%>";
            var uno = "<%=request.getParameter("uno")%>";
            console.log("iduser" + idUser + "name" + name + "uno" + uno);
        </script>
        <header>

            <!--FORMULARIO PARA REGISTRAR!-->
            <div class="contendedor-form">
                <div class="formulario">
                    <h2>Registro Usuario</h2>

                    <!--Accion del formulario para guardar los datos en la base despues de ejecutar el boton -->
                    <form action="Servlet?action=Guardar" method="POST">
                        <div class="colum1">

                            <div class="row" >
                                <!--Inputs de ingreso de usuario y contrase�a-->
                                <input type="text" id="R_user" name="R_user" placeholder="Usuario" required><p>&nbsp;&nbsp;&nbsp;&nbsp;</p>
                                <input type="password" id="R_pass" name="R_pass" placeholder="Contrasenia" required>

                            </div>

                        </div>
                        <p>Tipo de Usuario:</p>

                        <div >
                            <select class="select-css" id="R_tipoUser" name="R_tipoUser">
                                <option value="TU_administrador">Administrador</option>
                                <option value="TU_visualizador">Visualizador</option>
                                <option value="TU_gestor">Gestor</option>
                            </select>
                        </div> 
                        <br>
                        <!--Inputs de ingreso de email - cargo - nombres - apellidos - profesion -->
                        <input type="text" id="R_Pnombre" name="R_Pnombre" placeholder="Primer Nombre" required>
                        <input type="text" id="R_Snombre" name="R_Snombre" placeholder="Segundo Nombre" required>
                        <input type="text" id="R_Papellido" name="R_Papellido" placeholder="Primer Apellido" required>
                        <input type="text" id="R_Sapellido" name="R_Sapellido" placeholder="Segundo Apellido" required>
                        <input type="text" id="R_telefono" name="R_telefono" placeholder="0984467071" required>
                        <input type="text" id="R_cedula" name="R_cedula" placeholder="1723953053" required>
                        <input type="email" id="R_email" name="R_email"  placeholder="egct@outlook.es" required>
                        <input type="text" id="R_cargo" name="R_cargo" placeholder="Cargo" required>             
                        <input type="text" id="R_profesion" name="R_profesion" placeholder="Profesion" required>

                        <input type="text" id="R_empresa" name="R_empresa" placeholder="Empresa" required>
                        <input type="file" id="R_foto" name="R_foto" />

                        <!--Boton de registro de datos en la base -->
                        <br>
                        <input type="submit" value="Guardar"  class="btn btn-success" id="GuardarNuevoUser">
                        <input type="reset" value="Borrar" class="btn btn-success" id="LimpiarFormR">
                    </form>
                </div>
            </div>
        </header> 
        <script src="js/jquery.js"></script>	
    </body>

    <footer style="width:100%; max-width:100%; margin: 0px auto; position: relative; text-align: justify;">

        <div class="container-footer-all">

            <div class="container-body">

                <div class="colum1">
                    <h1>Mas informacion de la compa�ia</h1>

                    <p>La empresa DESGO es una iniciativa que realiza su actividad en el
                        �mbito del desarrollo de aplicaciones web y m�viles integradas, 
                        enfocados en las �reas geogr�fica, ambiental y social; as� mismo 
                        como explora en nuevas tecnolog�as aplicables a la elaboraci�n de 
                        geoportales y an�lisis de big data.

                        DESGO brinda un espacio para la creaci�n de nuevas ideas que 
                        potencialice a la juventud con el objetivo de integrar grupos 
                        multidisciplinarios que desarrollen productos para el beneficio
                        de la comunidad y el progreso del pa�s
                    </p>

                </div>

                <div class="colum2">

                    <h1>Redes Sociales</h1>

                    <div class="row" >
                        <img src="Registrar/icon/facebook.png" >
                        <a href="https://www.facebook.com/">
                            <label>Siguenos en Facebook</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Registrar/icon/twitter.png">
                        <a href="https://www.Twitter.com/">
                            <label>Siguenos en Twitter</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Registrar/icon/instagram.png">
                        <a href="https://www.Instagram.com/">
                            <label>Siguenos en Instagram</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Registrar/icon/google-plus.png">
                        <a href="https://www.Instagram.com/">
                            <label>Siguenos en Google Plus</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Registrar/icon/pinterest.png">
                        <label>Siguenos en Pinteres</label>
                    </div>


                </div>

                <div class="colum3">

                    <h1>Informacion Contactos</h1>

                    <div class="row2">
                        <img src="Registrar/icon/house.png">
                        <label>Florinda de Alvear y 
                            Joaqu�n Gallegos Lara E17-25</label>
                    </div>

                    <div class="row2">
                        <img src="Registrar/icon/smartphone.png">
                        <label>0997589895</label>
                    </div>

                    <div class="row2">
                        <img src="Registrar/icon/contact.png">
                        <label>desgoecuador@outlook.com</label>
                    </div>

                </div>

            </div>

        </div>

        <div class="container-footer">
            <div class="footer">
                <div class="copyright">
                    � 2019 Todos los Derechos Reservados | <a href="">DESGO</a>
                </div>

                <div class="information">
                    <a href="">Informacion Compa�ia</a> | <a href="">Privacion y Politica</a> | <a href="">Terminos y Condiciones</a>
                </div>
            </div>

        </div>

    </footer>  

    <link rel="stylesheet" href="Registrar/css/estilos.css">    

</html>