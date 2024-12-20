package methods;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManger {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Method to add a student
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Marks: ");
        double marks = scanner.nextDouble();

        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    // Method to view all students
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Marks: " + student.marks);
        }
    }

    // Method to calculate average marks
    public static void calculateAverageMarks() {
        if (students.isEmpty()) {
            System.out.println("No students available to calculate average marks!");
            return;
        }

        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }
        double average = totalMarks / students.size();
        System.out.println("Average Marks: " + average);
    }

    // Overloaded method to search for a student by ID
    public static void searchStudent(int id) {
        for (Student student : students) {
            if (student.id == id) {
                System.out.println("Student Found: ID: " + student.id + ", Name: " + student.name + ", Marks: " + student.marks);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    // Main method
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    calculateAverageMarks();
                    break;
                case 4:
                    System.out.print("Enter Student ID to search: ");
                    int id = scanner.nextInt();
                    searchStudent(id);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
