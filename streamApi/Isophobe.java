package org.Parker1.Shannu.stream;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.*;
public class Isophobe {
//public static	boolean isIsophobe(String st) {   //general logic
//	char ar[]=new char[122];
//	st=st.toLowerCase();
//	for(int i=0;i<st.length();i++) {
//		ar[st.charAt(i)]++;
//	}
//		for(int i=0;i<ar.length;i++) {
//			if(ar[i]==2)
//				return false;
//		}
//		return true;
//}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char ch[]=s.toCharArray();
	if(isIsophobe(s,ch))
		System.out.println("isophobe");
	else
		System.out.println("not an isophobe");
	sc.close();
}

private static boolean isIsophobe(String s,char ch[]) {  ///logic using stream Api
	long len=IntStream.range(0, ch.length).mapToObj(i->ch[i]).distinct().count();
	if(len==s.length())
		return true;
	return false;
}
}
