/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reademployeesrandomly;
import java.nio.file.*;
import java.nio.channels.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
/**
 *
 * @author lycan
 */
public class ReadEmployeesRandomly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("E:\\testFiles\\RandomRecords.txt");
        String s = "000,       ,00.00"+System.getProperty("line.separator");
        final int RECSIZE = s.length();
        String idString;
        int id;
        byte[] data = s.getBytes();
        ByteBuffer buffer;
        FileChannel fc;
        String name;
        final String QUIT = "999";
        try{
            fc = (FileChannel) Files.newByteChannel(file, READ, WRITE);
            System.out.print("Enter Employee ID number or "+QUIT+" to quit: ");
            idString = input.nextLine();
            while(!(idString.equals(QUIT))){
                id = Integer.parseInt(idString);
                buffer = ByteBuffer.wrap(data);
                fc.position(id * RECSIZE);
                fc.read(buffer);
                s = new String(data);
                System.out.print("ID #"+id+" "+s);
                System.out.print("Enter employee ID or"+QUIT+" to quit");
                idString = input.nextLine();
            }
            fc.close();
            
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
    
}
