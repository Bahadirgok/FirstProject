package Day12;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		//take 2 number from users
		//ask the operation from user
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("operator + , - , * , / ");
		String operator = scan.next();
		
		if(operator.equals("+")) {
			System.out.println("the result is " + (num1+num2));
			
		}else if(operator.equals("-")) {
			System.out.println("the substarction result is " + (num1-num2));
		    
	    }else if(operator.equals("*")){
	      System.out.println("the multiplication result is " + (num1*num2));
	    
	    }else if(operator.equals("/")){
	      System.out.println("the division result is " + (num1/num2));
	    
	    }else{
	      System.out.println("INVALID OPERATOR!");
	    }
		
		
		
		}

	}


