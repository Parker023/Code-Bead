package dsa.queue.priorityque;

public class MinHeap {
	int ar[];
	int n;
	public MinHeap(int capacity) {
		ar=new int[capacity];
		n=0;
	}
	public void insert(int key) {
		if(n==ar.length-1) {
			resize(2*ar.length);
		}
		n++;
		ar[n]=key;
		swim(n);
	}
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
	private void swim(int k) {
		while(k>1&&ar[k/2]>ar[k]) {
			int t=ar[k/2];
			ar[k/2]=ar[k];
			ar[k]=t;
			k=k/2;
		}
	}
	private void resize(int i) {
		int a[]=new int[i];
		for(int j=0;j<ar.length;j++) {
			a[j]=ar[j];
		}
		ar=a;
	}
	public String toString() {
		String st="[";
		for(int i=1;i<=n;i++) {
			st=st+ar[i];
			if(i<n)
				st=st+" ";
		}
		return st+"]";
	}
	public int deleteMin() {
		int min=ar[1];
		int temp=ar[1];
		ar[1]=ar[n];
		ar[n]=temp;
		ar[n]=Integer.MAX_VALUE;
		int i=1;
		while(2*i<=n||2*i+1<=n) {
			if(ar[i]>ar[2*i]||ar[i]>ar[2*i+1]) {
				if(ar[2*i]<ar[2*i+1]) {
					int t=ar[i];
					ar[i]=ar[2*i];
					ar[2*i]=t;
				}
				else {
					int t=ar[i];
					ar[i]=ar[2*i+1];
					ar[2*i+1]=t;
				}
			}
			i++;	
		}
		return min;
	}

	public static void main(String[] args) {
		MinHeap mh=new MinHeap(3);
		mh.insert(4);
		mh.insert(1);
		mh.insert(6);
		mh.insert(2);
		mh.insert(3);
		mh.insert(5);
		mh.insert(7);
		System.out.println(mh);
		System.out.println(mh.deleteMin());
		System.out.println(mh.deleteMin());
		System.out.println(mh.deleteMin());
		System.out.println(mh);
	}
}
