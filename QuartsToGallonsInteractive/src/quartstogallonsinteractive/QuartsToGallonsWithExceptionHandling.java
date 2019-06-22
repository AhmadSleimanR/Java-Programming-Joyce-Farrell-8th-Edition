package quartstogallonsinteractive;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class QuartsToGallonsWithExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*I'm ignoring the chapter 2 requirements 
        for quartz and just doing the try/catch assignment*/
        Scanner input = new Scanner(System.in);
        double quartz = 0;
        boolean didConvert = false;
        try{
            Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        while(!didConvert){
            try{
                System.out.print("Please enter the amount of quartz: ");
                quartz = Double.parseDouble(input.nextLine());
                didConvert = !didConvert;
            }catch(NumberFormatException e){
                System.out.println("Invalid data entry.");
            }
        }
        System.out.println("The amount of gallons is: "+(quartz / 4));
    }
    
}
