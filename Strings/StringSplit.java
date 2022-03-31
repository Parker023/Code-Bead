package org.Parker1.Shannu.Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class StringSplit {
	public static void printString(String st) {
		String str[]=st.trim().split(" ");int i=0;
		ArrayList<String> list=new ArrayList<String>();
		while(i<str.length) {
			String k=str[i];
			char ch[]=k.toCharArray();
			if(k.codePointAt(0)>=97&&k.codePointAt(0)<=122) {
				ch[0]=(char) (ch[0]-32);
				list.add(k=new String(ch)+" ");
			}
			else
				list.add(k+" ");
			i++;
		}
		list.trimToSize();
		for(String e:list)
			System.out.print(e+" ");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		printString(st);
	}
}
