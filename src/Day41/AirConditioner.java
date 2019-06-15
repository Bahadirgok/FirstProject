package Day41;

	public class AirConditioner {
	String brand;
	float currentTemp;
	boolean isOn;

	public void displayBrand() {
	System.out.println("The brand is: " + brand);
	}
	public void showCurrentTemp() {
	System.out.println("currentTemp: " + currentTemp);
	}
	public void displayAllInfo() {
	    System.out.println("Brand is "+brand+" | The current temp is: "+currentTemp+" | Is AC on? "+isOn);
	}
	public void turnOn() {
	    
	System.out.println("current AC status: " + isOn);
	    
	   if(isOn == false) {
	      isOn = true ; 
	    }else {
	      System.out.println("It is already on !!!");
	    }
	    
	  }
	  
	  public void turnOff() {
	    
	    if(isOn) {
	      isOn = false;
	      System.out.println("It has been turned off");
	    }else {
	      System.out.println("IT IS ALREADY OFF!@");
	    }
	    
	  }
	    public void increaseTemp(int increaseBy) {
	    	
	        //currentTemp = currentTemp + increaseBy; 
	        currentTemp += increaseBy;
	        // an instance method can be called inside 
	        // another instance method directly 
	        // just like an instance field 
	        // can be accessed directly inside any instance method 
	    }
	      	      
	      public void decreaseTemp(int decreaseBy) {
	        
	        //currentTemp = currentTemp - decreaseBy; 
	        currentTemp -= decreaseBy;
	        
	      }
	      
	      public void setTemperature(float targetTempurature) {
	        currentTemp = targetTempurature ; 
	      }
	  }


