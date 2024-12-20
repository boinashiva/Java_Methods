package methods;

public class Add {
	static int res=0;
	public static void add(int a,int b) {
		 res=a+b;
		System.out.println("Addition");
	}
	public void sub(int a,int b) {
		 res=a-b;
		System.out.println("Substraction");
	}
	public void mul(int a,int b) {
		res=a*b;
		System.out.println("Mulstiplication");
	}
	public void muduless(int a,int b) {
		res=a%b;
		System.out.println("moduless operation");
	}
	public static void main(String[] args) {
		
		Add S=new Add();
		System.out.println(+res);
		
		S.sub(6, 0);
		S.mul(5, 0);
		S.muduless(6, 5);
	}
}
