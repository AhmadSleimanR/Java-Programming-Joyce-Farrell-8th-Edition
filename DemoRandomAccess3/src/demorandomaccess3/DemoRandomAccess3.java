/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorandomaccess3;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import static java.nio.file.StandardOpenOption.*;
/**
 *
 * @author lycan
 */
public class DemoRandomAccess3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path file = Paths.get("E:\\testFiles\\RandomRecords.txt");
        //It is 17 bytes + 2 from line.separator
        String employee = "002,Sleiman,15.25"+
                System.getProperty("line.separator");
        byte[] data = employee.getBytes();
        final int RECSIZE = employee.length();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        FileChannel fc;
        try{
            fc = (FileChannel) Files.newByteChannel(file, READ, WRITE);
            fc.position(2 * RECSIZE);
            fc.write(buffer);
            fc.close();
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
    
}
