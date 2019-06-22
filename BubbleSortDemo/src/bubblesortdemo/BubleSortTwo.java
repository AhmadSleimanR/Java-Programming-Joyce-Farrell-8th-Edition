package bubblesortdemo;
import java.util.Scanner;

public class BubleSortTwo {
    public static void main(String[] args) {
        int[] integersArray = new int[5];
        int a, b, temp;
        Scanner keyboard = new Scanner(System.in);
        final int MAXSIZE = integersArray.length;
        final int SORTMAXSIZE = integersArray.length - 1;
        int changingSortTimes = SORTMAXSIZE;
        for(a = 0;a < MAXSIZE;++a){
            System.out.print("Please enter number "+(a+1)+" >>");
            integersArray[a] = keyboard.nextInt();
        }
        display(integersArray, 0);
        for(a = 0;a < SORTMAXSIZE;++a){
            for(b = 0;b < changingSortTimes;++b){
                if(integersArray[b] > integersArray[b+1]){
                    temp = integersArray[b];
                    integersArray[b] = integersArray[b+1];
                    integersArray[b+1] = temp;
                }
            }
            --changingSortTimes;
            display(integersArray, (a+1));
        }
    }
    
    public static void display(int[] integersArray, int a){
        System.out.print("Iteration "+a+": ");
        for(int x = 0;x < integersArray.length;++x)
            System.out.print(integersArray[x]);
        System.out.println();
    }
    
}
