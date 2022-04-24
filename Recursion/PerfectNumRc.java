package org.Parker1.Shannu.Recursion;

import java.util.Scanner;

public class PerfectNumRc {
	public static boolean isPerfect(int n) {
		return n==sumOfDigits(n,1);
	}
	private static int sumOfDigits(int n, int i) {
		if(i>n/2)
			return 0;
		if(n%i==0)
			return i+sumOfDigits(n, i+1);
		else
			return 0+sumOfDigits(n, i+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 boolean flag=isPerfect(n);
		if(flag)
			System.out.println("perfect");
		else
			System.out.println("not perfect");
		sc.close();
	}
}
