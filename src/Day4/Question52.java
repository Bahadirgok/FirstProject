package Day4;

import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	      String splitOrNoSplit;
	        int numberOfPeople;
	        double checkAmount, tip, total = 0 , tipPerPerson,totalTip;
	        String serviceQuality;
	        
	        
	        System.out.println("Split:");
	        splitOrNoSplit = scan.next();
	        
	        System.out.println("Number of people:");
	        numberOfPeople = scan.nextInt();
	        
	        System.out.println("Check amount:");
	        checkAmount = scan.nextDouble();
	        
	        System.out.println("Service Quality:");
	        serviceQuality = scan.next();
	        
	        
	        if (serviceQuality.equalsIgnoreCase("excellent")) {
	            tip = 0.25*checkAmount;
	            total = tip + checkAmount;
	        }
	        
	        else if (serviceQuality.equalsIgnoreCase("great")) {
	            tip = 0.20*checkAmount;
	            total = tip + checkAmount;
	        }
	        
	        else if (serviceQuality.equalsIgnoreCase("good")) {
	            tip = 0.15*checkAmount;
	            total = tip + checkAmount;
	        }
	        else if (serviceQuality.equalsIgnoreCase("fair")) {
	            tip = 0.10*checkAmount;
	            total = tip + checkAmount;
	        }
	        else if (serviceQuality.equalsIgnoreCase("poor")) {
	            tip = 0.05*checkAmount;
	            total = tip + checkAmount;
	        }
	        
	        totalTip = total-checkAmount;
	        tipPerPerson=totalTip/numberOfPeople;
	        
	        
	        
	        if(numberOfPeople == 4 ) {
	            System.out.println("Number of people entered: &&&&" );
	        }
	        
	        else if (numberOfPeople ==5 ) {
	            System.out.println("Number of people entered: &&&&&" );
	        }
	        
	        
	        System.out.println("Total to pay: " + total);
	        System.out.println("Total tip: " + (totalTip));
	        System.out.println("Total per person: " + (total/numberOfPeople));
	        
	        if(splitOrNoSplit.equalsIgnoreCase("yes")) {
	        System.out.println("Tip per person: " + (tipPerPerson));
	        }
	}

}
