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
public class War2 {

    public static void main(String[] args)
    {
       int myValue, mySuit;  
       int yourValue, yourSuit;
       final int HIGH = 13;
       final int LOW = 1;
       final int HIGH_SUIT = 4;
       Card myCard = new Card();
       Card yourCard = new Card();
       myValue = ((int)(Math.random() * 100) % HIGH + LOW);
       yourValue = ((int)(Math.random() * 100) % HIGH + LOW);
       myCard.setValue(myValue);
       yourCard.setValue(yourValue);
       mySuit = ((int)(Math.random() * 100) % HIGH_SUIT + LOW);
       yourSuit = ((int)(Math.random() * 100) % HIGH_SUIT + LOW);
       if(myValue == yourValue && mySuit == yourSuit)
       {
          yourSuit = yourSuit + 1;
          if(yourSuit > 4)
             yourSuit = 1;
       }
        switch (mySuit) {
            case 1:
                myCard.setSuit("Spades");
                break;
            case 2:
                myCard.setSuit("Hearts");
                break;
            case 3:
                myCard.setSuit("Diamonds");
                break;
            default:
                myCard.setSuit("Clubs");
                break;
        }
        switch (yourSuit) {
            case 1:
                yourCard.setSuit("Spades");
                break;
            case 2:
                yourCard.setSuit("Hearts");
                break;
            case 3:
                yourCard.setSuit("Diamonds");
                break;
            default:
                yourCard.setSuit("Clubs");
                break;
        }

       System.out.println("My card is the " + myCard.getRank() +
             " of " + myCard.getSuit());
       System.out.println("Your card is the " + yourCard.getRank() +
             " of " + yourCard.getSuit());
       if(myValue == yourValue)
           System.out.println("It's a tie");
       else
          if(myValue > yourValue)
            System.out.println("I win");
          else
            System.out.println("You win");
 }
    
}
