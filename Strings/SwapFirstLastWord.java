import java.util.*;
public class SwapFirstLastWord {
	static String change1stlastword(String str) {
		char ch[]=str.toCharArray();
		int count=0;
		char newch[]=new char[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')
				count++;
		}
		for(int i=0;i<ch.length;i++) {
			if(i==0)
			ch[i]=newch[count-1];
			else if(i==count-1)
				ch[i]=newch[count-1-i];
			else
				ch[i]=newch[i];
			
		}
			str=new String(newch);
			return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
	String res=	change1stlastword(st);
	System.out.println(res);
	sc.close();
	}
	

}
