import java.io.IOException;

import enumex.*;
interface AB{
	static public final class ADF{
		
	}
	default void m789(){
		
	}
}
  class A{
	static class InnerA{
		void mmmm(){
			System.out.println("static method");
		}
	}
	void m() {
	System.out.println("class A");	
	}
}
public class B extends A{
	void m()  throws RuntimeException{
		
		Enum2[] e=Enum2.values();
		for(Enum2 e1:e){
			//System.out.println(e1);
		}
	}
	public final static void main(String[] args)  {
		B b= new B();
		b.m();
		 A a= new A(){
			 void m(){
				 System.out.println("Anonymous");
			 }
		 };
		 a.m();
		 A.InnerA ia=new InnerA();
		 ia.mmmm();
	}
}