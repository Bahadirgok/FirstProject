package Day8;

import java.util.Scanner;

public class ConditionalStatementPractice {

	public static void main(String[] args) {

		/*  TASK 2
	     *  BestBuy store : 
	     *  declare double variables for price of iphone , Ipad , yourBudget
	     *  assign value for iPhone as 599.99, ipad 899.99 
	     *  declare 2 more int variables for phoneCount and tabletCount
	     *  ask user to enter the budget 
	     *  ask user to enter quantity you want to buy 
	     *  calculate the total price 
	     *
	     *  write a conditional statement to check whether total price is more than your budget
	     *  if it's more print , out of budget
	     *  else print I Will take it !!
	     *  
	     *
	     *
	     *
	     * */
	    Scanner input = new Scanner(System.in); 
	    
	    double priceIphone = 599.99;
		double priceIpad = 899.99;
		
	    System.out.println("How many Iphone do you want to buy?");
	    int countIphone = input.nextInt();
	    System.out.println("How many Ipad do you want to buy?");
	    int countIpad = input.nextInt();
	    System.out.println("Please enter your budget");
	    int budget = input.nextInt();
	    
	    double totalPrice = (countIphone*599.99)+ (countIpad*899.99);
	    System.out.println("Your total price is: " +totalPrice);
	     if(totalPrice>budget) {
	    	 System.out.println("You are overbudget");
	    	 
	    	 
	     }
	    
	     else {
	    	
	    	 System.out.println("You are not over your budget");
	    	 
	     }

	}

}
