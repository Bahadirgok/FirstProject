package Day28;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		

	    String str = "Sunday Perfect Day to start coding" ; 
	    // coding start to Day Perfect Sunday
	    // reverse above sentence to generate below
	    String[] strArr = str.split(" ");
	    
	    for (int i  = strArr.length-1 ; i >= 0 ; i--) {
	    	
	    	
//	    	System.out.print(strArr[i] + "-");
	    }
	    
	    String strRev = "" ;
	    int lastIndex = strArr.length-1 ;
	    
	    for (int i = 0; i < strArr.length/ 2; i++) {
//	    	System.out.print(strArr[i]);
	    	String temp = strArr[i] ; 
			strArr[i] = strArr[lastIndex - i];
	    	strArr[lastIndex - i] = temp;
	    		
	    	}
	    System.out.println( Arrays.toString(strArr));
	    }
	}


