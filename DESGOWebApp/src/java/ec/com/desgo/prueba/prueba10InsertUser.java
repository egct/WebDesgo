/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.controlador.Seguridad;
import ec.com.desgo.servicios.Persona;
import ec.com.desgo.servicios.TipoUsuario;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class prueba10InsertUser {

    public static void main(String[] args) {
        User us = new User();
        Persona p = new Persona();
        TipoUsuario tipouser = new TipoUsuario();
        prueba10InsertUser prueba = new prueba10InsertUser();
        p.setIDPERSONA(1);
        tipouser.setIDTIPOUSUARIO(1);
        us.setPersona(p);
        us.setTipoUsuario(tipouser);
        
        us.setUSUARIOUSUARIO("edwinegct2");
        us.setCONTRASENIAUSUARIO("edwinegct2");
        us.setEMPRESAUSUARIO("DESGO");
        System.out.println(">>" + prueba.registrarUsuario(us));

    }

    public boolean registrarUsuario(ec.com.desgo.servicios.User usuario) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.registrarUsuario(usuario);
    }

   
    

}
