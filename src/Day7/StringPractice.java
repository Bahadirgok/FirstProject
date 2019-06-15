package Day7;

public class StringPractice {

	public static void main(String[] args) {
		
		//the outbut expected is ---> I love "Java"
		
		String name = "I love \"Java\" ";
		System.out.println(name);
		
		//the output expected is ---> I love \Java
		String name2 = "I love \\Java " ;
		System.out.println(name2);
		

		String sentence = " \" Stay Positive \" " ; 
		System.out.println( sentence );
		
		//my name is "Bahadir"
		//in order to have quotation inside your string
		//you need to add \ before to tell compiler it's not end of the String
		//but just treat it as normal quotation character
		//  \" will generate " in the outbut
		//same goes for \ itself --> will generate \ in output
		
		
		String name3 = "Bahadir ";
		System.out.println( "my name is \"" + name3 + "\" "    );
		
		System.out.println( " Java is\n Cool" );
		
	}

}
