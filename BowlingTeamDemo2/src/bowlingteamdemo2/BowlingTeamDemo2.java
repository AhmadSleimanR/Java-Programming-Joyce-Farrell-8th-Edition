/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingteamdemo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BowlingTeamDemo2 {
   public static void main(String[] args)
   {
      String name;
      final int NUM_TEAMS = 4;
      BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
      int x;
      int y;
      final int NUM_TEAM_MEMBERS = 4;
      Scanner input = new Scanner(System.in);
      getTeamData(teams);
      for(y = 0; y < NUM_TEAMS; ++y)
      {
         System.out.println("\nMembers of team " + teams[y].getTeamName());
         for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            System.out.print(teams[y].getMember(x) + "  ");
         System.out.println();
      }
      System.out.print("\n\nEnter a team name to see its roster >> ");
      name = input.nextLine();
      for(y = 0; y < teams.length; ++y)
         if(name.equals(teams[y].getTeamName()))
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
               System.out.print(teams[y].getMember(x) + "  ");
      System.out.println(); 
   }
   public static void getTeamData(BowlingTeam[] teams)
   {
      String name;
      final int NUM_TEAMS = 4;
      int x;
      int y;
      final int NUM_TEAM_MEMBERS = 4;
      Scanner input = new Scanner(System.in);
      for(y = 0; y < NUM_TEAMS; ++y)
      {
        teams[y] = new BowlingTeam();
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        teams[y].setTeamName(name);
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
        {
           System.out.print("Enter team member's name >> ");
           name = input.nextLine();
           teams[y].setMember(x, name);
        }
      }
   }
}