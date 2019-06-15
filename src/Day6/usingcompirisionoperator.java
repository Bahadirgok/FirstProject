package Day6;
import java.util.Scanner;
public class usingcompirisionoperator {

	public static void main(String[] args) {

		 // creating scanner object
		
	    Scanner input = new Scanner(System.in);  
	      
	    // ask user questions 
	    System.out.println("Enter number 1 : ");
	    int num1 = input.nextInt();
	    System.out.println("Enter number 2 : ");
	    int num2 = input.nextInt();
	     
	    input.close();
	    
	    
	    boolean isGreater = num1 > num2 ;  
	    
	    System.out.println( "IS NUMBER 1 GREATER THAN NUMBER 2? : " +  isGreater );
		
		
	}

}
