/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democandles;

/**
 *
 * @author Lycan
 */
public class Candle {
    private String color;
    protected int height;
    protected double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        price = height * 0.393701 * 2;
    }

    public double getPrice() {
        return price;
    }
    
}
