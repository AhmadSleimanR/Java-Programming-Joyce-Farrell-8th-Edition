/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathrowableprintstacktrace;
/**
 *
 * @author lycan
 */
public class JavaThrowCustomException {
    public static void main(String[] args){
        try{
            highBalance(1001);
        }catch(HighBalanceException exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }
    
    static void highBalance(int balance) throws HighBalanceException{
        if(balance > 1000)
            throw(new HighBalanceException());
    }
}
