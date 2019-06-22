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
public class HighSchoolBaseballGame extends BaseballGame{
    public HighSchoolBaseballGame(){
        scoresArray = new int[2][7];
        for(a = 0; a <= 1;++a)
            for(b = 0;b < 7;++b)
                scoresArray[a][b] = 999;
    }
}
