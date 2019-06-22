/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebook;

/**
 *
 * @author lycan
 */
public class UseBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fiction fiction = new Fiction("Moby Dick");
        NonFiction nonFiction = new NonFiction("The Art Of War");
        System.out.println("Show details:\n"
                +"Fiction book: "+fiction.getTitle()
                +", Price: "+fiction.getPrice());
        System.out.println("Show details:\n"
                +"Non fiction book: "+nonFiction.getTitle()
                +", Price: "+nonFiction.getPrice());
    }
    
}
