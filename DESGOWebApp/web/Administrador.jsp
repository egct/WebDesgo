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
    <body  onload="javascript:cambiarPestanna(pestanas, pestana1);">
        <%
            String id = request.getParameter("idUser");
            String n = request.getParameter("name");
            String e = request.getParameter("empresa");
            String t = request.getParameter("tipo");

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
                                <br>

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
                    <div class="titulo">Gestiona a tus Usuarios</div>
                </center>
                <div id="pestanas">
                    <ul id=lista>
                        <li id="pestana1"><a href='javascript:cambiarPestanna(pestanas,pestana1);'>Roles</a></li>
                        <li id="pestana2"><a href='javascript:cambiarPestanna(pestanas,pestana2);'>Personas</a></li>
                        <li id="pestana3"><a href='javascript:cambiarPestanna(pestanas,pestana3);'>Usuarios</a></li>
                    </ul>
                </div>

                <div id="contenidopestanas">
                    <div id="cpestana1">
                        <article class="contenedorP" >
                            <article class="partes"> 
                                <h2>Tipos de Usuarios</h2>

                                <center>
                                    <br>
                                    <hr>
                                    <br>
                                    <table class="tablasP">                                           

                                        <%
                                            UserService rolesS = new UserService();
                                            List<TipoUsuario> data = rolesS.listarRoles();
                                            for (TipoUsuario cus : data) {
                                                String sendOrder = cus.getIDTIPOUSUARIO() + "||" + cus.getNIVELTIPOUSUARIO();

                                        %>

                                        <tr style="align-items: center  ">
                                            <td hidden=""><%=cus.getIDTIPOUSUARIO()%></td>
                                            <td><%=cus.getNIVELTIPOUSUARIO()%></td>
                                        </tr>
                                        <%}%>

                                    </table>
                                    <br>
                                    <hr>
                                    <br>
                                </center>
                            </article>
                        </article>

                    </div>
                    <div id="cpestana2">
                        <article class="contenedorP" >
                            <article class="partes"> 
                                <h2>Personas</h2><br>
                                <a href="#miModalAddP" class="botonAdd">Agregar nuevo</a>
                                <center>
                                    <br>
                                    <hr>
                                    <br>
                                    <section id="tablePer" style="width:100%; height:100%; overflow:auto;">
                                        <table id="tablePersonas"  class="tablasPersonas" >                                           
                                            <tr>
                                                <td hidden="">IDPERSONA</td>
                                                <td><h4>Nombres</h4></td>
                                                <td><h4></h4></td>
                                                <td><h4>Apellidos</h4></td>
                                                <td><h4></h4></td>
                                                <td><h4>Cédula</h4></td>
                                                <td><h4>Teléfono</h4></td>
                                                <td><h4>Correo</h4></td>
                                                <td><h4>Cargo</h4></td>
                                                <td><h4>Profesión</h4></td>
                                                <td><h4>Empresa</h4></td>
                                                <td><h4></h4></td>
                                                <td><h4></h4></td>

                                            </tr>
                                            <%
                                                List<Persona> listPersonas = rolesS.listarPersonas(Integer.parseInt(id));
                                                int cont = 0;
                                                for (Persona cus : listPersonas) {

                                            %>
                                            <tr id="PF_<%=cont%>">
                                                <td id="PC_<%=cont%>0" hidden=""><%=cus.getIDPERSONA()%></td>
                                                <td id="PC_<%=cont%>1"><%=cus.getPNOMBREPERSONA()%></td>
                                                <td id="PC_<%=cont%>2"><%=cus.getSNOMBREPERSONA()%></td>
                                                <td id="PC_<%=cont%>3"><%=cus.getPAPELLIDOPERSONA()%></td>
                                                <td id="PC_<%=cont%>4"><%=cus.getSAPELLIDOPERSONA()%></td>
                                                <td id="PC_<%=cont%>5"><%=cus.getCEDULAPERSONA()%></td>
                                                <td id="PC_<%=cont%>6"><%=cus.getTELEFONOPERSONA()%></td>
                                                <td id="PC_<%=cont%>7"><%=cus.getCORREOPERSONA()%></td>
                                                <td id="PC_<%=cont%>8"><%=cus.getCARGOPERSONA()%></td>
                                                <td id="PC_<%=cont%>9"><%=cus.getPROFESIONPERSONA()%></td>
                                                <td id="PC_<%=cont%>10"><%=cus.getEMPRESAPERSONA()%></td>
                                                <td id="PC_<%=cont%>11"><a id="D<%=cont%>" onclick="cargarIdPersonaDelete('<%=cus.getIDPERSONA()%>', '<%=cus.getPNOMBREPERSONA()%>', '<%=cus.getPAPELLIDOPERSONA()%>', '<%=cus.getCEDULAPERSONA()%>')" class="botonDelete" >Eliminar</a></td>
                                                <td id="PC_<%=cont%>12"><a id="A<%=cont%>" onclick="cargarIdPersonaUpdate('<%=cus.getIDPERSONA()%>', '<%=cus.getPNOMBREPERSONA()%>',
                                                                '<%=cus.getSNOMBREPERSONA()%>', '<%=cus.getPAPELLIDOPERSONA()%>',
                                                                '<%=cus.getSAPELLIDOPERSONA()%>', '<%=cus.getCEDULAPERSONA()%>',
                                                                '<%=cus.getTELEFONOPERSONA()%>', '<%=cus.getCORREOPERSONA()%>',
                                                                '<%=cus.getCARGOPERSONA()%>', '<%=cus.getPROFESIONPERSONA()%>')" class="botonUpdate">Actualizar</a></td>
                                            </tr>
                                            <%cont++;
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
                    <div id="cpestana3">
                        <article class="contenedorP" >
                            <article class="partes"> 
                                <h2>Usuarios</h2><br>
                                <a href="#miModalAddU" class="botonAdd">Agregar nuevo</a>
                                <center>
                                    <br>
                                    <hr>
                                    <br>
                                    <section style="width:100%; height:100%; overflow:auto;">
                                        <table class="tablasPersonas" >                                           
                                            <tr>
                                                <td hidden="">IDUSUARIO</td>
                                                <td hidden="">IDTIPOUSUARIO</td>
                                                <td hidden="">IDPERSONA</td>
                                                <td><h4>Usuario</h4></td>
                                                <td><h4>Tipo Usuario</h4></td>
                                                <td><h4>Empresa</h4></td>
                                                <td><h4></h4></td>
                                                <td><h4></h4></td>

                                            </tr>
                                            <%
                                                List<User> listUser = rolesS.listarUsuarios(Integer.parseInt(id));
                                                int contU = 0;
                                                for (User cus : listUser) {

                                            %>
                                            <tr id="UF_<%=contU%>">
                                                <td id="UC_<%=contU%>0" hidden=""><%=cus.getIDUSUARIO()%></td>
                                                <td id="UC_<%=contU%>1" hidden=""><%=cus.getIDTIPOUSUARIO()%></td>
                                                <td id="UC_<%=contU%>2" hidden=""><%=cus.getIDPERSONA()%></td>
                                                <td id="UC_<%=contU%>3"><%=cus.getUSUARIOUSUARIO()%></td>
                                                <td id="UC_<%=contU%>4"><%=cus.getTipoUsuario().getNIVELTIPOUSUARIO()%></td>
                                                <td id="UC_<%=contU%>5"><%=cus.getEMPRESAUSUARIO()%></td>
                                                <td id="UC_<%=contU%>6"><a id="D<%=contU%>" onclick="cargarIdUsuarioDelete('<%=cus.getIDUSUARIO()%>', '<%=cus.getUSUARIOUSUARIO()%>', '<%=cus.getTipoUsuario().getNIVELTIPOUSUARIO()%>')" class="botonDelete">Eliminar</a></td>
                                                <td id="UC_<%=contU%>7"><a id="A<%=contU%>" onclick="cargarIdUsuarioUpdate('<%=cus.getIDUSUARIO()%>', '<%=cus.getUSUARIOUSUARIO()%>')" class="botonUpdate">Actualizar</a></td>
                                            </tr>
                                            <%contU++;}%>
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

        <div id="miModalAddP" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Ingrese los datos</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=2b8e1048771e181884a26e269baef21eb17ec74fc3670d7cad1cb5f3e9af4e5a" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <label >Primer Nombre:</label>
                        <input class="cssinput" type="text" name="R_Pnombre" required>
                        <label>Segundo Nombre:</label>
                        <input class="cssinput" type="text" name="R_Snombre"  required>
                        <label>Primer Apellido:</label>
                        <input class="cssinput" type="text" name="R_Papellido" required>
                        <label>Segundo Apellido:</label>
                        <input class="cssinput" type="text" name="R_Sapellido"  required>
                        <label>Cédula:</label>
                        <input class="cssinput" type="number" name="R_cedula" required>
                        <label>Teléfono:</label>
                        <input class="cssinput" type="number" name="R_telefono" required>
                        <label>Correo:</label>
                        <input class="cssinput" type="email" name="R_email" required>
                        <label>Cargo:</label>
                        <input class="cssinput" type="text" name="R_cargo" required>
                        <label>Profesión:</label>
                        <input class="cssinput" type="text" name="R_profesion"   required>
                        <label>Empresa:</label>
                        <input class="cssinput" type="text" name="R_empresa"  value="<%=e%>" disabled="true">                        
                        <div>
                            <input class="cssinput" type="submit" value="Guardar">
                        </div>
                    </form>
                </div>
            </div>  
        </div>

        <div id="miModalDeleteP" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Eliminar Persona</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=fd302b95acffc2823c575e932a9733138dbb619e873bbac31618cde1fcc4e184" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <center><label>Estas seguro que deseas eliminarlo?</label>
                        </center>
                        <br>
                        <input class="cssinput" type="hidden" name="D_Id" id="D_Id">
                        <label>Nombre:</label>
                        <input class="cssinput" type="text" name="D_Pnombre" id="D_Pnombre" disabled="true">
                        <label>Apellido:</label>
                        <input class="cssinput" type="text" name="D_Papellido" id="D_Papellido" disabled="true">
                        <label>Cédula:</label>
                        <input class="cssinput" type="number" name="D_cedula" id="D_cedula" disabled="true">
                        <div>
                            <input class="cssinput" type="submit" value="Eliminar">
                        </div>
                    </form>
                </div>
            </div>  
        </div>

        <div id="miModalUpdateP" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Modifique los datos</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=62cc030121d538da6e06096bf090f352d0e68276291763c52b8ec65296be716e" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <br>
                        <input class="cssinput" type="hidden" name="U_Id" id="U_Id">
                        <label>Primer Nombre:</label>
                        <input class="cssinput" type="text" name="U_Pnombre" id="U_Pnombre">
                        <label>Segundo Nombre:</label>
                        <input class="cssinput" type="text" name="U_Snombre" id="U_Snombre" >
                        <label>Primer Apellido:</label>
                        <input class="cssinput" type="text" name="U_Papellido" id="U_Papellido">
                        <label>Segundo Apellido:</label>
                        <input class="cssinput" type="text" name="U_Sapellido" id="U_Sapellido" >
                        <label>Cédula:</label>
                        <input class="cssinput" type="number" name="U_cedula" id="U_cedula">
                        <label>Teléfono:</label>
                        <input class="cssinput" type="number" name="U_telefono" id="U_telefono" >
                        <label>Correo:</label>
                        <input class="cssinput" type="email" name="U_email" id="U_email" >
                        <label>Cargo:</label>
                        <input class="cssinput" type="text" name="U_cargo" id="U_cargo">
                        <label>Profesión:</label>
                        <input class="cssinput" type="text" name="U_profesion" id="U_profesion"  >
                        <label>Empresa:</label>
                        <input class="cssinput" type="text" name="U_empresa" id="U_empresa"  value="<%=e%>" disabled="true">                        
                        <div>
                            <input class="cssinput" type="submit" value="Actualizar">
                        </div>
                    </form>
                </div>
            </div>  
        </div>

        <div id="miModalAddU" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Ingrese los datos</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=6d0ce3439eaf154b505d675e220b06eacd30fb8cb2a5ecbfb52437e3493da448" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <label>Persona:</label>
                        <select class="cssinput" type="text" name="RU_Persona" required>
                            <option value="-1">Seleccione una persona</option>
                            <%
                                UserService rolesSUParaUser = new UserService();
                                List<Persona> listPersonasParaUser = rolesSUParaUser.listarPersonas(Integer.parseInt(id));
                                for (Persona cusUs : listPersonasParaUser) {
                            %>
                            <option value="<%=cusUs.getIDPERSONA()%>"><%=cusUs.getPNOMBREPERSONA()%> <%=cusUs.getPAPELLIDOPERSONA()%></option>
                            <%}%>
                        </select>
                        <label>Usuario:</label>
                        <input class="cssinput" type="text" name="RU_Usuario" required>
                        <label>Contraseña:</label>
                        <input class="cssinput" type="text" name="RU_Contra"  required>
                        <label>Tipo usuario:</label>
                        <select class="cssinput" type="text" name="RU_TipoUsuario" required>
                            <option value="-1">Seleccione una tipo de usuario</option>
                            <%
                                UserService rolesSU = new UserService();
                                List<TipoUsuario> dataU = rolesSU.listarRoles();
                                for (TipoUsuario cusUs : dataU) {
                            %>
                            <option value="<%=cusUs.getIDTIPOUSUARIO()%>"><%=cusUs.getNIVELTIPOUSUARIO()%></option>
                            <% }%>
                        </select>
                        <label>Empresa:</label>
                        <input class="cssinput" type="text" name="RU_Empresa" id="RU_Empresa"  value="<%=e%>" disabled="true">                        
                        <div>
                            <input class="cssinput" type="submit" value="Guardar">
                        </div>
                    </form>
                </div>
            </div>  
        </div>

        <div id="miModalDeleteU" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Eliminar Usuario</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=980048512dddd10b99f847a23c66344952a2323daa47d0873119d6c444e383e4" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <center><label>Estas seguro que deseas eliminarlo?</label>
                        </center>
                        <br>
                        <input class="cssinput" type="hidden" name="DU_Id" id="DU_Id">
                        <label>Usuario:</label>
                        <input class="cssinput" type="text" name="DU_Usuario" id="DU_Usuario" disabled="true">
                        <label>Tipo de usuario:</label>
                        <input class="cssinput" type="text" name="DU_TipoUsuario" id="DU_TipoUsuario" disabled="true">
                        <label>Empresa:</label>
                        <input class="cssinput" type="text" name="DU_Empresa" id="DU_Empresa"  value="<%=e%>" disabled="true">                        
                        <div>
                            <input class="cssinput" type="submit" value="Eliminar">
                        </div>

                    </form>
                </div>
            </div>  
        </div>

        <div id="miModalUpdateU" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Modifique los datos</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=b012a14bde5dd5fa3df954d640330f2a8cabb66de43e510f066ecb49da8e0e34" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <br>
                        <input class="cssinput" type="hidden" name="UU_Id" id="UU_Id">
                        <label>Usuario:</label>
                        <input class="cssinput" type="text" name="UU_Usuario" id="UU_Usuario" required>
                        <label>Contraseña:</label>
                        <input class="cssinput" type="text" name="UU_Contra" id="UU_Contra" required>
                        <label>Tipo usuario:</label>
                        <select class="cssinput" type="text" name="UU_TipoUsuario" id="UU_TipoUsuario" required>
                            <option value="-1">Seleccione una tipo de usuario</option>
                            <%
                                UserService rolesUU = new UserService();
                                List<TipoUsuario> dataUU = rolesUU.listarRoles();
                                for (TipoUsuario cusUs : dataUU) {
                            %>
                            <option value="<%=cusUs.getIDTIPOUSUARIO()%>"><%=cusUs.getNIVELTIPOUSUARIO()%></option>
                            <% }%>
                        </select>
                        <label>Empresa:</label>
                        <input class="cssinput" type="text" name="UU_Empresa" id="UU_Empresa"  value="<%=e%>" disabled="true">                        
                        <div>
                            <input class="cssinput" type="submit" value="Actualizar">
                        </div>
                    </form>
                </div>
            </div>  
        </div>                

        <script>
            var table = document.getElementById("tablePersonas")

            table.addEventListener("click", getData);

            function getData() {
                var tds = event.path[1].children
                var datos = []
                for (var i = 0; i < tds.length; i++) {
                    datos.push(tds[i].innerText)
                }
                console.log(datos);
            }

            function cargarIdPersonaDelete(idEliminar, nEliminar, aEliminar, cEliminar) {
                document.getElementById('D_Id').value = idEliminar;
                document.getElementById('D_Pnombre').value = nEliminar;
                document.getElementById('D_Papellido').value = aEliminar;
                document.getElementById('D_cedula').value = cEliminar;
                window.location.href = "#miModalDeleteP";
            }
            function cargarIdPersonaUpdate(idActualizar, pnActualizar, snActualizar,
                    paActualizar, saActualizar, cActualizar,
                    tActualizar, emActualizar, carActualizar,
                    proActualizar) {
                document.getElementById('U_Id').value = idActualizar;
                document.getElementById('U_Pnombre').value = pnActualizar;
                document.getElementById('U_Snombre').value = snActualizar;
                document.getElementById('U_Papellido').value = paActualizar;
                document.getElementById('U_Sapellido').value = saActualizar;
                document.getElementById('U_cedula').value = cActualizar;
                document.getElementById('U_telefono').value = tActualizar;
                document.getElementById('U_email').value = emActualizar;
                document.getElementById('U_cargo').value = carActualizar;
                document.getElementById('U_profesion').value = proActualizar;
                window.location.href = "#miModalUpdateP";
            }

            function cargarIdUsuarioDelete(idUEliminar, uEliminar, tuEliminar) {
                document.getElementById('DU_Id').value = idUEliminar;
                document.getElementById('DU_Usuario').value = uEliminar;
                document.getElementById('DU_TipoUsuario').value = tuEliminar;
                window.location.href = "#miModalDeleteU";
            }
            function cargarIdUsuarioUpdate(idUActualizar, uActualizar) {
                document.getElementById('UU_Id').value = idUActualizar;
                document.getElementById('UU_Usuario').value = uActualizar;
                window.location.href = "#miModalUpdateU";
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