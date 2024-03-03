import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    // stores the list of courses
    private static List<Course> courses = new ArrayList<>();
    // stores the overall grades for each student
    private static List<Student> students = new ArrayList<>();

    // adds a new course to the system
    public static void addCourse(Course course) {
        courses.add(course);
    }

    // enrolls a student in a course
    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
        Course.incrementTotalEnrolled();
    }

    // assigns a grade to a student for a course
    public static void assignGrade(Student student, Course course, int grade) {
        student.assignGrade(course, grade);
    }

    // calculates the overall grade for a student
    public static double calculateOverallGrade(Student student) {
        double sum = 0;
        int count = 0;
        for (Integer grade : student.getGrades().values()) {
            if (grade != null) {
                sum += grade;
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}
