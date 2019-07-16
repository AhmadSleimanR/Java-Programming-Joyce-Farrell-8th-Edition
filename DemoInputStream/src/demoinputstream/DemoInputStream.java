/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoinputstream;

import java.nio.file.*;
import java.io.*;

/**
 *
 * @author lycan
 */
public class DemoInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path path = Paths.get("E:\\testFiles\\Test.txt");
        InputStream input;
        try{
            input = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader
        (new InputStreamReader(input));
            String s;
            s = reader.readLine();
            /**
             * while(s = reader.readLine() != null)
             *   System.out.println(s);
             * can be used to read multiple lines.
             **/
            System.out.println(s);
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
