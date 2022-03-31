package org.Parker1.Shannu.Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringEncryption
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		System.out.println(printEncryptString(st));
		br.close();
	}
	private static String printEncryptString(String st)
	{
		String k="";
		boolean b[]=new boolean[st.length()];
		for(int i=0;i<st.length();i++) 
		{
			if(b[i])
				continue;
			int count=0;
			String s=""+st.charAt(i)+"";
			Pattern p=Pattern.compile(s);
			Matcher m=p.matcher(st);
			while(m.find())
			{
				b[m.start()]=true;
				count++;
			}
			k=k+st.charAt(i)+count;
		}
		return k;
	}
}