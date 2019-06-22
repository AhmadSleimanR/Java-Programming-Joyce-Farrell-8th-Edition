/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daystilnextmonth;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class DaysTilNextMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate date1;
        int days1, days2, result;
        date1 = LocalDate.now();
        days1 = date1.lengthOfMonth();
        days2 = date1.getDayOfMonth();
        result = days1 - days2;
        System.out.println(result);
    }
    
}
