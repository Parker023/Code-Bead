package org.Parker1.Shannu.App;

import java.util.Scanner;

public class CheckCode {
	static int printNumOfNonDecimalValues(double x[]) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%1==0)
				count++;
		}
		    return count;
	}
	public static double[] readDoubleArray(Scanner sc) {
		
		int n=sc.nextInt();
		double a[]=new double[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextDouble();
		}
			return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x[]=readDoubleArray(sc);
		int res=printNumOfNonDecimalValues(x);
		System.out.println(res);
	}
	}


