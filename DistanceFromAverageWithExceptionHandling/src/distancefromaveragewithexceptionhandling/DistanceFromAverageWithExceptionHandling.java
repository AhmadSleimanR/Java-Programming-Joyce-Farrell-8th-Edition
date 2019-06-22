package distancefromaveragewithexceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class DistanceFromAverageWithExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] enteredValues = null; // = new double[20];
        double total = 0;
        double average;
        final int QUIT = 99999;
        int i, x;
        Scanner scan = new Scanner(System.in);
        while(enteredValues == null){
            try{
            System.out.print("Please enter the array size: ");
            i = scan.nextInt();
            enteredValues = new double[i];
            }catch(InputMismatchException e){
                System.out.println("You need to enter a positive integer value");
                scan.nextLine();
            }catch(NumberFormatException e){
                System.out.println("The array must have an integer size");
                scan.nextLine();
            }catch(NegativeArraySizeException e){
                System.out.println("You cannot enter a negative integer value.");
                scan.nextLine();
            }
        }
        for(i = 0;i < enteredValues.length;++i){
            while(enteredValues[i] == 0){
                try{
                    System.out.println("Please enter a number, "+QUIT+" to quit.");
                    enteredValues[i] = scan.nextDouble();
                }catch(InputMismatchException e){
                    System.out.println("You must enter a rational number.");
                    scan.nextLine();
                }
            }
            if(enteredValues[i] == QUIT){
                --i;
                break;
            }else{
                total += enteredValues[i];
            }
        }
        if(i == 0)
            System.out.println("Error, no values entered.");
        else{
            average = total / (i + 1);
            System.out.println("The values are: ");
            for(x = 0;x < i;++x){
                System.out.println("the value is: "+enteredValues[x]+"\n"+
                        "And the distance from the average is: "+(Math.max(average, enteredValues[x]) - Math.min(average, enteredValues[x])));
            }
        }
    }
}
