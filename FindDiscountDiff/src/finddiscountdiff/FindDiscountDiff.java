/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddiscountdiff;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FindDiscountDiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    final int NUM_RANGES = 5;
    int[] discountRangeLimits = { 1, 13, 50, 100, 200};
    double[] discountRates = {0.00, 0.10, 0.14, 0.18, 0.20};
    double customerDiscount;
    String strNumOrdered;
    int numOrdered;
    int sub = NUM_RANGES - 1;
    strNumOrdered = JOptionPane.showInputDialog(null,
    "How many items are ordered?");
    numOrdered = Integer.parseInt(strNumOrdered);
    while(sub >= 0 && numOrdered < discountRangeLimits[sub])
        --sub;
    customerDiscount = discountRates[sub];
    JOptionPane.showMessageDialog(null, "Discount rate for " +
    numOrdered + " items is " + customerDiscount);
    }
    
}
