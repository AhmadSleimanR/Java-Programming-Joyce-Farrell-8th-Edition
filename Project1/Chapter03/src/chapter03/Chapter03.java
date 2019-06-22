/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Chapter03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfEggs = 0;
        ArrayList<Integer> returnedArray = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your number of eggs");
        numberOfEggs = scan.nextInt();
        returnedArray = returnEggs(numberOfEggs);
        System.out.println("The amount of dozens you have is: "+returnedArray.get(0)+"\n"+"And the remainder is: "+returnedArray.get(1));
        
    }
    
    public static ArrayList<Integer> returnEggs(int eggs){
        ArrayList<Integer> returnedArray = new ArrayList<Integer>();
        
        returnedArray.add(eggs / 12);
        returnedArray.add(eggs % 12);
        return returnedArray;
    }
    
}
