/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demooutputstream;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

/**
 *
 * @author lycan
 */
public class DemoOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path file = Paths.get("E:\\testFiles\\Test.txt");
        String s = "ABCDEFG";
        byte[] data = s.getBytes();
        OutputStream output;
        try{
            output = Files.newOutputStream(file, CREATE);
            output.write(data);
            output.flush();
            output.close();
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
        
    }
    
}
