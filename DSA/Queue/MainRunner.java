package dsa.queue;

public class MainRunner {
public static void main(String[] args) {
	MyQueue mq=new MyQueue(5);
	mq.enQue(2);
	mq.enQue(45);
	mq.enQue(85);
	mq.enQue(56);
	System.out.println(mq);
	System.out.println(mq.deQue());
	System.out.println(mq);
	System.out.println(mq.deQue());
	System.out.println(mq);

}	
}
