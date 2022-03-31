package org.Parker1.Shannu.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum
{
public static int getMissingNum(int a[]) 
{
	Arrays.sort(a);
	int n=a[a.length-1]-a[0]+1;
	int sum=(n/2)*(a[0]+a[a.length-1]);
	int originalsum=Arrays.stream(a).sum();
	return sum-originalsum;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++) 
	{
		ar[i]=sc.nextInt();
	}
	System.out.println(getMissingNum(ar));
	sc.close();
}
}
