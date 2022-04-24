package dsa.queue;

public class MainQueList {
public static void main(String[] args) {
	QueueDlist qdl=new QueueDlist();
	qdl.enQue(2);
	qdl.enQue(5);
	System.out.println(qdl);
	System.out.println(qdl.deQue());
	System.out.println(qdl);
	
}
}
