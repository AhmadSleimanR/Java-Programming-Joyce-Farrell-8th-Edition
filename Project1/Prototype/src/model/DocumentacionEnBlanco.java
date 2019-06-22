/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DocumentacionEnBlanco extends Documentacion{
    private static DocumentacionEnBlanco _instance = null;

 private DocumentacionEnBlanco(){
 documentos = new ArrayList<>();
 }

 public static DocumentacionEnBlanco Instance()
 {
 if (_instance == null)
 _instance = new DocumentacionEnBlanco();
    return _instance;
 }

 public void incluye(Documento doc)
 {
 documentos.add(doc);
 }
 public void excluye(Documento doc)
 {
 documentos.remove(doc);
 }
}
