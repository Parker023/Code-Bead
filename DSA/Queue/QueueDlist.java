package dsa.queue;
public class QueueDlist {
	public class Node{
		Object data;
		Node prev,next;
		public Node(Object data) {
			this.data=data;
		}
	}
	Node head,tail;
	public void enQue(Object data) {
		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			return;
		}
		tail.next=n;
		n.prev=tail;
		tail=n;
	}
	public Object deQue() {
		if(head==null) {
			System.out.println("Queue is empty");
			return "";
		}
		Object data=head.data;
		if(head==tail) {
			head=tail=null;
			return data;
		}
		head=head.next;
		head.prev=null;
		return data;
	}
	public String toString() {
		String st="[";
		Node temp=head;
		while(temp!=null) {
			st=st+temp.data+" ";
			temp=temp.next;
		}
		return st+"]";
	}
}
