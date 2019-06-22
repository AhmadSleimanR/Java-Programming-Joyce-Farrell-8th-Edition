/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war2;

/**
 *
 * @author Usuario
 */
public class Card {
    private String suit;
   private int value;
   private String rank;
   public String getSuit()
   {
      return suit;
   }
   public int getValue()
   {
      return value;
   }
   public String getRank()
   {
      return rank;
   }
   public void setSuit(String s)
   {
      suit = s;
   }
   public void setValue(int v)
   {
      final int LOW = 1;
      final int HIGH = 13;
      if(v >= LOW && v <= HIGH)
         value = v;
       else
         value = LOW;
        switch (value) {
            case 1:
                rank = "Ace";
                break;
            case 11:
                rank ="Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            default:
                rank = Integer.toString(value);
                break;
        }
    } 
}
