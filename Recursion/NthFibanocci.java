package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class NthFibanocci {
	static int getNum(int n) {
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return getNum(n-1)+getNum(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getNum(n));
		sc.close();
	}
}
