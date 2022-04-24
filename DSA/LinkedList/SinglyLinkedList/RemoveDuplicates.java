package dsa.list.singlylinkedlist;
import dsa.list.singlylinkedlist.SinglyLinkedList.Node;
public class RemoveDuplicates {
	static SinglyLinkedList sl=null;
	public static void main(String[] args) {
		sl=new SinglyLinkedList();
		sl.add(5);
		sl.add(6);
		sl.add(5);
		sl.add(7);
		sl.add(8);
		sl.add(6);
		sl.add(6);
		sl.add(7);
		sl.add(6);
		System.out.println(sl);
		removeDuplicate(sl);
	}
	private static void removeDuplicate(SinglyLinkedList sl) {
			Node current=sl.head,temp=sl.head.next,pointer=sl.head;
//			System.out.println(current.data+" "+temp.data+" "+pointer.data);
			System.out.println("hi");
			while(current!=null&&temp!=null) {
				if(current.data==temp.data) {
					pointer.next=temp.next;
					temp=temp.next;
				}
				else {
					temp=temp.next;
				pointer=pointer.next;	
				}
				if(temp==null) {
					current=current.next;
					pointer=current;
					if(current!=null)
					temp=current.next;
				}
			}
			System.out.println(sl);
	}
}
