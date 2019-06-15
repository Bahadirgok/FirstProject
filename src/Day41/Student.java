package Day41;

public class Student {

//	Public String name;
//	Public int age;
//	Public long ssn;
	String name;
	int age;
	long ssn;
	
	public void displayName() {
		System.out.println("name is: " + name);
	}
	//it is only accessible within same class
	//which means Student class only
	public void displayNameAndAge() {
		System.out.println("name is: "+name +"|age is"+ age);
	}
	
	//it is only accessible within same class
	//which means Student class only
	public void showSSN() {
		System.out.println("SSN is " + ssn);
	}
}
