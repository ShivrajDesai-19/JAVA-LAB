// Write a java program to get personal information from user and display on screen


import java.util.Scanner;
public class Information{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details of user : "); 

		System.out.println("Name : ");
		String name = sc.nextLine();

		System.out.println("Surname: ");
		String surname =sc.nextLine();

		System.out.println("Age : ");
		String age = sc.nextLine();

		System.out.println("Number : ");
		String number = sc.nextLine();

		System.out.println("Name : " + name );
		System.out.println("Surname : " + surname);
		System.out.println("Age : " + age );
		System.out.println("Number : " + number );

	}
}