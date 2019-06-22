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
public class IncomingPhoneCall extends PhoneCall{
    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPriceOfCall(0.02);
    }
    @Override
    public String getPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPriceOfCall() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void displayCallInformation() {
        System.out.println("The phone number is: "+phoneNumber+"\n"
        +"The rate of the call is: "+priceOfCall+"\n"
        +"And the price of the call is: "+priceOfCall);
    }
    
}
