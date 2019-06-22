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
public class OutgoingPhoneCall extends PhoneCall{
    private int minutesOfCall;
    
    public OutgoingPhoneCall(String phoneNumber, int minutesOfCall){
        super(phoneNumber);
        this.minutesOfCall = minutesOfCall;
        setPriceOfCall(0.04);
    }
    @Override
    public String getPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPriceOfCall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayCallInformation() {
        System.out.println("The phone number is: "+phoneNumber+"\n"
        +"The rate of the call is: "+priceOfCall+"\n"
        +"The amount of minutes is: "+minutesOfCall+"\n"
        +"And the price of the call is: "+(priceOfCall * minutesOfCall));
    }
    
}
