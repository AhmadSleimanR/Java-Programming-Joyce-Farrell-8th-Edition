package inputgrades;

public class Student {
    private int sId;
    private CollegeCourse[] courseArray = new CollegeCourse[5];
    
    
    public CollegeCourse getCollegeCourse(int position){
        return this.courseArray[position];
    }
    
    public void setCollegeCourse(CollegeCourse course, int position){
        this.courseArray[position] = course;
    }
    
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
}
