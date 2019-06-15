package Day40;

public class BankAccount {

	// 2 instance variable/fields
	String accountHolder;
	double balance;
	
	public void showAccountHolder() {
		System.out.println("Account holder name is: " + accountHolder);
	}
	public void showBalance() {
		System.out.println( "Account balance: " + balance);
	}
	public void add100Dollar() {
		balance = balance +100;
	}
	public void addDollar(int amount) {
		balance = balance + amount;
	}
	
	//create an instance method (non-static method)
	//called showAccountHolder -->printOut Account Holder name
	
	//create an instance method showBalance and print out the balance
	
	//create an instance method a called add100Dollar
	//increase the balance of the account by 100
	
	//Create another class called BankActivity with main method
	//create bank account object
	//set account holder name and balance value
	//call your showAccountHolder and showBalance method
	
	
}
