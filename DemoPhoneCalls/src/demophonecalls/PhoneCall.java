/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demophonecalls;

/**
 *
 * @author lycan
 */
public abstract class PhoneCall {
    protected String phoneNumber;
    protected double priceOfCall;
    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        priceOfCall = 0;
    }
    public final void setPriceOfCall(double priceOfCall){
        this.priceOfCall = priceOfCall;
    }
    public abstract String getPhoneNumber();
    public abstract double getPriceOfCall();
    public abstract void displayCallInformation();
}
