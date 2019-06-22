/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author lycan
 */
public class TestJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int increment = -1;
        for(int i = 0, j = 0;i<10 && j<5;i++,j+=2){
            increment++;
        }
        System.out.println(increment);
    }
    
}
