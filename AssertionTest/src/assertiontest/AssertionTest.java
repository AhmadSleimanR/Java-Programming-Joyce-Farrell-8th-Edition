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
public class AssertionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number >> ");
        number = input.nextInt();
        if(isEven(number))
        System.out.println(number + " is even");
        else
        System.out.println(number + " is odd");
    }
    
    static boolean isEven(int number){
        boolean result;
        if(number % 2 == 1)
        result = false;
        else
        {
        result = true;
        //assert number % 2 == 0 : number + " % 2 is " + number % 2;
        assert number % 2 == 0 : number + " % 2 is " + number % 2;
        }
        return result;
    }
}
