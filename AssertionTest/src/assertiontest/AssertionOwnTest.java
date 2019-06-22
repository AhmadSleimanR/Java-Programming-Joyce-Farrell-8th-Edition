/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertiontest;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class AssertionOwnTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char test;
        System.out.print("Please enter the letter A: ");
        test = scan.nextLine().charAt(0);
        assert Character.toUpperCase(test) == 'A' : "The character entered was not A";
        System.out.println("The character entered was right!");
    }
    
}
