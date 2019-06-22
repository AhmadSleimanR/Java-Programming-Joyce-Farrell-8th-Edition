/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosubscriptions;

/**
 *
 * @author lycan
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription{

    @Override
    public void setSubscriberAddress(String subscriberAddress) {
        int i;
        char c;
        boolean hasDigit = false;
        for(i = 0;i < subscriberAddress.length();++i){
            c = subscriberAddress.charAt(i);
            if(c == '@')
                hasDigit = true;
        }
        if(!hasDigit){
            System.out.println("Sorry, your subscriber address was incorrect.");
        }else{
            subscriptionRate = 9;
        }
    }
    
}
