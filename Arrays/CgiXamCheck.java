package org.Parker1.Shannu.Arrays;

import java.util.Scanner;

public class CgiXamCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int nextnum=getNextNumber(ar);
		System.out.println(nextnum);
	}
	public static int getNextNumber(int[] ar) {
		boolean b=FibanocciCheck(ar);
		if(b) {
			System.out.println("fibanocci");
			return (ar[ar.length-1]+ar[ar.length-2]);
		}
		boolean b1=arithmeticCheck(ar);
		if(b1) {
			System.out.println("arithmetic");
			return	(ar[ar.length-1]+(ar[ar.length-1]-ar[ar.length-2]));
		}
		boolean b2=geometricCheck(ar);
		if(b2) {
			System.out.println("geometric");
			return (ar[ar.length-1]*(ar[ar.length-1]/ar[ar.length-2]));
		}
		return -999;
	}
	private static boolean geometricCheck(int[] ar) {
		int mod=ar[1]/ar[0];
		for(int i=2;i<ar.length;i++) {
			if(ar[i]/ar[i-1]!=mod)
				return false;
		}
		return true;
	}
	private static boolean arithmeticCheck(int[] ar) {
		int diff=ar[1]-ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]-ar[i-1]!=diff)
				return false;
		}
		return true;
	}
	public static boolean FibanocciCheck(int []ar) {
		if(ar.length==1||ar.length==2)
			return true;
		for(int i=2;i>ar.length;i++) {
			if(ar[i-1]+ar[i-2]!=ar[i])
				return false;
		}
		return true;
	}

}
