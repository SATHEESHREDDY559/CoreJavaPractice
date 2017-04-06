package multithreadingdemo;

public class AnonymousClass {
	public static void main(String[] args) {
		(new Thread(){
			public void run(){
				System.out.println("thread1");
			}
		}).start();
	}

	}
