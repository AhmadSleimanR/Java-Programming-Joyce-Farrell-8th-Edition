/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingteamdemo2;

/**
 *
 * @author Usuario
 */
public class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];
    public void setTeamName(String team)
    {
       teamName = team;
    }
    public String getTeamName()
    {
       return teamName; 
    }
    public void setMember(int number, String name)
    {
       members[number] = name;
    }
    public String getMember(int number)
    {
       return members[number];
 }
}
