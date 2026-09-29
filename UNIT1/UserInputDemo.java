// Write a java program to get different values from user at runtime using Scanner.

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Reading a String (Text)
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine(); 

        // 2. Reading an Integer (Whole Number)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 3. Reading a Double (Decimal Number)
        System.out.print("Enter your GPA or salary: ");
        double financialValue = scanner.nextDouble();

        // 4. Reading a Boolean (true/false)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("USER PROFILE SUMMARY");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Value: " + financialValue);
        System.out.println("Is Student? " + isStudent);

    }
}