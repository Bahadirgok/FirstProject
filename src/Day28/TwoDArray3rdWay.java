package Day28;

public class TwoDArray3rdWay {

	public static void main(String[] args) {
		
//		int[] nums = {1,23,4} ;
		
		int [][] data = { {2,14,3} , {4,5} , {9} };
		
		for(int[] row : data) {
			
			for(int cell: row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < data.length; i++) {
		
		  System.out.println("Row Number " + (i+1) + " : ");
		  for(int j=0 ; j < data[i].length ; j++) {
			  System.out.println( data[i][j] + " " );
		  }
            System.out.println();
	}
	}
}
