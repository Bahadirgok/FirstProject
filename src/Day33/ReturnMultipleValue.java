package Day33;

import java.util.Arrays;

public class ReturnMultipleValue {

	public static void main(String[] args) {
		
		int[] myArray = giveMeAnArray();
		System.out.println( Arrays.toString(myArray));
		
//		CALING in one shot
		System.out.println( Arrays.toString(giveMeAnArray() ));
	    	
	}
	
//  This method have no parameter
//	and return int array object as returned value
	public static int[] giveMeAnArray() {
		
		
		System.out.println("Action ");
		int[] arr = new int[] {1,2,3};
		return arr ;
	}


}
