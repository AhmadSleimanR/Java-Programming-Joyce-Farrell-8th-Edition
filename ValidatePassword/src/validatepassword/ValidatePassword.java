/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatepassword;

import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class ValidatePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String password;
        int upper, lower, digits;
        char c;
        do{
        upper = 0;
        lower = 0;
        digits = 0;
        password = JOptionPane.showInputDialog(null, "Please input a password that contains at least two uppercase letters, at least two lowercase letters and at least two digits");
        for(int i = 0;i < password.length();++i){
            c = password.charAt(i);
            if(Character.isUpperCase(c))
                ++upper;
            if(Character.isLowerCase(c))
                ++lower;
            if(Character.isDigit(c))
                ++digits;
        }
        if(upper < 2)
                System.out.println("You are missing "+(2 - upper)+" uppercase letter(s)");
        if(lower < 2)
                System.out.println("You are missing "+(2 - lower)+" lowercase letter(s)");
        if(digits < 2)
                System.out.println("You are missing "+(2 - digits)+" digit(s)");
        }while(upper < 2 || lower < 2 || digits < 2);
        System.out.println("Congratulations, your password: "+ password+" was succesfully verified!");
    }
    
}
