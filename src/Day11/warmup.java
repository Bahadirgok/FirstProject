package Day11;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		//TASK 1 : 

		//	FIZZ BUZZ TEST 

		//	ask user for a int 

		//	here is your condition 
		//if the number is divisible by 5  print fizz

		//	if the number is divisible by 3 print buzz

		//	if both are true print fizz buzz
		

		
		System.out.println("Enter a number");
		
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    // THIS MUST BE THE FIRST condition 
	    if (num % 5 == 0 && num % 3 == 0)
	      System.out.println("fizz buzz");
	    else if (num % 5 == 0)
	      System.out.println("fizz");
	    else if (num % 3 == 0)
	      System.out.println("buzz");
	    else
	      System.out.println("NOT A FIZZ BUZZ NUMBER");


	}

}
