package org.Parker1.Shannu.Threads;
public class DemoThread {
	public static void main(String[] args) {
		Runnable rn=new MyThread2();
		Thread t2=new Thread(rn,"thread2");
	Thread t1=new MyThread1();
	t1.setName("thread1");
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	t2.start();
	}
}
