/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairname;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class RepairName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, nameCopy;
        int length;
        char c;
        name = JOptionPane.showInputDialog(null, "Please type your name and last name.");
        nameCopy = name;
        length = name.length();
        for(int i = 0;i < length ;++i){
            c = name.charAt(i);
            if(i == 0){
                c = Character.toUpperCase(c);
                name = c + name.substring(1, length);
            }else if(c == ' '){
                ++i;
                c = name.charAt(i);
                c = Character.toUpperCase(c);
                name = name.substring(0, i) + c + name.substring(i + 1, length);
            }
        }
        System.out.println("Your original entry was: "+nameCopy+"\n"+
                "And now your fixed name is: "+name);
    }
    
}
