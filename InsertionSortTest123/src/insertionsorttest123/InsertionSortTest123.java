/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsorttest123;

/**
 *
 * @author lycan
 */
public class InsertionSortTest123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayInsertion = new int[1000];
        int i, a, b, temp;
        for(i = 999;i >= 0;--i)
            arrayInsertion[i] = i+1;
        //now the actual sorting
        a = 1;
        while(a < arrayInsertion.length){
            temp = arrayInsertion[a];
            b = a -1;
            while(b >= 0 && temp < arrayInsertion[b]){
                arrayInsertion[b+1] = arrayInsertion[b];
                --b;
            }
            arrayInsertion[b+1] = temp;
            ++a;
        }
        for(i = 0;i<arrayInsertion.length;++i)
            System.out.println(arrayInsertion[i]);
    }
    
}
