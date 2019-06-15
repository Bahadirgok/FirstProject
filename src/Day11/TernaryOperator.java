package Day11;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//used for conditional assigning a value
		int score = 98;
		String abc = "";
		
		if(score>75)
			abc = "pass";
		else abc = "fail";
		
		abc = (score>75)? "pass" : "fail";
		System.out.println(abc);
		
		//Task 3:
		//create a variable price as double, String as label
		//if the price is more than 100 assign value as expensive
		// else assign value as cheap
		
		double price = 99.9;
		String label = "";
		
		if (price>100)
			label = "expensive";
		else label = "cheap";
		
		label = (price>100)? "expensive" : "cheap";
		System.out.println(label);

	}

}
