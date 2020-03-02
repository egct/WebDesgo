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
public class prueba11EditarUsuario {
   
        
    public static void main(String[] args) {    
        prueba11EditarUsuario pru=new prueba11EditarUsuario();
        TipoUsuario tipo=new TipoUsuario();
        User u = new User();
        u.setIDUSUARIO(17);
        u.setUSUARIOUSUARIO("edwin4");
        u.setCONTRASENIAUSUARIO("edwin4");
        tipo.setIDTIPOUSUARIO(1);
        u.setTipoUsuario(tipo);
        
        boolean bandera=pru.editarUsuario(u);   
        System.out.println("result>"+bandera);
    }

    public boolean editarUsuario(ec.com.desgo.servicios.User usuario) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.editarUsuario(usuario);
    }


    

    

    

    
    
}
