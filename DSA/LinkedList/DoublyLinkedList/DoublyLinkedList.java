package dsa.list.doublylinkedlist;

public class DoublyLinkedList {
	Node head,tail;
	class Node{
		Object data;
		Node next,previous;
		public Node(Object data) {
			this.data = data;
		}
	}
	public boolean addFirst(Object a) {
		Node n=new Node(a);
		if(head==null) {
			head=n;
			tail=n;
			return true;
		}
		n.next=head;
		head.previous=n;
		head=n;
		return true;
	}
	public boolean add(Object a,int pos) {
		Node n=new Node(a);
		if(pos>length()) {
			System.err.println("Sequence is missing and index breakage");
			return false;
		}
		if(pos==0) {
			n.next=head;
			head.previous=n;
			head=n;
			return true;
		}
		Node temp=head,before=null;int i=0;
		while(temp.next!=null&&i<pos) {
			before=temp;
			temp=temp.next;
			i++;
		}
		before.next=n;
		n.next=temp;
		n.previous=before;
		temp.previous=n;
		return true;
	}
	public boolean addLast(Object a) {
		Node n=new Node(a);
		if(tail==null) {
			tail=n;
			head=n;
			return true;
		}
		tail.next=n;
		n.previous=tail;
		tail=n;
		return true;
	}
	public boolean add(Object a) {
		Node n=new Node(a);
		if(head==null) {
			head=n;
			tail=n;
			return true;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		tail=n;
		n.previous=temp;
		return true;
	}
	public Object remove() {
		Node temp=head,last=null;
		while(temp.next!=null) {
			last=temp;
			temp=temp.next;
		}
		tail=last;
		last.next=null;
		temp.previous=null;
		return temp.data;
	}
	public Object removeLast() {
		Node temp=tail;
		tail=tail.previous;
		tail.next=null;
		return temp.data;
	}
	public Object removeFirst() {
		Node temp=head,current=head.next;
		head=current;
		current.previous=null;
		return temp.data;
	}
	public Object remove(int pos) {
		Node temp=head.next,last=null,current=head;int i=0;
		if(pos>=length()) {
			System.err.println("Index Out of Range");
			return null;
		}
		if(pos==0) {
			head=temp;
			temp.previous=null;
			return current.data;
		}
		while(temp.next!=null&&i<pos) {
			last=current;
			current=current.next;
			temp=temp.next;
			i++;
		}
		last.next=temp;
		temp.previous=last;
		return current.data;
	}
	public void displayReverse() {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.previous!=null)
				System.out.print("->");
			temp=temp.previous;
		}
		System.out.println();
	}
	public String toString() {
		Node temp=head;
		String st="";
		while(temp!=null) {
			st=st+temp.data;
			if(temp.next!=null)
				st=st+"->";
			temp=temp.next;
		}
		return st;
	}
	public int length() {
		Node t=head;int count=1;
		while(t.next!=null) {
			count++;
			t=t.next;
		}
		return count;
	}
	public Object get(int in) {
		if(head==null) {
			System.out.println("list is empty");
			return "";
		}
		if(in>=length()) {
			System.out.println("Index out of range");
			return "";
		}
		if(in==0) {
			return head.data;
		}
		Node temp=head;
		while(temp!=null&&in>0) {
			temp=temp.next;
			in--;
		}
		return temp.data;
	}
}
