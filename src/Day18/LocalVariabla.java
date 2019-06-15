package Day18;

import java.util.Scanner;

public class LocalVariabla {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = 0;
		//while( !(x==5 || x==10)  ){ this is another method
		while(x!=5 && x!=10) {
			System.out.println("Give me 5 or 10 dollars");
			x = scan.nextInt();
		}
		System.out.println("Thank You");
	}

}
