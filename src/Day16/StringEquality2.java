package Day16;

public class StringEquality2 {

	public static void main(String[] args) {


		String s1 = "abc"; // using string literal
		
		String s2 = new String("abc"); // using new keyword
		
		System.out.println(  s1 == s2 );
		
		String s3 = "abc" ;
		
		System.out.println(  s1 == s3 );
		
		
		//SCP == STRING CONSTANT POOL --->> STRING POOL
		//String pool is special location inside heap
		//to store unique string literal
	}

}
