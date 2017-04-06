
package multithreadingdemo;

import java.util.Scanner;

class Customer {
	int bal= 10000;
	synchronized void withdraw(int amount){
	if(this.bal<amount){
		System.out.println("Low Balance . Waiting for deposit");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	else{
		this.bal-=amount;
		System.out.println("Amount withdrawn........");
		System.out.println("available balance is  "+bal);
		System.exit(0);
	}
	this.bal-=amount;
	System.out.println("Amount withdrawn........");
	System.out.println("available balance is  "+bal);
	System.exit(0);	
	}
	synchronized void deposit(int amount){
		this.bal=this.bal+amount;
		System.out.println("Amount Deposited......");
		notifyAll();
	}
	}

public class BankExampleSynchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c= new Customer();
		System.out.println("Enter Amount to withdraw");
		Scanner sc= new Scanner(System.in);
		final int amt= sc.nextInt();
		new Thread(){
			public void run(){
				c.withdraw(amt);
			}
		}.start();
		
		new Thread(){
			public void run(){
				c.deposit(10000);
			}
		}.start();
		
	}

}
