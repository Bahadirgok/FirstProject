package Day23;

public class CrationArray {

	public static void main(String[] args) {
		
		int[] numbers = new int[2];
		
		//Assigning value to array
				numbers[0] = 10 ;
				numbers[1] = 15 ;
				numbers[0] = 100;
				
				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				
				numbers = new int[4];
				System.out.println(numbers[0]);


				//ArrayIndexOutOfBoundsException will occure when
				//you got out of range
				//numbers[2] = 28 ;
				//numbers[3] = 20 ;
				
	}

}
