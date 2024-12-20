package methods;


import java.util.Scanner;

public class Calculater {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void mul(int a,int b) {
		System.out.println(a*b);
	}
	public static void modulus(int a,int b) {
		System.out.println(a%b);
	}
	public static void div(int a,int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int repeat;
		do {
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		System.out.println("Select 1 for addition \n select 2 for substraction \n select 3 for Multiplication \n select 4 for Muduluss \n select 5 for Division");
		int option=sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("After addition:");
			add(a, b);
			break;
        case 2:
        	System.out.println("After substraction:");
        	sub(a, b);
			break;
        case 3:
        	System.out.println("After multiplication:");
        	mul(a, b);
        	break;
        case 4:
        	System.out.println("After moduluss:");
        	modulus(a, b);
        	break;
        case 5:
        	System.out.println("After div:");
        	div(a, b);
        	break;
        
		}
		System.out.println("Enter 1 for repeat the operation:");
		 repeat=sc.nextInt();
	}while(repeat==1);
}
}

