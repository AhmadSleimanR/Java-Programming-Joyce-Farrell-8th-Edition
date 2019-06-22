/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usegeometric;

/**
 *
 * @author lycan
 */
public class Triangle extends GeometricFigure implements SidedObject{

    @Override
    public void getArea() {
        area = height * height;
    }

    @Override
    public void displaySides() {
        System.out.println("It has three sides.");
    }
    
}
