package dsa.list.singlylinkedlist;
public class SlListSum {
	public static void main(String[] args) {
		SinglyLinkedList sl1=new SinglyLinkedList();
		sl1.add(2);
		sl1.add(5);
		sl1.add(9);
		sl1.add(6);
		SinglyLinkedList sl2=new SinglyLinkedList();
		sl2.add(1);
		sl2.add(4);
		sl2.add(8);
		sl2.add(4);
		sl2.add(6);
//		System.out.println(sl1);
		sl1=sl1.reverse(sl1);
		sl2=sl2.reverse(sl2);
		SinglyLinkedList slnew =new SinglyLinkedList();
		slnew=addSinglyLinkedList(sl1,sl2);
		System.out.println(slnew);
	}
	private static SinglyLinkedList addSinglyLinkedList(SinglyLinkedList s1, SinglyLinkedList s2) {
		SinglyLinkedList.Node fc=s1.head;
		SinglyLinkedList.Node sc=s2.head;
		SinglyLinkedList sl=new SinglyLinkedList();
		int carry=0;
		while(fc!=null&&sc!=null) {
			int sum=(Integer)fc.data+(Integer)sc.data+carry;
			carry=sum/10;
			sl.addFirst(sum%10);
			fc=fc.next;
			sc=sc.next;
		}
		while(fc!=null) {
			int sum=(Integer)fc.data+carry;
			carry=sum/10;
			sl.addFirst(sum%10);
			fc=fc.next;
		}
		while(sc!=null) {
			int sum=(Integer)sc.data+carry;
			carry=sum/10;
			sl.addFirst(sum%10);
			sc=sc.next;
		}
		while(carry!=0) {
			sl.addFirst(carry);
		}
		return sl;
	}
}
