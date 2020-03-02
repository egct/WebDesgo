/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.controlador;

import ec.com.desgo.modelo.FormService;
import ec.com.desgo.modelo.UserService;
import ec.com.desgo.servicios.Formulario;
import ec.com.desgo.servicios.IdentificacionUF;
import ec.com.desgo.servicios.Persona;
import ec.com.desgo.servicios.TipoUsuario;
import ec.com.desgo.servicios.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author egct
 */
@WebServlet(name = "DesgoS", urlPatterns = {"/DesgoS"})
public class DesgoS extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UserService userS = new UserService();
    String acceso = "";
    String id;
    String n;
    String em;
    String t;

    User user = new User();
    User useraux = null;
    TipoUsuario tipou = new TipoUsuario();
    Persona persona = new Persona();
    /**
     * *******Formulario************
     */
    Formulario form = new Formulario();
    FormService formS = new FormService();
    //partes
    /**
     *
     */

    //Direccion_DDPLote direccion_DDPLote=new Direccion_DDPLote();
    IdentificacionUF identificacionUF = new IdentificacionUF();

    /**/
    /**
     * *******************
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("a");
            switch (action) {
                /**
                 * *Administrar usuarios personas roles***
                 */
                case "9dbf7c1488382487931d10235fc84a74bff5d2f4":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "Administrador.jsp";
                    break;
                /**
                 * *Formulario administrador***
                 */
                case "2c3279f6b1dce58a4d197fb68d3515bab8f5129a":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "formularioAdministrador.jsp";
                    break;
                /**
                 * *Formulario Usuario***
                 */
                case "d92837bb331591b05aac92e158bd2902d6fcc4ea":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "formularioUsuario.jsp";
                    break;
                /**
                 * *Ayuda administrador***
                 */
                case "d520317d32c646d6cf5813d217950930d878e68a":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "ayudaAdministrador.jsp";
                    break;
                /**
                 * *Ayuda Usuario***
                 */
                case "eaa524a78a79eda3a4a6fcbca36b2470e95ba4d4":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "ayudaUsuario.jsp";
                    break;
                /**
                 * *Salir***
                 */
                case "684ce6a058b8e008f2a5199ef912b84620c49758":
                    acceso = "index.jsp";
                    break;
                /**
                 * *Login***
                 */
                case "2736fab291f04e69b62d490c3c09361f5b82461a":
                    useraux = null;
                    user.setUSUARIOUSUARIO(request.getParameter("username"));
                    user.setCONTRASENIAUSUARIO(request.getParameter("pass"));
                    try {
                        useraux = userS.login(user.getUSUARIOUSUARIO(), user.getCONTRASENIAUSUARIO());
                        switch (useraux.getTipoUsuario().getNIVELTIPOUSUARIO()) {
                            case "Administrador":
                                acceso = "menuAdministrador.jsp?idUser=" + useraux.getIDUSUARIO() + "&name=" + useraux.getUSUARIOUSUARIO() + "&empresa=" + useraux.getEMPRESAUSUARIO() + "&tipo=" + useraux.getTipoUsuario().getNIVELTIPOUSUARIO();
                                break;
                            case "Visualizador":
                                acceso = "menuUsuario.jsp?idUser=" + useraux.getIDUSUARIO() + "&name=" + useraux.getUSUARIOUSUARIO() + "&empresa=" + useraux.getEMPRESAUSUARIO() + "&tipo=" + useraux.getTipoUsuario().getNIVELTIPOUSUARIO();
                                break;
                            default:
                                acceso = "menuUsuario.jsp?idUser=" + useraux.getIDUSUARIO() + "&name=" + useraux.getUSUARIOUSUARIO() + "&empresa=" + useraux.getEMPRESAUSUARIO() + "&tipo=" + useraux.getTipoUsuario().getNIVELTIPOUSUARIO();
                                break;
                        }
                    } catch (Exception e) {
                        acceso = "loginerror.jsp";
                    }
                    break;
                /**
                 * *Perfil Administrador***
                 */
                case "f1c51add186473948772ee6bf159f006413d693a":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    useraux = userS.buscarPersona(Integer.parseInt(id));
                    request.setAttribute("useraux", useraux);
                    acceso = "perfilAdministrador.jsp";
                    break;
                /**
                 * *Perfil Usuario***
                 */
                case "ec52f08d101d7f813c031c3f50a41a39db7f8436":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    useraux = userS.buscarPersona(Integer.parseInt(id));
                    request.setAttribute("useraux", useraux);
                    acceso = "perfilUsuario.jsp";
                    break;
                /**
                 * *administradorPersonaCrud:Create***
                 */
                case "2b8e1048771e181884a26e269baef21eb17ec74fc3670d7cad1cb5f3e9af4e5a":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    persona.setPNOMBREPERSONA(request.getParameter("R_Pnombre"));
                    persona.setSNOMBREPERSONA(request.getParameter("R_Snombre"));
                    persona.setPAPELLIDOPERSONA(request.getParameter("R_Papellido"));
                    persona.setSAPELLIDOPERSONA(request.getParameter("R_Sapellido"));
                    persona.setTELEFONOPERSONA(request.getParameter("R_telefono"));
                    persona.setCORREOPERSONA(request.getParameter("R_email"));
                    persona.setCARGOPERSONA(request.getParameter("R_cargo"));
                    persona.setPROFESIONPERSONA(request.getParameter("R_profesion"));
                    persona.setCEDULAPERSONA(request.getParameter("R_cedula"));
                    persona.setFOTOPERSONA(request.getParameter("R_foto"));
                    persona.setEMPRESAPERSONA(em);
                    user.setPersona(persona);
                    userS.registrarUser(user);
                    acceso = "Administrador.jsp";
                    break;
                /**
                 * *administradorPersonaCrud:DeletePersona***
                 */
                case "fd302b95acffc2823c575e932a9733138dbb619e873bbac31618cde1fcc4e184":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    persona.setIDPERSONA(Integer.parseInt(request.getParameter("D_Id")));
                    persona.setPNOMBREPERSONA(request.getParameter("D_Pnombre"));
                    persona.setPAPELLIDOPERSONA(request.getParameter("D_Papellido"));
                    persona.setCEDULAPERSONA(request.getParameter("D_cedula"));
                    userS.eliminarPersona(persona);
                    acceso = "Administrador.jsp";
                    break;
                /**
                 * *administradorPersonaCrud:UpdatePersona***
                 */
                case "62cc030121d538da6e06096bf090f352d0e68276291763c52b8ec65296be716e":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    persona.setIDPERSONA(Integer.parseInt(request.getParameter("U_Id")));
                    persona.setPNOMBREPERSONA(request.getParameter("U_Pnombre"));
                    persona.setSNOMBREPERSONA(request.getParameter("U_Snombre"));
                    persona.setPAPELLIDOPERSONA(request.getParameter("U_Papellido"));
                    persona.setSAPELLIDOPERSONA(request.getParameter("U_Sapellido"));
                    persona.setTELEFONOPERSONA(request.getParameter("U_telefono"));
                    persona.setCORREOPERSONA(request.getParameter("U_email"));
                    persona.setCARGOPERSONA(request.getParameter("U_cargo"));
                    persona.setPROFESIONPERSONA(request.getParameter("U_profesion"));
                    persona.setCEDULAPERSONA(request.getParameter("U_cedula"));
                    persona.setFOTOPERSONA(request.getParameter("U_foto"));
                    persona.setEMPRESAPERSONA(em);
                    userS.editarPersona(persona);
                    acceso = "Administrador.jsp";
                    break;
                /**
                 * *administradorUserCrud:Create***
                 */
                case "6d0ce3439eaf154b505d675e220b06eacd30fb8cb2a5ecbfb52437e3493da448":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);

                    user.setUSUARIOUSUARIO(request.getParameter("RU_Usuario"));
                    user.setEMPRESAUSUARIO(em);
                    user.setCONTRASENIAUSUARIO(request.getParameter("RU_Contra"));
                    tipou.setIDTIPOUSUARIO(Integer.parseInt(request.getParameter("RU_TipoUsuario")));
                    user.setTipoUsuario(tipou);

                    persona.setIDPERSONA(Integer.parseInt(request.getParameter("RU_Persona")));
                    user.setPersona(persona);
                    userS.registrarUsuario(user);
                    acceso = "Administrador.jsp";

                    break;
                /**
                 * *administradorUserCrud:Delete***
                 */
                case "980048512dddd10b99f847a23c66344952a2323daa47d0873119d6c444e383e4":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    user.setIDUSUARIO(Integer.parseInt(request.getParameter("DU_Id")));
                    user.setUSUARIOUSUARIO(request.getParameter("DU_Usuario"));
                    tipou.setNIVELTIPOUSUARIO(request.getParameter("DU_TipoUsuario"));
                    user.setTipoUsuario(tipou);
                    userS.eliminarUsuario(user);
                    acceso = "Administrador.jsp";
                    break;
                    
                /**
                 * *administradorUserCrud:Update***
                 */
                case "b012a14bde5dd5fa3df954d640330f2a8cabb66de43e510f066ecb49da8e0e34":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    user.setIDUSUARIO(Integer.parseInt(request.getParameter("UU_Id")));
                    user.setUSUARIOUSUARIO(request.getParameter("UU_Usuario"));
                    user.setCONTRASENIAUSUARIO(request.getParameter("UU_Contra"));
                    tipou.setIDTIPOUSUARIO(Integer.parseInt(request.getParameter("UU_TipoUsuario")));
                    user.setTipoUsuario(tipou);
                    userS.editarUsuario(user);
                    acceso = "Administrador.jsp";
                    break;
                case "Formulario":

                    identificacionUF.setCLAVECATASTRALANTIGUOIULOTE("123");
                    identificacionUF.setCLAVECATASTRALNUEVOIULOTE("123");
                    identificacionUF.setNUMEROPREDIOIULOTE("123");

                    form.setIdentificacionUF(identificacionUF);
                    if (formS.registrarFormulario(form, user)) {
                        acceso = "menu.jsp?idUser=" + useraux.getIDUSUARIO() + "&name=" + useraux.getUSUARIOUSUARIO() + "&empresa=" + useraux.getEMPRESAUSUARIO();
                    }
                    break;

            }
            RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
            dispatcher.forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
