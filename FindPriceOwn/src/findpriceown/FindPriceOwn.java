/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findpriceown;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class FindPriceOwn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] references = {101, 102, 103, 104, 105, 110, 115, 120, 125, 130};
        double[] prices = {0.20, 0.25, 0.30, 0.35, 0.40, 0.50, 0.60, 0.70, 0.80, 1.00};
        int x;
        int entered;
        boolean validItem = false;
        entered = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the reference number for the \nproduct you want to know the price of:"));
        for(x = 0;x < references.length; ++x){
            if(references[x] == entered){
                validItem = true;
                JOptionPane.showMessageDialog(null, "Item number "+entered+"'s price is: $"+prices[x]);
            }
        }
        if(!validItem)
            JOptionPane.showMessageDialog(null, "No item found with such reference number.");
    }
    
}
