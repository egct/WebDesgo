/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.modelo.*;
import ec.com.desgo.servicios.FormularioIds;
import ec.com.desgo.servicios.HashMapClassForm;
import ec.com.desgo.servicios.User;
import ec.com.desgo.servicios.WSGestionFormulario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author egct
 */
public class formPrueba03ListAllformWithEmp {

    public static void main(String[] args) {
        List<HashMapClassForm> listformsUs = new ArrayList();
        formPrueba03ListAllformWithEmp a=new formPrueba03ListAllformWithEmp();
        //lista los formularios con su usuario
        
        listformsUs = a.listTodosFormIds("DESGO");
        
        for (HashMapClassForm i : listformsUs) {
            System.out.println("key: " + i.getForm().getIdFormulario() + " value: " +i.getUs().getUSUARIOUSUARIO());
        }
    }
    public java.util.List<ec.com.desgo.servicios.HashMapClassForm> listTodosFormIds(java.lang.String empresa) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listTodosFormIds(empresa);
    }


    
}
