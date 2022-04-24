package org.Parker1.Shannu.App;
import java.util.Scanner;
public class Phanixam {
static int printSum(int n) {
		int sum=1;int res=0;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
		do {
			int d=sum%10;
			res=res+d;
			sum=sum/10;
		}while (sum!=0);
		return res;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long res=printSum(n);
	System.out.println(res);
	sc.close();
}
}