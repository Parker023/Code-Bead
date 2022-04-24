import java.util.*;
public class Pangram {
		 static boolean pangramCheck(String str) {
			 int count[]=new int[26];
			 for(int i=0;i<str.length();i++) {
				 char ch=str.charAt(i);
				 if(ch>='A'&&ch<='Z')
					 count[ch-65]++;
				 else if(ch>='a'&&ch<='z')
					 count[ch-97]++;
					 }
			 for(int i=0;i<count.length;i++) {
				 if(count[i]==0.)
					 return false;
				 }
			 	return true;
		 }
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
			boolean res=pangramCheck(st);
			if(res==true)
				System.out.println("given string is pangram");
			else
				System.out.println("given string is not a pangram");
sc.close();
			
	}

}
