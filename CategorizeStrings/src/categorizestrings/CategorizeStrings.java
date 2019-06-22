package categorizestrings;
import java.util.Arrays;
import javax.swing.*;

public class CategorizeStrings {
    public static void main(String[] args) {
        String[] shortArray = new String[10];
        String[] longArray = new String[10];
        String entered;
        final String QUIT = "Quit";
        int i;
        int counterLong = 0;
        int counterShort = 0;
        entered = JOptionPane.showInputDialog(null, "Please enter your first word, or Quit to quit.");
        while((counterShort + counterLong) < 9 && !entered.equalsIgnoreCase(QUIT)){
            if(entered.length() <= 10){
                for(i = 0;i < shortArray.length;++i){
                    if(shortArray[i] == null){
                        shortArray[i] = entered;
                        ++counterShort;
                        break;
                    }
                }
            }else{
                for(i = 0;i < longArray.length;++i){
                    if(longArray[i] == null){
                        longArray[i] = entered;
                        ++counterLong;
                        break;
                    }
                }
            }
            entered = JOptionPane.showInputDialog(null, "Please enter another  word, or Quit to quit.");
        }
        if(counterShort == 0)
            JOptionPane.showMessageDialog(null, "There are no numbers below or equals 10.");
        else
            JOptionPane.showMessageDialog(null, Arrays.toString(Arrays.copyOf(shortArray,counterShort)));
        if(counterLong == 0)
            JOptionPane.showMessageDialog(null, "There are no numbers with more than 10 characters.");
        else
            JOptionPane.showMessageDialog(null, Arrays.toString(Arrays.copyOf(longArray,counterLong)));
    }
}
