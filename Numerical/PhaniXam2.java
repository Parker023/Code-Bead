package org.Parker1.Shannu.App;

import java.util.Scanner;

public class PhaniXam2 {
	static int printNum(int n) {
		String temp="";
		while(n!=0) {
			int d=n%10;
			int p=(d+7)%10;
			temp=p+temp;
			n=n/10;
		}
	char ch[]=temp.toCharArray();
	for(int i=0;i<ch.length/2;i++) {
		
			char k=ch[i];
			ch[i]=ch[i+2];
			ch[i+2]=k;
	}
	String st=new String(ch);
	int num=Integer.parseInt(st);
		return num;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int res=printNum(n);
	System.out.println(res);
}
}
