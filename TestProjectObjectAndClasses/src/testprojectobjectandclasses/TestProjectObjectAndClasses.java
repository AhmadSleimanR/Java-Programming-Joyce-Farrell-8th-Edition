/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojectobjectandclasses;

import Model.MathFunctions;

/**
 *
 * @author Usuario
 */
public class TestProjectObjectAndClasses {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        MathFunctions math = new MathFunctions();
        System.out.println(math.sum(6, 2, 3, 4));
    }
}
