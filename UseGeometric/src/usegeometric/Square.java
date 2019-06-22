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
public class Square extends GeometricFigure implements SidedObject{

    @Override
    public void getArea() {
        area = (height * width) / 2;
    }

    @Override
    public void displaySides() {
        System.out.println("It has 4 sides.");
    }
    
}
