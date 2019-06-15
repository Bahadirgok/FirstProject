package Day23;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		
		//TASK2
		//create an array of double with size 4
		//assign 4 value
		//the print them all out
		
		//dataType[] variableName = new dataType[4];
		//dataType variableName[] = new dataType[4];
		
		
		double [] prices1 ;
		prices1 = new double[4];
		
		prices1[0] = 1.5 ;
		prices1[3] = 2.12 ;
		prices1[2] = 23.99 ;
		prices1[1] = 12.32 ;
		
		System.out.println(prices1[2] );
		
		//double  prices2[] ;
		//TASK 5
		/*
		 * declare boolean array variable that point to array of size 5
		 * declare short variable
		 * declare String array variable
		 * declare Scanner array variable
		 * */
		
		//the number in [] is the capacity of array pbject
		boolean[] ofOffs = new boolean[5];
		short[] shortNum = new short[2];
		String[] strs = new String[20];
		Scanner[] manyScan = new Scanner[15];
		
	}

}
