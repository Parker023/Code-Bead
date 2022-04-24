//Using Lambda expression
package org.Parker1.Shannu.Threads;
import java.util.Scanner;
public class ThreadCheck  {
	int a,b;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		@SuppressWarnings("unused")
		ThreadCheck tc=new ThreadCheck(a,b);
//		Runnable r=()->System.out.println(a+b);
  
		Thread t1=new Thread(()-> System.out.println("Sum is: "+(a+b))); 
		Thread t2=new Thread(()-> System.out.println("Product is: "+a*b));
		t1.start();
		Thread.sleep(2000);
		t2.start();
	}
	public ThreadCheck(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
