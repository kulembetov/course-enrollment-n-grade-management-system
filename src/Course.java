public class Course {
    // stores the course code
    private String courseCode;
    // stores the course name
    private String name;
    // stores the maximum capacity of the course
    private int maxCapacity;
    // tracks the total number of enrolled students across all courses
    private static int totalEnrolled = 0;

    public Course(String courseCode, String name, int maxCapacity) {
        this.courseCode = courseCode;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    // allows access to the course code
    public String getCourseCode() {
        return courseCode;
    }

    // allows access to the course name
    public String getName() {
        return name;
    }

    // allows access to the maximum capacity
    public int getMaxCapacity() {
        return maxCapacity;
    }

    // retrieves the total number of enrolled students
    public static int getTotalEnrolled() {
        return totalEnrolled;
    }

    // increments the total number of enrolled students
    public static void incrementTotalEnrolled() {
        totalEnrolled++;
    }
}
