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
public class Fiction extends Book{
    public Fiction(String title){
        super(title);
        setPrice();
    }
    @Override
    public final void setPrice() {
        price = 24.99;
    }
    
}
