/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Internals.InterfaceMaths;

/**
 *
 * @author Usuario
 */
public class MathFunctions implements InterfaceMaths{
    
    public double sum(int X, int Y){
        return X + Y;
    }
    
    public double sum(int X, int Y, int Z){
        return X + Y + Z;
    }
    
    public double substraction(int X, int Y){
        return X - Y;
    }
    
   public double multiplication(int X, int Y){
       return X * Y;
   }
  
   public double division(int X, int Y){
       return X / Y;
   }

    @Override
    public double sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
