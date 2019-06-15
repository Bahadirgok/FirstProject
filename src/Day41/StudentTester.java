package Day41;

import Day40.BankAccount;

public class StudentTester {

	public static void main(String[] args) {
		
		Student muammar = new Student();
		muammar.name = "Muammar";
		muammar.age = 27;
		muammar.ssn = 1234567;
		
		muammar.displayName();
		
		BankAccount acc1 = new BankAccount();
		
//		muammar.displayNameAndAge();
//		muammar.displayshowSSN();
	}

}
