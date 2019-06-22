/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynamecomparison;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = new String[3];
        char c;
        names[0] = JOptionPane.showInputDialog(null, "Write a name!");
        names[0] = names[0].toLowerCase();
        c = Character.toUpperCase(names[0].charAt(0));
        names[0] = c + names[0].substring(1, names[0].length());
        System.out.println("Your writted name was: "+names[0]);
        names[1] = JOptionPane.showInputDialog(null, "Write another name!");
        names[1] = names[1].toLowerCase();
        c = Character.toUpperCase(names[1].charAt(0));
        names[1] = c + names[1].substring(1, names[1].length());
        System.out.println("Your writted name was: "+names[1]);
        names[2] = JOptionPane.showInputDialog(null, "Write a third name!!");
        names[2] = names[2].toLowerCase();
        c = Character.toUpperCase(names[2].charAt(0));
        names[2] = c + names[2].substring(1, names[2].length());
        System.out.println("Your writted name was: "+names[2]);
        for(int i = 0;i < 3;++i){
            for(int j = 0; j < 3; ++j){
                if(i != j){
                    System.out.println(names[i] +" "+names[j]);
                }
            }
        }
    }
}
