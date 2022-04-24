package org.Parker1.Shannu.Threads;
public class BankThread {
	public static void main(String[] args) throws InterruptedException {
		Bank sbi =new Bank(10000);
		Thread t1=new Thread()//Anonymous class
													  {
														public void run() {
															sbi.withdraw(12000);
														}
		};
		Thread t2=new Thread() 
													{
														public void run() {
															sbi.deposit(13000);
													}
		};
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(8000);
	}
}
