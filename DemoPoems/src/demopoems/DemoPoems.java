/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopoems;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class DemoPoems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poem poem;
        Couplet couplet;
        Haiku haiku;
        Limerick limerick;
        String poemName, coupletName, haikuName, limerickName;
        int poemNumLines;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name for the poem >> ");
        poemName = input.nextLine();
        System.out.print("Now, enter its number of lines >> ");
        poemNumLines = input.nextInt();
        input.nextLine();
        System.out.print("Now, enter the name for the couplet >> ");
        coupletName = input.nextLine();
        System.out.print("Now, enter the name for the haiku >> ");
        haikuName = input.nextLine();
        System.out.print("Now, enter the name for the limerick >> ");
        limerickName = input.nextLine();
        poem = new Poem(poemName, poemNumLines);
        couplet = new Couplet(coupletName);
        haiku = new Haiku(haikuName);
        limerick = new Limerick(limerickName);
        System.out.println("--------------------------------------");
        System.out.println("The registered poems are:\n"
        +poem.getName()+" and its number of lines are: "+poem.getNumLines()
        +"\n"+couplet.getName()+" and its number of lines are: "+couplet.getNumLines()
        +"\n"+haiku.getName()+" and its number of lines are: "+haiku.getNumLines()
        +"\n"+limerick.getName()+" and its number of lines are: "+limerick.getNumLines());
    }
    
}
