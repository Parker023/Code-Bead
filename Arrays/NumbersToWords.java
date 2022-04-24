package org.Parker1.Shannu.App;
import java.util.Scanner;
public class NumbersToWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		printWord(x/10000000, "crore");
		printWord(x/100000%100, "lakh");
		printWord(x/1000%100, "thousand");
		printWord(x/100%10, "hundred");
		printWord(x%100, "");
		sc.close();
	}
	public static void printWord(int n,String st) {
		String one[]= {"","one","two","three","four","five","six","seven","eight","nine",
				        "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				         "seventeen","eighteen","nineteen"};
		String two[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		if(n<20) {
			System.out.print(one[n]+" ");
		}
		else {
			System.out.println(two[n/10]+" "+one[n%10]);
		}
		if(n!=0)
			System.out.print(st+" ");
	}
}
