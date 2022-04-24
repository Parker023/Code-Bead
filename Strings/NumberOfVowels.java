import java.util.*;
public class NumberOfVowels {
		public static int countVowels(String str) {
			int v=0;
			String n="AEIOUaeiou";
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(n.indexOf(ch)!=-1)
					v++;
			}
				return v;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
			int count=countVowels(st);
			System.out.println(" number of vowels: "+count);
			sc.close();
	}

}
