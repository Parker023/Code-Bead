package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class RcPrimr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=checkPrime(n,2);
		if(b)System.out.println("prime");
		else System.out.println("not prime");
		sc.close();
	}
	private static boolean checkPrime(int n, int i) {
		if(i<=n/2) {
			if(n%i==0)
				return false;
			else
				return checkPrime(n, i+1);
		}
		return true;
	}
}
