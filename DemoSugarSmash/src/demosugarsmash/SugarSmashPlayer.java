/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosugarsmash;

/**
 *
 * @author lycan
 */
public class SugarSmashPlayer {
    private int id;
    private String screenName;
    protected int[] highScoresArray;
    
    public SugarSmashPlayer(){
            highScoresArray = new int[10];
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getScreenName(){
        return screenName;
    }
    public void setScreenName(String screenName){
        this.screenName = screenName;
    }
    public int getHighScoreArray(int pos){
        if(pos < 0 || pos > 9){
            System.out.println("Error the position entered is out of range.");
            return 0;
        }else
            return highScoresArray[pos];
    }
    public void setHighScoreArray(int pos, int highScore){
        if(pos == 0 || highScoresArray[pos - 1] >= 100)
            highScoresArray[pos] = highScore;
        else
            System.out.println("Error, you must first get at least 100 points\n"
            +" on all previous levels.");
    }
}
