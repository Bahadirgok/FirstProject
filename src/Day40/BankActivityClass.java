package Day40;

public class BankActivityClass {

	public static void main(String[] args) {
		
		BankAccount costumer1 = new BankAccount();
		costumer1.accountHolder = "Bahadir" ;
		costumer1.balance = 2935.6;
		
		costumer1.showAccountHolder();
		costumer1.showBalance();
		costumer1.add100Dollar();
		costumer1.showBalance();
		
		System.out.println("---------------");
		BankAccount costumer2 = new BankAccount();
		
		costumer2.accountHolder = "Sercin GOK";
		costumer2.balance = 2500;
		
		costumer2.showAccountHolder();
		costumer2.showBalance();
		costumer2.add100Dollar();
		costumer2.showBalance();
		costumer2.addDollar(200);
		costumer2.showBalance();
	}

}
