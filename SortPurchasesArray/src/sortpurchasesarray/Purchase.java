/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortpurchasesarray;

/**
 *
 * @author Lycan
 */
public class Purchase
{
   private int invoiceNumber;
   private double saleAmount;
   private double tax;
   private static final double RATE = 0.05;

   public void setInvoiceNumber(int num)
   {
      invoiceNumber = num;
   }
   public void setSaleAmount(double amt)
   {
      saleAmount = amt;
      tax = saleAmount * RATE;
   }
   public double getSaleAmount()
   {
      return saleAmount;
   }
   public int getInvoiceNumber()
   {
      return invoiceNumber;
   }
   public void display()
   {
      System.out.println("Invoice #" + invoiceNumber +
         "  Amount of sale: $" + saleAmount + "  Tax: $" + tax);
   }
}
