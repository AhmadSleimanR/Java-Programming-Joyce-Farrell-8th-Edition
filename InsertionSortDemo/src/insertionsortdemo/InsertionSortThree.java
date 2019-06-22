/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortdemo;

/**
 *
 * @author lycan
 */
public class InsertionSortThree {
    public static void main(String[] args){
            int[] arrayInsertion = new int[1000];
            int a, b, temp;
            for(int i = 999;i >= 0;--i)
                arrayInsertion[i] = i + 1;
            a = 1;
            while(a < arrayInsertion.length){
                temp = arrayInsertion[a];
                b = a - 1;
                while(b >= 0 && arrayInsertion[b] > temp){
                    arrayInsertion[b + 1] = arrayInsertion[b];
                    --b;
                }
                arrayInsertion[b+1] = temp;
                ++a;
            }
            for(int i = 0;i < 1000;++i)
                System.out.println(arrayInsertion[i]);
    }
}
