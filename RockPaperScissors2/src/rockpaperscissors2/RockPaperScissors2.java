package rockpaperscissors2;
import java.util.*;

public class RockPaperScissors2 {
    enum RPS {
        ROCK, PAPER, SCISSORS
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String enteredString, choiceString = "";
        int count = 0, count2, pwon = 0, cwon = 0, tgames = 0;
        RPS choice = RPS.ROCK, autogenerate;
        char c;
        while(count < 10){
            ++count;
            count2 = 0;
            while(count2 < 2){
                choiceString = "";
                count2 = 0;
                System.out.println("Please enter a choice between Rock, Paper and Scissors:");
                enteredString = scan.nextLine();
                c = Character.toUpperCase(enteredString.charAt(0));
                 switch(c){
                   case 'R':
                     ++count2;
                     choiceString += c;
                     c = Character.toUpperCase(enteredString.charAt(1));
                     if(c == 'O'){
                         ++count2;
                         choiceString += c;
                     }
                     break;
                   case 'P':
                       ++count2;
                       choiceString += c;
                     c = Character.toUpperCase(enteredString.charAt(1));
                     if(c == 'A'){
                         ++count2;
                         choiceString += c;
                     }
                     break;
                   case 'S':
                       ++count2;
                       choiceString += c;
                     c = Character.toUpperCase(enteredString.charAt(1));
                     if(c == 'C'){
                         ++count2;
                         choiceString += c;
                     }
                      break;
                   default:
                       break;
                 }
            }
            switch(choiceString){
                case "RO":
                    choice = RPS.ROCK;
                    break;
                case "PA":
                    choice = RPS.PAPER;
                    break;
                case "SC":
                    choice = RPS.SCISSORS;
                    break;
            }
            autogenerate = RPS.values()[(int)(Math.random() * 3)];
            
            switch(choice){
                case ROCK:
                    switch(autogenerate){
                        case ROCK:
                            ++tgames;
                            System.out.println("The result of game "+count+" was a tie (Rock vs Rock)");
                            break;
                        case PAPER:
                            ++cwon;
                            System.out.println("The result of game "+count+" was that the computer won (Rock vs Paper)");
                            break;
                        case SCISSORS:
                            ++pwon;
                            System.out.println("The result of game "+count+" was that the player won (Rock vs Scissors)");
                            break;
                    }
                    break;
                case PAPER:
                    switch(autogenerate){
                        case ROCK:
                            ++pwon;
                            System.out.println("The result of game "+count+" was that the player won (Paper vs Rock)");
                            break;
                        case PAPER:
                            ++tgames;
                            System.out.println("The result of game "+count+" was a tie (Paper vs Paper)");
                            break;
                        case SCISSORS:
                            ++cwon;
                            System.out.println("The result of game "+count+" was that the computer won (Paper vs Scissors)");
                            break;
                    }
                    break;
                case SCISSORS:
                    switch(autogenerate){
                        case ROCK:
                            ++cwon;
                            System.out.println("The result of game "+count+" was that the computer won (Scissors vs Rock)");
                            break;
                        case PAPER:
                            ++pwon;
                            System.out.println("The result of game "+count+" was that the player won (Scissors vs Paper)");
                            break;
                        case SCISSORS:
                            ++tgames;
                            System.out.println("The result of game "+count+" was a tie");
                            break;
                    }
                    break;
            }
            System.out.println("Count is: "+count);
        }
        System.out.println("In total, the amount of games won by the player was of:"+"\n"+
                pwon+"\n"+
                "The amount of games won by the computer was of:"+"\n"+
                cwon+"\n"+
                "And the amount of tied games was of: "+tgames);
    }
}
