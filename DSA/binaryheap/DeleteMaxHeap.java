package dsa.queue.priorityque;
public class DeleteMaxHeap extends MaxHeap {
	public DeleteMaxHeap(int capacity) {
		super(capacity);
	}
	public int deleteMax() {
		int max=heap[1];
		int temp=heap[1];
		heap[1]=heap[n];
		heap[n]=temp;
		heap[n]=0;
		n--;
		int i=1;
		while(2*i+1<=n||2*i<=n) {
			if(heap[i]<heap[2*i]||heap[i]<heap[2*i+1]) {
				if(heap[2*i]>heap[2*i+1]) {
					int t=heap[i];
					heap[i]=heap[2*i];
					heap[2*i]=t;
				}
				else {
					int t=heap[i];
					heap[i]=heap[2*i+1];
					heap[2*i+1]=t;
				}
			}
			i++;	
		}
		return max;
	}
	public static void main(String[] args) {
		DeleteMaxHeap dmh=new DeleteMaxHeap(4);
		dmh.insert(4);
		dmh.insert(2);
		dmh.insert(1);
		dmh.insert(6);
		dmh.insert(8);
		System.out.println(dmh.deleteMax());
		System.out.println(dmh.deleteMax());
		System.out.println(dmh);
		System.out.println(dmh.deleteMax());
	}

}
