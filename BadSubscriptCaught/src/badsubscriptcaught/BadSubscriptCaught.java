/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badsubscriptcaught;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class BadSubscriptCaught {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] arrayNames = {"Ahmad1", "Ahmad2", "Ahmad3", "Ahmad4", "Ahmad5",
        "Ahmad6", "Ahmad7","Ahmad8","Ahmad9","Ahmad10"};
        int temp;
        try{
            Process proc =  Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
            System.out.print("Enter a number for the subscript: ");
            temp = input.nextInt();
            System.out.println("The name is: "+arrayNames[temp]);
        }catch(IOException | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
