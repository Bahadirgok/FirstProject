package Day14;

public class MoreStringMethods {

	public static void main(String[] args) {

		// subString(beginningIndex, EndinIndex)
		// beginning index is always inclusive
		//ending index is always exclusive
		             //012345
     //String name1 = "Sercin" ;
		
		//rci
		//System.out.println( name1.substring(2,5)  );
		
		//System.out.println(  name1.substring(1,5) );
		
		//System.out.println( name1.substring(1,6)  );
		
		//Task 1
        // store your name into A String 
        // print your last character 
        // print your first 2 character 
        
        // OPTIONAL 
        // print your name starting from middle till the end
		
	String name2 = "Bahadir";
		int count = name2.length();
		
		System.out.println(name2.substring(count-1, count));
		System.out.println(name2.substring(0,2));
		
		int midPoint = count/2;
		System.out.println(midPoint);
		
		System.out.println( name2.substring(midPoint,count));


	}

}
