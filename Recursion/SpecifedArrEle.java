package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class SpecifedArrEle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		} 
		int a=sc.nextInt();
		int len=ar.length;
		System.out.println(printSpecifiedEleArr(ar,len-1,a));
		sc.close();
	}
	private static int printSpecifiedEleArr(int[] ar, int i, int a) {
		if(i<0)
			return -1;
		if(ar[i]==a)
			return i;
		return printSpecifiedEleArr(ar, i-1, a);
	}
}
