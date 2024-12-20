package methods;

import java.util.Scanner;

class Rectangle{
	int len,br,per;
	Scanner sc ;
	public Rectangle() {
		sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth: ");
		len = sc.nextInt();
		br = sc.nextInt();
	}
	
	public Rectangle(int len, int br) {
		
		System.out.println("Length of Rectangle : "+len);
	}

	public void calculatePerimeter() {
		per = 2*(len+br);
		System.out.println("-------------------------");
		System.out.println("Perimeter of Rectangle : "+per);
		
	}
	
}


public class RectangleOperation {
	public static void main(String[] args) {
		/*className objName = new className()*/
		Rectangle rcb1 = new Rectangle(); 
		rcb1.calculatePerimeter();
		Rectangle rcb2 = new Rectangle(10,10);
	}
}
