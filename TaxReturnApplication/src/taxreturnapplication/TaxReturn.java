/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxreturnapplication;

/**
 *
 * @author Usuario
 */
public class TaxReturn {
     private final String socialSecurityNumber;
     private String lastName;
     private final String firstName;
     private String streetAddress;
     private String city;
     private String state;
     private final int zipCode;
     private final int annualIncome;
     private final String maritalStatus;
     private double taxLiability;

    public TaxReturn(String socialSecurityNumber, String lastName, String firstName, String streetAddress, String city, String state, int zipCode, int annualIncome, String maritalStatus) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus.toUpperCase();
        this.setTaxLiability();
    }

    public TaxReturn(String socialSecurityNumber, String firstName, int zipCode, int annualIncome, String maritalStatus) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus.toUpperCase();
        this.setTaxLiability();
    }
    
    private void setTaxLiability() {
        if(annualIncome >= 0 && annualIncome <= 20000){
            switch(maritalStatus){
                case "MARRIED":
                    this.taxLiability = annualIncome * 0.14;
                    break;
                case "SINGLE":
                    this.taxLiability = annualIncome *  0.15;
                    break;
            }
        }else if(annualIncome > 20000 && annualIncome <= 50000){
              switch(maritalStatus){
                case "MARRIED":
                    this.taxLiability = annualIncome *  0.20;
                    break;
                case "SINGLE":
                    this.taxLiability = annualIncome *  0.22;
                    break;
        }
    }else{
              switch(maritalStatus){
                case "MARRIED":
                    this.taxLiability = annualIncome *  0.28;
                    break;
                case "SINGLE":
                    this.taxLiability = annualIncome *  0.30;
                    break;
        }
     
        }
    }
    
    public void displayData(){
        System.out.println("Dear "+firstName+", your tax return data is:"+"\n"+
                "Annual income of: "+annualIncome+"\n"+
                "And tax liability of: "+taxLiability);
    }
}
