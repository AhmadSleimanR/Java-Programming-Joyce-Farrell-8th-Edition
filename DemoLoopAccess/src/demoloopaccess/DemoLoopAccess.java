package demoloopaccess;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
/**
 *
 * @author lycan
 */
public class DemoLoopAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("E:\\testFiles\\RandomRecords.txt");
        String s =  "000,       ,00.00" +
            System.getProperty("line.separator");
        String name;
        String delimiter = ",";
        String payRate;
        String idString;
        int id;
        FileChannel fc;
        final int RECSIZE = s.length();
        final String QUIT = "999";
        try{
            fc = (FileChannel) Files.newByteChannel(file, READ, WRITE);
            System.out.print("Please enter the value for the ID: ");
            idString = input.nextLine();
            while(!(idString.equals(QUIT))){
                id = Integer.parseInt(idString);
                System.out.print
        ("Enter the name for employee #"+idString+": ");
                name = input.nextLine();
                System.out.print
        ("Enter the pay rate of employee #"+idString+": ");
                payRate = input.nextLine();
                s = idString + delimiter + name + delimiter +
                payRate + System.getProperty("line.separator");
                byte[] data = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                fc.position(id * RECSIZE);
                fc.write(buffer);
                System.out.print("Please enter the value for the ID or "
                        +QUIT+" to quit: ");
                idString = input.nextLine();
            }
            fc.close();
        }catch(IOException e){
            System.out.println("Message; "+e);
        }
    }
    
}
