package certofdepositarray;

import java.time.LocalDate;
import java.util.Scanner;

public class CertOfDepositArray {
    public static void main(String[] args) {
        CertOfDeposit[] certArray = new CertOfDeposit[5];
        Scanner scan = new Scanner(System.in);
        int i;
        for(i = 0;i < certArray.length;++i){
            certArray[i] = new CertOfDeposit();
            System.out.println("Please enter the certificate number:");
            certArray[i].setCertNum(scan.nextLine());
            System.out.println("Now, please enter the last name:");
            certArray[i].setLastName(scan.nextLine());
            System.out.println("Now, please enter the balance");
            certArray[i].setBalance(scan.nextDouble());
            scan.nextLine();
            System.out.println("Now, please enter the issue date in a YYYY-MM-DD format");
            certArray[i].setIssueDate(LocalDate.parse(scan.nextLine()));
        }
        displayData(certArray);
    }
    public static void displayData(CertOfDeposit[] displayArray){
        for(int i = 0;i < displayArray.length;++i){
            System.out.println("The first certificate is: #"+displayArray[i].getCertNum()+"\n"+
                    "The Last name registered with it is: "+displayArray[i].getLastName()+"\n"+
                    "The balace of it is: $"+displayArray[i].getBalance()+"\n"+
                    "The issue date was: "+displayArray[i].getIssueDate()+"\n"+
                    "And the maturity date is: "+displayArray[i].getMaturityDate());
        }
    }
    
}
