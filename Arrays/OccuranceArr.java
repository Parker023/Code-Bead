package org.Parker1.Shannu.App;

import java.util.Scanner;
public class OccuranceArr {
	public static int countOccurance(int x[],int k) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==k)
				count++;
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<x.length;i++) {
		x[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	int res=countOccurance(x, k);
	System.out.println(res);
	sc.close();
}
}
