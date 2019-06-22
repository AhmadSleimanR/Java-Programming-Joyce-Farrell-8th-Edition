package collegelist;
import javax.swing.JOptionPane;

/**
 *
 * @author Lycan
 */
public class Student extends Person{
    private String majorFieldOfStudy;
    private double gradePointAverage;
    @Override
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
        this.majorFieldOfStudy = JOptionPane.showInputDialog(null,
                "Enter the major field of study");
        this.gradePointAverage = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter the grade point average"));
    }
    @Override
    public void display(){
        System.out.println("Person: "+firstName+" "+lastName+"'s information:\n"
                +"Street address: "+streetAddress+"\n"
                +"Zip code: "+zipCode+"\n"
                +"Phone number: "+phoneNumber+"\n"
                +"Field of study: "+majorFieldOfStudy+"\n"
                +"Grade point average: "+gradePointAverage);
    }
}
