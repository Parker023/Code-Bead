package dsa.stack;

public class MyStack {
	int capacity,top=-1;
	Object ar[];
	public MyStack(int capacity) {
		this.capacity = capacity;
		ar=new Object[capacity];
	}
	public boolean push(Object a) {
		if(top==capacity-1)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		ar[++top]=a;
		return true;
	}
	public Object pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return null;
		}
		Object obj=ar[top--];
		return obj;
	}
	public Object peek() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return null;
		}
		Object obj=ar[top];
		return obj;
	}
	public String toString() {
		String st="[";
		for(int i=0;i<=top;i++) {
			st=st+ar[i];
			if(i<top)
				st=st+",";
		}
		return st+"]";
	}

}
