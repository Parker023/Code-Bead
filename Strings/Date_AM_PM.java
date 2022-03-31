package org.Parker1.Shannu.Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Date_AM_PM {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		char ch[]=st.toCharArray();
		String k="";
		Pattern pt=Pattern.compile("[0-9:]*PM");
		Matcher mt=pt.matcher(st);
		if(mt.find()) {
			k=k+ch[0]+ch[1];
			int a=12+Integer.parseInt(k);
			//			System.out.println(a);
			k=String.valueOf(a);
			ch[0]=k.charAt(0);
			ch[1]=k.charAt(1);
			ch[ch.length-1]='\u0000';
			ch[ch.length-2]='\u0000';
			System.out.println(ch);

		}
	}

}
