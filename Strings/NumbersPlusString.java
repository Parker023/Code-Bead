package org.Parker1.Shannu.App;
import java.util.Scanner;
public class NumbersPlusString {
	static int printSumPlusString(String st) {
		st=st+" ";
		boolean b[]=new boolean[st.length()];
		int sum=0;String val="0123456789";
		for(int i=0;i<st.length();i++) {
			String s="";
			if(b[i]==true)
				continue;
			if(val.indexOf(st.charAt(i))!=-1) {
				if(val.indexOf(st.charAt(i+1))!=-1) {
					for(int j=i;j<st.length();j++) {
						if(val.indexOf(st.charAt(j))==-1)
							break;
						b[j]=true;
						s=s+st.charAt(j);
					}
					sum=sum+Integer.parseInt(s);}
				else {
					s=s+String.valueOf(st.charAt(i));
					sum=sum+Integer.parseInt(s);}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		System.out.println(printSumPlusString(st));
		sc.close();
	}
}
