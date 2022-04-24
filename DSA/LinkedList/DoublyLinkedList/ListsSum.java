package dsa.list.doublylinkedlist;

public class ListsSum {
	public static void main(String[] args) {
		DoublyLinkedList d1=new DoublyLinkedList();
		d1.add(2);
		d1.add(5);
		d1.add(8);
		d1.add(7);
		DoublyLinkedList d2=new DoublyLinkedList();
		d2.add(5);
		d2.add(4);
		d2.add(1);
		d2.add(6);
		d2.add(9);
		DoublyLinkedList dll=listSum(d1,d2);
		System.out.println(dll);
	}

	private static DoublyLinkedList listSum(DoublyLinkedList d1, DoublyLinkedList d2) {
		DoublyLinkedList.Node fc=d1.tail;
		DoublyLinkedList.Node sc=d2.tail;
		DoublyLinkedList dll=new DoublyLinkedList();
		int carry=0;
		while(fc!=null&&sc!=null) {
			int sum=(Integer)fc.data+(Integer)sc.data+carry;
			carry=sum/10;
			dll.addFirst(sum%10);
			fc=fc.previous;
			sc=sc.previous;
		}
		while(fc!=null) {
			int sum=(Integer)fc.data+carry;
			carry=sum/10;
			dll.addFirst(sum%10);
			fc=fc.previous;
		}
		while(sc!=null) {
			int sum=(Integer)sc.data+carry;
			carry=sum/10;
			dll.addFirst(sum%10);
			sc=sc.previous;
		}
		while(carry!=0)
			dll.addFirst(carry);
		return dll;
	}
}
