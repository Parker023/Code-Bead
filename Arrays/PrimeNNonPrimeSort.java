package org.Parker1.Shannu.Arrays;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class PrimeNNonPrimeSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		primeSort(ar);
		sc.close();
	}
	private static void primeSort(int[] ar) {
		Arrays.sort(ar);
		LinkedList<Integer> list=new LinkedList<Integer>();
		LinkedList<Integer> llist=new LinkedList<Integer>();
		for(int i=0;i<ar.length;i++) {
			if(primeCheck(ar[i], 2)) {
				list.add(ar[i]);
			}
			else
				llist.add(ar[i]);
		}
		int a[]=new int[ar.length];int i=0;
		for(Integer e:list) {
			a[i]=e;
			i++;
		}
		for(Integer e:llist) {
			a[i]=e;
			i++;
		}
		System.out.println(Arrays.toString(a));
	}
	private static boolean primeCheck(int x,int i) {
		if(i<=x/2) {
			if(x%i==0)
				return false;
			else
				return primeCheck(x, i+1);
		}
		return true;
	}
}
