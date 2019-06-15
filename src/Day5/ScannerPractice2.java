package Day5;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {

		
		
		
		Scanner input = new Scanner(System.in); 
		
		
		
	    // short cut for importing is COMMAND/CONTROL + SHIFT + O 
	    // ask user questions 
	    System.out.println("Enter your name today : ");
	    // save user input into String
	    String name = input.next();  // This will only pick up a word as Sring
	    
	    System.out.println("Enter your birth year today : ");
//	    // save user input into int
	    int age = input.nextInt(); 

	    System.out.println("Enter current year : ");
//	    // save user input into int
	    int year = input.nextInt(); 
	    
	    
	    
	  // TASK 2 
	    // ASK USER TO ENTER BIRTH YEAR AS A NUMBER 
	    // and calculate users age 
	    
	    System.out.println("Your name is : " + name );
	    System.out.println("Your age is : " + (year - age) );

	    
//	    System.out.println("Your name is : " + name 
//	            + "\n Your Age is " + age);
        System.out.println("Enter short value :" );
        short b1 = input.nextShort();

	    System.out.println("You have entered short value " + b1);
        System.out.println("Enter float value :" );

	    float c1 = input.nextFloat();
        System.out.println("Enter double value :" );
	    System.out.println("You have entered fload value " + c1);

	    double d1 = input.nextDouble();
	    System.out.println("You have entered double value " + d1);

	
	}

}
