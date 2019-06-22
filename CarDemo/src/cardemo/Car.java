/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardemo;

/**
 *
 * @author Lycan
 */
public class Car {
    private int year;
    private Model model;
    private Color color;
    
    public Car(int year, Model model, Color color){
        this.year = year;
        this.model = model;
        this.color = color;
    }
    
    public void display(){
        System.out.println("Car is a "+year+" "+color+" "+model);
    }
}
