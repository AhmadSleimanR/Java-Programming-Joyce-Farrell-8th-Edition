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
public class DocumentacionVehiculoHtmlBuilder extends DocumentacionVehiculoBuilder {
    
    public DocumentacionVehiculoHtmlBuilder(){
        documentacion = new DocumentacionHTML();
    }
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido Cliente: " +
                nombreCliente + "</HTML>";
        documentacion.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento =
                "<HTML>Solicitud de matriculacion Solicitante: " +
                nombreSolicitante + "</HTML>";
        documentacion.agregaDocumento(documento);
    }
    
}
