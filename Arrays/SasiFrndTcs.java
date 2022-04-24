package org.Parker1.Shannu.App;
import java.util.Scanner;
public class SasiFrndTcs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		System.out.println(	findProbability(b, a));
		sc.close();
	}
	public static String findProbability(int b,int ar[]) 
	{
		int count=0;
		for(int i=0;i<ar.length;i++) 
		{
			if(ar[i]==b)
			{
				count++;
			}
		}
		double len=ar.length;
		double d=count/len;
		if(count==0)
			return ""+0+"";
		else
			return  ""+d+"";
	}
}
