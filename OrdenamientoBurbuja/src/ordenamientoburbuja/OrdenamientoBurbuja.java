/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoburbuja;

/**
 *
 * @author lycan
 */
public class OrdenamientoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayBubble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int temp;
        int sortTimesChanging = arrayBubble.length - 1;
        for(int i = 0;i < arrayBubble.length - 1;++i){
            for(int j = 0;j < sortTimesChanging;++j){
               if(arrayBubble[j] > arrayBubble[j+1]){
                temp = arrayBubble[j];
                arrayBubble[j] = arrayBubble[j+1];
                arrayBubble[j+1] = temp;
            }
            }
            --sortTimesChanging;
        }
        for(int j = 0;j < arrayBubble.length;++j)
            System.out.println(arrayBubble[j]);
    }
}
