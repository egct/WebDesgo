/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.modelo.Prueba;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class prueba04Id {
   
        
    public static void main(String[] args) {    
        User u=new User();
        prueba04Id p=new prueba04Id();
    
        u=p.buscarPersona(14);   
        System.out.println("datos>"+u.getUSUARIOUSUARIO()+">"+u.getEMPRESAUSUARIO()+">"+u.getCONTRASENIAUSUARIO()+" "+u.getTipoUsuario().getNIVELTIPOUSUARIO()+" "+u.getTipoUsuario().getNIVELTIPOUSUARIO());
    }

    public User buscarPersona(int iduser) {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.buscarPersona(iduser);
    }

    
    
  
}
