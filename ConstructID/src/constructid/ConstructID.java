/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructid;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, address, username = "";
        char c;
        int i;
        name = JOptionPane.showInputDialog(null, "Please enter your name and last names: ");
        address = JOptionPane.showInputDialog(null, "Now, please enter your address");
        username += name.substring(0, 1).toUpperCase();
        for(i = 0; i < name.length();++i){
            c = name.charAt(i);
            if(Character.isWhitespace(c)){
                ++i;
                username += Character.toUpperCase(name.charAt(i));
            }
            
        }
        
        for(i = 0; i < address.length();++i){
            c = address.charAt(i);
            if(Character.isDigit(c))
                username += c;
        }
        
        JOptionPane.showMessageDialog(null, "Your username is: "+username);
    }
    
}
