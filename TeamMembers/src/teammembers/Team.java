/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teammembers;

/**
 *
 * @author Usuario
 */
public class Team {
    private String teamName;
    private String[] names;
    
    public String getTeamName(){
        return teamName;
    }
    
    public void setTeamName(String name){
        this.teamName = name;
    }
    
    public void setNames(int position, String name){
        this.names[position] = name;
    }
    
    public String getName(int position){
        return names[position];
    }
    
    public void setAmount(int amount){
        this.names = new String[amount];
    }
    
    public int getAmount(){
        return names.length;
    }
}
