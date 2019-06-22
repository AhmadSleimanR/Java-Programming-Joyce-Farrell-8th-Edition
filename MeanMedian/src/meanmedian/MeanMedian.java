package meanmedian;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        int[] valuesArray = new int[5];
        Scanner input = new Scanner(System.in);
        int i;
        for(i = 0;i < valuesArray.length;++i){
            System.out.print("Enter integer #"+(i+1)+" >");
            valuesArray[i] = input.nextInt();
        }
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
