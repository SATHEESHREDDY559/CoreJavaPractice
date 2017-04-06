package multithreadingdemo;
class A extends Thread{
	public void run()
	{
		System.out.println("thread 1");
	}
	
}
class B extends Thread{
	public void run()
	{
		System.out.println("thread 2");
	}
	
}
class C extends Thread {
public void run(){
	System.out.println("thread 3");
}
}

public class MultiThreadDemo {
public static void main(String arg[]){
	/*A a= new A();
	a.start();*/
	B b= new B();
	b.start();
	C c= new C();
	c.start();
	A a= new A();
	a.start();
	
	try {
		a.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		b.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		c.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("main thread..");
}
}
