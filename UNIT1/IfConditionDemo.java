// Write a java program to use IF Condition 

import java.util.Scanner;

public class IfConditionDemo {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voting Eligibility Checker");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Using the IF condition
        if (age >= 18) {
            System.out.println("Congratulations! You are eligible to vote.");
        } else {
            System.out.println("Sorry, you are not old enough to vote yet.");
            int yearsLeft = 18 - age;
            System.out.println("Come back in " + yearsLeft + " year(s)!");
        }
    }
}