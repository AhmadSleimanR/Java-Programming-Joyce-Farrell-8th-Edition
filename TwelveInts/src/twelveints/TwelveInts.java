/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelveints;

/**
 *
 * @author Usuario
 */
public class TwelveInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] integers = {1, 2, 4, 8, 10, 12, 24, 48, 82, 100, 120, 240};
        int i;
        System.out.println("From first to last:");
        for(i = 0;i < integers.length;++i){
            System.out.print(integers[i]+" ");
        }
        System.out.println();
        System.out.println("From last to first:");
        while(i > 0){
            --i;
           System.out.print(integers[i]+" ");
        }
    }
    
}
