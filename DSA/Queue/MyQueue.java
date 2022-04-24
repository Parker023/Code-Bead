package dsa.queue;

public class MyQueue {
		int front=-1,rear=-1;
		Object ar[];
		int capacity;
		public MyQueue(int capacity) {
			this.capacity=capacity;
			ar=new Object[capacity];
		}
		public boolean enQue(Object obj) {
			if(rear==capacity-1)
				return false;
			if(front==-1) {
				front=0;
			}
			ar[++rear]=obj;
			return true;
		}
		public Object deQue() {
			if(front>rear)
				return null;
			Object a=ar[front];
			front++;
			return a;
		}
		public String toString() {
			String st="[";
			for(int i=front;i<=rear;i++) {
				st=st+ar[i];
				if(i<rear)
					st=st+",";
			}
			return st+"]";
		}
}
