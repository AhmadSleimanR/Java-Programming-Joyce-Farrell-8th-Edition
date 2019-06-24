/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Wedding {
    LocalDate wedding;
    String guyName, girlName, location;
    
    public Wedding(String wedding, String guyName, String girlName, String location){
        this.wedding = LocalDate.parse(wedding);
        this.guyName = guyName;
        this.girlName = girlName;
        this.location = location;
    }
    
    public LocalDate getWedding(){
        return wedding;
    }
    
    public String getGuyName(){
        return guyName;
    }
    
    public String getGirlName(){
        return girlName;
    }
    
    public String getLocation(){
        return location;
    }
    
}
