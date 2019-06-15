package Day37;

import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		
ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(49);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		
		//add a number at index 1; add(index, value);
		numList.add(1, 99);
		System.out.println(numList);
		
		//update a value
		numList.set(2, 23);
		System.out.println("Changed at index 2"+ numList);
		
		
		//remove a message, 1000 will be gone
		numList.remove(1);
		System.out.println("Index 1 removed: "+ numList);
		
		//clear all contents in the template
		numList.clear();
		System.out.println("all data cleared: " + numList);
		
	}

}
