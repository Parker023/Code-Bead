package dsa.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(key<a[j]&&j>=0) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
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
		insertionSort(ar);
		sc.close();
	}
}
