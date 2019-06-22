/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class Eliza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entered, noun;
        final String RESPONSE1= "Please go on";
        final String RESPONSE2= "Tell me more";
        final String RESPONSE3= "Continue";
        final String GOODBYE = "Goodbye";
        int i, count, randomResponse;
        char c;
        entered = JOptionPane.showInputDialog(null, "Please tell me something...");
        while(!entered.equalsIgnoreCase(GOODBYE)){
            noun = "";
            count = 0;
            for(i = 0;i < entered.length() -3 && count < 1;++i){
                c = Character.toUpperCase(entered.charAt(i));
                if(c == ' ' || c =='M' || c == 'L' || c == 'H'){
                    if(c == ' '){
                        ++i;
                        c = Character.toUpperCase(entered.charAt(i));
                    }
                if(i < entered.length() -1){
                switch(c){
                    case 'M':
                        ++i;
                        c = Character.toUpperCase(entered.charAt(i));
                        if(c == 'Y' && i < entered.length() -1){
                            ++i;
                            c = Character.toUpperCase(entered.charAt(i));
                            if(c == ' ' && i < entered.length() -1){
                                ++i;
                                while(i < entered.length()){
                                    c = Character.toLowerCase(entered.charAt(i));
                                    if(c != ' ')
                                        noun += c;
                                    else
                                        break;
                                    ++i;
                                }
                                entered = JOptionPane.showInputDialog(null, "Tell me more about your "+noun);
                                ++count;
                                break;
                            }
                        }
                        break;
                    case 'L':
                        ++i;
                        c = Character.toUpperCase(entered.charAt(i));
                        if(c == 'O' && i < entered.length() -1){
                            ++i;
                            c = Character.toUpperCase(entered.charAt(i));
                            if(c == 'V' && i < entered.length() -1){
                                ++i;
                                c = Character.toUpperCase(entered.charAt(i));
                                if(c == 'E' && i < entered.length() -1){
                                  ++i;
                                  c = entered.charAt(i);
                                  if(c == ' '){
                                      entered = JOptionPane.showInputDialog(null, "You seem to have strong feelings about that");
                                      ++count;
                                      break;
                                  }
                                }
                                      entered = JOptionPane.showInputDialog(null, "You seem to have strong feelings about that");
                                      ++count;
                            }
                        }
                        break;
                    case 'H':
                        ++i;
                        c = Character.toUpperCase(entered.charAt(i));
                        if(c == 'A' && i < entered.length() -1){
                            ++i;
                            c = Character.toUpperCase(entered.charAt(i));
                            if(c == 'T' && i < entered.length() -1){
                                ++i;
                                c = Character.toUpperCase(entered.charAt(i));
                                if(c == 'E' && i < entered.length() -1){
                                  ++i;
                                  c = entered.charAt(i);
                                  if(c == ' ' && i < entered.length() -1){
                                      entered = JOptionPane.showInputDialog(null, "You seem to have strong feelings about that");
                                      ++count;
                                      break;
                                  }
                                      entered = JOptionPane.showInputDialog(null, "You seem to have strong feelings about that");
                                      ++count;
                                }
                            }
                        }
                        break;
                    }
                }
                }
            }
                if(!entered.equals("Goodbye") && count < 1){
                randomResponse = (int) (Math.random() * 3) +1;
                switch(randomResponse){
                    case 1:
                        entered = JOptionPane.showInputDialog(null, RESPONSE1);
                        ++count;
                        break;
                    case 2:
                        entered = JOptionPane.showInputDialog(null, RESPONSE2);
                        ++count;
                        break;
                    case 3:
                        entered = JOptionPane.showInputDialog(null, RESPONSE3);
                        ++count;
                        break;
                }
                }
        }
        JOptionPane.showMessageDialog(null, GOODBYE);
    }
}
