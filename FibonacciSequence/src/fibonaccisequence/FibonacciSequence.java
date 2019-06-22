/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisequence;

/**
 *
 * @author lycan
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fib(3));
    }
    
    public static int fib(int n){
        if(n >= 3)
            return fib(n - 1) + fib(n - 2);
        else if(n == 1 || n == 2)
            return 1;
        return Integer.MAX_VALUE;
    }
    
}
