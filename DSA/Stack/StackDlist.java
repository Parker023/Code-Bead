package dsa.stack;

public class StackDlist {
	class Node{
		Object data;
		Node next,prev;
		Node(Object data){
			this.data=data;
		}
	}
	Node head,tail;
	public void push(Object data) {
		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			return;
		}
		tail.next=n;
		n.prev=tail;
		tail=n;
	}
	public Object pop() {
		if(head==null) {
			System.out.println("stack is empty");
			return "";
		}
		Object data=tail.data;
		if(head==tail) {
			head=tail=null;
			return data;
		}
		tail=tail.prev;
		tail.next=null;
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
	public Object peek() {
			if(head==null) {
				System.out.println("Stack is empty");
				return "";
			}
		return tail.data;
	}
}
