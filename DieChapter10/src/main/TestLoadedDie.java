/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author lycan
 */
public class TestLoadedDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Die dice1, dice2;
        LoadedDie dice3;
        int a, wins1 = 0, wins2 = 0;
        for(a = 0;a < 1000;++a){
            dice1 = new Die();
            dice2 = new Die();
            if(dice1.getValue() > dice2.getValue())
                ++wins1;
        }
        System.out.println("The amount of times dice 1 won vs dice 2 were: "+wins1+" times.");
        for(a = 0;a < 1000;++a){
            dice1 = new Die();
            dice3 = new LoadedDie();
            if(dice1.getValue() > dice3.getValue())
                ++wins2;
        }
        System.out.println("The amount of times dice 1 won vs dice 3 were: "+wins2+" times.");
    }
    
}
