/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countmoviespaces;

/**
 *
 * @author Usuario
 */
public class CountMovieSpaces {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String movieQuote = "Frankly, my dear, I don't give a damn.";
        int count = 0;
        char c;
        for(int i = 0; i < movieQuote.length();++i){
            c = movieQuote.charAt(i);
            if(c == ' ')
                ++count;
        }
        System.out.println("The amount of spaces is: "+count);
    }
    
}
