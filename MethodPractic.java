package methods;

import java.util.Scanner;

public class MethodPractic {
    public static void add(int a,int b) {
    System.out.println(a+b);
    }
    public  int  num(int a,int b) {
    	
    	return a-b;
    	}
    public  String name() {
    	
    	return "shiv";
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
      	MethodPractic S=new MethodPractic();
    	System.out.println("Enter 1 for method 1");
    	System.out.println("Enter 2 for method2");
    	System.out.println("Enter 3 for method3:");
  
    	int option=sc.nextInt();
    	
    	switch (option) {
		case 1:
			add(5, 1);
			break;
		case 2:
			System.out.println(S.num(4,2));
			break;
		case 3:
			
			
	    	System.out.println(S.name());
			break;
    	}
    }
}
