/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringaltering;

/**
 *
 * @author Usuario
 */
public class StringAltering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mutator = "Original Value";
        System.out.println("At the start the string is: "+mutator);
        mutatorMethod(mutator);
        System.out.println("At the end the string is: "+mutator);
    }
    
    
    private static void mutatorMethod(String str){
            System.out.println("At the start of the method it is: "+str);
            str = "Changed value";
            System.out.println("At the end of the method it is: "+str);
}
    
}
