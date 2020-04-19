<!DOCTYPE html>
<html lang="es">
    <head>        

        <meta http-equiv="content-type" content="text/html; utf-8">
        <%@page import="java.util.List"%>
        <%@page import="java.util.ArrayList"%>
        <%@page import="ec.com.desgo.modelo.*"%>
        <%@page import="ec.com.desgo.controlador.*"%>
        <%@page import="ec.com.desgo.servicios.*"%>
        <%@page import="java.sql.*" %>



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

        <!--Links para cargar archivos excel en html-->
        <script type="text/javascript" src="https://unpkg.com/xlsx@0.14.1/dist/xlsx.full.min.js"></script>



    </head>
    <body  onload="javascript:cambiarPestanna(pestanas, pestana2);">
        <%
            String id = request.getParameter("idUser");
            String n = request.getParameter("name");
            String e = request.getParameter("empresa");
            String t = request.getParameter("tipo");
            String aux = "aux";
            String banderaForm = request.getParameter("banderaForm");
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
                    <div class="titulo">Formularios</div>
                </center>
                <table style="background: #b2dba1; border: 2px solid black;">
                    <tr>
                        <td>
                            <label style="margin: 50%;">
                                <form action="#" method="post">
                                    <input type="hidden" name="idUser" value="<%=id%>">
                                    <input type="hidden" name="name" value="<%=n%>">
                                    <input type="hidden" name="empresa" value="<%=e%>">
                                    <input type="hidden" name="tipo" value="<%=t%>">
                                    
                                    <a class="gn-icon gn-icon-download" style="margin-right: 25px;">
                                        <input type="submit" style="border: 0;" value="Descargar DB">
                                    </a>
                                </form>
                            </label>
                        </td>
                    </tr>
                </table>

                <br>
                <br>
                <div id="pestanas">
                    <ul id=lista>
                        <li id="pestana2"><a href='javascript:cambiarPestanna(pestanas,pestana2);'>Cargar</a></li>
                        <li id="pestana3"><a href='javascript:cambiarPestanna(pestanas,pestana3);'>Asignar</a></li>
                        <li id="pestana1"><a href='javascript:cambiarPestanna(pestanas,pestana1);'>Visualizar</a></li>

                    </ul>
                </div>

                <div id="contenidopestanas">
                    <div id="cpestana2">

                        <article class="contenedorP" >
                            <article class="partes"> 
                                <h2>Nuevos Formularios</h2><br>
                                <h3><span>Cargar excel: </span></h3>
                                <br>
                                <hr>
                                <br>
                                <center>

                                    <a >
                                        <form name="formulario" action="DesgoS?a=31afc1b5779edc3cbd32844041ecdd2438a95d3a6c11d1587edc484277b18adc" method="post" enctype="multipart/form-data">
                                            <input type="hidden" name="idUser" value="<%=id%>">
                                            <input type="hidden" name="name" value="<%=n%>">
                                            <input type="hidden" name="empresa" value="<%=e%>">
                                            <input type="hidden" name="tipo" value="<%=t%>">
                                            <table style="color: #000">
                                                <tr>
                                                    <td><input type="file" id="input-excel" name="input-excel" style="color: #000"/></td>
                                                    <td> <input type="submit" class="botonAdd" onclick="cargarArchivo()" value="Subir Excel" id="subirExcel" disabled="true"></td>
                                                </tr>
                                                <tr>

                                                </tr>
                                            </table>
                                            <input type="hidden" name="nombre" value=""/>
                                        </form>
                                        <iframe name="null" style="display: none;"></iframe>
                                    </a>      
                                    <section id="wrapper" style="width:100%; height:100%; overflow:auto; color: #000">
                                    </section>
                                    <script>

                                        $('#input-excel').change(function (e) {
                                            $('#wrapper')[0].innerHTML = "";
                                            var reader = new FileReader();
                                            reader.readAsArrayBuffer(e.target.files[0]);
                                            reader.onload = function (e) {
                                                var data = new Uint8Array(reader.result);
                                                var wb = XLSX.read(data, {type: 'array'});
                                                var htmlstr = XLSX.write(wb, {sheet: "Hoja1", type: 'binary', bookType: 'html'});
                                                console.log(htmlstr.toString());
                                                $('#wrapper')[0].innerHTML += htmlstr;

                                            }
                                            document.getElementById("subirExcel").disabled = false;
                                        });
                                        function cargarArchivo() {
                                            var file = document.getElementById("input-excel").files[0];
                                            var objHidden = document.formulario.nombre;
                                            objHidden.value = file.name;
                                            //document.formulario.target="null";
                                            document.formulario.submit();
                                            $('#wrapper')[0].innerHTML = "";
                                            document.getElementById("subirExcel").disabled = true;
                                            alert("Proceso terminado satisfactoriamente");

                                        }
                                    </script>
                                    <br>
                                    <hr>
                                    <br>
                                    <br>
                                    <hr>
                                    <br>
                                </center>
                            </article>
                        </article>

                    </div>
                    <div id="cpestana1">
                        <article class="contenedorP" >
                            <article class="partes" > 
                                <h2>Formularios</h2><br>
                                <table>
                                    <tr>
                                        <td>
                                            <a href="#miModalAddP" class="botonDelete">Eliminar formularios</a>
                                        </td>
                                        <td>
                                            <a href="#miModalAddU" class="botonAdd">Exportar formularios</a>                                            
                                        </td>
                                    </tr>
                                </table>
                                <center>
                                    <br>
                                    <hr>
                                    <br>
                                    <table class="tablasP" id="formulariosList">                                           
                                        <tr>
                                            <td hidden="">IDFORMULARIO</td>
                                            <td hidden="">IDUSUARIO</td>
                                            <td><h4>Código</h4></td>
                                            <td><h4>Estado</h4></td>
                                            <td><h4>Usuario</h4></td>

                                        </tr>
                                        <%
                                            FormService formSer = new FormService();
                                            List<HashMapClassForm> data = formSer.listTodosFormIds(e);
                                            String estadoFormulario = "";
                                            for (HashMapClassForm cus : data) {
                                                if (cus.getForm().getEstadoF() == 0) {
                                                    estadoFormulario = "No Actualizado";
                                                } else {
                                                    estadoFormulario = "Actualizado";
                                                }
                                        %>

                                        <tr style="align-items: center  ">
                                            <td hidden=""><%=cus.getForm().getIdFormulario()%></td>
                                            <td hidden=""><%=cus.getUs().getIDUSUARIO()%></td>
                                            <td><%=cus.getForm().getCodigoF()%></td>
                                            <td><%=estadoFormulario%></td>
                                            <td><%=cus.getUs().getUSUARIOUSUARIO()%></td>
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

                    <div id="cpestana3">
                        <article class="contenedorP" >
                            <article class="partes"> 
                                <h2>Usuarios</h2><br>
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
                                                UserService rolesS = new UserService();
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
                                                <td id="UC_<%=contU%>7"><a id="A<%=contU%>" onclick="cargarIdUsuarioUpdate('<%=cus.getIDUSUARIO()%>', '<%=cus.getUSUARIOUSUARIO()%>')" class="botonUpdate">Asignar</a></td>
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

        <div id="miModalAddP" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Seleccione los formularios</h2></center>

                <div class="cssdiv">
                    <form action="DesgoS?a=cc5efbcf967a47f4fcf30f96a09801a19c879960e691d024c50f7c3130451adf" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <br>
                        <label style="color: #c80000">El usuario <b><%=n%></b> de la empresa <b><%=e%></b> sera el responsable de la eliminación de los formularios.</label>
                        <br><br>
                        <table class="tablasP" style="align-items: center  ">                                           
                            <div>
                                <input type="checkbox" onclick="marcar(this);"/><label><b>&nbsp;Marcar/Desmarcar Todos</b></label>    
                            </div>
                            <br><br> 
                            <tr>
                                <td><h4></h4></td>
                                <td><h4>Código</h4></td>
                                <td><h4>Estado</h4></td>
                                <td><h4>Usuario</h4></td>

                            </tr>
                            <%
                                List<HashMapClassForm> dataDeleteForm = formSer.listTodosFormIds(e);
                                String estadoFormularioA = "";
                                for (HashMapClassForm cus : dataDeleteForm) {
                                    if (cus.getForm().getEstadoF() == 0) {
                                        estadoFormularioA = "No Actualizado";
                                    } else {
                                        estadoFormularioA = "Actualizado";
                                    }
                            %>
                            <tr style="align-items: center  ">
                                <td><input type="checkbox" name="formulariosEliminar" value="<%=cus.getForm().getCodigoF() + "-" + cus.getUs().getIDUSUARIO()%>"></td>
                                <td><label for="formulariosEliminar"> <%=cus.getForm().getCodigoF()%>&nbsp;</label></td>
                                <td><label for="formulariosEliminar"> <%=estadoFormularioA%>&nbsp;</label></td>
                                <td><label for="formulariosEliminar"> <%=cus.getUs().getUSUARIOUSUARIO()%></label></td>
                            </tr>
                            <%}%>
                        </table>                       
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
                <center><h2>Seleccione los formularios</h2></center>
                <div class="cssdiv">
                    <form action="DesgoS?a=a989f832e5e28dd18636e124c281d5f37278a5b96e94f47af200b2d78836e8ff" method="post">
                        <input type="hidden" name="idUser" value="<%=id%>">
                        <input type="hidden" name="name" value="<%=n%>">
                        <input type="hidden" name="empresa" value="<%=e%>">
                        <input type="hidden" name="tipo" value="<%=t%>">
                        <br>
                        <input class="cssinput" type="hidden" name="UUF_Id" id="UUF_Id">
                        <label>Usuario:</label>
                        <input class="cssinput" type="text" name="UUF_Usuario" id="UUF_Usuario" readonly="readonly" >
                        <label>Empresa:</label>
                        <input class="cssinput" type="text" name="UUF_Empresa" id="UUF_Empresa"  value="<%=e%>" disabled="true">                        
                        <br><br>
                        <table class="tablasP" style="align-items: center  ">                                           
                            <div>
                                <input type="checkbox" onclick="marcar(this);"/><label><b>&nbsp;Marcar/Desmarcar Todos</b></label>    
                            </div>
                            <br><br> 
                            <tr>
                                <td><h4></h4></td>
                                <td><h4>Código</h4></td>
                                <td><h4>Estado</h4></td>
                                <td><h4>Usuario</h4></td>

                            </tr>
                            <%
                                List<HashMapClassForm> dataUpdateForm = formSer.listTodosFormIds(e);
                                estadoFormularioA = "";
                                for (HashMapClassForm cus : dataUpdateForm) {
                                    if (cus.getForm().getEstadoF() == 0) {
                                        estadoFormularioA = "No Actualizado";
                                    } else {
                                        estadoFormularioA = "Actualizado";
                                    }
                            %>
                            <tr style="align-items: center  ">
                                <td><input type="checkbox" name="formulariosAsignar" value="<%=cus.getForm().getIdFormulario()%>"></td>
                                <td><label for="formulariosAsignar"> <%=cus.getForm().getCodigoF()%>&nbsp;</label></td>
                                <td><label for="formulariosAsignar"> <%=estadoFormularioA%>&nbsp;</label></td>
                                <td><label for="formulariosAsignar"> <%=cus.getUs().getUSUARIOUSUARIO()%></label></td>
                            </tr>
                            <%}%>
                        </table>
                        <div>
                            <input class="cssinput" type="submit" value="Asignar">
                        </div>
                    </form>
                </div>
            </div>  
        </div>     

        <div id="miModalAddU" class="modal">
            <div class="modal-contenido">
                <a class="botoncerrar" href="#" style="">X</a>
                <center><h2>Tipo de archivo</h2></center>
                <div class="cssdiv">
                    <br>
                    <label for="UU_TipoArchivo">Seleccione una tipo de archivo</label>
                    <select class="cssinput" type="text" name="UU_TipoArchivo" id="UU_TipoArchivo" required>
                        <option value="Excel">Excel</option>
                        <option value="Txt">Txt</option>
                        <option value="Xml">Xml</option>
                    </select>
                    <label>Empresa:</label>
                    <input class="cssinput" type="text" name="UU_Empresa" id="UU_Empresa"  value="<%=e%>" disabled="true">                        
                    <label>Nombre del Archivo:</label>
                    <input class="cssinput" type="text" name="UU_NombreArchivo" id="UU_NombreArchivo"  required>                        
                    <div>
                        <input onclick="tipoDescarga('UU_TipoArchivo', 'formulariosList', 'UU_NombreArchivo')" class="cssinput" type="submit" value="Descargar">
                    </div>
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


            function cargarIdUsuarioUpdate(idUActualizar, uActualizar) {
                document.getElementById('UUF_Id').value = idUActualizar;
                document.getElementById('UUF_Usuario').value = uActualizar;
                window.location.href = "#miModalUpdateU";

            }
            function marcar(source)
            {
                checkboxes = document.getElementsByTagName('input'); //obtenemos todos los controles del tipo Input
                for (i = 0; i < checkboxes.length; i++) //recoremos todos los controles
                {
                    if (checkboxes[i].type == "checkbox") //solo si es un checkbox entramos
                    {
                        checkboxes[i].checked = source.checked; //si es un checkbox le damos el valor del checkbox que lo llamó (Marcar/Desmarcar Todos)
                    }
                }
            }

            function tipoDescarga(tipodescarga, tableID, inputname) {
                var tipo = document.getElementById(tipodescarga).value;
                var filename = document.getElementById(inputname).value;
                switch (tipo) {
                    case 'Excel':
                        exportTableToExcel(tableID, filename);
                        break;
                    case 'Txt':
                        alert("Tipo: Txt, Nombre archivo: " + filename);
                        break;
                    case 'Xml':
                        alert("Tipo: Xml, Nombre archivo: " + filename);
                        break;
                }
            }
            function exportTableToExcel(tableID, filename) {
                var downloadLink;
                var dataType = 'application/vnd.ms-excel';
                var tableSelect = document.getElementById(tableID);
                var tableHTML = tableSelect.outerHTML.replace(/ /g, '%20');

                // Specify file name
                filename = filename ? filename + '.xls' : 'Desgo_excel_data.xls';

                // Create download link element
                downloadLink = document.createElement("a");

                document.body.appendChild(downloadLink);

                if (navigator.msSaveOrOpenBlob) {
                    var blob = new Blob(['ufeff', tableHTML], {
                        type: dataType
                    });
                    navigator.msSaveOrOpenBlob(blob, filename);
                } else {
                    // Create a link to the file
                    downloadLink.href = 'data:' + dataType + ', ' + tableHTML;

                    // Setting the file name
                    downloadLink.download = filename;

                    //triggering the function
                    downloadLink.click();
                }
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