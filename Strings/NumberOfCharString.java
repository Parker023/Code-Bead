import java.util.*;
public class NumberOfCharString {
			static int[] countChar(String str) {
				int uc,lc,v,c,di,spc;
				uc=lc=v=c=di=spc=0;
				for(int i=0;i<str.length();i++) {
					char ch=str.charAt(i);
					if(ch>='A'&&ch<='Z') {
						uc++;
					if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
							v++;
						else
							c++;
					}	
					else if(ch>='a'&&ch<='z') {
						lc++;
						if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
							v++;
						else
							c++;
					}
					else if(ch>='0'&&ch<='9')
						di++;
					else
						spc++;
				}
				int len[]= {uc,lc,v,c,di,spc};
				return len;
			}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.next();
			int []res=countChar(st);
			System.out.println(" no. of upper case letters: "+res[0]);
			System.out.println(" no. of lower case letters: "+res[1]);
			System.out.println(" no. of vowels: "+res[2]);
			System.out.println(" no. of consonants: "+res[3]);
			System.out.println(" no. of digits: "+res[4]);
			System.out.println(" no. of special characters: "+res[5]);
			sc.close();
	}

}
