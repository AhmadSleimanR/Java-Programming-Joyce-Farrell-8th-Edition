/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdemo;

/**
 *
 * @author Usuario
 */
public class Event
{
   public final static double HIGH_GUEST_PRICE = 35.00;
   public final static double LOW_GUEST_PRICE = 32.00;  
   public final static int LARGE_EVENT = 50;
   public final static int EVENT_NUM_LENGTH = 4;
   private String eventNumber;
   private int guests;
   private double pricePerGuest;
   private double priceForEvent;
   private String contactPhone;
   public Event()
   {
      this("A000", 0);
   }
   public Event(String num, int guests)
   {
      setEventNumber(num);
      setGuests(guests);
   }
   public void setEventNumber(String num)
   {
      boolean numOk = true;
      if(num.length() != EVENT_NUM_LENGTH || !Character.isLetter(num.charAt(0)) || !Character.isDigit(num.charAt(1)) || !Character.isDigit(num.charAt(2)) || !Character.isDigit(num.charAt(3))) 
          eventNumber = "A000";      
        else
         eventNumber = num.toUpperCase();
   }
   public void setGuests(int gsts)
   {
      guests = gsts;
      if(isLargeEvent())
      {
         pricePerGuest = LOW_GUEST_PRICE;
         priceForEvent = guests * LOW_GUEST_PRICE;
      }
      else
      {
         pricePerGuest = HIGH_GUEST_PRICE;
         priceForEvent = guests * HIGH_GUEST_PRICE;
      }
   }
   public String getEventNumber()
   {
      return eventNumber;
   }
   public int getGuests()
   {
      return guests;
   }
   public double getPriceForEvent()
   {
      return priceForEvent;
   }
   public double getPricePerGuest()
   {
      return pricePerGuest;
   }
   public String getContactPhone()
   {
      String phone;
      phone = "(" + contactPhone.substring(0, 3) + ") " +
         contactPhone.substring(3, 6) + "-" +
         contactPhone.substring(6, 10);
      return phone;
   }
   public void setContactPhone(String phone)
   {
      final int VALID_LEN = 10;
      final String INVALID_PHONE = "0000000000";
      contactPhone = "";
      int len = phone.length();
      for(int x = 0; x < len; ++x)
      {
         if(Character.isDigit(phone.charAt(x)))
            contactPhone += phone.charAt(x);
      }
      if(contactPhone.length() != VALID_LEN)
         contactPhone = INVALID_PHONE;
   }
   public boolean isLargeEvent()
   {
      boolean isLarge = false;
      if(guests >= LARGE_EVENT)
         isLarge = true;
      return isLarge;
   }
}