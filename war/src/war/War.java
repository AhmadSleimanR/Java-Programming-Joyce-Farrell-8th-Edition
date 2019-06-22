/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

/**
 *
 * @author Usuario
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
         if(yourSuit > HIGH_SUIT)
           yourSuit = 1;
      }
        switch (mySuit) {
            case 1:
                myCard.setSuit('s');
                break;
            case 2:
                myCard.setSuit('h');
                break;
            case 3:
                myCard.setSuit('d');
                break;
            default:
                myCard.setSuit('c');
                break;
        }
        switch (yourSuit) {
            case 1:
                yourCard.setSuit('s');
                break;
            case 2:
                yourCard.setSuit('h');
                break;
            case 3:
                yourCard.setSuit('d');
                break;
            default:
                yourCard.setSuit('c');
                break;
        }
      System.out.println("My card is the " + myCard.getValue() +
            " of " + myCard.getSuit());
      System.out.println("Your card is the " + yourCard.getValue() +
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
