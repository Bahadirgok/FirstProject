package Day30;

public class MethodWithParameters {

//	public static void main(String[] args) {
		
//		String s = "abc";
//		System.out.println(s.substring(1,3));
		
//		 printTheSum(10.5, 20.9);
//		 printTheSum(123.9, 200.1);
//		 printTheSum(11.33, 44.1);
//		 printTheSum(11, 5);
//		
//		
//	}
//	
//	public static void printTheSum(double a, double b) {
//		
//		double sum = a + b ;
//		System.out.println("the sum of numbers is " + sum);
//		
//	}
	// create a static method called reportName
	// this method take 2 String parameters as firstName, lastName
	// return nothing
	// in the body -->
	// print the length of first and lastName with nice message
	// print the first initial of first and lastNam together
	
	public static void reportName(String firstName, String lastName) {
		System.out.println("firstName " +firstName + " length is: "+ firstName.length() );
		System.out.println("lastName " +lastName + " length is: "+ lastName.length());
		System.out.println("Your initial is  " +lastName.charAt(0) + " length is: "+ lastName.charAt(0));

	}
	public static void main (String[] args) {
		
		reportName("Sercin", "Gok");
		reportName("Bahadir", "Gok");
		
	}
	
	//create s static method called reverseString
	//it takes one String as a parameter return nothing
	//in the body --> print reversed String
    
	//create a static method called addAllNumbers
	//it takes 3 numbers and get 
	
}
