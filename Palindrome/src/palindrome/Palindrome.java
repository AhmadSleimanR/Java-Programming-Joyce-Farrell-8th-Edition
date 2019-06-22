/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String phrase;
      String message;
      int i, j, midPoint;
      char first, last;
      boolean isPalindrome = true;
      phrase = JOptionPane.showInputDialog(null, "Enter a string");
      int stringLength = phrase.length();
    
      midPoint = stringLength / 2;
      i = stringLength - 1;
      j = 0;
      while(j <= midPoint)
      {
         first = Character.toLowerCase(phrase.charAt(j));
         last = Character.toLowerCase(phrase.charAt(i));
         if(first != ' ' && last != ' ')
         {
            if(first != last)
            {
               isPalindrome = false;
               j = midPoint;
            }
            --i;
            ++j;
         }
        else
           if(first == ' ')
              ++j;
           else
              --i;
      }
      if(isPalindrome)
          message = "You entered a plaindrome";
      else
          message = "You did not enter a palindrome";   
      JOptionPane.showMessageDialog(null, message);
    }
}
   
