package dsa.Sort;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=sc.nextInt();
		}
		quickSort(ar, 0, ar.length-1);
		for(int i=0;i<ar.length;i++) 
		{
			System.out.print(ar[i]+" ");
		}
		sc.close();
	}
	public static void quickSort(int ar[],int l,int h)
	{
		if(l<h) 
		{
			int m=partition(ar,l,h);
			quickSort(ar, l, m-1);
			quickSort(ar, m+1, h);
		}
	}
	private static int partition(int[] ar, int l, int h)
	{
		int pivot=ar[l];
		int i=l+1;
		int j=h;
		while(i<=j) 
		{
			while(i<=j&&ar[i]<pivot)
				i++;
			while(j>=i&&ar[j]>pivot)
				j--;
			if(i<j)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(ar));
		ar[l]=ar[j];
		ar[j]=pivot;
		System.out.println("l "+l+" j "+j+" i "+i);
		return j;
	}

}
