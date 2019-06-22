/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxreturnapplication;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class TaxReturnApplication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       TaxReturn tax;
        Scanner scan = new Scanner(System.in);
        int correct1 = 0, correct2 = 0, correct3 = 0, correct4 = 0;
        char c;
        String maritalStatus = "", socialSecurity = "", zipCode = "", name;
        int annualIncome = 0, i;
        System.out.println("Please input your name:");
        name = scan.nextLine();
        while(correct1 != 1 || correct2 != 5 || correct3 != 1 || correct4 != 1){
            correct1 = 0;
            correct2 = 0;
            correct3 = 0;
            correct4 = 0;
            System.out.println("Please input the social security number (for example: 999-99-9999):");
            socialSecurity = scan.nextLine();
            if(socialSecurity.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")){
                correct1 = 1;
            }
            System.out.println("Please input the zip code (five digits):");
            zipCode = scan.nextLine();
            if(zipCode.length() == 5){
                for(i = 0;i < 5;++i){
                    c = zipCode.charAt(i);
                    if(Character.isDigit(c))
                        correct2 += 1;
                }
            }
            System.out.println("Please input your marital status Now (Married or Single):");
            maritalStatus = scan.nextLine();
            c = Character.toUpperCase(maritalStatus.charAt(0));
            if(c == 'M' || c == 'S')
                correct3 += 1;
            System.out.println("Now, please input your annual income:");
            annualIncome = scan.nextInt();
            if(annualIncome >= 0)
                correct4 += 1;
            scan.nextLine();
        }
        tax = new TaxReturn(socialSecurity, name, Integer.parseInt(zipCode), annualIncome, maritalStatus);
        tax.displayData();
    }
    
}
