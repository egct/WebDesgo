
package ec.com.desgo.servicios;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSGestionUsuario", targetNamespace = "http://servicios.desgo.com.ec/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSGestionUsuario {


    /**
     * 
     * @param pass
     * @param user
     * @return
     *     returns ec.com.desgo.servicios.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.LoginResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/loginRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/loginResponse")
    public User login(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @return
     *     returns java.util.List<ec.com.desgo.servicios.TipoUsuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarRoles", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ListarRoles")
    @ResponseWrapper(localName = "listarRolesResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ListarRolesResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/listarRolesRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/listarRolesResponse")
    public List<TipoUsuario> listarRoles();

    /**
     * 
     * @param iduser
     * @return
     *     returns java.util.List<ec.com.desgo.servicios.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarUsuarios", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ListarUsuarios")
    @ResponseWrapper(localName = "listarUsuariosResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ListarUsuariosResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/listarUsuariosRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/listarUsuariosResponse")
    public List<User> listarUsuarios(
        @WebParam(name = "iduser", targetNamespace = "")
        int iduser);

    /**
     * 
     * @param iduser
     * @return
     *     returns java.util.List<ec.com.desgo.servicios.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPersonas", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ListarPersonas")
    @ResponseWrapper(localName = "listarPersonasResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ListarPersonasResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/listarPersonasRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/listarPersonasResponse")
    public List<Persona> listarPersonas(
        @WebParam(name = "iduser", targetNamespace = "")
        int iduser);

    /**
     * 
     * @param persona
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarPersona", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EliminarPersona")
    @ResponseWrapper(localName = "eliminarPersonaResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EliminarPersonaResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/eliminarPersonaRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/eliminarPersonaResponse")
    public boolean eliminarPersona(
        @WebParam(name = "persona", targetNamespace = "")
        Persona persona);

    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarUsuario", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EliminarUsuario")
    @ResponseWrapper(localName = "eliminarUsuarioResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EliminarUsuarioResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/eliminarUsuarioRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/eliminarUsuarioResponse")
    public boolean eliminarUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        User usuario);

    /**
     * 
     * @param persona
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarPersona", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EditarPersona")
    @ResponseWrapper(localName = "editarPersonaResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EditarPersonaResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/editarPersonaRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/editarPersonaResponse")
    public boolean editarPersona(
        @WebParam(name = "persona", targetNamespace = "")
        Persona persona);

    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarUsuario", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarUsuario")
    @ResponseWrapper(localName = "registrarUsuarioResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarUsuarioResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/registrarUsuarioRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/registrarUsuarioResponse")
    public boolean registrarUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        User usuario);

    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarUsuario", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EditarUsuario")
    @ResponseWrapper(localName = "editarUsuarioResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.EditarUsuarioResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/editarUsuarioRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/editarUsuarioResponse")
    public boolean editarUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        User usuario);

    /**
     * 
     * @param form
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarFormulario", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarFormulario")
    @ResponseWrapper(localName = "registrarFormularioResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarFormularioResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/registrarFormularioRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/registrarFormularioResponse")
    public Boolean registrarFormulario(
        @WebParam(name = "form", targetNamespace = "")
        Formulario form,
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param pass
     * @param privilegio
     * @param dni
     * @return
     *     returns ec.com.desgo.servicios.Empleado
     */
    @WebMethod(operationName = "Validar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Validar", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.Validar")
    @ResponseWrapper(localName = "ValidarResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.ValidarResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/ValidarRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/ValidarResponse")
    public Empleado validar(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "pass", targetNamespace = "")
        String pass,
        @WebParam(name = "privilegio", targetNamespace = "")
        String privilegio);

    /**
     * 
     * @param apellidos
     * @param pass
     * @param privilegio
     * @param dni
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Registrar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Registrar", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.Registrar")
    @ResponseWrapper(localName = "RegistrarResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/RegistrarRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/RegistrarResponse")
    public String registrar(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "pass", targetNamespace = "")
        String pass,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos,
        @WebParam(name = "nombres", targetNamespace = "")
        String nombres,
        @WebParam(name = "privilegio", targetNamespace = "")
        String privilegio);

    /**
     * 
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarUser", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarUser")
    @ResponseWrapper(localName = "registrarUserResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.RegistrarUserResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/registrarUserRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/registrarUserResponse")
    public Boolean registrarUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param iduser
     * @return
     *     returns ec.com.desgo.servicios.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarPersona", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.BuscarPersona")
    @ResponseWrapper(localName = "buscarPersonaResponse", targetNamespace = "http://servicios.desgo.com.ec/", className = "ec.com.desgo.servicios.BuscarPersonaResponse")
    @Action(input = "http://servicios.desgo.com.ec/WSGestionUsuario/buscarPersonaRequest", output = "http://servicios.desgo.com.ec/WSGestionUsuario/buscarPersonaResponse")
    public User buscarPersona(
        @WebParam(name = "iduser", targetNamespace = "")
        int iduser);

}
