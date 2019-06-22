package fulldeck;
public class Card
{
   private Suit suit;
   private int value;
   private String rank;
   final int HIGH_VAL = 13;
   final int LOW_VAL = 1;
   final int HIGH = 4;
   public Suit getSuit()
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
   public void setSuit(Suit s)
   {
       suit = s;
   }
   public void setValue(int v)
   {
      if(v >= LOW_VAL && v <= HIGH_VAL)
         value = v;
      else
         value = LOW_VAL;
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