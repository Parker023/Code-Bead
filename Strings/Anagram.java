import java.util.*;
public class Anagram {
		static boolean anagramCheck(String str1,String str2){
			int count[]=new int[26];
			for(int i=0;i<str1.length();i++) {
				char ch=str1.charAt(i);
				 if(ch>='A'&&ch<='Z')
					 count[ch-65]++;
				 else if(ch>='a'&&ch<='z')
					 count[ch-97]++;
			}
			for(int i=0;i<str2.length();i++) {
				char ch=str2.charAt(i);
				 if(ch>='A'&&ch<='Z')
					 count[ch-65]--;
				 else if(ch>='a'&&ch<='z')
					 count[ch-97]--;
			}
				for(int i=0;i<count.length;i++) {
					if(count[i]!=0)
						return false;
				}
				return true;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st1=sc.nextLine();
			String st2=sc.nextLine();
		boolean op=	anagramCheck(st1, st2);
		if(op==true)
			System.out.println("given strings are anagram");
		else
			System.out.println("given strings are not anagram");
			sc.close();
	}

}
