package dsa.list.singlylinkedlist;
import dsa.list.singlylinkedlist.SinglyLinkedList.Node;
public class DataSearchSL {
	static SinglyLinkedList sll=null;
public static void main(String[] args) {
	 sll=new  SinglyLinkedList();
	sll.add(2);
	sll.add(5);
	sll.add(85);
	sll.add(51);
	sll.add(62);
	int obj=62;
	int n=keySearch(obj);
	if(n==0)
		System.out.println("Key is not present in List");
	else
		System.out.println("key is present in "+n+"th node");
	int ob=middleNode(sll);
	System.out.println("middle node data of given list : "+ob);
}
public static int middleNode(SinglyLinkedList sl) {
	int i=0;Node temp=sl.head;
	while(i<sl.length()/2&&temp!=null) {
	temp=temp.next;
		i++;
	}
	return temp.data;
}
 static int keySearch(int obj) {
		Node temp=sll.head;
		int count=1;
	while(temp!=null) {
		if(temp.data==obj) {
			return count;
		}
		count++;
		temp=temp.next;
	}
	return 0;
}
}
