package dsa.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int a[]) {
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
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
		bubbleSort(ar);
		sc.close();
	}
}
