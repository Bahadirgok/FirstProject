package Day32;

public class Utility {

	public static void main(String[] args) {
		
		String name = "Emine";
		System.out.println(name.length() );
//		There are two ways to call static methods
//		1- If the method is in same class
//		we can just directly call the method by it's name
//		and passing the value it required
//		2- or we can use className.staticmethodName(params..)
		
		
//		we can use directly staticMethod(parameters)to call static methods
//		we are printing out so we can see the result of method call
		System.out.println( giveMeFive() );
//		System.out.println( 5 );
		
//		we can use className.staticMEthod to call static methods
		System.out.println( Utility.giveMeFive() );
		
		int myNum = giveMeFive();
		System.out.println(myNum);
		
		
	}

	public static int giveMeFive() {
		
		return 5 ;
	}
}
