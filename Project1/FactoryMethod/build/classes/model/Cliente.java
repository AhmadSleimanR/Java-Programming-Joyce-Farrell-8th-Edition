/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public abstract class Cliente {
    protected List<Pedido> pedidos = new ArrayList<>();
    
    protected abstract Pedido creaPedido (double importe);
    
    public void nuevoPedido(double importe)
    {
        Pedido pedido = this.creaPedido(importe);
        if (pedido.valida())
        {
            pedido.paga();
            pedidos.add(pedido);
        }
    }
}
