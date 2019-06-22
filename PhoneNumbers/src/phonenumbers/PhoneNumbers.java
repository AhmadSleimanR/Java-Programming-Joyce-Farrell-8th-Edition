package phonenumbers;

//A personal phone directory contains room for first names and phone numbers for

import java.util.Scanner;

public class PhoneNumbers {
    
    public static void main(String[] args) {
        String[] namesArray = new String[30];
        int[] phonesArray = new int[30];
        final int MAX = 10;
        final String QUIT = "Quit";
        String enteredName;
        Scanner scan = new Scanner(System.in);
        int i, enteredPhone;
        int count = 0;
        int namesCount = 0;
        boolean didFind;
        
        System.out.println("Please enter the name for the first person:");
        enteredName = scan.nextLine();
        System.out.println("Now, please enter the phone number for "+enteredName+":");
        enteredPhone = scan.nextInt();
        scan.nextLine();
        while(count < MAX){
            namesArray[count] = enteredName;
            ++namesCount;
            phonesArray[count] = enteredPhone;
            ++count;
            if(count < MAX){
            System.out.println("Please enter the name for the next person:");
            enteredName = scan.nextLine();
            System.out.println("Now, please enter the phone number for "+enteredName+":");
            enteredPhone = scan.nextInt();
            scan.nextLine();
            } 
        }
        System.out.println("Please enter a name that you want to see the phone number from:");
        enteredName = scan.nextLine();
        while(namesCount < 30 && !enteredName.equalsIgnoreCase(QUIT)){
            didFind = false;
            for(i = 0;i < namesArray.length;++i){
                if(namesArray[i] != null && namesArray[i].equalsIgnoreCase(enteredName)){
                    didFind = true;
                    System.out.println("The phone number for "+namesArray[i]+" is:\n"+
                            phonesArray[i]);
                }
            }
            if(!didFind && namesCount < 30){
                for(i = 0;i < namesArray.length;++i){
                    if(namesArray[i] == null){
                        namesArray[i] = enteredName;
                        System.out.println("Please enter a phone number for "+enteredName);
                        enteredPhone = scan.nextInt();
                        phonesArray[i] = enteredPhone;
                        scan.nextLine();
                    }
                }
            }else if(!didFind && namesCount >= 30){
                System.out.println("Sorry "+enteredName+" does not have a phone registered, the entries are full\n"+
                        "So we can't allow you to add new ones either.");
            }
            if(namesCount < 30){
            System.out.println("Please enter a name that you want to see the phone number from:");
            enteredName = scan.nextLine();
            }
        }
    }
    
}
