/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teammembers;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class TeamMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numOfMembers;
        final int NUM_OF_TEAMS;
        Team[] teams;
        String teamName, name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert the desired amount of teams: ");
        NUM_OF_TEAMS = scan.nextInt();
        System.out.println("The amount entered was: "+ NUM_OF_TEAMS);
        teams = new Team[NUM_OF_TEAMS];
        scan.nextLine();
        for(int i = 0;i < NUM_OF_TEAMS; ++i){
            teams[i] = new Team();
            System.out.println("Enter the team's name: ");
            teamName = scan.nextLine();
            teams[i].setTeamName(teamName);
            System.out.println("The entered team name was: "+teams[i].getTeamName());
            System.out.println("Now enter the desired amount of members of team "+teams[i].getTeamName()+": ");
            numOfMembers = scan.nextInt();
            System.out.println("The amount entered was: "+numOfMembers);
            scan.nextLine();
            teams[i].setAmount(numOfMembers);
            for(int j = 0;j < numOfMembers;++j){
                System.out.println("Please enter the name of the member: ");
                name = scan.nextLine();
                teams[i].setNames(j, name);
                System.out.println("The name entered was: "+teams[i].getName(j));
            }
        }
        System.out.println("Alright, now let's review all teams: ");
         for(int i = 0;i < NUM_OF_TEAMS; ++i){
            System.out.println("Team name: "+teams[i].getTeamName());
             System.out.println("And the team members are: ");
            for(int j = 0;j < teams[i].getAmount();++j){
                if(j != teams[i].getAmount() - 1){
                    System.out.println(teams[i].getName(j)+", ");
                }else{
                    System.out.println(teams[i].getName(j)+".");
                }
            }
        }
   }
}
