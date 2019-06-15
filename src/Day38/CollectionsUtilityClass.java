package Day38;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityClass {

	public static void main(String[] args) {
		
//		Arrays class is a class that have a lot of
//		static methods to perform common array operation
//		Arrays.sort(arrayObject)
		
//		Collections is a class under java.util package
//		to perform common collection object related operation
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Yunus");
		lst.add("Vera");
		lst.add("Sercin");
		lst.add("Bahadir");
		lst.add("Meryem");
		lst.add("Gok");
		
		System.out.println(lst);
//		sorting arrayList using sort method of Collections class
		Collections.sort(lst);
		System.out.println(lst);
		
//		looking for the index of an item in the sorted list
		int yunusLocation = Collections.binarySearch(lst, "Yunus");
		System.out.println("index is: " + yunusLocation);
		
		int talmuratLocation = Collections.binarySearch(lst, "talmurat");
		System.out.println("index is: " + talmuratLocation);
		
		// reversing collection
		Collections.reverse(lst);
		System.out.println(lst);
		
		// shuffle items inside the list 
	    Collections.shuffle(lst);
	    System.out.println(lst);
	
		
		
	}

}
