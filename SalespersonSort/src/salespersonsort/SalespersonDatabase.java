package salespersonsort;
import java.util.Scanner;

public class SalespersonDatabase {
    public static void main(String[] args) {
        Salesperson[] salespeopleArray = new Salesperson[20];
        Scanner input = new Scanner(System.in);
        int a, enteredID, searchedID;
        int count = 0, amount = 0;
        final int MAX = 20;
        double enteredAmount;
        String entered;
        boolean doContinue;
        System.out.print("Do you wish to modify the database? type true or false: ");
        doContinue = input.nextBoolean();
        input.nextLine();
        while(count < MAX && doContinue){
            ++count;
            System.out.print("Do you wish to add, delete or change a record from the database? ");
            entered = input.nextLine();
            switch(entered.toUpperCase()){
                case "ADD":
                    if(amount < salespeopleArray.length){
                        for(a = 0;a < salespeopleArray.length;++a){
                            if(salespeopleArray[a] == null){
                                System.out.print("Enter the ID for salesperson #"+(a+1)+": ");
                                enteredID = input.nextInt();
                                input.nextLine();
                                System.out.print("Now, please enter the annual sales amount: ");
                                enteredAmount = input.nextDouble();
                                input.nextLine();
                                salespeopleArray[a] = new Salesperson(enteredID, enteredAmount);
                                ++amount;
                                break;
                            }
                        }
                    }else{
                        System.out.println("The database is already full, delete an try before you add a new one.");
                    }
                    display(salespeopleArray, amount);
                    break;
                case "DELETE":
                    if(amount != 0){
                        System.out.print("Enter the ID of the user you wish to delete: ");
                        enteredID = input.nextInt();
                        input.nextLine();
                        searchedID = searchID(salespeopleArray, enteredID);
                        if(searchedID >= 0){
                            salespeopleArray[searchedID] = null;
                            --amount;
                        }
                        else
                            System.out.println("There was no user found with such ID.");
                    }else{
                        System.out.println("There are no salespeople registered in the database.");
                    }
                    display(salespeopleArray, amount);
                    break;
                case "CHANGE":
                    if(amount != 0){
                        System.out.print("Enter the ID of the user you wish to change: ");
                        enteredID = input.nextInt();
                        input.nextLine();
                        searchedID = searchID(salespeopleArray, enteredID);
                        if(searchedID  >= 0){
                            System.out.print("The existing annual sales amount for the salesperson with the ID #"+enteredID+""
                                    + "\n is: "+salespeopleArray[searchedID].getAnnualSalesAmount()+" enter a new annual sales amount:");
                            enteredAmount = input.nextDouble();
                            input.nextLine();
                            salespeopleArray[searchedID].setAnnualSalesAmount(enteredAmount);
                        }else{
                            System.out.println("There was no user found with such ID.");
                        }
                        display(salespeopleArray, amount);
                    }else{
                        System.out.println("There are no salespeople registered in the database.");
                    }
                    break;
            }
            if(count < MAX){
                System.out.print("Do you wish to continue? type true or false: ");
                doContinue = input.nextBoolean();
                input.nextLine();
            }else{
                doContinue = false;
            }
        }
    }
    public static void display(Salesperson[] salespeopleArray, int amount){
        Salesperson[] tempArray = new Salesperson[amount];
        int a, b;
        Salesperson temp;
        boolean didFind;
        for(int i = 0;i< salespeopleArray.length;++i){
            if(salespeopleArray[i] != null){
                didFind = false;
                for(int j = 0;j < tempArray.length && !didFind;++j){
                    if(tempArray[j] == null){
                        didFind = true;
                        tempArray[j] = salespeopleArray[i];
                    }
                }
            }
        }
        a = 1;
        while(a < tempArray.length){
            temp = tempArray[a];
            b = a - 1;
            while(b >= 0 && tempArray[b].getId() > temp.getId()){
                tempArray[b + 1] = tempArray[b];
                --b;
            }
            tempArray[b+1] = temp;
            ++a;
        }
        System.out.println("The salesperson database contains these entries:");
        for(int x = 0;x < tempArray.length;++x)
            System.out.println("Salesperson #"+tempArray[x].getId()+
                    "'s annual sales amount is: "+tempArray[x].getAnnualSalesAmount());
        System.out.println("-------------------------------------------");
    }
    public static int searchID(Salesperson[] salespeopleArray, int ID){
        for(int x = 0;x < salespeopleArray.length;++x)
            if(salespeopleArray[x].getId() == ID)
                return x;
        return -1;
    }
}
