package stringsort;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        String[] stringsArray = new String[5];
        Scanner input = new Scanner(System.in);
        int a, b;
        String temp;
        final int MAXITERATIONS = stringsArray.length - 1;
        int comparisonsIterations = MAXITERATIONS;
        for(a = 0;a < stringsArray.length;++a){
            System.out.print("Enter string #"+(a+1)+" >");
            stringsArray[a] = input.nextLine();
        }
        display(stringsArray, 0);
        for(a = 0;a < MAXITERATIONS;++a){
            for(b = 0;b < comparisonsIterations;++b){
                if(stringsArray[b].compareTo(stringsArray[b+1]) > 0){
                    temp = stringsArray[b];
                    stringsArray[b] = stringsArray[b+1];
                    stringsArray[b+1] = temp;
                }
            }
            display(stringsArray, (a+1));
            --comparisonsIterations;
        }
    }
    
    public static void display(String[] stringsArray, int iterations){
        System.out.println("Iteration #"+iterations+":");
        for(int x = 0;x < stringsArray.length;++x)
            System.out.print(stringsArray[x]+" ");
        System.out.println();
    }
    
}
