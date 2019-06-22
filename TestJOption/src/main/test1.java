/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author lycan
 */
public class test1 {
    public String test = "";
    public void askQuestion(){
        test = JOptionPane.showInputDialog(null, "test");
    }
}
