package Day18;

import java.util.Scanner;

public class WhileLoopMultipleCondition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please");
		int x = scan.nextInt();
		
		int y = 1;
		
		while (y<= x) {
			System.out.print(y + " " );
			y++;
		}
	}

}
