package Day15;

import java.util.Scanner;

public class AmazoneSerachTets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	// ask user items to search for
	//verify the tab name has chanced to Amazon.com and your Text
		
		System.out.println("Enter items to search for: ");
		String itemToSearchFor = sc.nextLine();
		
		System.out.println("You have entered: "+ itemToSearchFor);
		
		//Amazon.com itemToSearchFor
		
		String expectedResult = "Amazon.com : iPad" ;
		String actualResult = "Amazon.com :" + itemToSearchFor;
		
		if(expectedResult.equalsIgnoreCase (actualResult) ) {
			System.out.println("Test Pass for ipad");
		}else {
			System.out.println("Test Fail for ipad");
		}
		
		
	}

}
