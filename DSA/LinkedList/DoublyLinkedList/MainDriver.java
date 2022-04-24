package dsa.list.doublylinkedlist;
public class MainDriver {
public static void main(String[] args) {
	DoublyLinkedList dll=new DoublyLinkedList();
	dll.add(2);
	dll.add(3);
	dll.add(1,1);
	dll.add(45);
	dll.add(51, 2);
	dll.add(25);
	dll.add(85);
	dll.add(75, 3);
	dll.addFirst(23);
	dll.add(102,8);
	dll.add(758,9);
	dll.addLast(0);
	System.out.println(dll.remove());
	dll.remove(2);
	System.out.println(dll.remove(0));
	System.out.println("last:  "+dll.removeLast());
	System.out.println("Reverse:      ");
	dll.displayReverse();
	System.out.println(" Regular:      ");
	System.out.println(dll);
//	System.out.println(dll.get(8));
}
}
