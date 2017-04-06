

class A{
	
	void m() throws Exception{
	System.out.println("class A");	
	}
}
public class B extends A{
	void m() throws ArithmeticException{
		
		System.out.println("Class B");
	}
	public static void main(String[] args) {
		B b= new B();
		b.m();
	}
}