/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class DocumentacionHTML extends Documentacion {

    @Override
    public void agregaDocumento(String documento) {
        if (documento.startsWith("<HTML>"));
            contenido.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion HTML");
        for(String s: contenido)
        System.out.println(s);
    }
    
}
