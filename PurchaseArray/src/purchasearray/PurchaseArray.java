package purchasearray;
import java.util.Scanner;

public class PurchaseArray {
    public static void main(String[] args) {
    Purchase[] purchasesArray = new Purchase[5];
    Scanner scan = new Scanner(System.in);
    int i, invoiceNumber, salesAmount;
    for(i = 0;i < purchasesArray.length;++i){
        purchasesArray[i] = new Purchase();
        do{
            System.out.println("Please enter an invoice number:");
            invoiceNumber = scan.nextInt();
            scan.nextLine();
        }while(!(invoiceNumber >= 1000) || !(invoiceNumber <= 8000));
        purchasesArray[i].setInvoiceNumber(invoiceNumber);
        do{
            System.out.println("Please enter a sale amount:");
            salesAmount = scan.nextInt();
            scan.nextLine();
        }while(salesAmount < 0);
        purchasesArray[i].setSaleAmount(salesAmount);
    }
    for(i = 0;i < purchasesArray.length;++i)
        purchasesArray[i].display();
    }
}
