package Day9;
import java.util.Scanner;
public class StringEqualuty {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name Please");
		
		String name = scan.next();
		String expectedName = "Bahadir";
		
		//boolean b  = (name =="Bahadir");
		//we use method from Sting class called aquals
		
		//boolean nameEqualToExpected = name.equals("Bahadir");
		boolean nameEquaelToExpected = name.equals("Bahadir");
		
			
		
		if(name.equals("Bahadir") ) {
			System.out.println("That's me !!");
		}else{
			System.out.println("Dude it's not my name !!");
		}
	}


				

	}


