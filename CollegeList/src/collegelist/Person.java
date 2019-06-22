package collegelist;
import javax.swing.JOptionPane;
/**
 *
 * @author Lycan
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected String streetAddress;
    protected int zipCode;
    protected int phoneNumber;

    public void setFields(){
        this.firstName = JOptionPane.showInputDialog(null,
                "Enter the first name");
        this.lastName = JOptionPane.showInputDialog(null,
                "Enter the last name");
        this.streetAddress = JOptionPane.showInputDialog(null,
                "Enter the street address");
        this.zipCode = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the zip code"));
        this.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the phone number"));
    }
    
    public void display(){
        System.out.println("Person: "+firstName+" "+lastName+"'s information:\n"
                +"Street address: "+streetAddress+"\n"
                +"Zip code: "+zipCode+"\n"
                +"Phone number: "+phoneNumber);
    }
    
}
