package org.Parker1.Shannu.Recursion;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		} 
		int a=sc.nextInt();
		Arrays.sort(ar);
		System.out.println(bSearch(ar,a,0,ar.length-1));	
		sc.close();
	}
	private static int  bSearch(int[] ar, int a, int i, int j) {
		if(i>j)
			return -1;
		int m=(i+j)/2;
		if(ar[m]==a)
			return m;
		if(ar[m]>a)
			return bSearch(ar, a, i, m-1);
		else
			return bSearch(ar, a, m+1, j);
	}
}
