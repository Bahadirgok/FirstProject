package Day28;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) {
		
		/*
		 * Arrays Class methods to work with array object
		 * 
		 * toString(arrayObject --> return string rep of array items
		 * sort(); --> sort the array
		 * copyOf( arrObject , lengthOfNewArr) --> new array with length defined
		 *                            and everything copied from original
		 * copyOfRange( arrObject, from,to) --> works like subString 
		 * equals(arr1, arr2) --> true false if all elements are the same and
		 * 
		 * binarySearch
		 * */
		String[] words = {"coding" , "start", "to", "Day", "Perfect", "Sunday"};
		Arrays.sort(words);
		System.out.println( Arrays.toString(words) );
		
		String[] first2words = Arrays.copyOf(words, 2) ;
	    System.out.println( Arrays.toString(first2words) );
	     
	    String[] tenItem = Arrays.copyOf(words,10) ;
	    System.out.println( Arrays.toString(tenItem) );
	}

}
