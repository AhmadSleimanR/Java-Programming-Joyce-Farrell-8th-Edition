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
public class UseGeometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricFigure[] geometricFigures = new GeometricFigure[2];
        geometricFigures[0] = new Square();
        geometricFigures[1] = new Triangle();
        geometricFigures[0].height = 50;
        geometricFigures[0].width = 20;
        geometricFigures[1].height = 25;
        geometricFigures[1].width = 15;
        geometricFigures[0].getArea();
        geometricFigures[1].getArea();
        System.out.println("Square Area: "+geometricFigures[0].area+"\n"
                +"Triangle Area: "+geometricFigures[1].area);
    }
    
}
