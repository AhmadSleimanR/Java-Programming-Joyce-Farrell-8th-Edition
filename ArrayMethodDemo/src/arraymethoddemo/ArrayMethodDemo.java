/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethoddemo;

/**
 *
 * @author Usuario
 */
public class ArrayMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbersArray = {10, 20, 30, 40, 55, 60, 70, 80, 90, 100};
        displayInt(numbersArray);
        displayReverse(numbersArray);
        displaySum(numbersArray);
        displayLess(numbersArray, 60);
        displayHigherAvg(numbersArray);
    }
    
    
    public static void displayInt(int[] array){
        int i;
        System.out.println("The numbers in regular order are:");
        for(i = 0;i < array.length;++i)
            System.out.print(array[i]+" ");
    }
    
    public static void displayReverse(int[] array){
        int i;
        System.out.println();
        System.out.println("The numbers in reverse order are:");
        for(i = array.length - 1;i >= 0;--i)
            System.out.print(array[i]+" ");
    }
    
    public static void displaySum(int[] array){
        int i, sum = 0;
        System.out.println();
        for(i = 0;i < array.length;++i)
            sum += array[i];
        System.out.print("The sum of the numbers is: "+sum);
    }
    
    public static void displayLess(int[] array, int limit){
        int i;
        System.out.println();
        System.out.println("The numbers which are below "+limit+" are:");
        for(i = 0;i < array.length;++i)
            if(array[i] < limit)
                System.out.print(array[i]+" ");
    }
    
    public static void displayHigherAvg(int[] array){
        int i;
        double avg = 0;
        System.out.println();
        System.out.println("The values which are higher than average are:");
        for(i = 0;i < array.length;++i)
            avg += array[i];
        avg /= array.length;
        for(i = 0;i < array.length;++i)
            if(array[i] > avg)
                System.out.print(array[i]+" ");
        System.out.println();
    }
    
}
