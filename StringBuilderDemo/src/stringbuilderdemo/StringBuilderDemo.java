/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdemo;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class StringBuilderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder demo, demo1, demo2;
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in your name: ");
        demo = new StringBuilder(scan.nextLine());
        System.out.println("The Stringbuilder contains: "+demo);
        System.out.println("Now... we will divide it into two");
        length = demo.length();
        demo1 = new StringBuilder(demo.substring(0, length / 2));
        demo2 = new StringBuilder(demo.substring(length / 2, length));
        System.out.println("The new strings are: "+"\n"+
                "First half: "+demo1+"\n"+
                "Second half: "+demo2);
    }
    
}
