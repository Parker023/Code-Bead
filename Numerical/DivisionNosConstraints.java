package org.Parker1.Shannu.Numerical;
import java.util.Scanner;
public class DivisionNosConstraints {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of test cases");
		int testcase=sc.nextInt();int i=0;
		while(i<testcase) {
			int n=findNum(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println(n);
		}
		sc.close();
	}
	private static int findNum(int num, int rem, int max) {
		int m=Integer.MIN_VALUE;
		for(int i=1;i<max;i++) {
			if(i%num==rem) {
				if(i>m)
					m=i;
			}
		}
		if(m==Integer.MIN_VALUE)
			return -1;
		return m;
	}
}
