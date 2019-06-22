package useparty;
import java.util.Scanner;

public class UseDinnerParty2 {
    public static void main(String[] args) {
        int guests;
        int choice;
        DinnerParty2 aDinnerParty = new DinnerParty2();
        Party aParty = new Party();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        keyboard.nextLine();
        aParty.setGuests(guests);
        System.out.println("The party has "+aParty.getGuests()+" guests");
        aParty.displayInvitation();
        System.out.print("Enter the number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        keyboard.nextLine();
        aDinnerParty.setGuests(guests);
        System.out.print
        ("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        keyboard.nextLine();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner party has "+
                aDinnerParty.getGuests()+" guests");
        System.out.println("Menu option "+
                aDinnerParty.getDinnerChoice()+" will be served");
        aDinnerParty.displayInvitation();
        aDinnerParty.publicDisplay();
    }
}
