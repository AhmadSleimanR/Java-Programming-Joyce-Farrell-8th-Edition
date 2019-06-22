/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosalesperson;

/**
 *
 * @author lycan
 */
public class Salesperson {
    private int id;
    private double annualSalesAmount;
    
    public Salesperson(int id, double annualSalesAmount){
        this.id = id;
        this.annualSalesAmount = annualSalesAmount;
    }
    
    public int getId(){
        return id;
    }
    
    public double getAnnualSalesAmount(){
        return annualSalesAmount;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setAnnualSalesAmount(double annualSalesAmount){
        this.annualSalesAmount = annualSalesAmount;
    }
}
