package org.Parker1.Shannu.Numerical;

import java.util.Scanner;
public class MaxNumDecRemoval {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c=sc.next().charAt(0);
		int max=returnMax(n,c);
		System.out.println("Max Possible: "+max);
		sc.close();
	}
	private static int returnMax(int n,char c) {
		String st=String.valueOf(n);
		char ch[]=st.toCharArray();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==c) {
				String s="";
				for(int j=0;j<ch.length;j++) {
					if(j==i)
						continue;
					s=s+ch[j];
				}
				int big=Integer.parseInt(s);
				if(big>max)
					max=big;
			}
		}
		return max;
	}
}
