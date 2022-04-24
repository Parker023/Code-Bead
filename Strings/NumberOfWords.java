import java.util.*;
public class NumberOfWords {
			static int countWords(String str) {
				int count=0;
				for(int i=0;i<str.length();i++) {
					char ch[]=str.toCharArray();
					if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
						count++;
				}
					return count;
			}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
		int result=	countWords(st);
		System.out.println(" number of a words :"+result);
		sc.close();
	}

}
