package collegelist;

import javax.swing.JOptionPane;

/**
 *
 * @author Lycan
 */
public class Faculty extends CollegeEmployee{
    private boolean tenured;
    
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
        this.socialSecurityNumber = Integer.parseInt(JOptionPane
                .showInputDialog(null,
                "Enter the social security number"));
        this.annualSalary = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the annual salary"));
        this.departmentName = JOptionPane.showInputDialog(null,
                "Enter the department name");
        this.tenured = Boolean.valueOf(JOptionPane.showInputDialog(null,
                "Is the faculty tenured?"));
    }
    @Override
    public void display(){
        System.out.println("College Employee: "+firstName+" "+lastName+"'s information:\n"
                +"Street address: "+streetAddress+"\n"
                +"Zip code: "+zipCode+"\n"
                +"Phone number: "+phoneNumber+"\n"
                +"Social security number: "+socialSecurityNumber+"\n"
                +"Annual salary: "+annualSalary+"\n"
                +"Department name: "+departmentName+"\n"
                +"Is tenured: "+tenured);
    }
}
