package Day9;

import java.util.Scanner;

public class SimpleIfWithoutCurlyBraces {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers");
		int x = scanner.nextInt();
		
		/*
		 * booleam b = false;
		 * () inside here, you can put
		 * boolean literal : trure false
		 * boolean variable : b
		 * boolean expression : any operation that result in boolean
		 * 
		 **/
		//Curly braces for if and else blocks are optional
		// ONLY WHEN WE HAVE SINGLE STATEMENT
		
		//COMMAND SHIFT F
		//CTRL SHIFT F
		
		if(x != 10 ){
			System.out.println("NOT 10 !");
				
		}else 
				System.out.println("YES IT IS 10 !");
				System.out.println("YES IT IS 10 as i said");
			
		}

	}



