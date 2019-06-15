package Day17;

public class WhileLoopPractice {

	public static void main(String[] args) {

		//TASK 2 print even numbers from 0-10
		
		int x = 0;
		
		//while (x <= 10) {
		//	System.out.println("value of x is " + x);
		//	x++;  // x = x+2; or x+=2; count value 0-2-4-6-8-10
			 
		//}
		// How many iteration do we have 11 
		
		while(x < 11) {
					
		if( x%2==0 ) {
		System.out.println("value of x is " + x );
		
		}
		x++ ; 
	}
				
		
	      // TASK 3 : 
		  // print out all the odd numbers within 50-100
		int z= 50;
		while (z<100) {
			if (z%2==1) {
				System.out.println("value of x is " +z);
			}
			z++;
		}
		
		
	      // OPTIONAL TASK : print only even number between 50-70
		  // and odd number for the rest in one while loop 
		
	}

}
