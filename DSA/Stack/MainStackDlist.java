package dsa.stack;
public class MainStackDlist {
public static void main(String[] args) {
	StackDlist sd=new StackDlist();
	sd.push(2);
	sd.push(5);
	sd.push(6);
	System.out.println(sd);
	System.out.println(sd.pop());
	System.out.println(sd.pop());
	System.out.println(sd.peek());
	System.out.println(sd.peek());
	System.out.println(sd);
	
}
}
