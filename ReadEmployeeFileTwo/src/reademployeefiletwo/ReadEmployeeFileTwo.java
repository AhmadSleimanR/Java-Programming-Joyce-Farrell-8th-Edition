package reademployeefiletwo;

import java.nio.file.*;
import java.io.*;
/**
 *
 * @author lycan
 */
public class ReadEmployeeFileTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path file = Paths.get("E:\\testFiles\\text2.txt");
        String[] array = new String[3];
        String s;
        String delimiter = ",";
        int id;
        String name;
        double payRate;
        double gross;
        final double HRS_IN_WEEK = 40;
        double total = 0;
        try{
            InputStream input = new BufferedInputStream
        (Files.newInputStream(file));
            BufferedReader reader = new BufferedReader
        (new InputStreamReader(input));
            System.out.println();
            s = reader.readLine();
            while(s != null){
                array = s.split(delimiter);
                id = Integer.parseInt(array[0]);
                name = array[1];
                payRate = Double.parseDouble(array[2]);
                gross = payRate * HRS_IN_WEEK;
                System.out.println("ID#"+ id + " " +
                        name + " $"+ payRate + "  $"+gross);
                total += gross;
                s = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
        System.out.println("Total gross payroll is $"+total);
    }
    
}
