package org.Parker1.Shannu.Recursion;

import java.util.Scanner;

public class Count1s {
	public static int getCount(int n,int i) {
		if(n==0)
			return i;
		if(n%10==1)
			i++;
			return getCount(n/10,i);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(getCount(n, 0));
	sc.close();
}
}
