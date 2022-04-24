package org.Parker1.Shannu.App;
//String+sum of the digits present in the string.
import java.util.Scanner;

public class StringSum {
	static void printSumAndString(String str) {
		int sum=0,count=0,j=0;;
		boolean bool[]=new boolean[str.length()];
		String val="0123456789";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(val.indexOf(str.charAt(i))!=-1) {
				sum=sum+ch[i]-48;
				count++;
				bool[i]=true;
			}
		}
		char newch[]=new char[str.length()-count];
		for(int i=0;i<str.length();i++) {
			if(bool[i]!=true) {
				newch[j]=ch[i];
				j++;
			}
		}
		str=new String(newch);
		System.out.println(str);
		System.out.println(sum);
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.next();
			printSumAndString(st);
	}
}
