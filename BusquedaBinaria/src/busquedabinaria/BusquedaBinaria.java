package busquedabinaria;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] baseArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean find = false;
        int counter = 0, number, currentPosition = baseArray.length / 2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 10 to find it in the array: ");
        number = keyboard.nextInt();
        while(!find){
            ++counter;
            if(baseArray[currentPosition] == number)
                find = true;
            else{
                if(baseArray[currentPosition] < number)
                    currentPosition = currentPosition + baseArray.length / 2; 
                else
                    currentPosition = currentPosition / 2;
                }
        }
        System.out.println("The amount of loops it took were: "+ counter +
                ", and the position of the element is: baseArray["+currentPosition+
                "] (which is: "+baseArray[currentPosition]+")");
    }
}
