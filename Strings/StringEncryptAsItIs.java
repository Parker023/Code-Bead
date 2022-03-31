package org.Parker1.Shannu.Strings;
import java.util.Scanner;
public class StringEncryptAsItIs 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		System.out.println(printEncryptedString(st));
		sc.close();
	}
	private static String printEncryptedString(String st) 
	{
		st=st+" ";
		boolean b[]=new boolean[st.length()];
		String k="";
		for(int i=0;i<st.length()-1;i++)
		{
			if(b[i])
				continue;
			int count=0;
			if(st.charAt(i+1)==st.charAt(i)) 
			{
				for(int j=i;j<st.length();j++) 
				{
					if(st.charAt(j)!=st.charAt(i)) 
						break;
					count++;
					b[j]=true;
				}
				k=k+st.charAt(i)+count;
			}
			else
			{
				k=k+st.charAt(i)+1;
			}
		}

		return k;
	}
}
