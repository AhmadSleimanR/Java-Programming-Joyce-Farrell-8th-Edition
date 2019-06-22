/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trytoparsedouble;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class TryToParseDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double temp = 0;
        try{
            Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
            System.out.print("Enter a number: ");
            temp = Double.parseDouble(input.nextLine());
        }catch(IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            temp = 0;
        }finally{
            System.out.println("The number is: "+temp);
        }
    }
    
}
