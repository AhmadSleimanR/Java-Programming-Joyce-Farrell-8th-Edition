package inputgrades;

import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] studentsArray = new Student[1];
        String enteredID;
        final int AMNTCOURSES = 5;
        int i, j, testID, enteredHours;
        char enteredGrade;
        for(i = 0;i < studentsArray.length;++i){
            studentsArray[i] = new Student();
            System.out.println("Enter ID for student #"+(i+1)+":");
            studentsArray[i].setsId(scan.nextInt());
            scan.nextLine();
            for(j = 0;j < AMNTCOURSES;++j){
                System.out.println("Enter course ID #"+(j+1)+":");
                enteredID = scan.nextLine();
                System.out.println("Now, enter course hours for course #"+(j+1)+":");
                enteredHours = scan.nextInt();
                scan.nextLine();
                System.out.println("Now, enter course grade for course #"+(j+1)+":");
                enteredGrade = Character.toUpperCase(scan.nextLine().charAt(0));
                while(enteredGrade != 'A' && enteredGrade != 'B' && enteredGrade != 'C' && 
                        enteredGrade != 'D' && enteredGrade != 'F'){
                      System.out.println("Please try again, enter course grade for course #"+(j+1)+":");
                      enteredGrade = Character.toUpperCase(scan.nextLine().charAt(0));
                }
                CollegeCourse course = new CollegeCourse(enteredID, enteredHours, enteredGrade);
                studentsArray[i].setCollegeCourse(course, j);
            }
        }
        //Everything from here is just testing
        System.out.println("Please input the position for the student from whom you want to see its data and courses: ");
        testID = scan.nextInt();
        System.out.println("The ID for the student is: "+studentsArray[testID].getsId());
        System.out.println("And it's courses are: ");
        for(i = 0;i < 5;++i){
            System.out.println("The ID of course #"+(i+1)+" is:\n"+
                    studentsArray[testID].getCollegeCourse(i).getCid()+"\n"+
                    "Its hours are:\n"+
                    studentsArray[testID].getCollegeCourse(i).getcHours()+"\n"+
                    "And the grade he got is:\n"+
                    studentsArray[testID].getCollegeCourse(i).getcGrade()
                    );
        }
    }
    
}
