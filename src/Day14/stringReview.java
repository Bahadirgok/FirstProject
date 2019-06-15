package Day14;

import java.util.Scanner;

public class stringReview {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    System.out.println("Please enter the text:");
	    
	    String a = in.nextLine();
	    int b = a.length();
	    System.out.println("Length is: "+b);
	    // combine // System.out.println("Length is: "+ a.length());
	    
	    System.out.println("Uppercase output: "+a.toUpperCase());
	    System.out.println("Lowercase output: "+a.toLowerCase());
	    
	    char secondChar = a.charAt(1);
	    System.out.println("2nd character is "+secondChar);
	
	
	
	}
	

}
