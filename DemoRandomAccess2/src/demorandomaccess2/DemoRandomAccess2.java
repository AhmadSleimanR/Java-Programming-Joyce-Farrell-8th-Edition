/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorandomaccess2;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
/**
 *
 * @author lycan
 */
public class DemoRandomAccess2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path file = Paths.get("E:\\testFiles\\RandomRecords.txt");
        String s = "000,       ,00.00"+System.getProperty("line.separator");
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        final int NUMRECS = 1000;
        try{
            OutputStream output = new BufferedOutputStream
        (Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter
        (new OutputStreamWriter(output));
            for(int i = 0;i < NUMRECS;++i)
                writer.write(s,0,s.length());
            writer.close();
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
    
}
