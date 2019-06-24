/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import model.Cliente;
import model.ClienteContado;
import model.ClienteCredito;

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
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
    }
}
