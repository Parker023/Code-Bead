package org.Parker1.Shannu.Recursion;

import java.util.Scanner;

public class RecursionDemo {
	private static String printNum(int n) {
		if(n>=1)
		return n+" "+printNum(n-1);
		return "";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res=printNum(n);
		System.out.println(res);
		sc.close();
	}
}
