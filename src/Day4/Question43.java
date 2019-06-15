package Day4;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");

	        System.out.println("Enter your property type:");
	        houseType = scan.nextLine();
	        
	            if (houseType.equalsIgnoreCase("condo")) {
	                propertyPrice += 50000;
	            }
	            
	            else if (houseType.equalsIgnoreCase("Townhouse")) {
	                propertyPrice += 75000;
	            }
	            
	            else if (houseType.equalsIgnoreCase("single family home")) {
	                propertyPrice += 95000;
	            }
	            
	            else 
	                System.out.println("Invalid house type");
	            
	        
	            
	            
	            
	            
	        System.out.println("How many bedrooms do you have?");
	        numberOfBedrooms = scan.nextInt();
	        
	            int priceOfBedroom = numberOfBedrooms * 30000;
	        
	            propertyPrice += priceOfBedroom;
	            
	            
	            
	            
	            
	        
	        System.out.println("Do you have a backyard?");
	        backyard = scan.nextBoolean();
	        
	        
	        if (backyard == true) {
	            if (houseType.equalsIgnoreCase("TownHouse") | houseType.equalsIgnoreCase("Single Family Home")) {
	                
	                propertyPrice += 5000;
	            }
	            
	            else if (houseType.equalsIgnoreCase("condo")){
	                System.out.println("Backyard is not available for condo!");
	            }
	        }
	        
	        
	        
	        
	        
	        
	        
	        System.out.println("Do you have garage?");
	        garage = scan.nextBoolean();        
	        
	        System.out.println("How many spots?");
	        garageSpots = scan.nextInt();
	        
	        if(garage == true) {
	            
	            if (garageSpots <= 10) {
	                propertyPrice += garageSpots * 20000;
	                
	            }
	            
	            else if (garageSpots > 10) {
	                System.out.println("Pardon, it's not a public parking!");
	            }   
	            
	        }
	    
	        
	        
	        
	        
	        
	        
	        System.out.println("How close is metro station?");
	        metroAccessibility = scan.nextFloat();
	        
	            if (metroAccessibility <= 1 ) {
	                propertyPrice += 10000;
	            }
	            
	            else if (metroAccessibility > 1 | metroAccessibility <= 3) {
	                propertyPrice += 5000;
	            }
	        
	            
	            
	            
	            
	            
	        System.out.println("How close is highway?");
	        highwayAccessibility = scan.nextFloat();
	        
	            if (highwayAccessibility == 1) {
	                propertyPrice += 15000;
	            }
	        
	            else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {
	                propertyPrice += 8000;
	            }
	            
	            else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
	                propertyPrice += 4000;
	            }
	            
	            
	            
	            
	            
	            
	            
	        System.out.println("What's the rating of nearest school?");
	        schoolScore = scan.nextFloat();
	        
	        
	            if (schoolScore == 10.0 || schoolScore >= 8.0 ) {
	                propertyPrice += 45000;
	            }
	    
	            else if (schoolScore >= 4.0 ) {
	                propertyPrice += 20000;
	            }
	        
	            else  if ( schoolScore < 4.0){
	                propertyPrice += 5000;
	            }
	        
	        System.out.println("Does any of your family members smoking?");
	        smoking = scan.nextBoolean();
	        
	        if (smoking == true) {
	            propertyPrice -= 5000;
	        }
	        
	        
	        System.out.println("Market report has been generated.");
	        System.out.println("Your estimate market price is: " + propertyPrice + "$");
	        
	        
	  }
	
	
		
	}


