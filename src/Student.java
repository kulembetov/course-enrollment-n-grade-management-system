import java.util.HashMap;
import java.util.Map;

public class Student {
    // stores student's name
    private String name;
    // stores student's ID
    private String id;
    // maps Course objects to grades
    private final Map<Course, Integer> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new HashMap<>();
    }

    // allows access to student's name
    public String getName() {
        return name;
    }

    // allows modification of student's name
    public void setName(String name) {
        this.name = name;
    }

    // allows access to student's ID
    public String getId() {
        return id;
    }

    // allows modification of student's ID
    public void setId(String id) {
        this.id = id;
    }

    // enrolls a student in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.putIfAbsent(course, null);
    }

    // assigns a grade to a student for a course
    public void assignGrade(Course course, int grade) {
        if (enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, grade);
        }
    }

    // retrieves the student's grades
    public Map<Course, Integer> getGrades() {
        return enrolledCourses;
    }
}