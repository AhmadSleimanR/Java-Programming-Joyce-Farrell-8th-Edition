/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */

public class RealEstateListing {
    private int listingNumber;
    private double price;
    private HouseData houseData;
    
    public RealEstateListing(int num, double price, String address, int sqFt){
        listingNumber = num;
        this.price = price;
        houseData = new HouseData(address, sqFt);
    }
    
    public void display(){
        System.out.println("Listing number #:"+ listingNumber + " selling for $"+
                price);
        System.out.println("Address: "+ houseData.streetAddress);
        System.out.println(houseData.squareFeet + " square feet");
    }
    
    
    private class HouseData{
        private String streetAddress;
        private int squareFeet;
        
        public HouseData(String address, int sqFt){
            streetAddress = address;
            squareFeet = sqFt;
        }
    }
    
    
}
