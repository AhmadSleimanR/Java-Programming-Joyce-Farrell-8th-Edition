package birthdayreminder;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;

public class BirthdayReminder {
    public static void main(String[] args) {
        String[] namesArray = new String[10];
        LocalDate[] birthdaysArray = new LocalDate[10];
        String enteredName, enteredBirthday;
        Scanner scan = new Scanner(System.in);
        int i;
        final String QUIT = "ZZZ";
        final int MAX = 10;
        int count = 0;
        int namesCount = 0;
        int birthdayCount = 0;
        boolean didFind;
        System.out.println("Please enter a name or ZZZ to quit:");
        enteredName = scan.nextLine();
        while(count < MAX && !enteredName.equalsIgnoreCase(QUIT)){
            namesArray[namesCount] = enteredName;
            ++namesCount;
            System.out.println("Now please enter the birthday for: "+enteredName);
            enteredBirthday = scan.nextLine();
            birthdaysArray[birthdayCount] = LocalDate.parse(enteredBirthday);
            ++birthdayCount;
            ++count;
            if(count < MAX){
                System.out.println("Please enter the next name or ZZZ to quit:");
                enteredName = scan.nextLine();
            }
        }
        namesArray = Arrays.copyOf(namesArray, namesCount);
        birthdaysArray = Arrays.copyOf(birthdaysArray, birthdayCount);
        System.out.println("Please enter a name to check their birthday or ZZZ to quit:");
        enteredName = scan.nextLine();
        while(!enteredName.equalsIgnoreCase(QUIT)){
            didFind = false;
            for(i = 0;i < namesArray.length;++i){
                if(namesArray[i].equalsIgnoreCase(enteredName)){
                    System.out.println("Name: "+namesArray[i]+"\n"+
                        "Birthday: "+birthdaysArray[i]);
                        didFind = true;
                        break;
                }
           }
        if(!didFind)
                System.out.println("The name entered is not in the list.");
        System.out.println("Please enter a new name to check their birthday or ZZZ to quit:");
        enteredName = scan.nextLine();
        }
     }
}
