package sortpurchasesarray;
// In the exercises in Chapter 6, you created a class named Purchase. Each Purchase
//contains an invoice number, amount of sale, amount of sales tax, and several

import java.util.Scanner;

//methods. Add get methods for the invoice number and sale amount fields so their
//values can be used in comparisons. Next, write a program that declares an array of
//five Purchase objects and prompt a user for their values. Then, in a loop that
//continues until a user inputs a sentinel value, ask the user whether the Purchase
//objects should be sorted and displayed in invoice number order or sale amount order.
//Save the file as SortPurchasesArray.java.
public class SortPurchasesArray {

    public static void main(String[] args) {
        Purchase[] purchasesArray = new Purchase[5];
        Scanner input = new Scanner(System.in);
        int i, option;
        final int QUIT = 0;
        for(i = 0;i < purchasesArray.length;++i){
            purchasesArray[i] = new Purchase();
            System.out.print("Enter the invoice number for Purchase #"+(i+1)
                    +": ");
            purchasesArray[i].setInvoiceNumber(input.nextInt());
            input.nextLine();
            System.out.print("Now, enter the sale amount for it: ");
            purchasesArray[i].setSaleAmount(input.nextDouble());
            input.nextLine();
        }
        System.out.print("Would you like to sort the purchases by invoice number(1)\n"
                + "Or by sale amount(2)? If you don't want either you can type 0: ");
        option = input.nextInt();
        input.nextLine();
        while(option != QUIT){
            display(purchasesArray, option);
            System.out.print("Would you like to sort the purchases by invoice number(1)\n"
                + "Or by sale amount(2)? If you don't want either you can type 0: ");
            option = input.nextInt();
            input.nextLine();
        }
        
    }
    
    public static void display(Purchase[] purchasesArray, int option){
        int a, b, x;
        Purchase temp;
        switch(option){
                case 1:
                    a = 1;
                    while(a < purchasesArray.length){
                        temp = purchasesArray[a];
                        b = a - 1;
                        while(b >= 0 &&
                        purchasesArray[b].getInvoiceNumber() > temp.getInvoiceNumber()){
                        purchasesArray[b+1] = purchasesArray[b];
                        --b;
                        }
                        purchasesArray[b+1] = temp;
                        ++a;
                    }
                    System.out.println("Here's the list sorted by invoice number:");
                    break;
                case 2:
                    a = 1;
                    while(a < purchasesArray.length){
                        temp = purchasesArray[a];
                        b = a - 1;
                        while(b >= 0 &&
                        purchasesArray[b].getSaleAmount()> temp.getSaleAmount()){
                        purchasesArray[b+1] = purchasesArray[b];
                        --b;
                        }
                        purchasesArray[b+1] = temp;
                        ++a;
                    }
                    System.out.println("Here's the list sorted by sales amount:");
                    break;
                default:
                    System.out.println("Invalid option, here's the list:");
                    break;
            }
        for(x = 0;x < purchasesArray.length;++x){
            System.out.println("Invoice number: "+purchasesArray[x].getInvoiceNumber()+"\n"+
                    "Sales amount: "+purchasesArray[x].getSaleAmount());
        }
    }
    
}
