//Create a class named Majors that includes an enumeration for the six majors
//offered by a college as follows: ACC, CHEM, CIS, ENG, HIS, PHYS. Display the
//enumeration values for the user, then prompt the user to enter a major. Display the
//college division in which the major falls. ACC and CIS are in the Business Division,
//CHEM and PHYS are in the Science Division, and ENG and HIS are in the
//Humanities Division. Save the file as Majors.java.
package majors;

import java.util.Scanner;

public class Majors {
    enum CollegeMajors{
        ACC, CHEM, CIS, ENG, HIS, PHYS
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entered;
        CollegeMajors enteredMajor;
        String[] divisions = {"Business","Science","Humanities"};
        System.out.print("The majors are: ");
        for(CollegeMajors major : CollegeMajors.values())
            System.out.print(major+" ");
        System.out.println();
        System.out.print("Enter a major from which you want to see the College division from: ");
        entered = input.nextLine();
        enteredMajor = CollegeMajors.valueOf(entered);
        switch(enteredMajor){
            case ACC:
            case CIS:
                System.out.println(enteredMajor.toString()+"'s college division is "+divisions[0]+" division");
                break;
            case CHEM:
            case PHYS:
                System.out.println(enteredMajor.toString()+"'s college division is "+divisions[1]+" division");
                break;
            case ENG:
            case HIS:
                System.out.println(enteredMajor.toString()+"'s college division is "+divisions[2]+" division");
                break;
        }
    }
}
