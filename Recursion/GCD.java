package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(getGcd(a,b));
		sc.close();
	}
	private static int getGcd(int a, int b) {
			if(a>b)
				return getGcd(b, a);
			if(a==0)
				return b;
		return getGcd(b/a, a);
	}
}
