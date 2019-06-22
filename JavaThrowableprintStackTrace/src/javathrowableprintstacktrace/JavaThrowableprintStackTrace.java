/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathrowableprintstacktrace;

/**
 *
 * @author lycan
 */
public class JavaThrowableprintStackTrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        display(3);
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }
    
    public static void display(int whereTo) throws ArrayIndexOutOfBoundsException{
        int[] array = {1,2,3};
        System.out.println("array["+whereTo+"] is : "+array[whereTo]);
    }
    
}
