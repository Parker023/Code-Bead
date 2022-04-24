package org.Parker1.Shannu.App;
import java.util.Scanner;
public class KotiXamWipro {
		static int printBiggestDigit(int x) {
			int temp=0;
			do {
				int d=x%10;
				if(d>temp)
					temp=d;
					x=x/10;
			}while(x!=0);
			return temp;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			int op=printBiggestDigit(n);
			System.out.println(op);
			sc.close();
	}
}
