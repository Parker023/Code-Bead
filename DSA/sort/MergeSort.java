package dsa.Sort;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		mergeSort(ar,0,ar.length-1);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		sc.close();
	}

	private static void mergeSort(int[] ar, int l, int h) {
		if(l<h) {
		int mid=(l+h)/2;
			mergeSort(ar,l ,mid);
			mergeSort(ar, mid+1, h);
			mergeSort(ar, l, mid,h);
	}
	}
	private static void mergeSort(int[] ar, int l, int mid, int h) {
		int a[]=new int[mid-l+1];
		int b[]=new int[h-mid];
		for(int i=0;i<a.length;i++) 
			a[i]=ar[l+i];
		for(int i=0;i<b.length;i++) 
			b[i]=ar[mid+1+i];
		int k=l,i=0,j=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j])
				ar[k]=a[i++];
			else
				ar[k]=b[j++];
			k++;
		}
		while(i<a.length)
			ar[k++]=a[i++];
		while(j<b.length)
			ar[k++]=b[j++];
	}
}
