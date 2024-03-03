import java.util.Scanner;

public class AdministratorInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nCourse Enrollment and Grade Management System");
            System.out.println("1. Add a new course");
            System.out.println("2. Enroll a student in a course");
            System.out.println("3. Assign a grade to a student");
            System.out.println("4. Calculate a student's overall grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewCourse();
                    break;
                case 2:
                    enrollStudentInCourse();
                    break;
                case 3:
                    assignGradeToStudent();
                    break;
                case 4:
                    calculateStudentOverallGrade();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addNewCourse() {
        System.out.print("Enter course code: ");
        String code = scanner.nextLine();

        System.out.print("Enter course name: ");
        String name = scanner.nextLine();

        System.out.print("Enter maximum capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Course course = new Course(code, name, capacity);
        CourseManagement.addCourse(course);
        System.out.println("Course added successfully.");
    }

    private static void enrollStudentInCourse() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        // Placeholder for actual student retrieval
        Student student = new Student("James Wood", studentId);
        // Placeholder for actual course retrieval
        Course course = new Course(courseCode, "Math 1101", 100);

        CourseManagement.enrollStudent(student, course);
        System.out.println("Student enrolled successfully.");
    }

    private static void assignGradeToStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        // this would ideally involve looking up the actual student and course objects
        Student student = new Student("James Wood", studentId);
        Course course = new Course(courseCode, "Math 1101", 100);

        CourseManagement.assignGrade(student, course, grade);
        System.out.println("Grade assigned successfully.");
    }

    private static void calculateStudentOverallGrade() {
        System.out.print("Enter student ID for overall grade calculation: ");
        String studentId = scanner.nextLine();

        Student student = new Student("James Wood", studentId);

        double overallGrade = CourseManagement.calculateOverallGrade(student);
        System.out.println("The overall grade is: " + overallGrade);
    }
}
