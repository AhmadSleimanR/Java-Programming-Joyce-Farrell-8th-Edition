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
public class PhoneCallArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhoneCall[] phoneCallArray = new PhoneCall[10];
        int i;
        for(i = 0;i < phoneCallArray.length;++i){
            if(i % 2 == 0)
                phoneCallArray[i] = new OutgoingPhoneCall("99955883"+i,i * 5);
            else
                phoneCallArray[i] = new IncomingPhoneCall("99955883"+i);
            phoneCallArray[i].displayCallInformation();
        }
    }
    
}
