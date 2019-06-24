/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import model.CertificadoCesion;
import model.DocumentacionCliente;
import model.DocumentacionEnBlanco;
import model.OrdenDePedido;
import model.SolicitudMatricula;

/**
 *
 * @author Usuario
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inicializacion de la documentacion en blanco
    DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
    documentacionEnBlanco.incluye(new OrdenDePedido());
    documentacionEnBlanco.incluye(new CertificadoCesion());
    documentacionEnBlanco.incluye(new SolicitudMatricula());
    // creacion de documentacion nueva para dos clientes
    DocumentacionCliente documentacionCliente1 =
    new DocumentacionCliente("Martin");
    DocumentacionCliente documentacionCliente2 =
    new DocumentacionCliente("Simon");
    documentacionCliente1.visualiza();
    documentacionCliente2.visualiza();
    }
    
}
