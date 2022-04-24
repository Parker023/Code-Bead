package org.Parker1.Shannu.Threads;
public class ClassLoad extends Thread {
	public void run() {
		System.out.println("Hi");
	}
	{
		System.out.println("jiii");
	}
	static {
		System.out.println(2+3);
	}
	{
		System.out.println("Hi");
	}
	public static void printSum() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		ClassLoad cl=new ClassLoad();
		printSum();
	}
}
