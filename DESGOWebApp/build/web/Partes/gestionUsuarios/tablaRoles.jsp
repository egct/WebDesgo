<%-- 
    Document   : tablaRoles
    Created on : 07/02/2020, 10:01:37
    Author     : egct
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ec.com.desgo.modelo.*"%>
<%@page import="ec.com.desgo.controlador.DesgoS"%>
<%@page import="ec.com.desgo.servicios.*"%>

<div class="container">
    <h2>GESTION ROLES</h2>
    <div class="row">
        <div class="col-sm-12">

            </br>
            <table class="table table-hover table-bordered">
                <tr>
                
                    <tr>
                        <th hidden="">IDROLES</th>
                        <th>Tipos de Usuarios</th>
                    </tr>
                <%
                    UserService rolesS = new UserService();
                    List<TipoUsuario> data = rolesS.listarRoles();
                    for (TipoUsuario cus : data) {
                        String sendOrder = cus.getIDTIPOUSUARIO() + "||" + cus.getNIVELTIPOUSUARIO();

                %>
                <tbody>
                    <tr style="align-items: center  ">
                        <td hidden=""><%=cus.getIDTIPOUSUARIO()%></td>
                        <td><%=cus.getNIVELTIPOUSUARIO()%></td>
                    </tr>
                <%}%>
                </tbody>
            </table>
        </div>

    </div>
</div>