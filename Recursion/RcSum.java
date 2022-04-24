package org.Parker1.Shannu.Recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RcSum {
	static int getSum(int n) {
		if(n>=1)
		return n+getSum(n-1);
		return 0;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int x=getSum(n);
		System.out.println(x);
	}
}
