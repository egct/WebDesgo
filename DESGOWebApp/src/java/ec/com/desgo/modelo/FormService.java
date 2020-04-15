/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.modelo;

import ec.com.desgo.servicios.Formulario;

/**
 *
 * @author egct
 */
public class FormService {

    /*public Boolean registrarFormulario(ec.com.desgo.servicios.Formulario form, ec.com.desgo.servicios.User user) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.registrarFormulario(form, user);
    }*/

    public Formulario listarFormulario(ec.com.desgo.servicios.User user, ec.com.desgo.servicios.FormularioIds formularioIds) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listarFormulario(user, formularioIds);
    }

    public Formulario listarFormularioInt(int formularioIds, int iulote) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listarFormularioInt(formularioIds, iulote);
    }

    public java.util.List<ec.com.desgo.servicios.FormularioIds> listarFormularios(ec.com.desgo.servicios.User user) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listarFormularios(user);
    }

    public java.util.List<ec.com.desgo.servicios.FormularioIds> listarFormulariosId(int user) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listarFormulariosId(user);
    }
    
    
    
    /****Identificacion Ubicacion*****/
    
    public long insertarIdentificacionUF(ec.com.desgo.servicios.IdentificacionUF identificacionUF) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.insertarIdentificacionUF(identificacionUF);
    }

    public long insertarDDescriptivosPredioIULote(ec.com.desgo.servicios.DDescriptivosPredioIULote dDescriptivosPredioIULote) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.insertarDDescriptivosPredioIULote(dDescriptivosPredioIULote);
    }

    public long insertarDireccionDDPLote(ec.com.desgo.servicios.DireccionDDPLote direccionDDPLote) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.insertarDireccionDDPLote(direccionDDPLote);
    }

    public Boolean registarFormulario(ec.com.desgo.servicios.User us, ec.com.desgo.servicios.FormularioIds form) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.registarFormulario(us, form);
    }

    public boolean editarformulario(ec.com.desgo.servicios.Formulario formulario) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.editarformulario(formulario);
    }

    public java.util.List<ec.com.desgo.servicios.HashMapClassForm> listTodosFormIds(java.lang.String empresa) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listTodosFormIds(empresa);
    }

    public boolean asigUserFormulario(int idUser, int idForm) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.asigUserFormulario(idUser, idForm);
    }
    
}
