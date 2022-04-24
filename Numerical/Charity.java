package org.Parker1.Shannu.App;

import java.util.Scanner;
//ex1: input1: 2----> op: 1sq+2sq=5;   input2:3------> op: 1sq+2sq+3sq=14
public class Charity {
	static int printCharityAmount(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int op=printCharityAmount(n);
			System.out.println(op);
	}

}
