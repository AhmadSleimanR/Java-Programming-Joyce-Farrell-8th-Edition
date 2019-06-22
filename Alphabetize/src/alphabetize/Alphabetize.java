/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetize;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class Alphabetize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entered1, entered2, entered3;
        entered1 = JOptionPane.showInputDialog("Enter message 1");
        entered2 = JOptionPane.showInputDialog("Enter message 2");
        entered3= JOptionPane.showInputDialog("Entere message 3");
        
        if(entered1.compareToIgnoreCase(entered2) < entered2.compareToIgnoreCase(entered1)){
            if(entered2.compareToIgnoreCase(entered3) < entered3.compareToIgnoreCase(entered2))
                System.out.println("The strings were in alphabetical order!");
        }else{
                System.out.println("The strings weren't in alphabetical order!");
            }
    }
    
}
