/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.prueba;

import ec.com.desgo.modelo.*;
import ec.com.desgo.servicios.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author egct
 */
public class pathrelative {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String contexto = "C:\\Users\\egct\\Documents\\GitHub\\WebDesgo\\DESGOWebApp\\build\\web\\index.jsp";
        contexto = contexto.replaceAll("index.jsp", "");
        System.out.println(contexto);

        FormularioIds formu= new FormularioIds();
        ArrayList<FormularioIds> listForm = new ArrayList<>();
        int contF = 0;
        int contC = 0;
        DataFormatter formatter = new DataFormatter();
        FileInputStream file = new FileInputStream(new File("C:\\Users\\egct\\Desktop\\formularios.xlsx"));
        // leer archivo excel
        XSSFWorkbook worbook = new XSSFWorkbook(file);
        //obtener la hoja que se va leer
        XSSFSheet sheet = worbook.getSheetAt(0);
        //obtener todas las filas de la hoja excel
        Iterator<Row> rowIterator = sheet.iterator();
        Row row;
        // se recorre cada fila hasta el final
        while (rowIterator.hasNext()) {
            row = rowIterator.next();
            //se obtiene las celdas por fila
            Iterator<Cell> cellIterator = row.cellIterator();
            Cell cell;
            //se recorre cada celda
            if (contF != 0) {
                while (cellIterator.hasNext()) {
                    // se obtiene la celda en específico y se la imprime
                    cell = cellIterator.next();
                    System.out.print(formatter.formatCellValue(cell) + " | ");
                    if (contC == 0) {
                        formu.setCodigoF(Integer.parseUnsignedInt(formatter.formatCellValue(cell)));
                    } else if (contC == 1) {
                        if (formatter.formatCellValue(cell).equals("true")) {
                            formu.setEstadoF(1);
                        } else {
                            formu.setEstadoF(0);
                        }
                    }
                    contC++;
                }
                System.out.println();
                listForm.add(formu);
                formu= new FormularioIds();
                contC = 0;
            }            
            contF =-1;
        }
        for (FormularioIds f : listForm) {
            System.out.println(">" + f.getCodigoF() + ">" + f.getEstadoF());
        }
    }
}
