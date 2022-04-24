package dsa.list.singlylinkedlist;
public class MainRunner {
public static void main(String[] args) {
	SinglyLinkedList sl=new SinglyLinkedList();
		sl.add(2);
		sl.add(54);
//		sl.add(21,0);
//		sl.addFirst(6);
		sl.add(74);
		System.out.println(sl.get(3));
////		sl.remove();
////		sl.remove(0);
//		sl.remove(0);
//		sl.remove();
		System.out.println(sl);
//		System.out.println(sl.reverse(sl));
//		System.out.println();
}	
}
