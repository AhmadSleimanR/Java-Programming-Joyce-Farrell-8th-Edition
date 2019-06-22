package inputgrades;

public class CollegeCourse {
    private String cId;
    private int cHours;
    private char cGrade;

    public CollegeCourse(String cId, int cHours, char cGrade) {
        this.cId = cId;
        this.cHours = cHours;
        this.cGrade = cGrade;
    }

    public String getCid() {
        return cId;
    }

    public void setCid(String cId) {
        this.cId = cId;
    }

    public int getcHours() {
        return cHours;
    }

    public void setcHours(int cHours) {
        this.cHours = cHours;
    }

    public char getcGrade() {
        return cGrade;
    }

    public void setcGrade(char cGrade) {
        this.cGrade = cGrade;
    }
}
