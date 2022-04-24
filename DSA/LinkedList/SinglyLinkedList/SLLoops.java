package dsa.list.singlylinkedlist;
import dsa.list.singlylinkedlist.SinglyLinkedList.Node;
public class SLLoops 
{
	static SinglyLinkedList sl=null;
public static void main(String[] args) 
{
	 sl=new SinglyLinkedList();
	sl.add(2);
	sl.add(5);
	sl.add(6);
	sl.add(8);
	sl.add(9);
	sl.add(74);
	sl.add(52);
	sl.add(21);
	Node temp=sl.head;
	int key=9;
	while(temp.data!=key)
	{
		temp=temp.next;
	}
	Node t=sl.head,k=null;
	while(t!=null) {
		k=t;
		t=t.next;
	}
	k.next=temp;
	loopTest(sl);
}
public static void loopTest(SinglyLinkedList sl) {
	Node fstptr=sl.head;
	Node slptr=sl.head;
	while(fstptr!=null&&slptr!=null) {
		fstptr=fstptr.next.next;
		slptr=slptr.next;
		try
		{
			if(fstptr.data==slptr.data)
				loopStart(slptr);
		} catch (NullPointerException e) {
		System.out.println("not a loop");
//		e.printStackTrace();
		}
	}
}
public static void loopStart(Node slptr) {
Node temp=sl.head,t=null;
while(slptr!=temp) {
	if(temp.data==slptr.data)
		return;
	else
	{
		temp=temp.next;
		t=slptr;
		slptr=slptr.next;
	}
}
t.next=null;
System.out.println(sl);
  }
}
