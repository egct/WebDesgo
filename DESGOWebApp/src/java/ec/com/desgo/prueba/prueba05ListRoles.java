/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.servicios.TipoUsuario;
import java.util.List;

/**
 *
 * @author egct
 */
public class prueba05ListRoles {
   
        
    public static void main(String[] args) {    
        prueba05ListRoles p=new prueba05ListRoles();
        
        List<TipoUsuario> listRoles=p.listarRoles();   
        System.out.println("datos>"+listRoles.toString());
    }

    public List<TipoUsuario> listarRoles() {
        ec.com.desgo.servicios.WSGestionUsuario_Service service = new ec.com.desgo.servicios.WSGestionUsuario_Service();
        ec.com.desgo.servicios.WSGestionUsuario port = service.getWSGestionUsuarioPort();
        return port.listarRoles();
    }
    
    
}
