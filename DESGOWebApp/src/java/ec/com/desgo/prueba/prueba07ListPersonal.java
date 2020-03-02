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
public class prueba07ListPersonal {
   
        
    public static void main(String[] args) {    
        prueba07ListPersonal p=new prueba07ListPersonal();
        
        List<Persona> listRoles=p.listarPersonas(1);   
        System.out.println("datos>"+listRoles.toString());
    }

    public java.util.List<ec.com.desgo.servicios.Persona> listarPersonas(int iduser) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.listarPersonas(iduser);
    }

    

    
    
}
