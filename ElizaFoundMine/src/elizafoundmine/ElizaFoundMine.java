/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elizafoundmine;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ElizaFoundMine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entered;
        String noun;
        final String initialMessage = "Hello. I am Eliza, your tharapist. Tell me what" +
        "\nis troubling you. Any time you want to quit," +
        "\njust type \"Goodbye\"";
        final String GOODBYE= "Goodbye";
        final String LOVEHATE = "You seem to have strong feelings about that";
        final String TELLMEMORE = "Tell me more about your ";
        final String PLEASE = "Please go on";
        final String TELLME = "Tell me more";
        final String CONTINUE = "Continue";
        StringBuilder response = new StringBuilder();
        boolean hasMy;
        boolean hasLoveHate;
        int i, j = 0, timesMy,  random;
        char c;
        
        entered = JOptionPane.showInputDialog(null, initialMessage);
        while(!entered.equalsIgnoreCase(GOODBYE)){
            noun = "";
            hasMy = false;
            hasLoveHate = false;
            timesMy = 0;
            for(i = 0; i < entered.length() - 3; ++i){
                c = Character.toLowerCase(entered.charAt(i));
                if(!hasMy && !hasLoveHate){
                    if(c == 'l'){
                        if(Character.toLowerCase(entered.charAt(i + 1)) == 'o'){
                            if(Character.toLowerCase(entered.charAt(i + 2)) == 'v'){
                                if(Character.toLowerCase(entered.charAt(i + 3)) == 'e'){
                                    if(entered.charAt(i - 1) == ' ' || i == 0){
                                    hasLoveHate = true;
                                    }
                                }
                            }
                        }
                    }else if(c == 'h' && !hasMy && !hasLoveHate){
                        if(Character.toLowerCase(entered.charAt(i + 1)) == 'a'){
                            if(Character.toLowerCase(entered.charAt(i + 2)) == 't'){
                                if(Character.toLowerCase(entered.charAt(i + 3)) == 'e'){
                                    if(entered.charAt(i - 1) == ' ' || i == 0){
                                    hasLoveHate = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if(!hasMy && !hasLoveHate){
                    if(c == 'm'){
                        if(Character.toLowerCase(entered.charAt(i + 1)) == 'y')
                            if(entered.charAt(i + 2) == ' '){
                                if(i == 0 || entered.charAt(i - 1) == ' '){
                                    hasMy = true;
                                    //hasMy here is kinda useless, you can replace it with timesMy everywhere, but I added it later and too lazy to fix.
                                    timesMy += 1;
                                    if(j < entered.length() - 2)
                                        j = i+3;
                                    else
                                        j = i +2;
                                    noun += Character.toLowerCase(entered.charAt(j));
                                    while(entered.charAt(j) != ' ' && j < entered.length() - 1){
                                        ++j;
                                        noun += Character.toLowerCase(entered.charAt(j));
                                    }
                                }    
                            }
                    }
                }
            }
            if(entered.equalsIgnoreCase(GOODBYE)){
                entered = GOODBYE;
                JOptionPane.showMessageDialog(null, GOODBYE);
            }else if(hasLoveHate){
                entered = JOptionPane.showInputDialog(null, LOVEHATE);
            }else if(hasMy && timesMy < 2){
                entered = JOptionPane.showInputDialog(null, TELLMEMORE+noun);
            }else{
                random = (int)(Math.random() * 3) + 1;
                switch(random){
                    case 1:
                        response = response.replace(0, response.length(), PLEASE);
                        break;
                    case 2:
                        response = response.replace(0, response.length(), TELLME);
                        break;
                    case 3:
                        response = response.replace(0, response.length(), CONTINUE);
                        break;
                }
                entered = JOptionPane.showInputDialog(null, response);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
