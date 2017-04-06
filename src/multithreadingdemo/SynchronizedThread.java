package multithreadingdemo;
 class  Table{
	public synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n+i);
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class Mythread1 extends Thread{
	Table t;
	Mythread1(Table t){
		this.t=t;
	}
	 public void run()
	 {
		 t.printTable(5);
	 }
	
	
	
	}
class Mythread2 extends Thread{
	Table t;
	Mythread2(Table t){
		this.t=t;
		
	}
	public void run()
	{
		t.printTable(100);
	}
	
}

public class SynchronizedThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();;
		Mythread1 t1= new Mythread1(t);
		Mythread2 t2 = new Mythread2(t);
		t1.start();
		t2.start();
	}

}
