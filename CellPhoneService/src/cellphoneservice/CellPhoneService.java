/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphoneservice;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CellPhoneService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn;
        int talkMin, txtSent, gigDataUsed, plan;
        char type;
        
        sn = new Scanner(System.in);
        talkMin = sn.nextInt();
        System.out.println("The amount of talked minutes you entered is: "+talkMin+"\n");
        txtSent = sn.nextInt();
        System.out.println("The amount of text messages sent you entered is: "+txtSent+"\n");
        gigDataUsed = sn.nextInt();
        System.out.println("The amount of gigabits of data used you entered is: "+gigDataUsed+"\n");
        if(isBetween(talkMin, 0, 499)){
            if(txtSent == 0 && gigDataUsed == 0){
                plan = 49;
                type = 'A';
            }else if(gigDataUsed > 0 && gigDataUsed < 2){
                plan = 79;
                type = 'E';
            }else if(gigDataUsed >= 2){
                plan = 87;
                type = 'F';
            }else{
                plan = 55;
                type = 'B';
            }
        }else{
            if(gigDataUsed == 0 && isBetween(txtSent, 0, 99)){
                plan = 61;
                type = 'C';
            }else if(gigDataUsed == 0){
                plan = 70;
                type = 'D';
            }else if(gigDataUsed >= 2){
                plan = 87;
                type = 'F';
            }
            else{
                plan = 55;
                type = 'B';
            }
        }
        
        System.out.println("Your plan is: $"+plan+" per month, and the type is: "+type);
    }
    
    
    
    public static Boolean isBetween(int x, int lower, int upper){
        return x <= upper && x >= lower;
    }
    
}
