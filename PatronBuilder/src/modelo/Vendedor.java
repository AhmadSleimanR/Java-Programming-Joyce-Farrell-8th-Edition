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

public class Vendedor {
    protected DocumentacionVehiculoBuilder builder;

    public Vendedor(DocumentacionVehiculoBuilder builder) {
        this.builder = builder;
    }
    
    public Documentacion build(String nombreCliente){
        builder.construyeSolicitudPedido(nombreCliente);
        builder.construyeSolicitudMatriculacion(nombreCliente);
        Documentacion documentacion = builder.resultado();
        return documentacion;
    }
}
