/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palidromepersonal;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class PalidromePersonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String phrase;
        boolean isPalidrome = true;
        int i, j, midPoint;
        char first, last;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a phrase to check if it is a palidrome!");
        phrase = scan.nextLine();
        midPoint = phrase.length() / 2;
        i = 0;
        j = phrase.length() - 1;
        while(i <= midPoint){
            first = phrase.charAt(i);
            last = phrase.charAt(j);
            if(!Character.isWhitespace(first) && !Character.isWhitespace(last)){
                if(first != last){
                    i = midPoint;
                    isPalidrome = false;
                }else{
                    ++i;
                    --j;
                }
            }else{
                if(Character.isWhitespace(first))
                    ++i;
                else
                    --j;
            }
        }
        
        System.out.println("Is "+phrase+"a palidrome? "+isPalidrome);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                }
}
