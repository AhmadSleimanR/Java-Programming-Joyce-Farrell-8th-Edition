package main;
/**
 *
 * @author lycan
 */
public class CollegeCourse {
    protected String department;
    protected int courseNumber;
    protected int credits;
    protected int fee;
    
    public CollegeCourse(String department, int courseNumber, int credits){
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        fee = credits * 120;
    }
    public void display(){
        System.out.println("The data for the college course is: "+courseNumber
                +" the department is: "+department+"\n"
                +"The credits are: "+credits+" and the fee is: "+fee);
    }
}
