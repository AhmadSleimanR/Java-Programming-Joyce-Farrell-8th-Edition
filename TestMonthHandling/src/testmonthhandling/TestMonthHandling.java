/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmonthhandling;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class TestMonthHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate date1, date2, now;
        now = LocalDate.now();
        date1 = LocalDate.of(now.getYear(), 1, 31);
        date2 = LocalDate.of(now.getYear(), 12, 31);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date1.plusMonths(1L));
        System.out.println(date2.plusMonths(1L));
        System.out.println(date1.plusMonths(2L));
        System.out.println(date2.plusMonths(2L));
        System.out.println(date1.plusMonths(3L));
        System.out.println(date2.plusMonths(3L));
    }
    
}
