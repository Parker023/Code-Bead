package org.Parker1.Shannu.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MagicValueArr
{
	public static int getMagicValue(int ar[])
	{
		int nonsortarr[]=new int[ar.length];
		nonsortarr=ar.clone();
		Arrays.sort(ar);
		int goodsum=0,badsum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(nonsortarr[i]==ar[i])
				goodsum=goodsum+ar[i];
			else
				badsum=badsum+ar[i];
		}
		return goodsum-badsum;
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
		System.out.println(getMagicValue(ar));
		sc.close();
	}
}
