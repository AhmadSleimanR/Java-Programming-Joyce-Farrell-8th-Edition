package useparty;
public class Party {
  private int guests;
  public int getGuests(){
      return guests;
  }
  public void setGuests(int numGuests){
          guests = numGuests;
  }
  public void displayInvitation(){
      System.out.println("Please come to my party!");
  }
  private void privateDisplay(){
      System.out.println("Testing...");
  }
  public void publicDisplay(){
      privateDisplay();
  }
}
