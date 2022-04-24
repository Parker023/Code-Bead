import java.util.*;
public class ChangeToLowerCase  {
		static String lowerCase(String str) {
			char ch[]=str.toCharArray();
			for(int i=0;i<str.length();i++) {
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
				str=new String(ch);
				return str;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
		String lcs=	lowerCase(st);
		System.out.println(" Given String in Lower Case: "+lcs);
			sc.close();
	}

}
