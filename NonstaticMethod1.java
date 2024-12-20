package methods;

public class NonstaticMethod1 {
	public static void main(String[] args) {
		NonstaticMethod1 S=new NonstaticMethod1 ();
		S.SS();
		//new NonstaticMethod1().SS();
	}
	public void SS() {
		System.out.println("Boina");
		
	}
}
