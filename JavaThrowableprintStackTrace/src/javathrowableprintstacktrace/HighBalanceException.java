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
public class HighBalanceException extends Exception {
    public HighBalanceException(){
        super("The balance is too high!");
    }
}
