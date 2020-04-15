/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.controlador;

import ec.com.desgo.servicios.DDescriptivosPredioIULote;
import ec.com.desgo.servicios.DireccionDDPLote;
import ec.com.desgo.servicios.FormularioIds;
import ec.com.desgo.servicios.IdentificacionUF;
import ec.com.desgo.servicios.User;

/**
 *
 * @author egct
 */
public class InicializarNewForm {
    
    
    public FormularioIds TypeFormId(FormularioIds model,int num){
        model.setIdentificacionUF(num);
        return model;
    }   
    public DireccionDDPLote TypeDireccionDDPLote(DireccionDDPLote model){
        model.setCALLEPDLOTE("");
        model.setNODLOTE("");
        model.setINTERSECCIONDLOTE("");
        return model;
    }
    public DDescriptivosPredioIULote TypeDDescriptivosPredioIULote(DDescriptivosPredioIULote model,int num){
        model.setIDDLOTE(num);
        model.setNOMBRESECTORDDPLOTE("");
        model.setNOMBREEDIFICIODDPLOTE("");
        model.setUSOPREDIODDPLOTE("");
        model.setTIPOPREDIODDPLOTE("Rural");
        model.setREGIMENTENECIADDPLOTE("Unipropiedad");
        return model;
    }
    public IdentificacionUF TypeIdentificacionUF(IdentificacionUF model,int num){
        model.setIDDDPLOTE(num);
        model.setCLAVECATASTRALANTIGUOIULOTE("");
        model.setNUMEROPREDIOIULOTE("");
        model.setCLAVECATASTRALNUEVOIULOTE("");
        return model;
    }

}
