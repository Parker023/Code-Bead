package org.Parker1.Shannu.Numerical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {
	public void printMinMax(List<Integer> arr ) {
		int len=arr.size();
		boolean bl[]=new boolean[len];
		long ar[]=new long[len];
		for(int i=0;i<len;i++){
			bl[i]=true;
			if(i>0)
				bl[i-1]=false;
			long sum=0;//if it's Integer overflow will happen
			for(int j=0;j<len;j++){
				if(bl[j]==true)
					continue;
				sum=sum+arr.get(j);
			}
			ar[i]=sum;
		}
		Arrays.sort(ar);
		System.out.println(ar[0]);
		System.out.println(ar[len-1]);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> lis=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			Integer a=sc.nextInt();
			lis.add(a);
		}
		MinMaxSum mms=new MinMaxSum();
		mms.printMinMax(lis);
		sc.close();
	}
}
