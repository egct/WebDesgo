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
public class prueba08EliminarPersona {
   
        
    public static void main(String[] args) {    
        prueba08EliminarPersona p=new prueba08EliminarPersona();
        Persona per=new Persona();
        per.setIDPERSONA(34);
        boolean bandera=p.eliminarPersona(per);   
        System.out.println("result>"+bandera);
    }

    public boolean eliminarPersona(ec.com.desgo.servicios.Persona persona) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.eliminarPersona(persona);
    }

    

    

    
    
}
