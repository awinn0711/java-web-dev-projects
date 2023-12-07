import javax.security.auth.Subject;
import java.util.ArrayList;

public class Course {
    private final String subject;
    private final Teacher instructor;
    private final ArrayList<Student> enrolledStudents;

    public Course (String subject, Teacher instructor) {
        this.subject = subject;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<Student>();
    }

    public void setEnrolledStudents(Student aStudent) {
        enrolledStudents.add(aStudent);
    }
    public String getSubject() {
        return subject;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
