/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebook;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class BookArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book[] bookArray = new Book[10];
        boolean isFiction;
        StringBuilder title;
        int i;
        Scanner input = new Scanner(System.in);
        for(i = 0;i < bookArray.length;++i){
            System.out.print("Is the book fiction? ");
            isFiction = input.nextBoolean();
            input.nextLine();
            System.out.print("Enter the book's title >> ");
            title = new StringBuilder(input.nextLine());
            if(isFiction)
                bookArray[i] = new Fiction(title.toString());
            else
                bookArray[i] = new NonFiction(title.toString());
        }
        System.out.println("Now we will show all of the books:");
        for(i = 0;i < bookArray.length;++i){
            if(bookArray[i] instanceof Fiction)
                System.out.println("Book #"+(i+1)+" is of Fiction genre \n"
                        +"It's title is: "+bookArray[i].getTitle()+"\n"
                        +"And it's price is: "+bookArray[i].getPrice());
            else
                System.out.println("Book #"+(i+1)+" is of Non Fiction genre \n"
                        +"It's title is: "+bookArray[i].getTitle()+"\n"
                        +"And it's price is: "+bookArray[i].getPrice());
        }
        
    }
    
}
