package dsa.queue.priorityque;

public class MaxHeap {

	int heap[];
	int n;
	public MaxHeap(int capacity) {
		heap=new int[capacity+1];
		n=0;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
	public int capacity() {
		return heap.length;
	}
	public void insert(int key) {
		if(n==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=key;
		swim(n);
	}
	public void swim(int p) {
		while(p>1&&heap[p/2]<heap[p]) {
			int temp=heap[p/2];
			heap[p/2]=heap[p];
			heap[p]=temp;
			p=p/2;
		}
	}
	public void resize(int i) {
		int ar[]=new int[i];
		for(int k=0;k<heap.length;k++) {
			ar[k]=heap[k];
		}
		heap=ar;
	}
	public String toString() {
		String st="[";
		for(int i=1;i<=n;i++) {
			st=st+heap[i];
			if(i<n)
				st=st+" ";
		}
		return st+"]";
	}
	public static void main(String[] args) {
		MaxHeap mh=new MaxHeap(3);
		mh.insert(4);
		mh.insert(5);
		mh.insert(2);
		mh.insert(6);
		mh.insert(1);
		mh.insert(3);
		System.out.println(mh);
	}
}
