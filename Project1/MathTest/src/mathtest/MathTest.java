/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtest;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class MathTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Math.sqrt(37));
        System.out.println(Math.sin(300));
        System.out.println(Math.cos(300));
        System.out.println(Math.floor(22.8));
        System.out.println(Math.ceil(22.8));
        System.out.println(Math.round(22.8));
        System.out.println(Math.max('D', 71));
        System.out.println(Math.min('D', 71));
        Random rnd = new Random();
        System.out.println(((int)(Math.random() * 20)) +1);
    }
    
}
