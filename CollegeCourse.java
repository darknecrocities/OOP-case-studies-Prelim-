/*
 * Parejas, Arron Kian M.
 * Marquez, Jian Kalel
 * MIranda, Josh Danielle
 */


public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private char grade;

    // Constructor
    public CollegeCourse(String courseID, int creditHours, char grade) {
        this.courseID = courseID;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    // Get and Set methods
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}