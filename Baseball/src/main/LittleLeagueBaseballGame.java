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
public class LittleLeagueBaseballGame extends BaseballGame{
    public LittleLeagueBaseballGame(){
        scoresArray = new int[2][6];
        for(a = 0; a <= 1;++a)
            for(b = 0;b < 6;++b)
                scoresArray[a][b] = 999;
    }
}
