package Day35;

public class MethodOverloading {

	public static void main(String[] args) {

		/*
	     * can i use same method name for different methods ? 
	     * YES !!!!!! 
	     * That's called method overloading 
	     * 
	     * Defination : 
	     *    reusing the name of the method with different method parameters
	     * 
	     *  you can have method with different parameter count 
	     *  you can have method with different parameter type
	     *  or both  
	     * 
	     * */ 
	    printName(); 
	    printName("JAVA ");
	    printName("JAVA ", "Spartan");
	    
	    
	    System.out.println();
	    
	    
	    
	  }
	  
	  public static void printName() {
	    System.out.println("no arg print name");
	  }
	  
	  public static void printName(String name) {
	    System.out.println("1 String arg print name " + name);
	  }
	  
	  public static void printName(int number) {
	    System.out.println("1 int arg print name " + number);
	  }
	  
	  public static void printName(String firstName, String lastName) {
	    System.out.println("2 String args print name  " + firstName+lastName);
		
	}

}