package methods;

import java.util.Scanner;

public class Bank {
	static int balance=1000;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("*******************HDFC Bank*******************");
		System.out.println("please choose your option:");
		System.out.println("1 for deposite:");
		System.out.println("2 for withdraw:");
		int option=sc.nextInt();
		switch (option) {
		case 1:
			Addamount();
			break;
		case 2:
			withdrawn();
		default:
			break;
		}
		
	}
	public static void Addamount( ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total amount:");
		 balance+=sc.nextInt();
		 System.out.println("Amount added: balence is:  "+balance);
		 
		}
	public static void withdrawn() {
		
		System.out.println("Enter withdrawl amount:");
		int W=sc.nextInt();	
		if(W>0&&W<=balance) {
			balance-=W;
			System.out.println("withdraw success:" +balance);
		}else {
			System.out.println("please enter value ammount");
		}
	}
	
}
