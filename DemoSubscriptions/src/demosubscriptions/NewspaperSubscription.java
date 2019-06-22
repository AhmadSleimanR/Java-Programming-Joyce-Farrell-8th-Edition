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
public abstract class NewspaperSubscription {
    protected String subscriberName;
    protected String subscriberAddress;
    protected double subscriptionRate;
    
    public String getSubscriberName(){
        return subscriberName;
    }
    public void setSubscriberName(String subscriberName){
        this.subscriberName = subscriberName;
    }
    public String getSubscriberAddress(){
        return subscriberAddress;
    }
    public double getSubscriptionRate(){
        return subscriptionRate;
    }
    public abstract void setSubscriberAddress(String subscriberAddress);
}
