/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Usuario
 */
public class Die {
    protected int value;
    
    public Die(){
        this.value = (int)(Math.random() * 100) % 6 + 1;
    }
    
    public int getValue(){
        return value;
    }
}
