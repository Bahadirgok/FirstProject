package Day28;

import java.util.Arrays;
import java.util.Scanner;

public class AddItemToArray {

	public static void main(String[] args) {
	 
	    // create a program to add items to an array by users input 
	    // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17}
	     
	   Scanner scan = new Scanner (System.in);
	   System.out.println("Enter your word to be added");
	   String usersWord = scan.next();
	     
	   String[] newWords = {"AAA", "BBB", "CCC", "DDD", "EEE"};
	 
			   Arrays.copyOf(newWords, usersWord.length() + 1);
	   System.out.println(Arrays.toString(newWords));
	     
       int lastSpotIndex = newWords.length-1 ;
	   newWords[lastSpotIndex] = usersWord ;
       System.out.println(Arrays.toString(newWords));
	}

}
