package multithreadingdemo;
 class TableDemo{
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


public class AnonymousThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableDemo t= new TableDemo();
		new Thread(){
			public void run(){
				t.printTable(5);
			}
		}.start();
	
		new Thread(){
			public void run(){
				t.printTable(100);
			}
		}.start();
	}
	

}
