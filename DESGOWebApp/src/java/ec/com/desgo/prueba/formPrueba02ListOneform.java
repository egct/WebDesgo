/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.modelo.*;
import ec.com.desgo.servicios.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author egct
 */
public class formPrueba02ListOneform {
     public static void main(String[] args) { 
        FormularioIds formids=new FormularioIds();
        Formulario form=new Formulario();        
        List<FormularioIds>forms=new ArrayList();
        formPrueba02ListOneform fwsdl=new formPrueba02ListOneform();
        
        User us=new User();
        us.setIDUSUARIO(1);

        forms =fwsdl.listarFormularios(us);
        System.out.println("list>");
        for (int i = 0; i <= forms.size() - 1; i++) {
            System.out.println(forms.get(i).getIdFormulario()+":"+forms.get(i).getCodigoF());
            form =fwsdl.listarFormulario(us,forms.get(i));
            System.out.println(":"+form.getIdentificacionUF().getCLAVECATASTRALANTIGUOIULOTE());
            System.out.println(":"+form.getIdentificacionUF().getCLAVECATASTRALNUEVOIULOTE());
            System.out.println(":"+form.getIdentificacionUF().getNUMEROPREDIOIULOTE());
            System.out.println(":"+form.getIdentificacionUF().getDDescriptivosPredioIULote().getNOMBREEDIFICIODDPLOTE());
            System.out.println(":"+form.getIdentificacionUF().getDDescriptivosPredioIULote().getNOMBRESECTORDDPLOTE());
            System.out.println(":"+form.getIdentificacionUF().getDDescriptivosPredioIULote().getUSOPREDIODDPLOTE());
            System.out.println(":"+form.getIdentificacionUF().getDDescriptivosPredioIULote().getDDPLote().getINTERSECCIONDLOTE());
            System.out.println(":"+form.getIdentificacionUF().getDDescriptivosPredioIULote().getDDPLote().getCALLEPDLOTE());
        }
        
        
    }

    public Formulario listarFormulario(ec.com.desgo.servicios.User user, ec.com.desgo.servicios.FormularioIds formularioIds) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listarFormulario(user, formularioIds);
    }

    public java.util.List<ec.com.desgo.servicios.FormularioIds> listarFormularios(ec.com.desgo.servicios.User user) {
        ec.com.desgo.servicios.WSGestionFormulario_Service service = new ec.com.desgo.servicios.WSGestionFormulario_Service();
        ec.com.desgo.servicios.WSGestionFormulario port = service.getWSGestionFormularioPort();
        return port.listarFormularios(user);
    }
}
