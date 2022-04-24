package org.Parker1.Shannu.App;
import java.util.Scanner;
public class StringFcLcSwap {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
			printNewString(st);
			sc.close();
	}
public static void printNewString(String st) {
	char ch[]=st.toCharArray();String str="";int count=0;
	for(int j=0;j<ch.length;j=j+count+1) {
	String k="";count=0;
	for(int i=j;i<ch.length;i++) {
		if(ch[i]==' ') {
			break;
		}
		if(ch[i]!=' ') {
				k=k+ch[i];
				count++;
	}
	}
	char ch2[]=k.toCharArray();
	char temp=' ';
	temp=ch2[0];
	ch2[0]=ch2[ch2.length-1];
	ch2[ch2.length-1]=temp;
	 str=new String(ch2);
	 System.out.print(str+" ");
  }
	}
}

