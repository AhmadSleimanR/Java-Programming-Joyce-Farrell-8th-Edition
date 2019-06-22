/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalos;

/**
 *
 * @author Usuario
 */
public class DiagonalOs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final char LETTER = 'O';
        final char SPACE = ' ';
        int i, j, rows = 10;
        for(i = 0;i < rows;++i){
            for(j = 0;j <= i;++j)
                System.out.print(SPACE);
            System.out.println(LETTER);
        }
    }
    
}
