package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class Ejercicio03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrixNum = new int[4][4];
        Scanner keyboard = new Scanner(System.in);
        boolean didComplete = false;
        int i, j, row, column, choice, temp = 0;
        double avg = 0;
        final int ENTER = 1, SUM_ROW = 2, SUM_COLUMN = 3, SUM_DIAG_MAIN = 4,
                SUM_DIAG_SEC = 5, AVERAGE = 6, END = 7;
        display();
        choice = keyboard.nextInt();
        while(choice != 1 && choice != 7){
            display();
            choice = keyboard.nextInt();
        }
        keyboard.nextLine();
        while(!didComplete){
            showMatrix(matrixNum);
            switch(choice){
                case ENTER:
                    System.out.println("Enter the row value");
                    row = keyboard.nextInt();
                    while(!(row >= 0 && row < 4)){
                        System.out.println("The value must be between 0 and 4\n"
                                + "Please enter the row value");
                        row = keyboard.nextInt();
                    }
                    System.out.println("Enter the column value");
                    column = keyboard.nextInt();
                    while(!(column >= 0 && column < 4)){
                        System.out.println("The value must be between 0 and 4\n"
                                + "Please enter the column value");
                        column = keyboard.nextInt();
                    }
                    System.out.println("Now, enter the value");
                    matrixNum[row][column] = keyboard.nextInt();
                    break;
                case SUM_ROW:
                    System.out.println("Enter the row you want summed");
                    row = keyboard.nextInt();
                    while(!(row >= 0 && row < 4)){
                        System.out.println("The value must be between 0 and 4\n"
                                + "Please enter the row value");
                        row = keyboard.nextInt();
                    }
                    for(i = 0;i < 4;++i)
                        temp += matrixNum[row][i];
                    System.out.println("The sum of the entire row is: "+temp);
                    break;
                case SUM_COLUMN:
                    System.out.println("Enter the column you want summed");
                    column = keyboard.nextInt();
                    while(!(column >= 0 && column < 4)){
                        System.out.println("The value must be between 0 and 4\n"
                                + "Please enter the column value");
                        column = keyboard.nextInt();
                    }
                    for(i = 0;i < 4;++i)
                        temp += matrixNum[i][column];
                    System.out.println("The sum of the entire column is: "+temp);
                    break;
                case SUM_DIAG_MAIN:
                    for(i = 0;i < 4;++i)
                        temp += matrixNum[i][i];
                    System.out.println("The sum of the main diagonal is: "+temp);
                    break;
                case SUM_DIAG_SEC:
                    for(i = 0;i < 4;++i)
                        temp += matrixNum[i][(matrixNum[i].length - 1) - i];
                    System.out.println("The sum of the secondary diagonal"
                            + " is: "+temp);
                    break;
                case AVERAGE:
                    for(i = 0;i < 4;++i)
                        for(j = 0;j < 4;++j)
                            avg += matrixNum[i][j];
                    avg /= 16;
                    System.out.println("The average value of the matrix"
                            + " is of: "+avg);
                    break;
                case END:
                    didComplete = !didComplete;
                    break;
            }
            if(!didComplete){
                display();
                choice = keyboard.nextInt();
                if((choice != 1 && choice != 7) && !verifyComplete(matrixNum)){
                    System.out.println("Error, the matrix is not complete, "
                            + "you are only able to choose the first option,"
                            + "defaulting it to 1...");
                    choice = 1;
                    temp = 0;
                    avg = 0;
                }
            }
        }
        System.out.println("User has chosen to terminate.");
    }
    public static boolean verifyComplete(int[][] matrixNum){
        int i, j;
        for(i = 0;i < 4;++i)
            for(j = 0;j < 4;++j)
                if(matrixNum[i][j] == '\u0000')
                    return false;
        return true;
    }
    public static void display(){
        System.out.println("Please type one of these numbers (note that"
            + " for any option other than 1 and 7 all of "
            + "the matrix must have values):\n"
            + "1: Allows you to enter a value for the 4x4 matrix\n"
            + "2: Gets the sum of a row that you enter\n"
            + "3: Gets the sum of a column that you enter\n"
            + "4: Gets the sum of the main diagonal\n"
            + "5: Gets the sum of the secondary diagonal\n"
            + "6: Returns the average for all the values\n"
            + "7: Ends the program");
    }
    
    public static void showMatrix(int[][] matrixNum){
        int i, j;
        System.out.println("Currently the matrix is: ");
            for(i = 0;i < 4;++i){
                for(j = 0;j < 4;++j){
                    System.out.print(matrixNum[i][j]+" ");
                }
            System.out.println();
            }
    }
    
}
