/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetize2;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class Alphabetize2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entered1, entered2, entered3;
        entered1 = JOptionPane.showInputDialog("Enter a first string");
        entered2 = JOptionPane.showInputDialog("Enter a second string");
        entered3 = JOptionPane.showInputDialog("Enter a third string");
        
        if(entered1.compareToIgnoreCase(entered2) < 0){
            if(entered2.compareToIgnoreCase(entered3) < 0){
                System.out.println(entered1+"\n"+entered2+"\n"+entered3);
            }else if(entered1.compareToIgnoreCase(entered3) < 0){
                System.out.println(entered1+"\n"+entered3+"\n"+entered2);
            }else{
                System.out.println(entered3+"\n"+entered1+"\n"+entered2);
            }
        }else if(entered3.compareToIgnoreCase(entered2) < 0){
            System.out.println(entered3+"\n"+entered2+"\n"+entered1);
        }else if(entered1.compareToIgnoreCase(entered3) < 0){
            System.out.println(entered2+"\n"+entered1+"\n"+entered3);
        }else{
            System.out.println(entered2+"\n"+entered3+"\n"+entered1);
        }
    }
    
}
