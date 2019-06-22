package main;

/**
 *
 * @author lycan
 */
public class BaseballGame {
    private String[] teamNamesArray = new String[2];
    protected int[][] scoresArray;
    int a, b;
    
    public BaseballGame(){
        scoresArray = new int[2][9];
        for(a = 0; a <= 1;++a)
            for(b = 0;b < 9;++b)
                scoresArray[a][b] = 999;
    }
    public String getTeamName(int team){
            return teamNamesArray[team];
    }
    public void setTeamNamesArray(int team, String name){
        teamNamesArray[team] = name;
    }
    public int getScore(int team, int pos){
        return scoresArray[team][pos];
    }
    public void setScoresArray(int team, int pos, int score){
        if(pos == 0 || (pos < scoresArray[team].length
                && scoresArray[team][pos-1] != 999)){
            scoresArray[team][pos] = score;
            if(scoresArray[0][scoresArray[0].length-1] != 999
                    && scoresArray[1][scoresArray[1].length-1] != 999)
                calculateScore();
        }else
            System.out.println("Error, you need to set all previous innings");
    }
    public void calculateScore(){
        int team1 = 0, team2 = 0;
        for(int score : scoresArray[0]){
                team1 += score;
        }
        for(int score : scoresArray[1]){
                team2 += score;
        }
        if(team1 > team2)
            System.out.println("Team 1 wins");
        else if(team2 > team1)
            System.out.println("Team 2 wins");
        else
            System.out.println("It was a tie");
    }
}
