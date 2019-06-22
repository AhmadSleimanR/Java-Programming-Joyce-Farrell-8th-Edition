/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddiscountown;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class FindDiscountOwn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_RANGES = 5;
        int[] amountArray = {1, 13, 20, 50, 100};
        double[] valueArray = {0.00, 0.10, 0.20, 0.30, 0.40};
        int amountEntered;
        double discount;
        amountEntered = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired amount you want to purchase"));
        int counter = NUM_RANGES - 1;
        while(counter >= 0 && amountArray[counter] > amountEntered)
            --counter;
        discount = valueArray[counter];
        JOptionPane.showMessageDialog(null, "The discount for "+amountEntered+" was of "+discount);
    }
    
}
