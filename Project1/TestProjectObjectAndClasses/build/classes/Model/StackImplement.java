/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Internals.StackInterface;

/**
 *
 * @author Usuario
 */
public class StackImplement implements StackInterface{
    private String stack[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

    public StackImplement() {
    }
    
    
    @Override
    public void push(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] getStack() {
        return stack;
    } 
}
