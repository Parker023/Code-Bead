package dsa.list.singlylinkedlist;
import dsa.list.singlylinkedlist.SinglyLinkedList.Node;
public class InsertEleSortedList
{
public static void main(String[] args) 
{
	SinglyLinkedList s=new SinglyLinkedList();
		s.add(5);
		s.add(2);
		s.add(8);
		s.add(7);
		s.add(9);
		s.add(21);
		s.add(3);
		s.add(10);
		s.add(6);
		s.add(4);
		s.add(1);
		System.out.println("original  "+s);
		sortList(s);
		System.out.println("sorted   "+s);
}
public static void sortList(SinglyLinkedList s) {
	Node current=s.head,temp=s.head.next,Pointer=null;
	int min=Integer.MAX_VALUE;
	while(current!=null&&temp!=null) {
		if(current.data>temp.data) {
			if(temp.data<min) {
			min=temp.data;
			Pointer=temp;
			}
		}
		temp=temp.next;
		if(temp==null) {
			if(min==Integer.MAX_VALUE) {
		current=current.next;
			temp=current.next;
			continue;
			}
			int t=current.data;
			current.data=min;
			Pointer.data=t;
			current=current.next;
			temp=current.next;
			min=Integer.MAX_VALUE;
		}
	}
}
}
