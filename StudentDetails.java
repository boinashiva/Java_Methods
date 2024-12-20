package methods;

import java.util.Scanner;

public class StudentDetails {
	static Scanner sc=new Scanner(System.in);
  public static int rollnum(int num) {
	  System.out.println("Enter num:");
	  num =sc.nextInt();
	  return num;	   
  }
  public static String name(String name) {
	  System.out.println("Enter name:");
	  name=sc.next();
	  return name;
  }
  public static String address(String address) {
	  System.out.println("Enter address:");
	  address=sc.next();
	  return address;
  }
  public static String mail(String mail) {
	  System.out.println("Enter mail:");
	  mail=sc.next();
	  return mail;
  }
  public static void main(String[] args) {
	
	System.out.println("--------------------------");
	System.out.println("Enter the student details:");
	
	 StudentDetails S=new StudentDetails();
	 rollnum(0);
	 name(null);
	 address(null);
	 mail(null);
	
}
}
