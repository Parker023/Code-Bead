package org.Parker1.Shannu.App;
import java.util.Scanner;
public class StringWordsReverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	printWordReversedString(st);
	sc.close();
}
		public static void printWordReversedString(String st) {
		char ch[]=st.toCharArray();int count=0;
		for(int j=ch.length-1;j>=0;j=j-count-1) {
		String k="";count=0;
		for(int i=j;i>=0;i--) {
			if(ch[i]==' ') {
				break;
			}
			if(ch[i]!=' ') {
			   k=ch[i]+k;
			   count++;
		}
		}
		 System.out.print(k+" ");
		}
		}


}
