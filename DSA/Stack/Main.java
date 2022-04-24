package dsa.stack;
public class Main {
	public static void main(String[] args) {
		MyStack ms=new MyStack(5);
		ms.push(2);
		ms.push(25);
		ms.push(72);
		ms.push(200);
		System.out.println(ms);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms);
		System.out.println(ms.peek());
		System.out.println(ms.peek());
	}
}
