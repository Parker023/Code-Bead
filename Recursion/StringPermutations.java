package org.Parker1.Shannu.Recursion;
import java.util.Scanner;
public class StringPermutations {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int len=str.length();
	stringPermutations(str, 0,len-1);
	sc.close();
}
public static void stringPermutations(String st,int pos,int n) {
//	System.out.println(" pos "+pos);
	if(pos==n) {
		System.out.println(st);
	}
	else {
		for(int i=pos;i<=n;i++) {
//			System.out.println(" index "+i);  
		String swapped=swap(st,pos,i);
//		System.out.println(" pos "+pos+" "+" i "+i);
		stringPermutations(swapped, pos+1,n);
//		System.out.println(" pos1 "+pos+" "+" i1 "+i);
		swapped=swap(st,pos,i);
		}
		
	}
}
		public static String swap(String st,int i,int j) {
			char temp;
			char ch[]=st.toCharArray();
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			return st=String.valueOf(ch);
		}







}
