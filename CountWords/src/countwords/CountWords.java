/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class CountWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String words;
        boolean previousCharWasPunc = false;
        words = JOptionPane.showInputDialog(null, "Enter a string!");
        words = words.replace(" ", ".");
        words = words.replace(",", ".");
        words = words.replace(";", ".");
        words = words.replace("?", ".");
        words = words.replace("!", ".");
        words = words.replace("-", ".");
        char c;
        int count = 0;
        for(int i = 0;i < words.length();++i){
            c = words.charAt(i);
            if(c == '.' ){
                if(!previousCharWasPunc){
                    ++count;
                }
                previousCharWasPunc = true;
            }else{
            previousCharWasPunc = false;
            }
        }
        if(words.charAt(words.length() - 1) != '.')
            ++count;
        JOptionPane.showMessageDialog(null, "The amount of words in your string were: "+count);
    }
    
}
