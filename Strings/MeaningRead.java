package org.parker.ecstaticApp;
import java.io.*;
import java.util.regex.*;
public class MeaningRead {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		getMeaning(st);
	}
	private static void getMeaning(String st) throws IOException
	{
		st=st.toLowerCase();
		FileReader fr=new FileReader("Meanings.txt");
		BufferedReader bbr=new BufferedReader(fr);
		String s="";String str=null;
		while((s=bbr.readLine())!=null) 
		{
			String k=s.toLowerCase();
			Pattern p=Pattern.compile(st);
			Matcher m=p.matcher(k);
			while(m.find())
			{
				str=k.substring(st.length()+1);
			}
			k="";
			if(str!=null)
				break;
		}
		String sp[]=str.split(";");
		for(String e:sp) 
		{
			System.out.println("> "+e);
		}
		bbr.close();
	}	
}
