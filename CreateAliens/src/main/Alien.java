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
public class Alien {
    protected int eyes;
    protected String speciesName;
    protected int legs;
    
    public Alien(int eyes, String speciesName, int legs){
        this.eyes = eyes;
        this.speciesName = speciesName;
        this.legs = legs;
    }
    
    @Override
    public String toString(){
        return "Alien type: "+speciesName+", amount of eyes: "+eyes+", amount of legs: "+legs;
    }
}
