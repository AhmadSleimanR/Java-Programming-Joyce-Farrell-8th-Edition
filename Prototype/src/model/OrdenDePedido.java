/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class OrdenDePedido extends Documento{

    @Override
    public void imprime() {
        System.out.println("Imprime la orden de pedido: " + 
                contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra la orden de pedido: " +
                contenido);
    }
    
}
