/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pointsArt, pointsBob, pointsCal, pointsDan, pointsEli;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the amount of points of Art...");
        pointsArt = scan.nextInt();
        System.out.println("You inputted: "+pointsArt);
        System.out.println("Please input the amount of points of Bob...");
        pointsBob = scan.nextInt();
        System.out.println("You inputted: "+pointsBob);
        System.out.println("Please input the amount of points of Cal...");
        pointsCal = scan.nextInt();
        System.out.println("You inputted: "+pointsCal);
        System.out.println("Please input the amount of points of Dan...");
        pointsDan = scan.nextInt();
        System.out.println("You inputted: "+pointsDan);
        System.out.println("Please input the amount of points of Eli...");
        pointsEli = scan.nextInt();
        System.out.println("You inputted: "+pointsEli);
        draw("Art",pointsArt);
        draw("Bob",pointsBob);
        draw("Cal",pointsCal);
        draw("Dan",pointsDan);
        draw("Eli",pointsEli);
    }
    
    
    private static void draw(String name, int points){
        System.out.print(name+": ");
        for(int i = 1;i <= points;++i)
            System.out.print("*");
        System.out.println();
    }
    
}
