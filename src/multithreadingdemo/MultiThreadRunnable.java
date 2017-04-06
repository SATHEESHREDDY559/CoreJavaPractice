package multithreadingdemo;

public class MultiThreadRunnable implements Runnable{
	public MultiThreadRunnable(String str) {
		// TODO Auto-generated constructor stub
		new Thread(this,str).start();
		
	}
 public void run()
 {
	 System.out.println(" ");
	 for(int i=0;i<5;i++){
		 if(i%5==0){
			 System.out.println(Thread.currentThread().getName()+""+ "    yeilding ctrl..i.");
		 Thread.yield();
		 }
		 
	 }
	 System.out.println(Thread.currentThread().getName()+"  has  finished..........");
	 
 }
 public static void main(String args[]){
	 new MultiThreadRunnable("thread 1");
	 new MultiThreadRunnable("thread 2");
	 new MultiThreadRunnable("Thread 3");
 }
}
