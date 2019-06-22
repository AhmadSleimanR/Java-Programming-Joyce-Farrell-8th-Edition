/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebook;

/**
 *
 * @author lycan
 */
public abstract class Book {
    protected String title;
    protected double price;
    public Book(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public abstract void setPrice();
}
