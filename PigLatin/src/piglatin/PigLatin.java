/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entered;
        Scanner scan = new Scanner(System.in);
        char c;
        int count = 0, size= 0;
        boolean status = true;
        System.out.print("Please enter your word>>");
        entered = scan.nextLine();
        System.out.println("Your entered word was: "+entered);
        System.out.println("Entered length: "+entered.length());
        for(int i = 0;i < entered.length() && status == true;++i){
            c = entered.charAt(0);
            size = entered.length();
            if(count == 0 && check(c)){
                    entered = entered.substring(1, size);
                    entered += c;
                    System.out.println("Detected that the first letter contained a consonant it is now: "+entered);
                    ++count;
            }else if(checkY(c)){
                 entered = entered.substring(1, size);
                 entered += c;
                 System.out.println("Detected that the next letter contained a consonant it is now: "+entered);
            }else{
                status = false;
            }
        }
       entered += "ay";
       System.out.println("Added ay: "+entered);
        
        System.out.println("The pig latin version is: "+entered);
    }
    
    static boolean check(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
    
        static boolean checkY(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y';
    }
    
}
