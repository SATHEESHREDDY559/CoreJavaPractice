import enumex.*;

class A{
	
	void m() throws Exception{
	System.out.println("class A");	
	}
}
public class B extends A{
	void m() throws ArithmeticException{
		
		Enum2[] e=Enum2.values();
		for(Enum2 e1:e){
			System.out.println(e1);
		}
	}
	public static void main(String[] args) {
		B b= new B();
		b.m();
	}
}