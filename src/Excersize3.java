import java.util.Scanner;

public class Excersize3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter Your Price");
		
		double price = input.nextDouble();
		
		double tax = (price*8.25/100);
		
		double total = price + tax;
		
		System.out.println("Your Price " + price + " Your Tax is " + tax + " Your Total is " + total);
		
		
	}

}
