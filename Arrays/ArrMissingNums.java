package org.Parker1.Shannu.Arrays;
import java.util.Scanner;
public class ArrMissingNums 
{
	public static void printMissingNumbers(int ar[])
	{
		for(int i=1;i<ar.length;i++) {
			if(ar[i]-ar[i-1]!=1)
				System.out.println(ar[i-1]+1);
		}
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
		printMissingNumbers(ar);
		sc.close();
	}
}
