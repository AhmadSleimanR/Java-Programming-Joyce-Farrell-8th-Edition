/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwordsextra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CountWordsExtra {

public static void main(String[] args)
  {
     String str;
      Scanner in = new Scanner(System.in);
     char ch;
     int x;
     int count = 0;
     int length;
     boolean previousCharWasPunc = false;
     System.out.print("Enter a string >> ");
     str = in.nextLine();
     length = str.length();
     for(x = 0; x < length; x++)
     {
        ch = str.charAt(x);
        if(ch == ' ' || ch == '.' || ch == ';' || ch == ',' ||
           ch == '!' || ch == '-')
        {
           ++count;
           if(previousCharWasPunc)
              --count;
           previousCharWasPunc = true;
        }
        else
           previousCharWasPunc = false;
     }
     if(!previousCharWasPunc)
        ++count;
        
     System.out.println("There are " + count + " words in the string");
}
    
}
