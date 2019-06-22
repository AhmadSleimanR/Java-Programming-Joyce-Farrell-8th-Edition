/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretphrase;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class SecretPhrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String phrase = "hangman";
        StringBuilder show = new StringBuilder("h**g***");
        int i, count = 0;
        char c;
        Scanner scan = new Scanner(System.in);
        System.out.println("The word is: "+show);
        while(!show.toString().equals(phrase)){
            ++count;
            System.out.println("Please enter a letter to try to guess: ");
            c = scan.nextLine().charAt(0);
            for(i = 0;i < phrase.length(); ++i){
                if(phrase.charAt(i) == c){
                    show.setCharAt(i, c);
                    System.out.println("Yay! the word is now: "+show);
                }
            }
        }
        System.out.println("Congratulations! you guessed the word, it just took you "+count+" turns");
    }
    
}
