package Day16;

public class StringPractice {

	public static void main(String[] args) {

		// string literal 
				//String str = "Sunday is Java Day" ; 
				String str = new String("Sunday is Java Day"); 
				String up = str.toUpperCase();
				System.out.println( up );
				
				int count = str.length(); 
				// using charAt 
				System.out.println(count);
				
				char last = str.charAt(count-1); 
				char beforeLast = str.charAt(count-2); 
				
				
				System.out.println(beforeLast +""+ last ); 
				System.out.println( str.substring(count-2,count)   );
				//System.out.println( str.substring(count-2)   );
				System.out.println( str.substring(16,18 )   );
				
				
				
				int positionOfIs = str.indexOf("is") ; 
				System.out.println("position Of Is : " + positionOfIs );
				
//				int x = str.indexOf(97) ; 
//				System.out.println( x );
				
				System.out.println( str.contains("Java")  );
				
				System.out.println( str.indexOf("Java")  );
				System.out.println( str.indexOf("Java")>-1  );
		
	}

}
