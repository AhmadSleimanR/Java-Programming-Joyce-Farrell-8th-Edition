/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timedresponse2;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TimedResponse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LocalDateTime time1, time2;
        int seconds1, seconds2, difference;
        int minutes1, minutes2;
         // variables to hold minutes for the two times
        final int SECONDS_IN_MINUTE = 60;
         // constant to hold seconds in a minute
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        minutes1 = time1.getMinute();
         // get minutes from the first time
        JOptionPane.showConfirmDialog
         (null, "Is stealing ever justified? ");
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        minutes2 = time2.getMinute();
         // get minutes from the second time
        difference = seconds2  + SECONDS_IN_MINUTE * (minutes2 - minutes1) - seconds1;
        // new calculation
        // if minutes1 and inutes 2 are the same,
        //       then equation is just seconds2 - seconds1
        // but if minutes2 is a minte later, then 60 extra is added to seconds2
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 +
         "\nStart seconds: " + seconds1 +
        "\nIt took " + difference + " seconds for you to answer");
        
        System.out.println(time1);
    }
    
}
