package Day20;

public class Separator {

	public static void main(String[] args) {
		
		//Java day 20 is awesome---> Javaawesome 20
		
		String mix = "Aonline132x";
		
		char c = mix.charAt(0);
		
		//check weather c is between 0 - 9
		//if( c>= 32 && c<= 41 ) {
		
		if (c>='0' && c<= '9' ) {
			System.out.println("NUMBER!!");
		}else {
			System.out.println("NOT NUMBER!!");
		}
		if (c>='A' && c<= 'Z' ) {
			System.out.println("UPPERCASE!!");
		}else {
			System.out.println("NOT UPPERCASE!!");
		}
	}

}
