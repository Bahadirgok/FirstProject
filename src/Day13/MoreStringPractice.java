package Day13;

public class MoreStringPractice {

	public static void main(String[] args) {

		String s1 = "Bahadir";
		boolean aExistOrNot = s1.contains("i");
		
		System.out.println("does name contains a " + s1.contains("a") );
		
		System.out.println("what is the position of i : " + s1.indexOf("i"));
		
		 // subString(beginning index , ending index )
	    // it will return part of a string staring from beginning till right before ending index
	    
	     //012345
	    //"Bahadir" ; substring(1, 4) ---> i
	    String partOfString = s1.substring(1, 4) ; 
	    System.out.println(  partOfString);
	    
	    // 0123456    
	    // SAYYARA ---YAR
	    String s2 = "SAYYARA" ; 
	    System.out.println(  s2.substring(3, 6)  );
		
		
	}

}
