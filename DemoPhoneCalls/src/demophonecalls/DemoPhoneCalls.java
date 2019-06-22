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
public class DemoPhoneCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IncomingPhoneCall incPhoneCall = new IncomingPhoneCall("999558838");
        OutgoingPhoneCall outPhoneCall = new OutgoingPhoneCall("999558838",35);
        incPhoneCall.displayCallInformation();
        outPhoneCall.displayCallInformation();
    }
    
}
