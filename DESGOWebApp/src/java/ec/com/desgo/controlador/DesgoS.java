/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.controlador;

import ec.com.desgo.modelo.FormService;
import ec.com.desgo.modelo.UserService;
import ec.com.desgo.servicios.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.oreilly.servlet.MultipartRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.DataFormatter;

/**
 *
 * @author egct
 */
@WebServlet(name = "DesgoS", urlPatterns = {"/DesgoS"})
@MultipartConfig
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
    String IdFormulario;
    String codigoF;
    String contexto;

    User user = new User();
    User useraux = null;
    TipoUsuario tipou = new TipoUsuario();
    Persona persona = new Persona();
    /**
     * *******Formulario************
     */
    Formulario form = new Formulario();
    FormService formS = new FormService();
    Formulario formN = new Formulario();
    FormularioIds formIds = new FormularioIds();
    InicializarNewForm inicializarNewForm = new InicializarNewForm();

    //partes
    /**
     *
     */
    //Direccion_DDPLote direccion_DDPLote=new Direccion_DDPLote();
    IdentificacionUF identificacionUF = new IdentificacionUF();
    DDescriptivosPredioIULote dDescriptivosPredioIULote = new DDescriptivosPredioIULote();
    DireccionDDPLote dDPLote = new DireccionDDPLote();

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
                    formIds.setIdFormulario(Integer.parseInt(request.getParameter("IdFormulario")));
                    formIds.setCodigoF(Integer.parseInt(request.getParameter("codigoF")));
                    formIds.setIdentificacionUF(Integer.parseInt(request.getParameter("formIds_IU")));
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    request.setAttribute("IdFormulario", formIds.getIdFormulario());
                    request.setAttribute("codigoF", formIds.getCodigoF());
                    request.setAttribute("formIds_IU", formIds.getIdentificacionUF());
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
                    formIds.setIdFormulario(Integer.parseInt(request.getParameter("IdFormulario")));
                    formIds.setCodigoF(Integer.parseInt(request.getParameter("codigoF")));
                    formIds.setIdentificacionUF(Integer.parseInt(request.getParameter("formIds_IU")));
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    request.setAttribute("IdFormulario", formIds.getIdFormulario());
                    request.setAttribute("codigoF", formIds.getCodigoF());
                    request.setAttribute("formIds_IU", formIds.getIdentificacionUF());
                    acceso = "formularioUsuario.jsp";
                    break;
                /**
                 * *Mis Formularios administrador***
                 */
                case "3773b45def36f7906ee172a3a88b69a13dd4009a":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "misFormulariosAdministrador.jsp";
                    break;
                /**
                 * *Mis Formularios Usuario***
                 */
                case "30bfa040d6820b49c35db8bff22f0017a13b462e":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "misFormulariosUsuario.jsp";
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
                 * *Asignar Formulario Administrador***
                 */
                case "d65b1910633f1549f818bd804a2f10882ed36026":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    acceso = "AsignarFormularioAdministrador.jsp";
                    break;
                /**
                 * *Registrar formularios***
                 */
                case "31afc1b5779edc3cbd32844041ecdd2438a95d3a6c11d1587edc484277b18adc":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    contexto = getServletContext().getRealPath("index.jsp");
                    contexto = contexto.replaceAll("index.jsp", "");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);

                    //contexto=contexto.
//
                    try {
                        //leer y crear archivo desde jsp y guardar en una ruta relativa 
                        String nomb = request.getParameter("nombre");
                        Part arch = request.getPart("input-excel");
                        InputStream is = arch.getInputStream();
                        File f = new File(contexto + nomb);
                        FileOutputStream ous = new FileOutputStream(f);
                        int dato = is.read();
                        while (dato != -1) {
                            ous.write(dato);
                            dato = is.read();
                        }
                        ous.close();
                        is.close();

                        FormularioIds formu = new FormularioIds();
                        ArrayList<FormularioIds> listForm = new ArrayList<>();
                        int contF = 0;
                        int contC = 0;
                        DataFormatter formatter = new DataFormatter();
                        FileInputStream file = new FileInputStream(new File(contexto + nomb));
                        // leer archivo excel
                        XSSFWorkbook worbook = new XSSFWorkbook(file);
                        //obtener la hoja que se va leer
                        XSSFSheet sheet = worbook.getSheetAt(0);
                        //obtener todas las filas de la hoja excel
                        Iterator<Row> rowIterator = sheet.iterator();
                        Row row;
                        // se recorre cada fila hasta el final
                        while (rowIterator.hasNext()) {
                            row = rowIterator.next();
                            //se obtiene las celdas por fila
                            Iterator<Cell> cellIterator = row.cellIterator();
                            Cell cell;
                            //se recorre cada celda
                            if (contF != 0) {
                                while (cellIterator.hasNext()) {
                                    // se obtiene la celda en específico y se la imprime
                                    cell = cellIterator.next();
                                    System.out.print(formatter.formatCellValue(cell) + " | ");
                                    if (contC == 0) {
                                        formu.setCodigoF(Integer.parseUnsignedInt(formatter.formatCellValue(cell)));
                                    } else if (contC == 1) {
                                        if (formatter.formatCellValue(cell).equals("true")) {
                                            formu.setEstadoF(1);
                                        } else {
                                            formu.setEstadoF(0);
                                        }
                                    }
                                    contC++;
                                }
                                System.out.println();
                                listForm.add(formu);
                                formu = new FormularioIds();
                                contC = 0;
                            }
                            contF = -1;
                        }
                        //elimino el excel
                        f.delete();
                        //
                        //Inicializa el formulario para registrar en la Base de datos
                        for (FormularioIds uf : listForm) {
                            long re = formS.insertarDireccionDDPLote(inicializarNewForm.TypeDireccionDDPLote(dDPLote));
                            long re2 = formS.insertarDDescriptivosPredioIULote(inicializarNewForm.TypeDDescriptivosPredioIULote(dDescriptivosPredioIULote, (int) re));
                            long re3 = formS.insertarIdentificacionUF(inicializarNewForm.TypeIdentificacionUF(identificacionUF, (int) re2));
                            User us = new User();
                            us.setIDUSUARIO(Integer.parseInt(id));
                            FormularioIds formIds = new FormularioIds();
                            formIds.setCodigoF(uf.getCodigoF());
                            formIds.setEstadoF(uf.getEstadoF());
                            formIds.setIdUsuarioF(Integer.parseInt(id));
                            Boolean result = formS.registarFormulario(us, inicializarNewForm.TypeFormId(formIds, (int) re3));
                        }
                    } catch (Exception ex) {
                    }
                    acceso = "AsignarFormularioAdministrador.jsp";
                    break;
                /**
                 * *Asignar usuario a formulario
                 */
                case "a989f832e5e28dd18636e124c281d5f37278a5b96e94f47af200b2d78836e8ff":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);

                    String usuarioAsignado = request.getParameter("UUF_Id");
                    String[] formulariosAsignados = request.getParameterValues("formulariosAsignar");
                    for (int i = 0; i < formulariosAsignados.length; i++) {
                        formS.asigUserFormulario(Integer.parseInt(usuarioAsignado), Integer.parseInt(formulariosAsignados[i]));
                    }
                    acceso = "AsignarFormularioAdministrador.jsp";
                    break;
                /**
                 * *Eliminar formularios
                 */
                case "cc5efbcf967a47f4fcf30f96a09801a19c879960e691d024c50f7c3130451adf":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);
                    User usFormulario = new User();
                    String delimiter = "-";
                    String[] formulariosEliminar = request.getParameterValues("formulariosEliminar");
                    for (int i = 0; i < formulariosEliminar.length; i++) {
                        String[] all = formulariosEliminar[i].split(delimiter);
                        String codigoFormulario = all[0];
                        String idUs = all[1];
                        usFormulario.setIDUSUARIO(Integer.parseInt(idUs));
                        formS.eliminarFormulario(codigoFormulario, usFormulario);
                    }
                    acceso = "AsignarFormularioAdministrador.jsp";
                    break;
                /**
                 * *Actualizar formulario: Administrador***
                 */
                case "1135b4862b8f56a89f2066ecae93d4491a7d218d799189c4612e5d48a71cbbcd":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);

                    //
                    Formulario formActualizar = new Formulario();
                    formActualizar.setIdFormulario(Integer.parseInt(request.getParameter("IdFormulario")));

                    /*
                    Identificacion Ubicacion
                     */
                    DireccionDDPLote dDPLote = new DireccionDDPLote();
                    dDPLote.setIDDLOTE(Integer.parseInt(request.getParameter("IdDireccion")));
                    dDPLote.setCALLEPDLOTE(request.getParameter("IU_d_callep"));
                    dDPLote.setNODLOTE(request.getParameter("IU_d_no"));
                    dDPLote.setINTERSECCIONDLOTE(request.getParameter("IU_d_inter"));

                    DDescriptivosPredioIULote ddpiul = new DDescriptivosPredioIULote();
                    ddpiul.setDDPLote(dDPLote);
                    ddpiul.setIDDDPLOTE(Integer.parseInt(request.getParameter("IdDDescriptivospredio")));
                    ddpiul.setNOMBRESECTORDDPLOTE(request.getParameter("IU_dd_nsec"));
                    ddpiul.setNOMBREEDIFICIODDPLOTE(request.getParameter("IU_dd_nedi"));
                    ddpiul.setUSOPREDIODDPLOTE(request.getParameter("IU_dd_usop"));
                    ddpiul.setTIPOPREDIODDPLOTE("Rural");
                    ddpiul.setREGIMENTENECIADDPLOTE("Unipropiedad");

                    IdentificacionUF iuf = new IdentificacionUF();
                    iuf.setDDescriptivosPredioIULote(ddpiul);
                    iuf.setIDIULOTE(Integer.parseInt(request.getParameter("IdFormulario_IU")));
                    iuf.setCLAVECATASTRALANTIGUOIULOTE(request.getParameter("IU_cca_pro1"));
                    iuf.setCLAVECATASTRALNUEVOIULOTE(request.getParameter("IU_ccu"));
                    iuf.setNUMEROPREDIOIULOTE(request.getParameter("IU_np"));

                    formActualizar.setIdentificacionUF(iuf);
                    formActualizar.setCodigoF(Integer.parseInt(request.getParameter("codigoF")));
                    formActualizar.setIdUsuarioF(Integer.parseInt(request.getParameter("idUser")));
                    formActualizar.setEstadoF(1);

                    formS.editarformulario(formActualizar);

                    acceso = "formularioAdministrador.jsp";
                    break;
                /**
                 * *Actualizar formulario: Usuario***
                 */
                case "68adb34bce0e3a1dba5c25b1ce3e0d307b62352d81fa508c668965f8083ba68e":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);

                    //
                    Formulario formActualizarU = new Formulario();
                    formActualizarU.setIdFormulario(Integer.parseInt(request.getParameter("IdFormulario")));

                    /*
                    Identificacion Ubicacion
                     */
                    DireccionDDPLote dDPLoteU = new DireccionDDPLote();
                    dDPLoteU.setIDDLOTE(Integer.parseInt(request.getParameter("IdDireccion")));
                    dDPLoteU.setCALLEPDLOTE(request.getParameter("IU_d_callep"));
                    dDPLoteU.setNODLOTE(request.getParameter("IU_d_no"));
                    dDPLoteU.setINTERSECCIONDLOTE(request.getParameter("IU_d_inter"));

                    DDescriptivosPredioIULote ddpiulU = new DDescriptivosPredioIULote();
                    ddpiulU.setDDPLote(dDPLoteU);
                    ddpiulU.setIDDDPLOTE(Integer.parseInt(request.getParameter("IdDDescriptivospredio")));
                    ddpiulU.setNOMBRESECTORDDPLOTE(request.getParameter("IU_dd_nsec"));
                    ddpiulU.setNOMBREEDIFICIODDPLOTE(request.getParameter("IU_dd_nedi"));
                    ddpiulU.setUSOPREDIODDPLOTE(request.getParameter("IU_dd_usop"));
                    ddpiulU.setTIPOPREDIODDPLOTE("Rural");
                    ddpiulU.setREGIMENTENECIADDPLOTE("Unipropiedad");

                    IdentificacionUF iufU = new IdentificacionUF();
                    iufU.setDDescriptivosPredioIULote(ddpiulU);
                    iufU.setIDIULOTE(Integer.parseInt(request.getParameter("IdFormulario_IU")));
                    iufU.setCLAVECATASTRALANTIGUOIULOTE(request.getParameter("IU_cca_pro1"));
                    iufU.setCLAVECATASTRALNUEVOIULOTE(request.getParameter("IU_ccu"));
                    iufU.setNUMEROPREDIOIULOTE(request.getParameter("IU_np"));

                    formActualizarU.setIdentificacionUF(iufU);
                    formActualizarU.setCodigoF(Integer.parseInt(request.getParameter("codigoF")));
                    formActualizarU.setIdUsuarioF(Integer.parseInt(request.getParameter("idUser")));
                    formActualizarU.setEstadoF(1);

                    formS.editarformulario(formActualizarU);

                    acceso = "formularioUsuario.jsp";
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
                /**
                 * *DescargarDb***
                 */
                case "descargardb":
                    id = request.getParameter("idUser");
                    n = request.getParameter("name");
                    em = request.getParameter("empresa");
                    t = request.getParameter("tipo");
                    request.setAttribute("idUser", id);
                    request.setAttribute("name", n);
                    request.setAttribute("empresa", em);
                    request.setAttribute("tipo", t);

                    acceso = "AsignarFormularioAdministrador.jsp";
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
