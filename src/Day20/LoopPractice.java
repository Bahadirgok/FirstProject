package Day20;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		// Task 1 :
	    
	    // print our name char by char using do while loop 
	    // Hurma --> H u r m a 
	    // use do while loop 
		int x = 0;
		do {
			System.out.println(name.charAt(x) + " ");
			x++ ;
		}while(x<name.length());
		
		
		
		
		
		
		
		
		
//		String fUp = name.substring(0,1).toUpperCase();
//		String expected = fUp + name.substring(1);
//		
//		
//		
//		System.out.println(expected);
		
	}

}
