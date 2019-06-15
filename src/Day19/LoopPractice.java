package Day19;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		    System.out.println("ENTER A name");
		    // Ask user a name 
		    // for example  Bilal ----> B-i-l-a-l-
		    String name = scan.nextLine() ;
		    /// USING ABOVE CODE --> CREATE A PROGRAM 
		    // TO CHECK WHETHER A WORD IS PALINDROM 
		    //    ANA --> REVERSE -- ANA
		    //    CIVIC --> REVERSE -- CIVIC

		    int count = name.length() ;  // ABC 
		    String reversed = ""; 
		    
		    // in order to reserve a String
		    // we can start getting the chars in reversed order
		    // by using charAT method
		    // since the order is decrementing, we use --
		    // in order to save the reserved word, we need a container
		    // before we reverse the word, just put empty value in container
		    // while we looping through each chars,
		    // concatenate this character to the variable value
		    // after the loop we will have the word stored in reversed order
		    
		    while(count>0) {

		      count-- ; 
		      reversed  = reversed + name.charAt(count) ; 
		      //reversed += name.charAt(count)
		      System.out.println( reversed  );      
		      
		    }
		    System.out.println( "PALINDROME " + name.equals(reversed) );
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    //System.out.println();
//		    System.out.print(name.charAt(0)+"-");
//		    System.out.print(name.charAt(1)+"-");
//		    System.out.print(name.charAt(2)+"-");
//		    System.out.print(name.charAt(3)+"-");
//		    System.out.print(name.charAt(4)+"-");
		    
		    
		    
		   
	}
	
}
