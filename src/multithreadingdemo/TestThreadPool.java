package multithreadingdemo;
import java.util.concurrent.*;

 class ThreadPool  implements Runnable{
	private String message;
	public ThreadPool(String i) {
		this.message=i;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"start "+message);
		processingthread();
		System.out.println(Thread.currentThread().getName()+"end "+message);
		
	}
	private void processingthread() {
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
}

public class TestThreadPool{
	public static void main(String[] args) {
		ExecutorService executer=Executors.newFixedThreadPool(10);
		for(int i=0; i<=9;i++){
			ThreadPool run1=new ThreadPool(""+i);
			
			executer.execute(run1);
		}
		executer.shutdown();
		while(!executer.isTerminated()){}
		System.out.println("All thread completed");
		
	}
}