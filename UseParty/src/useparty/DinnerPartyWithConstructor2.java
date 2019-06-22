/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useparty;

/**
 *
 * @author Lycan
 */
public class DinnerPartyWithConstructor2 extends PartyWithConstructor2{
    private int dinnerChoice;
    public DinnerPartyWithConstructor2(int numGuests){
        super(numGuests);
    }
    public int getDinnerChoice() {
        return dinnerChoice;
    }

    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }
    @Override
    public void displayInvitation(){
        System.out.println("Please come to my dinner party!");
    }
}