package departments;
import java.util.Arrays;
import java.util.Scanner;

public class Departments {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        boolean didFind;
        boolean doContinue = true;
        String entered;
        String[][] departments = new String[20][2];
        final String QUIT = "Quit";
        for(a = 0;a < departments.length && doContinue;++a){
                System.out.print("Enter the name of department #"+(a+1)+": ");
                departments[a][0] = input.nextLine();
                System.out.print("Now, enter the department's supervisor's name: ");
                departments[a][1] = input.nextLine();
                if(a >= 4){
                    System.out.print("Do you wish to continue? ");
                    doContinue = input.nextBoolean();
                    input.nextLine();
                }
        }
       departments = Arrays.copyOf(departments, a);
       System.out.print("Enter a department name to see its supervisor: ");
       entered = input.nextLine();
       while(!entered.equalsIgnoreCase(QUIT)){
           didFind = false;
           for(a = 0;a < departments.length;++a){
               if(departments[a][0].equalsIgnoreCase(entered)){
                   System.out.println("Department's "+departments[a][0]+" supervisor is: "+departments[a][1]);
                   didFind = true;
               }
           }
           if(!didFind)
               System.out.println("There is no department with such name.");
           System.out.print("Enter a department name to see its supervisor:");
           entered = input.nextLine();
       }
    }
}
