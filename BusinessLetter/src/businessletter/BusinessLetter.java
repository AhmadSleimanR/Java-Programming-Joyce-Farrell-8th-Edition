/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessletter;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class BusinessLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        String firstName = "";
        String lastName = "";
        int x;
        name = JOptionPane.showInputDialog(null,"Please enter customer's first and last name");
        x = 0;
        while(x < name.length()){
            if(name.charAt(x) == ' '){
                firstName = name.substring(0, x);
                lastName = name.substring(x + 1, name.length());
            }
            ++x;
        }
        
        System.out.println("Dear "+firstName+"...\n"+
                "We are SO grateful for you being our customer, make sure to call us back! "+
                "thank you!"+"\n"+"However, we now have an offer for the entire "+lastName+" family!"+
                "\nPlease call us back!");
    }
    
}
