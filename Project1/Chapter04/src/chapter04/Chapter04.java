/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

import model.RealEstateListing;

/**
 *
 * @author Usuario
 */
public class Chapter04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RealEstateListing real = new RealEstateListing(5,4.00,"test",3);
        real.display();
    }
    
}
