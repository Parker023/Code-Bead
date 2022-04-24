package org.Parker1.Shannu.Threads;
public class MyThread1 extends Thread {
	public void run() {
			for(int i=1;i<=26;i++) {
				System.out.println(Thread.currentThread().getName()+"->"+i);
			}
	}
}
