package main;
/**
 *
 * @author lycan
 */
public class LabCourse extends CollegeCourse{
    public LabCourse(String department, int courseNumber, int credits){
        super(department, courseNumber, credits);
        fee += credits * 50;
    }
    @Override
    public void display(){
        System.out.println("The data for the lab course is: "+courseNumber
                +" the department is: "+department+"\n"
                +"The credits are: "+credits+" and the fee is: "+fee);
    }
    
}
