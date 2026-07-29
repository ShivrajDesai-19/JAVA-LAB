// Write a java program to get a name from user and display on screen.

import java.util.Scanner;
public class Name{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter user name : ");
		String name = sc.nextLine();
		System.out.println("the name is " + name );

	}
}