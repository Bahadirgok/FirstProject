import java.util.Scanner;

public class Excersize2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0");
		double v0 = input.nextDouble();
		System.out.println("Enter v1");
        double v1 = input.nextDouble();
        System.out.println("Enter Time");
		double t = input.nextDouble();
		
		double avarageacceleration = (v1 - v0)/(t);
		
		System.out.println("Your Acceleration is " + avarageacceleration);
		
	
	}

}
