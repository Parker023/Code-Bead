package org.Parker1.Shannu.Recursion;

import java.util.Scanner;

public class BigEleArrRc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int len=ar.length;int big=ar[0];
		System.out.println(printBigEleArr(ar,len-1,big));
		sc.close();
	}
	private static int printBigEleArr(int[] ar, int i,int big) {
			if(i<0)
				return big;
			if(ar[i]>big)
				big=ar[i];
			return  printBigEleArr(ar, i-1, big);
	}
}
