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
public class formPruebadeleteforms {

    public static void main(String[] args) {
        formPruebadeleteforms fwsdl = new formPruebadeleteforms();

        User usFormulario = new User();
        String delimiter = "-";
        String[] formulariosEliminar = {"17235956253-14","17235956253-15","17235956253-16","17235956253-17"};
        for (int i = 0; i < formulariosEliminar.length; i++) {
            String[] all = formulariosEliminar[i].split(delimiter);
            String codigoFormulario = all[0];
            String idUs = all[1];
            usFormulario.setIDUSUARIO(Integer.parseInt(idUs));
            System.out.println("codigo:"+codigoFormulario +" iduser:"+usFormulario.getIDUSUARIO());
        }

    }

}
