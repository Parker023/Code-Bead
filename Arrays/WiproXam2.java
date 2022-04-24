package org.Parker1.Shannu.App;

import java.util.Scanner;

public class WiproXam2 {
	static int[] print(int x,int k) {
		int len = String.valueOf(x).length();
		int n[]=new int[len];
		for(int i=n.length-1;i>=0;i--) {
			if(x!=0) {
				int d=x%10;
				n[i]=d;
				x=x/10;
			}
		}
		int ar[]=new int[n.length];
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				int y=i+k;
				if(y>n.length-1) {
					y=y-n.length;
					ar[i]=n[y];
					}
					else
						ar[i]=n[i+k];
			}
				else
					ar[i]=n[i];
		}
		return ar;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=sc.nextInt();
		System.out.println("enter the interval:");
		int x=sc.nextInt();
			int res[]=print(n, x);
			for(int i=0;i<res.length;i++) {
				System.out.print(res[i]);
			}
			sc.close();
	}

}
