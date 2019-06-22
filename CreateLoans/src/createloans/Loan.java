/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createloans;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public abstract class Loan implements LoanConstants{
    protected int loanNumber;
    protected String customerLastName;
    protected int amountOfLoan;
    protected double  interestRate;
    protected int term;
    public Loan(int loanNumber, String customerLastName, int amountOfLoan,
            int term){
            Scanner keyboard = new Scanner(System.in);
            this.loanNumber = loanNumber;
            this.customerLastName = customerLastName;
            while(amountOfLoan > MAXIMUM_LOAN_AMOUNT ){
                System.out.println("Please enter a loan amount lower than "
                        +MAXIMUM_LOAN_AMOUNT+":\n");
                amountOfLoan = keyboard.nextInt();
            }
            this.amountOfLoan = amountOfLoan;
            switch(term){
                case 1:
                case 3:
                case 5:
                    this.term = term;
                    break;
                default:
                    this.term = 1;
                    break;
            }
    }
    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getAmountOfLoan() {
        return amountOfLoan;
    }

    public void setAmountOfLoan(int amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
    @Override
    public String toString(){
        return "Loan number: "+loanNumber+"\n"
                +"Customer lastname: "+customerLastName+"\n"
                +"Amount of loan: "+amountOfLoan+"\n"
                +"Interest rate: "+interestRate+"\n" 
                +"Term: "+term;
    }
}
