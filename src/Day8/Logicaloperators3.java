package Day8;

public class Logicaloperators3 {

	public static void main(String[] args) {
		
		//Logical operator &&
		//Logical oparetor ||
		//Logical operator !
		
		// Logical and operator &&
	      // As long as one operand is false WHOLE THING WILL BE FALSE 
	      // ONLY WHEN both operands are true then WHOLE THING WILL BE TRUE 
	    
	    // Logical or operator ||
	      // As long as one operand is TRUE WHOLE THING WILL BE TRUE 
	      // ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE 
	    
	    // Logical not operator !
		
		//difference betweeen single & | and double && || is
		   //&& will only evaluate first part if the whole result can be dedicated
		   // just using the first boolean value
		   
	      
	    
	    System.out.println("result of (true && true)  " +  (true && true)  );
	    System.out.println("result of (false && true) " +  (false && true)  );
	    System.out.println("result of (true && false) " +  (true && false)  );
	    System.out.println("result of (false && false) " +  (false && false)  );
	    
	    System.out.println("result of (true || true)  " +  (true || true)  );
	    System.out.println("result of (false || true) " +  (false || true)  );
	    System.out.println("result of (true || false) " +  (true || false)  );
	    System.out.println("result of (false || false) " +  (false || false)  );
	    
	    System.out.println("result of !true " + (!true) );
	    System.out.println("result of !false " + (!false) );
	}

}
