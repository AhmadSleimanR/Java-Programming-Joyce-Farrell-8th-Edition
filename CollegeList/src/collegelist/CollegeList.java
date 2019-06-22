package collegelist;

import java.util.Scanner;

/**
 *
 * @author Lycan
 */
public class CollegeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXCOLLEGE = 4, MAXFACULTY = 3, MAXSTUDENT = 7;
        CollegeEmployee[] collegeEmployeeArray = new CollegeEmployee[MAXCOLLEGE];
        Faculty[] facultyArray = new Faculty[MAXFACULTY];
        Student[] studentArray = new Student[MAXSTUDENT];
        final char QUIT = 'Q';
        boolean didFind = false;
        int a;
        int counterCollege = 0, counterFaculty = 0, counterStudent = 0;
        char entered;
        System.out.println("Do you want to enter a person's data? (C, F, S) \n"
        +"Or quit(Q)?");
        entered = input.nextLine().toUpperCase().charAt(0);
        while (entered != QUIT && (
               counterCollege < MAXCOLLEGE ||
               counterFaculty < MAXFACULTY ||
               counterStudent < MAXSTUDENT)){
            
                switch(entered){
                    case 'C':
                        if(counterCollege < MAXCOLLEGE){
                            collegeEmployeeArray[counterCollege] =
                                    new CollegeEmployee();
                            collegeEmployeeArray[counterCollege].setFields();
                            ++counterCollege;
                        }else
                            System.out.println("The amount of college employees is at its maximum");
                        break;
                    case 'F':
                        if(counterFaculty < MAXFACULTY){
                            facultyArray[counterFaculty] = new Faculty();
                            facultyArray[counterFaculty].setFields();
                            ++counterFaculty;
                        }else
                            System.out.println("The amount of faculty members is at its maximum");
                        break;
                    case 'S':
                        if(counterStudent < MAXSTUDENT){
                            studentArray[counterStudent] = new Student();
                            studentArray[counterStudent].setFields();
                            ++counterStudent;
                        }else
                            System.out.println("The amount of students is at its maximum");
                        break;
                    default:
                        System.out.println("The option you picked was incorrect.");
                        break;
                }
           if(counterCollege < MAXCOLLEGE || counterFaculty < MAXFACULTY
                   || counterStudent < MAXSTUDENT){
                       System.out.println("Do you want to enter a person's data? (C, F, S) \n"
                                            +"Or quit(Q)?");
                        entered = input.nextLine().toUpperCase().charAt(0);
                        }     
        }
        for(a = 0;a < collegeEmployeeArray.length;++a){
            if(collegeEmployeeArray[a] != null){
                collegeEmployeeArray[a].display();
                didFind = true;
            }
        }
        for(a = 0;a < facultyArray.length;++a){
            if(facultyArray[a] != null){
                facultyArray[a].display();
                didFind = true;
            }
        }
        for(a = 0;a < studentArray.length;++a){
            if(studentArray[a] != null){
                studentArray[a].display();
                didFind = true;
            }
        }
        
        if(!didFind)
            System.out.println("Sorry, no values were entered to display.");
    }
}
