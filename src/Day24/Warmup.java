package Day24;

public class Warmup {

	public static void main(String[] args) {
			
		//TASK 1
		for (int i = 1; i <= 5; i++) {
			    
		      for (int j = 1; j <= 5; j++) {
		        System.out.print("java ");
		      }
		      System.out.println();
		    }
		    
		 //TASK 2
		for (int i = 1; i <=5; i++) {
			for(int j = 1; j<= i; j++) {
		System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//TASK 3
		for (int i = 'A'; i <= 'Z'; i++) {

		      for (int c = 'A'; c <= i; c++) {
		        System.out.print( (char)c + " ");
		      }
		      System.out.println();
		      
		    }
		
		  
       
	}

}
