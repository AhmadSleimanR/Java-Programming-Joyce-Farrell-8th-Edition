/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Person;

/**
 *
 * @author Usuario
 */
public class Couple {
    Person guy, girl;
    
    public Couple(Person guy, Person girl){
        this.guy = guy;
        this.girl = girl;
    }
    
    public Person getGuy(){
        return guy;
    }
    
    public Person getGirl(){
        return girl;
    }
}
