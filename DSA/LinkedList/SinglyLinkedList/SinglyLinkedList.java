package dsa.list.singlylinkedlist;
public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	Node head;
	public boolean add(int a) {
		Node n=new Node(a);

		if(head==null) {
			head=n;
			return true;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		return true;
	}
	public boolean addFirst(int a) {
		Node n=new Node(a);
		Node temp=n;
		temp.next=head;
		head=n;
		return true;
	}
	public boolean add(int a,int pos) {
		Node n=new Node(a);
		Node previous=head;
		if(pos==0) {
			n.next=head;
			head=n;
			return true;
		}int i=1;Node temp=head.next;
		while(i<pos-1) {
			previous=previous.next;
			temp=temp.next;
			i++;
		}
		previous.next=n;
		n.next=temp;
		return true;
	}
	public int remove() {
		Node temp=head;
		Node previous=null;
		while(temp.next!=null) {
			previous=temp;
			temp=temp.next;
		}
		previous.next=null;
		return temp.data;
	}
	public int removeFirst() {
		Node temp=head;
		head=temp.next;
		int a=temp.data;
		return a;
	}

	public int remove(int pos) {
		if(pos>length()) {
			System.out.println("Index out of range");
		}
		if(pos==0) {
			Node temp=head;
			head=temp.next;
			int a=temp.data;
			return a;
		}
		else {
			Node current=head,previous=null;int i=0;
			while(current.next!=null&&i<pos) {
				previous=current;
				current=current.next;
			}
			previous.next=current.next;
			current.next=null;
			return current.data;
		}

	}
	public String toString() {
		String st="";
		Node temp=head;
		while(temp!=null) {
			st=st+temp.data;
			if(temp.next!=null)
				st=st+"->";
			temp=temp.next;
		}
		return st;
	}
	public int length() {
		Node t=head;
		int count=1;
		while(t.next!=null) {
			t=t.next;
			count++;
		}
		return count;
	}
	public int get(int in) {
		if(head==null) {
			System.out.println("list is empty");
			return Integer.MIN_VALUE;
		}
		if(in>=length()) {
			System.out.println("Index not in range");
			return Integer.MIN_VALUE;
		}
		if(in==0) {
			return head.data;
		}
		Node temp=head;
		while(temp.next!=null&&in>0) {
			temp=temp.next;
			in--;
		}
		
		return temp.data;
	}
	public SinglyLinkedList reverse(SinglyLinkedList sl) {
		Node current=sl.head,prev=null,temp=sl.head.next;
		while(current!=null) {
			current.next=prev;
			prev=current;
			current=temp;
			if(temp!=null)
			temp=temp.next;
		}
//		current.next=prev;
		head=prev;
		return sl;
	}
}
