import java.sql.SQLOutput;
import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args) {
        //instantiate your Student class below
        Student Austin = new Student("Austin", 123, 1, 4.0);
//        System.out.println(Austin.getName());
        Student Bob = new Student("Bob", 456, 2, 3.5);
        Student Bill = new Student("Bill", 789, 1, 2.6);

        Teacher teacher = new Teacher("Mister", "Teach", "History", 200);
        Course history = new Course("History", teacher);
        history.setEnrolledStudents(Austin);
        history.setEnrolledStudents(Bob);
        history.setEnrolledStudents(Bill);

        System.out.println(history.getEnrolledStudents());
        System.out.println(history.getInstructor().getFirstName());
        System.out.println(history.getSubject());
    }
}
