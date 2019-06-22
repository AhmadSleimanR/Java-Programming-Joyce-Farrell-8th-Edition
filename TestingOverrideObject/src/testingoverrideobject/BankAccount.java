/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingoverrideobject;

/**
 *
 * @author Lycan
 */
public class BankAccount {
   public int acctNum = 1234;
   
       @Override
    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof BankAccount))
            return false;
        BankAccount secondAcct = (BankAccount) obj;
        return acctNum == secondAcct.acctNum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.acctNum;
        return hash;
    }
}
