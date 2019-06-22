package dayofweek;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entered;
        Days enteredDays;
        System.out.print("Please enter the name of a day from which you want to know the business hours of: ");
        entered = input.nextLine().toUpperCase();
        enteredDays = Days.valueOf(entered);
        switch(enteredDays){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("The business hours are from 9 am to 9 pm.");
                break;
            case SATURDAY:
                System.out.println("The business hours are from 10 am to 6 pm.");
                break;
            case SUNDAY:
                System.out.println("The business hours are from 11 am to 5 pm.");
                break;
        }
    }
}
