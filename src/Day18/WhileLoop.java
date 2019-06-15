package Day18;

public class WhileLoop {

	public static void main(String[] args) {

		// DRY Principle
		// Do not repeat yourself
		
		/*
		 * 
		 */
		
		int x = 10;
		if(x>5) {
			System.out.println("DO THIS");
		}else {
			System.out.println("DO THAT");
		}
		
		/*
		 * While (as long as some condition is true){
		 * repeat this action
		 * }
		 * 
		 * 
		 */
		int y = 10;
		while ( y > 5 ) {
			
			System.out.println(" do this " + y--);
			//y --;
		}
	}

}
