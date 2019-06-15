package Day24;

public class ArrayTasks {

	public static void main(String[] args) {
		
		char[] myNameChar = new char[7];
		myNameChar[0] = 'B';
		myNameChar[1] = 'A';
		myNameChar[2] = 'H';
		myNameChar[3] = 'A';
		myNameChar[4] = 'D';
		myNameChar[5] = 'I';
		myNameChar[6] = 'R';
		
	    System.out.print(myNameChar[0]);
	    System.out.print(myNameChar[1]);
	    System.out.print(myNameChar[2]);
	    System.out.print(myNameChar[3]);
	    System.out.print(myNameChar[4]);
	    System.out.print(myNameChar[5]);
	    System.out.print(myNameChar[6]);
	    
	    System.out.println( );
	     for (int i = 0; i < 7; i++) {
	    System.out.print( myNameChar[i]  );
	     }
	     System.out.println( );
	     
	     char[] myNameChar2 = new char[] {'G', 'u', 'l','j','a','h','a','n'} ; 
	     
	     //for (int i = 0; i <= myNameChar2.length-1 ; i++) {
	     for (int i = 0; i < myNameChar2.length ; i++) {
	      System.out.print( myNameChar2[i] + " " );
	     }
	     System.out.println();
	                 // 0    1    2    3    4    5    6    7 
	     char[] myNameChar3 = { 'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
	     
	     /// how do we get last items 
	     int count = myNameChar3.length ; 
	     
	     System.out.println( "item in last index : " +  myNameChar3[count-1] );
	     // how do we get the one in the middle 
	     
	     int midIndex = count/2 ; 
	     
	     System.out.println( "item in mid index : " +  myNameChar3[midIndex] );
	
	
	     System.out.print( myNameChar3[7] + " " );
	     System.out.print( myNameChar3[6] + " " );
	     System.out.print( myNameChar3[5] + " " );
	     System.out.print( myNameChar3[4] + " " );
	     System.out.print( myNameChar3[3] + " " );
	     System.out.print( myNameChar3[2] + " " );
	     System.out.print( myNameChar3[1] + " " );
	     System.out.print( myNameChar3[0] + " " );
	     
	     System.out.println();
	     
	     for(int i=7 ; i>=0 ; i--) {
	       System.out.print( myNameChar3[i] + " "   );
	     }
	}

}
