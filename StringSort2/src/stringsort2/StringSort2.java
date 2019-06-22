package stringsort2;
import java.util.Arrays;
import java.util.Scanner;

public class StringSort2 {
    public static void main(String[] args) {
        String[] stringsArray = new String[20];
        Scanner input = new Scanner(System.in);
        final String QUIT = "zzz";
        int a, b;
        int counter = 0, counterWords = 0;
        String entered, temp;
        boolean didInsert = false;
        System.out.print("Enter a string >");
        entered = input.nextLine();
        while(!entered.equalsIgnoreCase(QUIT) && counter < stringsArray.length){
            ++counter;
            for(a = 0;a < stringsArray.length && !didInsert;++a){
                if(stringsArray[a] == null){
                    stringsArray[a] = entered;
                    didInsert = true;
                    ++counterWords;
                }
            }
            if(counter < stringsArray.length){
                System.out.print("Enter a string >");
                entered = input.nextLine();
            }
            didInsert = false;
        }
        stringsArray = Arrays.copyOf(stringsArray, counterWords);
        display(stringsArray, 0);
        a = 1;
        while(a < stringsArray.length){
            temp = stringsArray[a];
            b = a - 1;
            while(b >= 0 && stringsArray[b].compareTo(temp) > 0){
                stringsArray[b + 1] = stringsArray[b];
                --b;
            }
            stringsArray[b+1] = temp;
            display(stringsArray,a);
            ++a;
        }
    }
    
    public static void display(String[] stringsArray, int iterations){
        System.out.println("Iteration #"+iterations+":");
        for(int i = 0;i < stringsArray.length;++i)
            System.out.print(stringsArray[i]+" ");
        System.out.println();
    }
}
