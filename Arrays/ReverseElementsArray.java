import java.util.*;
public class ReverseElementsArray {
		static void dispArr(int a[]) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		static int [] readArr() {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			sc.close();
			return arr;
		}
		static void reverse(int p[]) {
			for(int i=0;i<p.length/2;i++) {
				int temp=p[i];
				p[i]=p[p.length-1-i];
				p[p.length-1-i]=temp;
				
			}
			
		}
	public static void main(String[] args) {
			System.out.println("give size and read array elements : ");
			int x[]=readArr();
			System.out.println("user entered array : ");
			dispArr(x);
			System.out.println("after revering the array : ");
			reverse(x);
			dispArr(x);
			
	}

}
