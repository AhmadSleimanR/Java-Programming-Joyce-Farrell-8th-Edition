package demosequentialdatafiles;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
/**
 *
 * @author lycan
 */
public class DemoSequentialDataFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Path file = Paths.get("E:\\testFiles\\test2.txt");
        String s;
        String delimiter = ",";
        int id;
        String name;
        double payRate;
        final int QUIT = 999;
        try{
            OutputStream output = 
                    new BufferedOutputStream
        (Files.newOutputStream(file, CREATE));
            BufferedWriter writer = 
                    new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Enter employee ID: ");
            id = scan.nextInt();
            while(id != QUIT){
                System.out.print("Enter name for employee id #"+id+": ");
                scan.nextLine();
                name = scan.nextLine();
                System.out.print("Enter payRate: ");
                payRate = scan.nextDouble();
                s = id+delimiter+name+delimiter+payRate;
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.print("Enter id number or "+QUIT+" to quit: ");
                id = scan.nextInt();
            }
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
