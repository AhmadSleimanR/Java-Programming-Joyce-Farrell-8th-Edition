/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageofquizzespersonal;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class AverageOfQuizzesPersonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] scores = new int[10];
        int score;
        int total = 0;
        int count = 0;
        final int MAX = 10;
        final int QUIT = 999;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a quiz score, you can also enter "+QUIT+"\n"+
                "to quit.");
        score = scan.nextInt();
        while(score != QUIT){
            scores[count] = score;
            total += scores[count];
            ++count;
            if(count == MAX){
                score = QUIT;
                System.out.println("The number of scores have reached "+MAX+"\n"+"we are now generating your average.");
            }
            else{
            System.out.println("Next, please enter another quiz score... or "+QUIT+"\n"+
            "to quit.");
            score = scan.nextInt();
            }
        }
        if(count != 0){
            System.out.println("Your average was of: "+(total * 1.0 / count));
        }
        else
            System.out.println("No scores entered.");
    }
    
}
