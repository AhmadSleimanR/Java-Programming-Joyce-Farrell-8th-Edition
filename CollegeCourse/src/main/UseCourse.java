package main;

import java.util.Scanner;

/**
 *
 * @author lycan
 */
public class UseCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String department;
        int courseNumber, credits;
        CollegeCourse cCourse;
        LabCourse lCourse;
        System.out.print("Enter the department >> ");
        department = input.nextLine();
        System.out.print("Enter the course number >> ");
        courseNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter the credits >> ");
        credits = input.nextInt();
        input.nextLine();
        department = department.substring(0, 3).toUpperCase();
        switch(department){
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY":
                lCourse = new LabCourse(department, courseNumber, credits);
                lCourse.display();
                break;
            default:
                cCourse = new LabCourse(department, courseNumber, credits);
                cCourse.display();
                break;
        }
    }
}
