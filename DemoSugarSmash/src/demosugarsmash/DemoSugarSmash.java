/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosugarsmash;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class DemoSugarSmash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean paying;
        int id, highScore, count = 0;
        String name;
        SugarSmashPlayer player;
        PremiumSugarSmashPlayer pPlayer;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your player name >> ");
        name = input.nextLine();
        System.out.print("Enter your id >> ");
        id = input.nextInt();
        input.nextLine();
        System.out.print("Do you want to pay $2.99 for 40 more levels? ");
        paying = input.nextBoolean();
        input.nextLine();
        if(paying){
            pPlayer = new PremiumSugarSmashPlayer(); 
            pPlayer.setId(id);
            pPlayer.setScreenName(name);
            while(count < 50){
                highScore = 0;
                while(highScore < 100){
                        System.out.print("Enter highscore for level "+(count+1)
                            +" >> ");
                        highScore = input.nextInt();
                        input.nextLine();
                }
                pPlayer.setHighScoreArray(count, highScore);
                ++count;
            }
        }
        else{
            player = new SugarSmashPlayer();
            player.setId(id);
            player.setScreenName(name);
            while(count < 10){
                highScore = 0;
                while(highScore < 100){
                        System.out.print("Enter highscore for level "+(count+1)
                            +" >> ");
                        highScore = input.nextInt();
                        input.nextLine();
                }
                player.setHighScoreArray(count, highScore);
                ++count;
            }
        }
    }
}
