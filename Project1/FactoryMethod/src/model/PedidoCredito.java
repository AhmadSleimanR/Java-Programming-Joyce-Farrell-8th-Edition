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
public class PedidoCredito extends Pedido{

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe >= 1000) && (importe <= 5000);
    }

    @Override
    public void paga() {
            System.out.println("El pago del pedido por importe de: " +
                    + importe + " se ha realizado.");
    }
    
}
