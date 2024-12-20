package methods;

import java.util.Scanner;

public class Banking2 {
	static Scanner sc=new Scanner(System.in);
	public static void choosebank() {
		System.out.println("---------------------------------------");
		System.out.println("Choose the bank:");
	}
	public static void Bankofbaroda() {
		System.out.println("Ac no:");
		String AC=sc.nextLine();
		System.out.println("AC holder Name:");
		String Name=sc.nextLine();
		System.out.println("IFSI Code:");
		String IFSI=sc.nextLine();
		System.out.println("Branch name:");
		String Branch=sc.nextLine();
		System.out.println("Address:");
		String Address=sc.nextLine();
		}
	public static void SBI() {
		System.out.println("Ac no:");
		String AC=sc.nextLine();
		System.out.println("AC holder Name:");
		String Name=sc.nextLine();
		System.out.println("IFSI Code:");
		String IFSI=sc.nextLine();
		System.out.println("Branch name:");
		String Branch=sc.nextLine();
		System.out.println("Address:");
		String Address=sc.nextLine();
		}
	public static void ICICI() {
		System.out.println("Ac no:");
		String AC=sc.nextLine();
		System.out.println("AC holder Name:");
		String Name=sc.nextLine();
		System.out.println("IFSI Code:");
		String IFSI=sc.nextLine();
		System.out.println("Branch name:");
		String Branch=sc.nextLine();
		System.out.println("Address:");
		String Address=sc.nextLine();
		}
	public static void HDFCI() {
		System.out.println("Ac no:");
		String AC=sc.nextLine();
		System.out.println("AC holder Name:");
		String Name=sc.nextLine();
		System.out.println("IFSI Code:");
		String IFSI=sc.nextLine();
		System.out.println("Branch name:");
		String Branch=sc.nextLine();
		System.out.println("Address:");
		String Address=sc.nextLine();
		}
	public static void main(String[] args) {
		choosebank();
		int option;
		do {
		System.out.println("Select the Bank:\n 1.Bank of Baroada\n 2.SBI\n 3.ICICI\n 4.HDFCI");
		System.out.println("Select which bank you will opens:");
		int select=sc.nextInt();
		
		
		switch (select) {
		case 1:
			Bankofbaroda();
			break;
		case 2:
			SBI();
			break;
		case 3:
			ICICI();
			break;
		case 4:
			HDFCI();
			break;
		
		}
		System.out.println("Enter 1 for repeat:");
		 option=sc.nextInt();
	}while(option==1);

}
}
