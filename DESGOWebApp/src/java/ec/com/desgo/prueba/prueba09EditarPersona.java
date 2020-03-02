/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.servicios.Persona;
import ec.com.desgo.servicios.TipoUsuario;
import java.util.List;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class prueba09EditarPersona {
   
        
    public static void main(String[] args) {    
        prueba09EditarPersona pru=new prueba09EditarPersona();
        Persona p=new Persona();
        p.setIDPERSONA(21);
        p.setPNOMBREPERSONA("A");
        p.setSNOMBREPERSONA("X");
        p.setPAPELLIDOPERSONA("C");
        p.setSAPELLIDOPERSONA("T");
        p.setTELEFONOPERSONA("022385593");
        p.setCORREOPERSONA("M@outlook.es");
        p.setCARGOPERSONA("root");
        p.setPROFESIONPERSONA("Desarrollador");
        p.setCEDULAPERSONA("1723953058");
        p.setFOTOPERSONA("http://lacarpa.com.mx/wp-content/uploads/2019/06/whats-appfoto-perfil.png");
        p.setEMPRESAPERSONA("DESGO");
        boolean bandera=pru.editarPersona(p);   
        System.out.println("result>"+bandera);
    }

    public boolean editarPersona(ec.com.desgo.servicios.Persona persona) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.editarPersona(persona);
    }

    

    

    

    
    
}
