package multithreadingdemo;

class Table1 {
	synchronized void printTable(int n){
		for(int i=1;i<=10; i++){	
		
		System.out.println(i+"*"+n+"="+i*n);
	}
	}
}
/*class ThreadClass1 extends Thread{
	Table1 t;
	public ThreadClass1( Table1 t) {
		this.t=t;
	}
	public void run(){
		t.printTable(10);
	}
}
class ThreadClass2 extends Thread{
	Table1 t;
	public ThreadClass2( Table1 t) {
		this.t=t;
	}
	public void run(){
		t.printTable(100);
	}
}*/

public class SynchronizedClass {

	public static void main(String[] args) {
		final  Table1 t=new Table1();
		/*ThreadClass1 t1=new ThreadClass1(t);
		ThreadClass2 t2=new ThreadClass2(t);
		t1.start();
		t2.start();*/

		new Thread(){public void run(){t.printTable(10);}}.start();
		new Thread(){public void run(){t.printTable(100);}}.start();
	}

}
