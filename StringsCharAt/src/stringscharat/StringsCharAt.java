/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringscharat;

/**
 *
 * @author Usuario
 */
public class StringsCharAt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stacy = "Stacy is a bitch \nStacy is a bitch";
        for(int i = 0;i < stacy.length();++i){
            for(int j = 0;j<=i;j++)
                System.out.print(" ");
            System.out.print(stacy.charAt(i));
        }
        System.out.println();
    }

}
    

