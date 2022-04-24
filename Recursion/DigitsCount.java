package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class DigitsCount {
	static int  getCount(int n) {
		if(n==0)
			return 0;
		return 1+getCount(n/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getCount(n));
		sc.close();
	}
}
