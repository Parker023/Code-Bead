package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class ArraySum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	int len=ar.length;
	System.out.println(printArrSum(ar,len-1));
	sc.close();
}
private static int  printArrSum(int[] ar,int x) {
	if(x==0)
		return ar[0];
	return ar[x]+printArrSum(ar, x-1);
}

}
