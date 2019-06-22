/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanmedian;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class MeanMedian2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valuesArray = new int[20];
        Scanner input = new Scanner(System.in);
        int i, count = 0, entered;
        boolean didEnter;
        System.out.print("Enter an integer >");
        entered = input.nextInt();
        input.nextLine();
        while(count < valuesArray.length && entered != 999){
            didEnter = false;
            for(i = 0;i < valuesArray.length && !didEnter;++i){
                if(valuesArray[i] == 0){
                    valuesArray[count] = entered;
                    didEnter = true;
                }
            }
            ++count;
            if(count < valuesArray.length){
                System.out.print("Enter an integer >");
                entered = input.nextInt();
                input.nextLine();
            }
        }
        valuesArray = Arrays.copyOf(valuesArray, count);
        System.out.println("Here we have the values:");
        display(valuesArray);
        System.out.println("Here we have the median:");
        displayMedian(valuesArray);
        System.out.println("And here we have the mean:");
        displayMean(valuesArray);
        
    }
    public static void display(int[] valuesArray){
        System.out.println("The stored unsorted values are:");
        for(int x = 0;x < valuesArray.length;++x)
            System.out.print(valuesArray[x]+" ");
        System.out.println();
    }
    
    public static void displayMedian(int[] valuesArray){
        int[] localArray = valuesArray;
        double median;
        Arrays.sort(localArray);
        if(localArray.length % 2 == 0)
            median = ((double)valuesArray[valuesArray.length / 2] + (double)valuesArray[valuesArray.length / 2 - 1]) / 2;
        else{
            median = valuesArray[localArray.length / 2];
        }
        System.out.println("The median is: "+median);
    }
    
    public static void displayMean(int[] valuesArray){
        int x;
        double sum = 0;
        for(x = 0;x < valuesArray.length;++x)
            sum += valuesArray[x];
        System.out.println("The mean is: "+(sum / x));
    }
    
}
