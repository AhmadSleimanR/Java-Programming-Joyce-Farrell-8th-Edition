/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenthousanddaysold;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Usuario
 */
public class TenThousandDaysOld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate date1;
        
        date1 = LocalDate.of(1995, Month.APRIL, 11);
        date1 = date1.plusDays(10000);
        System.out.println(date1);
        
    }
    
}
