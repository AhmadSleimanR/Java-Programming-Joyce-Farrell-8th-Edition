/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorandomaccessfile;

import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import static java.nio.file.StandardOpenOption.*;
/**
 *
 * @author lycan
 */
public class DemoRandomAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("E:\\testFiles\\Numbers.txt");
        FileChannel fc;
        byte[] data;
        String s = "XYZ";
        data = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);
        try{
            fc = (FileChannel)Files.newByteChannel(path, READ, WRITE);
            fc.position(0);
            while(out.hasRemaining())
                fc.write(out);
            out.rewind();
            fc.position(22);
            while(out.hasRemaining())
                fc.write(out);
            out.rewind();
            fc.position(12);
            while(out.hasRemaining())
                fc.write(out);
            fc.close();
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
    
}
