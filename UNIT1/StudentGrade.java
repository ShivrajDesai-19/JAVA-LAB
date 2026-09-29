public class StudentGrade {
    public static void main(String[] args) {
        // Convert the command-line argument to an integer
        int marks = Integer.parseInt(args[0]);

        // Determine the grade using IF conditions
        if (marks >= 90 && marks <= 100) {
            System.out.println("Marks: " + marks + " | Grade: A+ (Excellent)");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Marks: " + marks + " | Grade: A (Very Good)");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Marks: " + marks + " | Grade: B (Good)");
        } else if (marks >= 50 && marks < 70) {
            System.out.println("Marks: " + marks + " | Grade: C (Satisfactory)");
        } else if (marks >= 35 && marks < 50) {
            System.out.println("Marks: " + marks + " | Grade: D (Pass)");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Marks: " + marks + " | Result: FAIL");
        } else {
            System.out.println("Invalid Marks! Please enter a value between 0 and 100.");
        }
    }
}