package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class DigitsSum {
	static int sumOfDigit(int n) {
		if(n==0)
			return 0;
		return n%10+sumOfDigit(n/10);
	}
	class ReverseNum{
		public int reverse(int n) {
			return rev(n,0);
		}
		private  int rev(int n, int i) {
			if(n==0)
				return i;
			return rev(n/10, i*10+n%10);
		}
	}
	public static void main(String[] args) {
		DigitsSum ds=new DigitsSum();
		DigitsSum.ReverseNum rn= ds.new ReverseNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to find sum of digits");
		int n=sc.nextInt();
		System.out.println(sumOfDigit(n));
		System.out.println("enter number to find reverse of digits");
		int x=sc.nextInt();
		System.out.println(rn.reverse(x));
		sc.close();
	}
}














