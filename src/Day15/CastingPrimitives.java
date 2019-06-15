package Day15;

import java.util.Scanner;

public class CastingPrimitives {

	public static void main(String[] args) {

		Scanner task = new Scanner (System.in);
	    String name = task.next();
	    
	    char change = name.charAt(0);
	    char change2 = name.charAt(name.length()-1);
	    
	    int num1 = change;
	    int num2 = change2;
	    
	    System.out.println(num1 + "," + num2);
	}

}
