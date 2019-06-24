/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwedding;

import model.Couple;
import model.Person;
import model.Wedding;

/**
 *
 * @author Usuario
 */
public class TestWedding {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person guy, girl;
        Couple couple;
        Wedding wedding;
        
        guy = new Person("Andrew","Snow","1994-04-23");
        girl = new Person("Yukiko","Yamauchi","1995-08-23");
        couple = new Couple(guy, girl);
        wedding = new Wedding("2018-11-25", guy.getName(),girl.getName(), "St. Louis");
        displayWedding(wedding);
    }
    
    public static void displayWedding(Wedding wedding){
        System.out.println("The fortunate guy is: "+ wedding.getGuyName()+
                "\nAnd the fortunate girl is: "+wedding.getGirlName()+
                "\nThey are marrying in: "+wedding.getLocation()+
                "\nThe wedding date is: "+wedding.getWedding());
    }
    
}
