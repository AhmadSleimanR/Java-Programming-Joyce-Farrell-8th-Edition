/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, fact = 1, number;
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        System.out.println("The numbers are:");
        for(i = 1;i <= number;++i){
            System.out.println(i);
            fact *= i;
        }
        System.out.println("And the factorial is: "+fact);
    }
    
}
