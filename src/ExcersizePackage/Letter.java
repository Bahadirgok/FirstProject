package ExcersizePackage;

import java.util.Scanner;

public class Letter {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the grade score:");
		  int score = scn.nextInt();
		  
		  if(score>=90) System.out.println("You got A");
		  if(score>=80) System.out.println("You got B");
		  if(score>=70) System.out.println("You got C");
		  if(score>=60) System.out.println("You got D");
		  if(score<60) System.out.println("You got F");
		
		
	}
	

}
