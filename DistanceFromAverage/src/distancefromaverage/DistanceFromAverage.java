package distancefromaverage;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        double[] enteredValues = new double[20];
        double total = 0;
        double average = 0;
        final int QUIT = 99999;
        int i, x;
        Scanner scan = new Scanner(System.in);
        for(i = 0;i < enteredValues.length;++i){
            System.out.println("Please enter a number, "+QUIT+" to quit.");
            enteredValues[i] = scan.nextDouble();
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
