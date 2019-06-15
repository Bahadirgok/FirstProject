package Day5;

import java.util.Scanner;

public class ScannerRound2 {

	public static void main(String[] args) {
	  

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = input.next();
		System.out.println("Your first name is" + firstName);
		
	
		System.out.println("Enter your last name: ");
		String lastName = input.next();
		System.out.println("Your last name is " + lastName);
		

		System.out.println("Enter where are you from (City): ");
		String city = input.next();
		System.out.println("You are from " + city);
		

		System.out.println("Enter where are you from (State): ");
		String state = input.next();
		System.out.println("State: " + state);
				

		System.out.println("What is your nationality? - ");
		String nationality = input.next();
		System.out.println("Your nationality is " + nationality);
				
		

		
		System.out.println("Your full name is " + firstName+" " + lastName);
		
		System.out.println("You are from " + city + ", " + state);
		
		System.out.println("Your nationality is " + nationality);
		
	}

}
