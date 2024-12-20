package methods;

import java.util.Scanner;

public class OddOrEven {
	 static Scanner sc=new Scanner(System.in);
			public static String oddoreven(int num) {
				if(num%2==0) {
					return "Even";
				}else {
					return "odd";
				}
	    	     
    	     
}
     
     public static void main(String[] args) {
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(oddoreven(num));
		
		
	}
}

