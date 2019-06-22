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
public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    
    @Override
    public void setSubscriberAddress(String subscriberAddress) {
    char c;
    int i;
    boolean hasDigit = false;
    for(i = 0;i < subscriberAddress.length();++i){
        c = subscriberAddress.charAt(i);
        if(Character.isDigit(c) == true)
            hasDigit = true;
    }
    if(!hasDigit){
        subscriptionRate = 0;
        System.out.println("Sorry, your subscriber address was incorrect.");
    }else{
        subscriptionRate = 15;
    }
    }    
}

