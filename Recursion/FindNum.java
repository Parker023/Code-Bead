package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class FindNum {
	public static String findNumber(int ar[],int i,int k) 
	{
		if(i>=ar.length)
			return "Not present";
		if(ar[i]==k)
			return "present";
		return findNumber(ar, i+1, k);
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
		int k=sc.nextInt();
		System.out.println(findNumber(ar, 0, k));
		sc.close();
	}
}
