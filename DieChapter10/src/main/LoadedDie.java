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
public class LoadedDie extends Die{
    public LoadedDie(){
        this.value = (int)(Math.random() * 100) % 5 + 2;
    }
}
