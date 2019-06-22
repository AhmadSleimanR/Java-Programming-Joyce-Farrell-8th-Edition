/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

import java.util.Scanner;
import modelo.Documentacion;
import modelo.DocumentacionVehiculoBuilder;
import modelo.DocumentacionVehiculoHtmlBuilder;
import modelo.DocumentacionVehiculoPdfBuilder;
import modelo.Vendedor;

/**
 *
 * @author Usuario
 */
public class ClienteVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        DocumentacionVehiculoBuilder builder;
        System.out.print("Desea generar " +
                "documentacion HTML (1) o PDF (2):");
        String seleccion = reader.next();
        if (seleccion.equals("1"))
            {
                builder = new DocumentacionVehiculoHtmlBuilder();
                
            }else{
            builder = new DocumentacionVehiculoPdfBuilder();
        }
        Vendedor vendedor = new Vendedor(builder);
        Documentacion documentacion = vendedor.build("Martin");
        documentacion.imprime();
    }
    
    
}
