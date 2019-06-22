package twodimensionalarraydemo;

import java.util.Scanner;

public class TwoDimensionalArrayOwn1 {

    public static void main(String[] args) {
        int[][] demoArray = new int[3][3];
        final int QUIT = 99;
        int r, c, rows, columns;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row or "+QUIT+" to quit >");
        rows = input.nextInt();
        while(rows != QUIT){
            System.out.print("Enter a column >");
            columns = input.nextInt();
            if(rows < demoArray.length && columns < demoArray[rows].length)
                ++demoArray[rows][columns];
            else
                System.out.println("Invalid amount of columns");
            for(r = 0;r < demoArray.length;++r){
                for(c = 0;c < demoArray[r].length;++c)
                    System.out.print(demoArray[r][c]+" ");
                System.out.println();
            }
            System.out.print("Enter a row or "+QUIT+" to quit >");
            rows = input.nextInt();
        }
    }
}
