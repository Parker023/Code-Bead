package dsa.Sort;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
	public static void selectionSort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int less=i-1;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[less]) {
					less=j;
				}
			}
			int t=a[i-1];
			a[i-1]=a[less];
			a[less]=t;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		selectionSort(ar);
		sc.close();
	}
}
