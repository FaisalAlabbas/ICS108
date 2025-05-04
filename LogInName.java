// Write a program that creates a login name for a user, given the user's first name, last name, and a four-digit integer as input.
// Output the login name, which is made up of the first six letters of the first name, followed by the first letter of the last name, an underscore (_), and then the last digit of the number (use the % operator). 
// If the first name has less than six letters, then use all letters of the first name.

// Ex: If the input is:

// Michael Jordan 1991
// the output is:

// Your login name: MichaeJ_1
// Ex: If the input is:

// Nicole Smith 2024
// the output is:

// Your login name: NicoleS_4


import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String first = sc.next();
		String last = sc.next();
		int number = sc.nextInt();

		String login;

		if (first.length() < 6)  {
			login = first + last.charAt(0) + '_' + (number % 10);
		}
		else {
			login = first.substring(0, 6) + last.charAt(0) + '_' + (number % 10);

		}
		System.out.println("Your login name: " + login);
	}
}
