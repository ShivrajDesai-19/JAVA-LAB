// Write a java program to get the name from user and print 10 times using loop.

import java.util.Scanner;

public class PrintNameTenTimes {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        // Get the name from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("\n--- Printing your name 10 times ---");

        // Loop runs from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }
    }
}