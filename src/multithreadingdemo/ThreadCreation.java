package multithreadingdemo;

/*class ThreadOne extends Thread{
	public void run(){
		System.out.println("Thread One with Thread Class");
	}
}
*/
class ThreadOne implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread with Runnable");
		
	}
	
}
public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOne to= new ThreadOne();
		Thread t1= new Thread(to);
		t1.start();


}

}
