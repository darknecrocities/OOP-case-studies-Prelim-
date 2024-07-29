/*
 * Parejas, Arron Kian M.
 * Marquez, Jian Kalel
 * MIranda, Josh Danielle
 */
public class Student {
    private String studentID;
    private CollegeCourse[] courses;

    // Constructor
    public Student(String studentID) {
        this.studentID = studentID;
        this.courses = new CollegeCourse[5]; // Array to hold 5 CollegeCourse objects
    }

    // Get and Set methods for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public CollegeCourse getCourse(int index) {
        if (index >= 0 && index < 5) {
            return courses[index];
        }
        return null; // or throw an exception
    }

    // Set method for CollegeCourse
    public void setCourse(CollegeCourse course, int index) {
        if (index >= 0 && index < 5) {
            courses[index] = course;
        }
    }
}
