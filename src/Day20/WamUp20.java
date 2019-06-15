package Day20;

import java.util.Scanner;

public class WamUp20 {

	public static void main(String[] args) {

		String name = "";
		String pass = "";
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter User Name");
			name=scan.next();
			System.out.println("Enter Password");
			pass = scan.next();
		
	}while( ! (name.equals("abc") && pass.equals("123"))) ;
          System.out.println("END");
}
}
