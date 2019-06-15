package Day19;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
	    
	    String theSentence = "" ; 
	    
	    while( theSentence.contains("java")== false    ) {
	      
	      System.out.println("Enter the sentence");
	      theSentence = scan.nextLine(); 
	      
	    }
	    
	    //while(! theSentence.toUpperCase().contains("JAVA")) {
	    while(! theSentence.toLowerCase().contains("java")) {
	        System.out.println("Enter the sentence");
	      theSentence = scan.nextLine();       
	    }
	    
	    
	    System.out.println(" END ");
	    
	
	}
	   
	


}
