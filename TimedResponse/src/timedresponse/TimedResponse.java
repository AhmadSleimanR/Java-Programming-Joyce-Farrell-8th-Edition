/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timedresponse;
import javax.swing.JOptionPane;
import java.time.*;

/**
 *
 * @author Usuario
 */
public class TimedResponse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime time1, time2;
        int seconds1, seconds2, difference;
        
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        JOptionPane.showConfirmDialog(null, "Is stealing ever justified?");
        
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null, "End seconds: "+seconds2+"\nStart seconds: "+seconds1+"\nIt took "+difference+" seconds for you to answer");
        
    }
    
}
