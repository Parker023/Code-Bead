package org.Parker1.Shannu.App;
import java.util.Scanner;
public class CgiXam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int p=sc.nextInt();
		int res=countPerfectSum(ar, p);
		System.out.println(res);
		sc.close();  
	}
	public static int countPerfectSum(int a[],int n) {
		long start=System.nanoTime();
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==n)
					count++;
				//time taken:2800
				else {
					int sum=a[i]+a[j];
					for(int k=j+1;k<a.length;k++) {
						sum=sum+a[k];
						if(sum==n) {
						count++;
						break;
						}
						else
							continue;
					}
				}
			}
		}
		//time taken :2900
		//	for(int i=0;i<a.length;i++) {
		//		for(int j=i+1;j<a.length;j++) {
		//			for(int k=j+1;k<a.length;k++) {
		//				if(a[i]+a[j]+a[k]==n)
		//					count++;
		//			}
		//		}
		//	}
		long end=System.nanoTime();
//		System.out.println(end-start);
		return count;
	}
}
