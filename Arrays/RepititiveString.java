package org.Parker1.Shannu.App;
import java.util.Scanner;

public class RepititiveString {
		public static int printMostRepeatedChar(int[] x) {
			int big=x[0];
			for(int i=1;i<x.length;i++) {
				if(x[i]>big)
					big=x[i];
			}
				int count[]=new int[big+1];
				for(int i=0;i<x.length;i++) {
					count[x[i]]++;
				}
			int p=count[0];int k=0;
			for(int i=1;i<count.length;i++) {
				if(count[i]>p) {
					p=count[i];
					k=i;
				}
			}
			return k;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int result=printMostRepeatedChar(a);
		System.out.println(result);
		sc.close();
	}

}
