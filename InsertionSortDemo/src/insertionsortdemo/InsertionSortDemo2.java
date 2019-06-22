/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortdemo;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class InsertionSortDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numsArray = new int[5];
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;
        for(a = 0;a < numsArray.length;++a){
            System.out.print("Enter number "+(a+1)+" >>");
            numsArray[a] = keyboard.nextInt();
        }
        display(numsArray, 0);
        a = 1;
        while(a < numsArray.length){
            temp = numsArray[a];
            b = a - 1;
            while(b >= 0 && numsArray[b] > temp){
                numsArray[b + 1] = numsArray[b];
                --b;
            }
            numsArray[b + 1] = temp;
            display(numsArray, a);
            ++a;
        }
    }
    
    public static void display(int[] numsArray, int a){
        System.out.print("Iteration "+a+": ");
        for(int x = 0;x < numsArray.length;++x)
            System.out.print(numsArray[x]+" ");
        System.out.println();
    }
    
}
