package demoreadsequentialdatafiles;

import java.nio.file.*;
import java.io.*;
/**
 *
 * @author lycan
 */
public class DemoReadSequentialDataFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("E:\\testFiles\\test2.txt");
        String s;
        try{
            InputStream input = new BufferedInputStream
        (Files.newInputStream(path));
            BufferedReader reader = new BufferedReader
        (new InputStreamReader(input));
            s = reader.readLine();
            while(s != null){
                System.out.println(s);
                s = reader.readLine();
            }
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
    
}
