import java.util.*;
public class MergeArray {
		static int[] merge(int a[],int b[]) {
			int c[]=new int[a.length+b.length];
			for(int i=0;i<a.length;i++) {
				c[i]=a[i];
			}
			for(int j=0;j<b.length;j++) {
				c[a.length+j]=b[j];
			}
				return c;
		}
			static int[] readArr() {
				Scanner sc=new Scanner(System.in);
				
				int n=sc.nextInt();
				int ar[]=new int[n];
				for(int i=0;i<ar.length;i++) {
					ar[i]=sc.nextInt();
				}
				
				return ar;
			}
			static void dispArr(int y[]) {
				for(int i=0;i<y.length;i++) {
					System.out.print(y[i]+" ");
				}
			System.out.println();
			}
	public static void main(String[] args) {
		System.out.println("read first array");
		int a[]=readArr();
		System.out.println("read second array");
		int b[]=readArr();
		int arr[]=merge(a, b);
		System.out.println("user entered first array is:");
		dispArr(a);
		System.out.println("user entered second array is:");
		dispArr(b);
		System.out.println("after merging :");
		dispArr(arr);
		
	}

}
