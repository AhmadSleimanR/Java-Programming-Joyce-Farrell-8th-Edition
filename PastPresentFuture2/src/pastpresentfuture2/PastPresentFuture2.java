/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastpresentfuture2;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Usuario
 */
public class PastPresentFuture2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LocalDate today = LocalDate.now();
         LocalDate insert;
        int mo, da, yr;
        int todayMo, todayDa, todayYr;
        Scanner input = new Scanner(System.in);
        todayMo = today.getMonthValue();
        todayDa = today.getDayOfMonth();
        todayYr = today.getYear();
        System.out.print("Enter a month >> ");
        mo = input.nextInt();
        System.out.print("Enter a day >> ");
        da = input.nextInt();
        System.out.print("Enter a year (four digits) >> ");
        yr = input.nextInt();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        insert = LocalDate.parse(da+"/"+mo+"/"+yr, formatter);
         System.out.println(insert);

        if(today.isBefore(insert))
           System.out.println("the inserted date is in the future");
        else
           if(today.equals(insert))
              System.out.println("the inserted date is today");
           else
              if(today.isAfter(insert))
                 System.out.println("the inserted date is in the past");
      }
    
}
