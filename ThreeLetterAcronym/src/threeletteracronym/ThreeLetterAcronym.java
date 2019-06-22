/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeletteracronym;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class ThreeLetterAcronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letters, acronym = "";
        char c;
        int count = 1, i;
        boolean previous = false;
        letters = JOptionPane.showInputDialog("Please type an acronym");
        acronym += letters.charAt(0);
        for(i = 0; i < letters.length();++i){
            if(count == 3)
                break;
            c = letters.charAt(i);
            if(previous == true && c != ' '){
                acronym += letters.charAt(i);
                previous = false;
                ++count;
                continue;
            } 
            if(c == ' '){
                previous = true;
                continue;
            }
            previous = false;
        }
        acronym = acronym.toUpperCase();
        System.out.println(acronym);
    }
    
}
