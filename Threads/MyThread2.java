package org.Parker1.Shannu.Threads;
public class MyThread2 implements Runnable {
	public void run() {
		for(char i='a';i<='z';i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
	}
}
}
