package methods;

public class Banking {
	static int currentBalance=1000;
	public static void greetcustomer() {
		System.out.println("Hello, Welcome to the banking application");
	}
	public void deposit(int amount){
		currentBalance=currentBalance+amount;
		System.out.println("amount is deposited succesfully");
	}
	public static void withdrawal(int amount) {
		currentBalance=currentBalance-amount;
		System.out.println("Amount is withdrawl sucessfully");
	}
	public int getcurrentBalance() {
		return currentBalance;
		
	}
public static void main(String[] args) {
	Banking s=new Banking();
	greetcustomer();
	System.out.println("current balence is:"+s.getcurrentBalance());
	s.deposit(500);
	System.out.println("current balance is:"+s.getcurrentBalance());
	 withdrawal(300);
	 System.out.println("current balance"+s.getcurrentBalance());
	 
}
}
